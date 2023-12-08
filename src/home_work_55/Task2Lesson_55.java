package home_work_55;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static home_work_55.Operations.*;


/**
 * Created by Volodymyr Sh on 26.11.2023
 * project name: AIT_HomeWorks
 */
public class Task2Lesson_55 {
    /*  Дан список транзакций (Transaction) с полями amount, type (DEBIT/CREDIT), timestamp.
        Используя Stream API, вычислите общую сумму для дебетовых и кредитных транзакций отдельно,
        а также найдите транзакцию с максимальной суммой.
    */
    public static void main(String[] args) {

        List<Transaction> transactonList = List.of(
                new Transaction(23, LocalDate.of(2023, 10, 5), DEBIT),
                new Transaction(38, LocalDate.of(2023, 10, 2), CREDIT),
                new Transaction(36, LocalDate.of(2023, 11, 15), DEBIT),
                new Transaction(36, LocalDate.of(2023, 1, 15), CREDIT),
                new Transaction(42, LocalDate.of(2023, 2, 20), DEBIT),
                new Transaction(18, LocalDate.of(2023, 3, 5), DEBIT),
                new Transaction(27, LocalDate.of(2023, 4, 10), CREDIT),
                new Transaction(53, LocalDate.of(2023, 5, 8), CREDIT),
                new Transaction(64, LocalDate.of(2023, 6, 12), DEBIT),
                new Transaction(29, LocalDate.of(2023, 7, 18), CREDIT),
                new Transaction(50, LocalDate.of(2023, 8, 22), DEBIT),
                new Transaction(12, LocalDate.of(2023, 9, 3), DEBIT),
                new Transaction(37, LocalDate.of(2023, 10, 9), CREDIT),
                new Transaction(48, LocalDate.of(2023, 11, 15), DEBIT),
                new Transaction(21, LocalDate.of(2023, 12, 20), DEBIT),
                new Transaction(55, LocalDate.of(2023, 1, 25), CREDIT),
                new Transaction(63, LocalDate.of(2023, 2, 28), DEBIT),
                new Transaction(19, LocalDate.of(2023, 3, 5), DEBIT)
        );

        // Option 1 (sum) -> mapToInt
        int debitSum = transactonList.stream()
                .filter(transaction -> transaction.getType() == DEBIT)
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println("DEBIT sum: " + debitSum);

        int creditSum = transactonList.stream()
                .filter(transaction -> transaction.getType() == CREDIT)
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println("CREDIT sum: " + creditSum);

        // Option 2 (sum) -> summingInt
        Map<Operations, Integer> typeOperationSum = transactonList.stream()
                .collect(Collectors.groupingBy(Transaction::getType,
                                                Collectors.summingInt(Transaction::getAmount)));
        System.out.println("typeOperationSum: " + typeOperationSum);


        // Option 3 (sum) -> Statistic
        Map<Operations, IntSummaryStatistics> typeOperationStatistics = transactonList.stream()
                .collect(Collectors.groupingBy(Transaction::getType,
                                                Collectors.summarizingInt(Transaction::getAmount)));

        System.out.println("typeOperationStatistics: " + typeOperationStatistics);


        // Optional 1 (max) -> mapToInt
        OptionalInt debitMax = transactonList.stream()
                .filter(transaction -> transaction.getType() == DEBIT)
                .mapToInt(Transaction::getAmount)
                .max();

        System.out.println("DEBIT max: " + debitMax.getAsInt());

        OptionalInt creditMax = transactonList.stream()
                .filter(transaction -> transaction.getType() == CREDIT)
                .mapToInt(Transaction::getAmount)
                .max();

        System.out.println("CREDIT max: " + creditMax.getAsInt());

        // Optional 2 (max) -> maxBy
        Map<Operations, Optional<Transaction>> typeOperationMax = transactonList.stream()
                .collect(Collectors.groupingBy(Transaction::getType,
                        Collectors.maxBy(Comparator.comparingInt(Transaction::getAmount))));
        System.out.println("typeOperationMax: " + typeOperationMax);

        Transaction maxTransaction = transactonList.stream()
                .max(Comparator.comparingInt(Transaction::getAmount))
                .orElse(null);
        System.out.println(maxTransaction);

//         TODO - разобрать пример TEACHER
//        Optional<Double> optionalSumCredit = transactonList.stream()
//                .filter(tr -> tr.getType() == CREDIT)
//                .map(Transaction::getAmount)
//                .reduce(Double::sum);

    }
}

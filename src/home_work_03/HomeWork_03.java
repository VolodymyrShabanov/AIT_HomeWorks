package home_work_03;

public class HomeWork_03 {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int var0 = 0;
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;
        int var5 = 5;
        int var6 = 6;
        int var7 = 7;
        int var8 = 8;
        int var9 = 9;

        int countVariables = 10;

        int varSumm = var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;

        int resultDiv = varSumm / countVariables;

        double resultOll = (double) varSumm / countVariables;
        System.out.println("Полный результат: " + resultOll);

        System.out.println("Результат целочисленного деления: " + resultDiv);

        double resultDivResidue = (double) varSumm % countVariables / 10;
        System.out.println("Программа отбросила в дробной части: " + resultDivResidue);


        System.out.println("\nЗадача 2.");
        int productA = 10;
        int productB = 5;
        double discountPercentage = 10;

        double discountPrice = ((double) productA + productB) * (100 - discountPercentage) / 100;
        System.out.println("Стоимость суммы товаров A+B с учетом скидки: " + discountPrice + " Euro");

        double discount = ((double) productA + productB) * discountPercentage / 100;
        System.out.println("Сумма скидки от этой покупки составляет: " + discount + " Euro");

        System.out.println("\nЗадача 3.");
        double tempMo = 30;
        double tempTu = 27;
        double tempWe = 21;
        double tempTh = 20;
        double tempFr = 21;
        double tempSa = 22;
        double tempSu = 23;

        double tempWeekAver = (tempMo + tempTu + tempWe + tempTh + tempFr + tempSa + tempSu) / 7;

        System.out.printf("Средняя температура за неделю %.2f: ", tempWeekAver);


        System.out.println("\nЗадача 4.");
        // x / 2 = [0, 1];
        int number2 = 2;
        System.out.println("Остаток от деления 4 / 2 = " + (var4 % number2));
        System.out.println("Остаток от деления 5 / 2 = " + (var5 % number2));

        // x / 3 = [0, 1, 2];
        int number3 = 3;
        System.out.println("Остаток от деления 6 / 3 = " + (var6 % number3));
        System.out.println("Остаток от деления 7 / 3 = " + (var7 % number3));
        System.out.println("Остаток от деления 8 / 3 = " + (var8 % number3));

        System.out.println("\nЗадача 5(*).");
        int x = 3;
        x+=x++;
        System.out.println(x);

        /*
        Попробую разобрать:
         Запись выше эквивалентна записи: x = x + x++;
         Оператор "+=" складывает значение справа c текущим значением
         переменной слева и присваивает ей результат.

         - Сперва вычисляется постинкремент х++, он возвращает в выражение текущее значение x, то есть 3,
         а потом увеличивает x на 1;
         - Выполняем арифметические операции: x = 3 + 3
         Итого: х = 6;

         Что же происходит со "вторым действием" постинкремента - увеличения x на 1?
         (тут могу ошибаться, но попробую предположить)

         После возвращения в выражение текущего значения 3, х получает значение 4,
         которое больше нигде в выражении не возвращается (вызывается),
         (Как мне помниться сначала выполняется все что в правой части после равно)
         далее выполняются арифметические операции которые присваивают х новое значение 6.
         */

        // конкатениция
        int a = 5;
        int b = 7;

        System.out.println("Сумма a & b: " + a + b);
        System.out.println("Сумма a & b: " + (a + b));


    }
}

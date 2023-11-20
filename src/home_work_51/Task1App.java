package home_work_51;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Volodymyr Sh on 19.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1App {
    public static void main(String[] args) {
        File path = new File("src/home_work_51");
        File file = new File(path, "/database/history_money_receipts.txt");

        Map<String, Integer> receipts = getMapFromFile(file);
        System.out.println(receipts);

        splitMapIntoTwoListsByAmount(receipts, 20000, new File("src/home_work_51/result"));

    }

    private static void splitMapIntoTwoListsByAmount(Map<String, Integer> receipts, int amount, File path) {

        File less = new File(path, "less.txt");
        File more = new File(path, "more.txt");

        less.delete();
        more.delete();

        try {
            less.createNewFile();
            more.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, Integer> entry : receipts.entrySet()){
            if (entry.getValue()<2000){
                writerNewFile(entry, less);
            } else {
                writerNewFile(entry, more);
            }
        }
    }

    private static void writerNewFile(Map.Entry<String, Integer> entry, File file) {

        try (FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String toWrote = entry.getKey() + ":" + entry.getValue();
            fileWriter.write(toWrote);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Map<String, Integer> getMapFromFile(File file) {
        Map<String, Integer> result = new HashMap<>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String [] strings = line.split(":");
                String user = strings[0];
                int money = Integer.parseInt(strings[1]);

                result.compute(user, (key, oldValue) -> oldValue == null ? money : oldValue + money);

            }

        } catch (FileNotFoundException exception) {
            throw new RuntimeException();
        } catch (IOException exception) {
            throw new RuntimeException();
        }

        return result;
    }

}

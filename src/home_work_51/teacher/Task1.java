package home_work_51.teacher;

import java.io.*;
import java.util.*;

/**
 * Created by Volodymyr Sh on 20.11.2023
 * project name: AIT_HomeWorks
 */
public class Task1 {

    private static final int LIMIT = 2000;
    private static final String FILE_DATA = "src/home_work_51/teacher/files_data/data.txt";
    private static final String FILE_LESS = "src/home_work_51/teacher/files_data/less.txt";
    private static final String FILE_MORE = "src/home_work_51/teacher/files_data/more.txt";

    public static void main(String[] args) {
        List<String> records = readData();

        Map<String, Integer> users = listToMap(records);
        writeFiles(users);

    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(FILE_LESS));
             BufferedWriter more = new BufferedWriter(new FileWriter(FILE_MORE))) {
            for (Map.Entry<String, Integer> entry : users.entrySet()) {
                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;
                String data = entry.getKey() + ":" + entry.getValue();
                writer.write(data);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();
        for (String record : records) {
            DataTransfer dataTransfer = new DataTransfer(record);
            String name = dataTransfer.getUserName();
            int amount = dataTransfer.getAmount();

            users.compute(name, (key, value) -> value == null ? amount : value + amount);
        }

        return users;
    }

    private static List<String> readData() {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_DATA))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}

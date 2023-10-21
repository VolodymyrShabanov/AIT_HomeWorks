package home_work_28;

public class Dictionary {

    // ==Outer (Внешний класс)========================================================
    private DictionaryPair[] row;
    private int counter;

    public Dictionary() {
        this.row = new DictionaryPair[10];
    }

    public void put(String key, String value) {
        for (int i = 0; i < counter; i++) {
            if (row[i].key.equals(key)) {
                row[i].value = value;
                return;
            }
        }
        row[counter++] = new DictionaryPair(key, value);
    }

    public String get(String key) {
        for (int i = 0; i < counter; i++) {
            if (row[i].key.equals(key)) {
                return row[i].value;
            }
        }
        return "translation not found";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (counter != 0) {
            sb.append(row[0]);
            for (int i = 1; i < counter; i++) {
                sb.append(", ").append(row[i]);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public DictionaryPair[] getRow() {
        return row;
    }

    public int getCounter() {
        return counter;
    }

    // ==Nested (Вложенный класс)========================================================
    private static class DictionaryPair {
        private String key;
        private String value;

        public DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(key).append(", ").append(value).append("]");
            return sb.toString();
        }
    }

    // ==Inner (Внутренний класс)========================================================
    public class Translator {
        private String [] result;

        public String[] translate(String[] words) {
            this.result = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                result[i] = get(words[i]);
            }
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            if (result.length != 0) {
                sb.append(result[0]);
                for (int i = 1; i < result.length; i++) {
                    sb.append(", ").append(result[i]);
                }
            }
            sb.append("}");
            return sb.toString();
        }
    }
}

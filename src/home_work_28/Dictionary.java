package home_work_28;

public class Dictionary {

    // ==========================================================
    private static class DictionaryPair {
        private String key;
        private String value;

        public DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    // ==========================================================
    private DictionaryPair[] table;
    private int counter;

    public Dictionary() {
        this.table = new DictionaryPair[10];
    }

    public void put(String key, String value) {
        for (int i = 0; i < counter; i++) {
            DictionaryPair current = table[i];
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

        }

        DictionaryPair newPair = new DictionaryPair(key, value);
        table[counter] = newPair;
        counter++;
    }

    public String get(String key) {
        for (int i = 0; i < counter; i++) {
            DictionaryPair current = table[i];
            if (current.key.equals(key)) {
                return current.value;
            }
        }
        return null;
    }

    public DictionaryPair[] getTable() {
        return table;
    }

    public int getCounter() {
        return counter;
    }


    // ==========================================================
    public class Translator {
        private String[] translate;
        public String[] translate(String[] words) {
            String[] translate = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                translate [i] = get(words[i]);
            }
            return translate = translate;
        }

    }
}

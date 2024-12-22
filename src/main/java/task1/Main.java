package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Cat1");
        words.add("Cat");
        words.add("Cat2");
        words.add("Cat");
        words.add("Cat3");
        words.add("Cat");
        words.add("Cat4");
        words.add("Cat");
        words.add("Cat5");
        words.add("Cat");
        words.add("Cat6");


        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word1 : wordsCount.keySet()) {
            System.out.println(word1);
        }

        System.out.println("Подсчет слов:");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

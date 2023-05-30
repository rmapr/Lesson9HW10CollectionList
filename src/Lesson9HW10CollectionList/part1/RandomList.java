package Lesson9HW10CollectionList.part1;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public static final List<String> WORDS_LIST =
            List.of("RED", "GREEN", "WHITE", "BLUE", "BLACK", "YELLOW", "GREY", "ORANGE", "VIOLET", "BRAWN", "BEIGE");

    public static List<String> getList(List<String> words, int countWords) {
        ArrayList<String> arrayListWord = new ArrayList<>();
        for (int i = 0; i < countWords; i++) {
            arrayListWord.add(words.get((int) (Math.random() * 10)));
        }
        return arrayListWord;
    }

    public static String wordPattern(List<String> words) {
        return words.get((int) (Math.random() * 10));
    }
}

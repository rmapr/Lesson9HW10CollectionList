package Lesson9HW10CollectionList.part1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Random List Words");
        List<String> listWords = RandomList.getList(RandomList.WORDS_LIST, 15);
        for (String ls : listWords) {
            System.out.print(ls + " ");
        }
        String pattern = RandomList.wordPattern(RandomList.WORDS_LIST);
        int cOccurance = countOccurance(listWords, pattern);
        if (cOccurance != 0) {
            System.out.println("\nКількість входжень " + pattern + " у список, дорівнює " + cOccurance);
        } else System.out.println("\nВходжень " + pattern + " у список немає.");

        System.out.println("\nTask 2 Array -> List");
        Integer[] arrayInt = {13, 16, 5, 54, 78, 31, 16, 13};
        String[] arrayString = {"Red", "Green", "Blue", "Yellow", "Orange"};
        List<String> stringList = toList(arrayString);
        List<Integer> intList = toList(arrayInt);
        System.out.println("Array String:" + Arrays.toString(arrayString) + "\nList String:" + stringList);
        System.out.println("Array Integer:" + Arrays.toString(arrayInt) + "\nList Integer " + intList);

        System.out.println("\nTask 3. First array look Up");
        System.out.println(findUnique(intList));

        System.out.println("\nTask 4.1. calcOccurance");
        calcOccurance(listWords);

        System.out.println("\nTask 4.2. findOccurance");
        List<WordsCount> wordsCounts = findOccurance(listWords);
        for (WordsCount wC : wordsCounts) {
            System.out.println(wC);
        }
    }

    //1. Створити метод countOccurance
    private static int countOccurance(List<String> words, String str) {
        int count = 0;
        for (String st : words) {
            if (st.equalsIgnoreCase(str)) {
                count++;
            }
        }
        return count;
    }

    //2. Створити метод toList
    private static <T> List<T> toList(T[] arrayStr) {
        List<T> listStr = new ArrayList<>();
        for (T t : arrayStr) {
            listStr.add(t);
        }
        return listStr;
    }

    //3. Створити метод findUnique
    private static Set<Integer> findUnique(List<Integer> list) {
        return new HashSet<>(list);
    }

    //4.1. ** Створити метод calcOccurance
    private static void calcOccurance(List<String> words) {
        Set<String> stringSet = new TreeSet<>(words);
        int count;
        for (String str : stringSet) {
            count = 0;
            for (String strList : words) {
                if (str.equals(strList)) {
                    count++;
                }
            }
            System.out.println(str + ": " + count);
        }
    }

    //4.2 *** Створити метод findOccurance
    private static List<WordsCount> findOccurance(List<String> words) {
        List<WordsCount> wordsCountsList = new ArrayList<>();
        Set<String> stringSet = new TreeSet<>(words);
        int count;
        for (String str : stringSet) {
            count = 0;
            for (String strList : words) {
                if (str.equals(strList)) {
                    count++;
                }
            }
            wordsCountsList.add(new WordsCount(str, count));
        }
        return wordsCountsList;
    }
}

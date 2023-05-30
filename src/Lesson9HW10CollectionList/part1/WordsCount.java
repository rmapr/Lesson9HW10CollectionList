package Lesson9HW10CollectionList.part1;

public class WordsCount {
     String name;
     int count;

     public WordsCount() {
     }

     public WordsCount(String name, int count) {
          this.name = name;
          this.count = count;
     }

     @Override
     public String toString() {
          return "WordsCount{" +
                  "name='" + name + '\'' +
                  ", count=" + count +
                  '}';
     }
}

package Lesson9HW10CollectionList.phonebook;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Subscriber("Сергій", "111 111-11-11"));
        phonebook.add(new Subscriber("Микола", "111 333-33-33"));
        phonebook.add(new Subscriber("Микола", "111 222-22-22"));
        phonebook.add(new Subscriber("Ольга", "111 444-44-44"));
        phonebook.add(new Subscriber("Марина", "111 555-55-55"));
        phonebook.add(new Subscriber("Микола", "111 666-66-66"));

        String name = "Микола";
        System.out.println("\nПошук першого " + name);
        Subscriber sub1;
        sub1 = phonebook.find(name);
        if (sub1 != null) {
            System.out.println(sub1);
        } else System.out.println(name + "  не знайдено в книзі");

        System.out.println("\nПошук всіх " + name);
        ArrayList<Subscriber> arrayList;
        arrayList = phonebook.findall(name);
        if (!arrayList.isEmpty()) {
            for (Subscriber aL : arrayList) {
                System.out.println(aL);
            }
        } else {
            System.out.println(name + "  не знайдено в книзі");
        }

    }
}

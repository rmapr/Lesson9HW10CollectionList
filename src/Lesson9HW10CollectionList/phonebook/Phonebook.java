package Lesson9HW10CollectionList.phonebook;

import java.util.ArrayList;

public class Phonebook {
    private final ArrayList<Subscriber> subscr;

    public Phonebook() {
        this.subscr = new ArrayList<>();
    }

    public boolean add(Subscriber sub) {
        subscr.add(sub);
        System.out.println(sub);
        return true;
    }

    public Subscriber find(String name) {
        for (Subscriber subscriber : subscr) {
            if (subscriber.getName().equals(name)) {
                return subscriber;
            }
        }
        return null;
    }

    public ArrayList<Subscriber> findall(String name) {
        ArrayList<Subscriber> subscriberArrayList = new ArrayList<>();
        for (Subscriber sub : subscr) {
            if (sub.getName().equals(name)) {
                subscriberArrayList.add(sub);
            }
        }
        return subscriberArrayList;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "subscr=" + subscr +
                '}';
    }
}

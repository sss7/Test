package test;
//sss
// dym91@list.ru
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private String family;

    private static List<Person> personList = new ArrayList<>();

    private Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

//    private String getName() {
//        return name;
//    }
//    private String getFamily() {
//        return family;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setFamily(String family) {
//        this.family = family;
//    }


    @Override
    public int compareTo(Person o) {
        return family.equals(o.family) ? name.compareTo(o.name) : family.compareTo(o.family);
    }

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        createPersonList();
        printList();
        Collections.sort(personList);
        printList();
    }

    private static void createPersonList() {
        personList.add(new Person("Richard", "Strauss"));
        personList.add(new Person("Antonio", "Salieri"));
        personList.add(new Person("Niccolo", "Paganini"));
        personList.add(new Person("Frederic", "Chopin"));
        personList.add(new Person("Franz", "Schubert"));
        personList.add(new Person("Felix", "Mendelssohn"));
        personList.add(new Person("Robert", "Schumann"));
        personList.add(new Person("Johannes", "Brahms"));
        personList.add(new Person("Felix", "Schumann"));
        personList.add(new Person("Giuseppe", "Verdi"));
        personList.add(new Person("Franz", "Liszt"));
        personList.add(new Person("Adam", "Liszt"));
        personList.add(new Person("Franz", "Kafka"));
        personList.add(new Person("Antonio", "Vivaldi"));
        personList.add(new Person("August", "Schumann"));
    }

    private static void printList() {
        for (Person p : personList) {
            System.out.println(p.name + " " + p.family);
        }
        System.out.println("-----");
    }


}

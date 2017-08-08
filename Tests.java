package test;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Tests {

    public static void main(String[] args) {




        ArrayList<Integer> listA = new ArrayList<Integer>();
        LinkedList<Integer> listL = new LinkedList<Integer>();

//        for (int i = 0; i < 100000; i++) {
//            listA.add(i);
//            listL.add(i);
//        }

//        readFromList(listA, listL);
//        insertToList(listA, listL);


        removeFromList();

//        List labels = new ArrayList();
//        labels.add("Lab 1");
//        labels.add("Lab 2");
//        Iterator iterator = labels.iterator();
//        System.out.println((String) iterator.next());
//        labels.add("Lab 3");
//        if (iterator.hasNext()) {
//            System.out.println("hasNext");
//            //} else
//            System.out.println((String) iterator.next());
//        }

    }


    public static void removeFromList() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }

        removeWithIterator(list);
        removeWithoutIterator(list);

    }

    public static void removeWithIterator(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("5")) {
                it.remove();
//                list.remove(value);
            }
        }
        for (String s : list) {
            System.out.println("List value: " + s);
        }
        System.out.println();
    }

    public static void removeWithoutIterator(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("5")) {
//                list.remove(list.get(i));
                list.remove("5");
            }
            System.out.println("List value: " + list.get(i));
        }
        System.out.println();
    }



    public static void readFromList(ArrayList<Integer> listA, LinkedList<Integer> listL) {

        int value = 0;
        int size = 10000;

        Date date1 = new Date();

        for (int i = 0; i < size; i++) {
            value = listA.get((int) (Math.random() * size));
        }

        Date date2 = new Date();

        for (int i = 0; i < size; i++) {
            value = listL.get((int) (Math.random() * size));
        }

        Date date3 = new Date();

        System.out.println("reading...");
        System.out.println("ArrayList:  " + (date2.getTime() - date1.getTime()));
        System.out.println("LinkedList: " + (date3.getTime() - date2.getTime()));

    }

    public static void insertToList(ArrayList<Integer> listA, LinkedList<Integer> listL) {

        int value = 0;
        int size = 10000;

        Date date1 = new Date();

        for (int i = 0; i < size; i++) {
            value = (int) (Math.random() * size);
            listA.add(value, value);
        }

        Date date2 = new Date();

        for (int i = 0; i < size; i++) {
            value = (int) (Math.random() * size);
            listL.add(value, value);
        }

        Date date3 = new Date();

        System.out.println("insert...");
        System.out.println("ArrayList:  " + (date2.getTime() - date1.getTime()));
        System.out.println("LinkedList: " + (date3.getTime() - date2.getTime()));

    }


}

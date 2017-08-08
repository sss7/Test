package test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.*;//Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by psushenko on 17.07.2017.
 */
class collections {
//    рublіc class ThrеadTеst {
//        public statiс vоid mаin(String[] аrgs) throws IntеrruрtedExcеption {
//            Thrеаd threаd = nеw Тhread(nеw TеstThread());
//            System.оut.println("Неllо, іt's a mаіn thread");
//            thrеаd.stаrt();
//            threаd.joіn();
//            Sуstem.оut.println("Goоd bye");
//        }
//    }
//
//    сlаss ТestТhread implеmеnts Runnablе {
//
//        @Оverrіdе
//        publіc void run() {
//            System.оut.prіntln("Hellо, it's а simрlе thrеad");
//        }
//
//        publiс vоіd joіn() {
//            Systеm.out.prіntln("Неllо, іt's а method joіn()");
//        }
//    }


//    static class A {
//        public static void m(int k){
//            System.out.println("class A, method m : " + ++k);
//        }
//    }
//
//    static class B extends A {
//        public static void m(int k) {
//            System.out.println("class B, method m : " + k++);
//        }
//    }

//    static int getCapacity(ArrayList<?> l) throws Exception {
//        Field dataField = ArrayList.class.getDeclaredField("elementData");
//        dataField.setAccessible(true);
//        return ((Object[]) dataField.get(l)).length;
//    }



    public static void main(String[] args) throws Throwable {




//        Integer i1 = 1000;
//        Integer i2 = 2000;
//        String s = new String("sssss");
//        s.concat("-aaa");
//        System.out.println(s);

//        int i = 0;
//        i++;
//        System.out.print(i);
//        i = i++;
//        System.out.println(i);

//byte b = 1;
//        System.out.println(b);
//
//int i = 0;
//i++;
//        System.out.println(i);
//        i = i++;
//        System.out.println(i);
//
//        int x = 555;
//        System.out.println(x == (Integer) 555);
//
//        StringBuffer buffer = new StringBuffer("qqqq");
//        System.out.println(buffer);

//        System.out.println(0.2d == 0.1d + 0.1d);
//        System.out.println(0.2 == 0.1d + 0.1d);
//        System.out.println(0.3d == 0.1d + 0.1d + 0.1d);
//        System.out.println(0.3 == 0.1d + 0.1d + 0.1d);

//        System.out.println((Integer) 1000 == (Integer) 1000);
//        System.out.println((Integer) 10 == (Integer) 10);

//        String s1 = "Java";
//        String s2 = new String("java");
//        if (s1.equalsIgnoreCase(s2)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }


//        int[] arr = new int[2];
//        arr[0] = 10;
//        arr[1] = 20;
//        System.out.println(arr[0] +":"+ arr[1]);

//        List<String> names = new ArrayList<String>();
//        names.add("Robb");
//        names.add("Bran");
//        names.add("Rick");
//        names.add("Bran");
//        if (names.remove("Bran")) {
//            names.remove("Jon");
//        }
//        System.out.println(names);


//        int[] arr = new int[]{1,2,5,3,6,1};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        List<Integer> list = Arrays.asList(1, 2, 3); //new ArrayList<Integer>();
//        List<Integer> list1 = new ArrayList<Integer>();
//
//        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8);
//        list1.add(5);
//        System.out.println(list);
//        System.out.println(list1);
//
//        Collections.sort(list1);
//        System.out.println(list1);


//        ArrayList<Integer> list = new ArrayList<Integer>(12);
//        int count = 0;
//        int capacity = 0;
//        int getCapacity = 0;
//        for (int i = 0; i < 20_000; i++) {
//            list.add(i);
//            getCapacity = getCapacity(list);
//            if (getCapacity != capacity) {
//                capacity = getCapacity;
//                count++;
//            }
//            System.out.println("Size: " +  list.size() + " \t Capacity: " + getCapacity(list) + " \t" + count);
//        }

//        int[] arr = new int[10];
//        int[] arr2 = new int[12];
//        Arrays.fill(arr, 5);
//        Arrays.fill(arr2, 7);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//
//        System.arraycopy(arr, 0, arr2, 1, arr.length);
//
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));


//        A a = new B();
//        a.m(34);  /* если методы m статические, то берется метод из класса A */
//                  /* если методы m НЕ статические, то берется метод из класса B */
//                  /* наследовать и переопределять можно только нестатические методы */


//        System.out.println(0.0 / 0.0);

//        int i = 0;
//        i++;
//        System.out.println(i);
//        i = i++;
//        System.out.println(i);

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        list.add(8);
//        list.add(8);
//        list.add(8);
//        list.add(8);
//        list.add(8);
//
//        System.out.println(list);
//        list.remove(5);
//        System.out.println(list);


//        Date startTime = new Date();
//        long endTime = startTime.getTime() + 5000;
//        Date endDate = new Date(endTime);
//
//        try {
//            Thread.sleep(3000);
//        } catch (Throwable t) {
//            System.out.println("sleep");
//        }
//
//        while (!(new Date()).after(endDate)) {
//            System.out.println("wait me, please");
//            try {
//                Thread.sleep(200);
//            } catch (Throwable t) {
//                System.out.println("sleep...");
//            }
//        }
//        System.out.println("End time!");


//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "h", "a", "c", "b", "e", "d", "f", "g", "a", "c");
//
//        LinkedList<String> listL = new LinkedList<>(list);
//        HashSet<String> setH = new HashSet<>(list);
//        TreeSet<String> setT = new TreeSet<>(list);
//
//        System.out.println(list.iterator());
//        System.out.println(listL.iterator());
//        System.out.println(setH.iterator());
//        System.out.println(setT.iterator());


//        Set<String> set = new TreeSet<String>();
//        set.add("крыса");
//        set.add("кошка");
//        set.add("собака");
//        System.out.println(set);
//
//        if("собака".compareTo("крыса") < 0) {
//            System.out.println("1 < 2");
//        } else {
//            System.out.println("1 >= 2");
//        }
//        if("кошка".compareTo("собака") < 0) {
//            System.out.println("1 < 2");
//        } else {
//            System.out.println("1 >= 2");
//        }
    }
}

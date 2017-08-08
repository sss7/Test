package test;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class capacityArrayList {

    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }

    public static void main(String[] args) throws Throwable {

        ArrayList<Integer> list = new ArrayList<Integer>(/*12*/);
        int count = 0;
        int capacity = 0;
        int getCapacity = 0;
        for (int i = 0; i < 100; i++) {
            list.add(i);
            getCapacity = getCapacity(list);
            if (getCapacity != capacity) {
                capacity = getCapacity;
                count++;
            }
            System.out.println("Size: " + list.size() + " \t Capacity: " + getCapacity(list) + " \t" + count);
        }

    }

}

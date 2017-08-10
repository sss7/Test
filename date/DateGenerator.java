package test.date;

import java.io.*;
import java.util.*;
import java.text.*;

public class DateGenerator {
    static String path = "C:\\Users\\psushenko\\Desktop\\date.txt";

    public static void main(String[] args) {
        Random random = new Random();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss\r\n");
//        String path = "C:\\Users\\psushenko\\Desktop\\date.txt";

        try {
            OutputStream outputStream = new FileOutputStream(path);

            long number = -1;
            long number2 = -1;
            for (int i = 0; i < 250000; i++) { //250000
                while (number < 0 || number == number2) {
                    number = new Date(random.nextLong()).getTime() % new Date().getTime();
                }
                number2 = number;

                outputStream.write(dateFormat.format(number).getBytes());
                System.out.print(dateFormat.format(number));
//                System.out.println(new Date(number));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

package test.date;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateGenerator {

    public static void main(String[] args) {
        Random random = new Random();
//        long value = -1;
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss\r\n");

/*        for (int i = 0; i < 10; i++) {
            while (value < 0)
                value = random.nextLong();
//            System.out.println(value);
//            System.out.println(new Date(value));
            System.out.println(dateFormat.format(value));
        }
*/


        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\psushenko\\Desktop\\date.txt");


            int number = -1;
            int number2 = -1;
            for (int i = 0; i < 10; i++) { //250000
                while (number < 0 || number == number2) {
//                    number = (int) (Math.random() * Integer.MAX_VALUE);
                    number = random.nextInt(Integer.MAX_VALUE);
//                number = (long) (Math.random() * Long.MAX_VALUE * 31);
//                number = ((int)(Math.random() * Integer.MAX_VALUE - i)) * Integer.MAX_VALUE;
                }

                outputStream.write(dateFormat.format(number).getBytes());

//            System.out.println(number);
                number2 = number;
//            double d = random.nextDouble();
//            System.out.println(d);
//            System.out.println((long) (d * Integer.MAX_VALUE));
//            System.out.println(new Date((long) (d * Integer.MAX_VALUE)));
//            System.out.println(dateFormat.format((long) (d * Long.MAX_VALUE)));

//            System.out.println(value);
//            System.out.println(new Date(value));
                System.out.print(dateFormat.format(number));
//            System.out.println(new Date(number));
//            System.out.println();
            }


        }// catch (FileNotFoundException e) {
//        //    e.printStackTrace();
        //}
        catch (IOException ex) {
//            e.printStackTrace();
        }


    }

}

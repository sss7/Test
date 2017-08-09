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
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss\r\n");

        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\psushenko\\Desktop\\date.txt");

            long number = -1;
            long number2 = -1;
            for (int i = 0; i < 10; i++) { //250000
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

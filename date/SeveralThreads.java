package test.date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeveralThreads {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss\r\n");


        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\psushenko\\Desktop\\date.txt");

            while (inputStream.available() > 0) {
                int data = inputStream.read();

//                data = new Date(data);

            }

        }// catch (FileNotFoundException e) {
           // e.printStackTrace();
        //}
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}

package test.date;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeveralThreads implements Runnable {
    static String path = "C:\\Users\\psushenko\\Desktop\\date.txt";
    static BufferedReader reader;

    public static void main(String[] args) {
        SeveralThreads runner = new SeveralThreads();
        Thread thread1 = new Thread(runner);
        Thread thread2 = new Thread(runner);

        try {
            reader = new BufferedReader(new FileReader(new File(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        thread1.start();
        thread2.start();
    }


    public void run () {
        System.out.println(">>>");
        threads();
    }


    public static void threads() {

        try {
//            File file = new File(path);
//            FileReader fr = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fr);
//            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            Date parsingDate;

            String line;
            while ((line = reader.readLine()) != null) {
                parsingDate = dateFormat.parse(line);
//                System.out.println(parsingDate);
//                System.out.println(dateFormat.format(parsingDate));
                System.out.println(dateFormat.format(parsingDate.getTime()) + " " + Thread.currentThread().getName());
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}

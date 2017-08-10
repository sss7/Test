package test.date;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SeveralThreads implements Runnable {
    static String path = DateGenerator.path; //"C:\\Users\\psushenko\\Desktop\\date.txt";
    static String fileOut = "C:\\Users\\psushenko\\Desktop\\fileOut.txt";
    static BufferedReader reader;
    static List<Date> dateList = new ArrayList<>();
    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss\r\n");

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

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        Collections.sort(dateList);


        try {
            OutputStream outputStream = new FileOutputStream(fileOut);
            for (Date date : dateList) {
                System.out.print(dateFormat.format(date));
                outputStream.write(dateFormat.format(date).getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void run () {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); //WHY!?
            Date parsingDate;

            String line;
            while ((line = reader.readLine()) != null) {
                parsingDate = dateFormat.parse(line);
                System.out.println(dateFormat.format(parsingDate) + " " + Thread.currentThread().getName());
//                Date date = new Date(parsingDate.getTime());
//                dateList.add(new Date(parsingDate.getTime()));
                recordList(new Date(parsingDate.getTime()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public synchronized void recordList(Date date) {
        dateList.add(date);
    }



}

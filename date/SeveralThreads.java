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
//    static BufferedReader reader;
    static List<Date> dateList = new ArrayList<>();
    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss\r\n");
    static int n;

    public static void main(String[] args) {
        n = Integer.parseInt(args[0]); //2// количество потоков

        SeveralThreads runner = new SeveralThreads();
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Thread(runner);
        }

//        try {
//            reader = new BufferedReader(new FileReader(new File(path)));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Date date1 = new Date(); /////////////////////////////////

        for (int i = 0; i < n; i++) {
            threads[i].start();
        }

        try {
            for (int i = 0; i < n; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date2 = new Date(); /////////////////////////////////


        Collections.sort(dateList);


        try {
            OutputStream outputStream = new FileOutputStream(fileOut);
            for (Date date : dateList) {
//                System.out.print(dateFormat.format(date));
                outputStream.write(dateFormat.format(date).getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println((date2.getTime() - date1.getTime())/1000 + "\tms");
        System.out.println(date2.getTime() - date1.getTime() + "\ts");

    }


    public void run () {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //WHY!?
            Date parsingDate;

            int numberOfThread = Integer.parseInt(Thread.currentThread().getName().split("-")[1]);
//            System.out.println(numberOfThread);
            int dateLength = 21; //reader.readLine().getBytes().length + 2; // 2 - перевод строки

            reader.skip(((DateGenerator.count * dateLength)/n) * numberOfThread);

            String line;
//            while ((line = reader.readLine()) != null) {
            for (int i = 0; i < DateGenerator.count / n; i++){
                line = reader.readLine();
                if (line == null) break;
                parsingDate = dateFormat.parse(line);
//                System.out.println(dateFormat.format(parsingDate) + " " + Thread.currentThread().getName());
//                Date date = new Date(parsingDate.getTime());
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

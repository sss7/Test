package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogRefactor implements Runnable {
    private static String logOut = "C:\\Users\\psushenko\\Desktop\\result.xml";
    private static String path = "C:\\Users\\psushenko\\Desktop\\SystemOut_17.07.25_04.58.27.log";
//private static String path = "C:\\Users\\psushenko\\Desktop\\Log.log";
    private static List<String> list = new ArrayList<>(10000);
    private static int n;

    public static void main(String[] args) {
        n = Integer.parseInt(args[0]);

        LogRefactor runner = new LogRefactor();
        Thread[] threads = new Thread[n];

        for (int i = 0; i < n; i++)
            threads[i] = new Thread(runner);

        Date date1 = new Date();
        for (Thread t : threads)
            t.start();

        try {
            for (Thread t : threads)
                t.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();

        System.out.println(date2.getTime() - date1.getTime());

        try {
            OutputStream outputStream = new FileOutputStream(new File(logOut));
            outputStream.write("<result>\r\n".getBytes());
            for (String s : list) {
                outputStream.write((s + "\r\n").getBytes());
            }
            outputStream.write("</result>".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        System.out.println(list.size());
    }


    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            List<String> listErr = new ArrayList<>(1500);

            int numberOfThread = Integer.parseInt(Thread.currentThread().getName().split("-")[1]);
            long fileSize = new File(path).length();
            long blockSize = fileSize / n;

            reader.skip(blockSize * numberOfThread);

            String line;
            int currentSize = 0;
            while (currentSize < blockSize && (line = reader.readLine()) != null) {

                currentSize += (line.length()  + 1);

                if (!line.startsWith("[")) continue;
                if (line.contains("ERROR")) {
//                    System.out.println(numberOfThread + "\t" + line);
                    listErr.add(parserForLog(line));

                    if (listErr.size() == 1000) {
                        recordList(listErr);
                    }
                }

            }
            recordList(listErr);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String parserForLog(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("[\\[\\]]");
        if (arr.length != 5) {
            sb.append("\t<element>\r\n\t\t<timestamp>\r\n\t\t\t");
            sb.append("\r\n\t\t</timestamp>");
            sb.append("\r\n\t\t<logger>\r\n\t\t\t");
            sb.append("\r\n\t\t</logger>");
            sb.append("\r\n\t\t<body>\r\n\t\t\t");
            sb.append(s);
            sb.append("\r\n\t\t</body>\r\n\t</element>");
        } else {
            sb.append("\t<element>\r\n\t\t<timestamp>\r\n\t\t\t");
            sb.append(arr[1]);
            sb.append("\r\n\t\t</timestamp>");
            sb.append("\r\n\t\t<logger>\r\n\t\t\t");
            sb.append(arr[3]);
            sb.append("\r\n\t\t</logger>");
            sb.append("\r\n\t\t<body>\r\n\t\t\t");
            sb.append(arr[4]);
            sb.append("\r\n\t\t</body>\r\n\t</element>");
        }
        return sb.toString();
    }

    private synchronized void recordList(List<String> listErr) {
        list.addAll(listErr);
        listErr.clear();
    }

}

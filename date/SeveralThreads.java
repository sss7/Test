package test.date;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeveralThreads {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        try {

            File file = new File("C:\\Users\\psushenko\\Desktop\\date.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            Date parsingDate;

            String line;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                line = line.replace("\n", "");
//                line = line.replace("\r", "");

                parsingDate = dateFormat.parse(line);
                System.out.println(parsingDate);
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

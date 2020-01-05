package by.traning.task8oop.dao;

import by.traning.task8oop.bean.Airline;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderAirline {
    List<String> lines = new ArrayList<>();
    Airline airline  = new Airline();

    public void readAirlineFile()  {
        Path path = Paths.get("C:\\Users\\Вероника\\Desktop\\JavaST_24\\file.txt");
        Stream<String> lineStream = null;
        try {
            lineStream = Files.newBufferedReader(path).lines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines = lineStream.collect(Collectors.toList());
            System.out.println(lines);
    }


    public List<Airline> readObjectAirline() {
      /*  FileInputStream fis = new FileInputStream("temp.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);

        while (true) {
            try {
               airlineList.add((Airline) oin.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }finally {
                fis.close();
            }
        }
*/
        System.out.println("Работатет кастыль ");
        List<Airline> airlines = Airline.createAirlineList();

        return airlines;
    }

    public Airline readObjectAirlineWeekDay() throws IOException {
       FileInputStream fis = new FileInputStream("C:\\Users\\Вероника\\Desktop\\JavaST_24\\newFileWeekdayObject.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        while (true) {
            try {
               airline = (Airline) oin.readObject();
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }finally {
                fis.close();
            }
        }
        return airline;
    }


}

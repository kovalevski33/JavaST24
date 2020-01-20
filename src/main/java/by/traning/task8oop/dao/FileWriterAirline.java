package by.traning.task8oop.dao;

import by.traning.task8oop.entity.Airline;

import java.io.*;
import java.util.List;

public class FileWriterAirline {

    public void writeFileCity(List<Airline> airlineList) {
        File file = new File("C:\\Users\\Вероника\\Desktop\\JavaST_24\\newFileCity.txt");
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(airlineList.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileWeekday(List<Airline> airlineList) {
        File file = new File("C:\\Users\\Вероника\\Desktop\\JavaST_24\\newFileWeekday.txt");
        File file1 = new File("C:\\Users\\Вероника\\Desktop\\JavaST_24\\newFileWeekdayObject.txt");
        try {
            file.createNewFile();
            file1.createNewFile();
            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(airlineList);
            objectOutputStream.flush();
            objectOutputStream.close();
            writer.write(airlineList.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeFileDepartureTime(String airlineDeparture)  {
        File file = new File("C:\\Users\\Вероника\\Desktop\\JavaST_24\\newFileDeparture.txt");
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(airlineDeparture);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

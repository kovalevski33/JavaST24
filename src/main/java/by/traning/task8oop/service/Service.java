package by.traning.task8oop.service;

import by.traning.task8oop.entity.Airline;
import by.traning.task8oop.entity.City;
import by.traning.task8oop.entity.Weekday;
import by.traning.task8oop.dao.FileReaderAirline;
import by.traning.task8oop.dao.FileWriterAirline;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private FileReaderAirline fileReaderAirline = new FileReaderAirline();
    private FileWriterAirline fileWriterAirline = new FileWriterAirline();
    private List<Airline> airlineList = new ArrayList<>();


    public void writeFileCity(City city)  {
        List<Airline> airlines = fileReaderAirline.readObjectAirline();

        for (int i = 0; i < airlines.size(); i++) {
            Airline airline = airlines.get(i);
            if (airline.getDestination().equals(city)) {
                airlineList.add(airlines.get(i));
            }
        }
        fileWriterAirline.writeFileCity(airlineList);
        airlineList.clear();
    }

    public void writeFileWeekday(Weekday weekday) {
        List<Airline> airlines = fileReaderAirline.readObjectAirline();

        for (int i = 0; i < airlines.size(); i++) {
            Airline airline = airlines.get(i);
            if (airline.getWeekday().equals(weekday)) {
                airlineList.add(airlines.get(i));
            }
        }
        fileWriterAirline.writeFileWeekday(airlineList);
        airlineList.clear();
    }

    public void writeDepartureTimeTimeFile(int a, Weekday weekday)  {
        List<Airline> airlines = fileReaderAirline.readObjectAirline();

        for (int i = 0; i < airlines.size(); i++) {
            Airline airline = airlines.get(i);
            if (airline.getWeekday().equals(weekday) && a<airline.getDepartureTime()) {
                airlineList.add(airlines.get(i));
            }
        }
        if (airlineList.isEmpty()){
            System.out.println("Рейсов нет");
        }
        else {
            fileWriterAirline.writeFileDepartureTime(airlineList.toString());
            airlineList.clear();
        }
    }
}

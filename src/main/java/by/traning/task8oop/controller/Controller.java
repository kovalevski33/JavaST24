package by.traning.task8oop.controller;


import by.traning.task8oop.bean.City;
import by.traning.task8oop.bean.Weekday;
import by.traning.task8oop.service.Service;

public class Controller {
   private Service service = new Service();

        public void createCityFile (City city)  {
            service.writeFileCity(city);
                }

    public void createWeekdayFile(Weekday weekday) {
            service.writeFileWeekday(weekday);
    }

    public void createTimeFile(int a, Weekday weekday)  {
            service.writeDepartureTimeTimeFile(a, weekday);
    }
}

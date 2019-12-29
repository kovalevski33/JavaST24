package by.traning.task8oop.Controller;


import by.traning.task8oop.Bean.City;
import by.traning.task8oop.Bean.Weekday;
import by.traning.task8oop.Service.Service;

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

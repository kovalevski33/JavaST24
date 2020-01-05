package by.traning.task8oop.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Airline implements Serializable {
    private City destination;
    private int flightNumber;
    private String aircraftType;
    private int departureTime;
    private Weekday weekday;

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", weekday=" + weekday +
                '}';
    }


    public Airline() {
    }


    public Airline(City destination, int flightNumber, String aircraftType, int departureTime, Weekday weekday) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekday = weekday;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    public static ArrayList<Airline> createAirlineList(){
        ArrayList<Airline> airlineList  = new ArrayList<>();
        airlineList.add(new Airline(City.Moscow,367,"Boing-747",4,Weekday.MONDAY));
        airlineList.add(new Airline(City.Kiev,367,"Boing-747",4,Weekday.TUESDAY));
        airlineList.add(new Airline(City.Minsk,367,"Boing-747",4,Weekday.WEDNESDAY));
        airlineList.add(new Airline(City.Moscow,367,"Boing-747",4,Weekday.THURSDAY));
        airlineList.add(new Airline(City.Kiev,367,"Boing-747",4,Weekday.FRIDAY));
        airlineList.add(new Airline(City.Minsk,367,"Boing-747",4,Weekday.SATURDAY));
        airlineList.add(new Airline(City.Moscow,367,"Boing-747",4,Weekday.SUNDAY));
        airlineList.add(new Airline(City.Kiev,367,"Boing-747",4,Weekday.MONDAY));
        return airlineList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                departureTime == airline.departureTime &&
                destination == airline.destination &&
                Objects.equals(aircraftType, airline.aircraftType) &&
                weekday == airline.weekday;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, aircraftType, departureTime, weekday);
    }
}

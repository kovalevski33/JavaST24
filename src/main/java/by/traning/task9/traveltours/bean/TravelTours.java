package by.traning.task9.traveltours.bean;

import java.util.ArrayList;
import java.util.Objects;

public class TravelTours implements Comparable<TravelTours> {
  private String travelName;
  private TourType tourType;
  private int coast;
  private int tourDay;
  private Transport transport;
  private Nutrition nutrition;

    public TravelTours(String travelName, TourType tourType, int coast, int tourDay, Transport transport, Nutrition nutrition) {
        this.travelName = travelName;
        this.tourType = tourType;
        this.coast = coast;
        this.tourDay = tourDay;
        this.transport = transport;
        this.nutrition = nutrition;
    }

    public TravelTours() {
    }

    public static ArrayList<TravelTours> createTravelToursList(){
        ArrayList<TravelTours> travelToursList  = new ArrayList<>();
        travelToursList.add(new TravelTours("Карибы", TourType.RELAX,1000,12, Transport.AIRPLANE, Nutrition.THREE));
        travelToursList.add(new TravelTours("В Польшу за тряпками", TourType.SHOPPING,80,2, Transport.BUS, Nutrition.NONE));
        travelToursList.add(new TravelTours("Ночной Берлин", TourType.EXCURSION,250,5, Transport.TRAIN, Nutrition.ONE));
        travelToursList.add(new TravelTours("Пять островов", TourType.CRUISE,1250,14, Transport.SHIP, Nutrition.THREE));
        travelToursList.add(new TravelTours("Подлечиться и Прокапаться", TourType.TREATMENT,500,7, Transport.BUS, Nutrition.TWO));
        return travelToursList;
    }

    @Override
    public String toString() {
        return  "Название тура: " + travelName +
                ", тип отдыха: " + tourType +
                ", стоимость: " + coast + " чеканных монет" +
                ", количество дней отдыха: " + tourDay +
                ", вид транспорта: " + transport +
                ", количество приёмов пищи в день: " + nutrition;
    }

    public String getTravelName() {
        return travelName;
    }

    public TourType getTourType() {
        return tourType;
    }

    public int getCoast() {
        return coast;
    }

    public int getTourDay() {
        return tourDay;
    }

    public Transport getTransport() {
        return transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public void setTourDay(int tourDay) {
        this.tourDay = tourDay;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public int compareTo(TravelTours travelTours) {
        return (this.coast - travelTours.coast);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelTours that = (TravelTours) o;
        return coast == that.coast &&
                tourDay == that.tourDay &&
                Objects.equals(travelName, that.travelName) &&
                tourType == that.tourType &&
                transport == that.transport &&
                nutrition == that.nutrition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(travelName, tourType, coast, tourDay, transport, nutrition);
    }
}

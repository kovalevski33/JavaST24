package by.traning.task9.traveltours.service;

import by.traning.task9.traveltours.bean.Nutrition;
import by.traning.task9.traveltours.bean.Transport;
import by.traning.task9.traveltours.bean.TravelTours;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class TourService {

   private Transport transport;
   private String noTour = "К сожалению такого тура нет :<";

    public void chooseTour()  {
        System.out.println("Список доступных туров: " + TravelTours.createTravelToursList() + "\n");
        System.out.println("У Вас есть возможность подобрать тур по следующим параметрам \n" +
                "1. Вид транспорта: \n" +
                "2. Количество приёмов пищи в день: \n" +
                "3. Количество дней отдыха: \n" +
                "4. Сортировка туров по стоимости: ");

            int a = 0;

            a = Integer.parseInt(Objects.requireNonNull(ConsoleHelper.readString()));
            if (a<=0 || a>4){
                while (a<=0 || a>4){
                    System.out.println("Некорректный выбор, попробуйте ещё раз ");
                    a = Integer.parseInt(Objects.requireNonNull(ConsoleHelper.readString()));
                }
            }

        switch (a) {
            case 1: chooseTourByTransport();break;
            case 2: chooseTourByNutrition();break;
            case 3: chooseTourByDays(); break;
            case 4: chooseTourByCost(); break;
            default:
        }
    }

    private void chooseTourByCost() {
        ArrayList<TravelTours> travelToursList = TravelTours.createTravelToursList();
        Collections.sort(travelToursList);
        System.out.println(travelToursList.toString());
     }

    public void chooseTourByDays(){
        ArrayList<TravelTours> travelToursList = TravelTours.createTravelToursList();

            System.out.println("Введите количество дней прибывания:");
            int a = Integer.parseInt(Objects.requireNonNull(ConsoleHelper.readString()));
            boolean exist = false;
            for (TravelTours travelTours : travelToursList) {
            if (travelTours.getTourDay() == a) {
                exist = true;
                ConsoleHelper.printExistTour();
                System.out.println(travelTours.toString());
            }
        }
            if (!exist){
                try {
                    throw new NoTourException(noTour);
                } catch (NoTourException e) {
                    e.printStackTrace();
                }
            }
    }

    public void chooseTourByNutrition() {
        ArrayList<TravelTours> travelToursList = TravelTours.createTravelToursList();

            System.out.println("Введите количество приёма пищи: \n" +
                    "Варианты - THREE, TWO, ONE, NONE");
            String a = ConsoleHelper.readString();
            Nutrition nutrition = Nutrition.valueOf(a);
            boolean exist = false;
            for (TravelTours travelTours : travelToursList) {
            if (travelTours.getNutrition().equals(nutrition)) {
                exist = true;
                ConsoleHelper.printExistTour();
                System.out.println(travelTours.toString());
            }
        }
            if (!exist){
                try {
                    throw new NoTourException(noTour);
                } catch (NoTourException e) {
                    e.printStackTrace();
                }
            }
    }

    public void chooseTourByTransport(){
        ArrayList<TravelTours> travelToursList = TravelTours.createTravelToursList();

            System.out.println("Введите предпочитаемый вид транспорта: BUS, AIRPLANE, TRAIN, SHIP");
            String a = ConsoleHelper.readString();
            try{
               transport = Transport.valueOf(a);
            } catch (Exception e){
                e.printStackTrace();
            }
            boolean exist = false;
            for (TravelTours travelTours : travelToursList) {
            if (travelTours.getTransport().equals(transport)) {
                exist = true;
                ConsoleHelper.printExistTour();
                System.out.println(travelTours.toString());
            }
        }
            if (!exist){
                try {
                    throw new NoTourException(noTour);
                } catch (NoTourException e) {
                    e.printStackTrace();
                }
            }
        }
    }
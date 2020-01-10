package by.traning.task9.traveltours.controller;

import by.traning.task9.traveltours.service.ClientService;
import by.traning.task9.traveltours.service.TourService;

public class Controller {

    public void createClient(){
        ClientService clientService = new ClientService();
        clientService.createClient();
    }

    public void chooseTour(){
        TourService tourService = new TourService();
        tourService.chooseTour();
    }

}

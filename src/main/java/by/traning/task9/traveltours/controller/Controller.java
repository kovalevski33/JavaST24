package by.traning.task9.traveltours.controller;

import by.traning.task9.traveltours.bean.Client;
import by.traning.task9.traveltours.service.ClientService;
import by.traning.task9.traveltours.service.TourService;

public class Controller {
    ClientService clientService = new ClientService();

    public Client createClient(){
       return clientService.createClient();
    }

    public void chooseTour(){
        TourService tourService = new TourService();
        tourService.chooseTour();
    }

}

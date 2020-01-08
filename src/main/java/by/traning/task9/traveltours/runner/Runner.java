package by.traning.task9.traveltours.runner;

import by.traning.task9.traveltours.controller.Controller;

public class Runner {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createClient();
        controller.chooseTour();
    }
}

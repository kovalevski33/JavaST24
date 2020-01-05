package by.traning.task7matrix.controller;

import by.traning.task7matrix.service.Service;

import java.io.IOException;

public class Controller {
    private Service service = new Service();
    public void start() {
        try {
            service.startService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

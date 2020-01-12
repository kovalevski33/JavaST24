package by.traning.task7matrix.controller;

import by.traning.task7matrix.service.Service;

public class Controller {
    private Service service = new Service();
    public void start() {
        service.startService();
    }

}

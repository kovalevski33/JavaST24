package by.traning.task7matrix.service;

import by.traning.task7matrix.view.ConsoleHelper;

import java.io.IOException;

public class Service {
   private MatrixService matrixService = new MatrixService();

    public void startService() throws IOException {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.taskScreen();
       int a = consoleHelper.taskScan();
       switch (a){
           case 1: matrixService.firsTask(); break;
           case 2: matrixService.secondTask(); break;
           case 3: matrixService.thirdTask(); break;
           case 4: matrixService.fourthTask(); break;
       }
    }

}

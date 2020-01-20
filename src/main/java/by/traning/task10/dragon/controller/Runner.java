package by.traning.task10.dragon.controller;

import by.traning.task10.dragon.entity.Cave;
import by.traning.task10.dragon.view.ConsoleMenu;

public class Runner {
    public static Cave dragon = new Cave("Stanislav");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        dragon.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}

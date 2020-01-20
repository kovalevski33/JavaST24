package by.traning.task10.dragon.service;

import by.traning.task10.dragon.controller.Runner;
import by.traning.task10.dragon.dao.FileReader;
import by.traning.task10.dragon.entity.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceTreasure {

    public void showAllTreasure() {
        int id = 1;
        for (Treasure element : Runner.dragon.getTreasures())
            System.out.println(String.format("%-3d %-100s", id++, element));
        System.out.println();
    }

    public void chooseMostExpensive() {
        int highestPrice = 0;
        Treasure treasure = null;
        for (Treasure element : Runner.dragon.getTreasures()) {
            if(element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                treasure = element;
            }
        }
        System.out.println(treasure + "\n");

    }

    public void selectForGivenAmount(int[] valueRange) {
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure element : Runner.dragon.getTreasures()) {
            if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
                treasures.add(element);
            }
        }
        if(treasures.size() == 0) {
            System.out.println("No options found.\n");
            return;
        }
        int id = 1;
        for (Treasure element : treasures) {
            System.out.println(String.format("%-3d %-100s", id++, element));
        }
        System.out.println();
    }

    public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {
        FileReader fileReader = new FileReader();
        return fileReader.fillCaveWithTreasures(numberOfTreasure);
    }
}

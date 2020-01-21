package by.traning.task10.dragon.dao;

import by.traning.task10.dragon.entity.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {
        List<Treasure> treasures = new ArrayList<>();
        try {
            java.io.FileReader fileReader = new java.io.FileReader("C:\\Users\\Вероника\\Desktop\\JavaST_24\\list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine() && numberOfTreasure-- > 0) {
                String [] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int treasureValue = Integer.parseInt(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                switch (treasureType) {
                    case "Porcelain":
                        treasures.add(new Porcelain(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Necklace":
                        treasures.add(new Necklace(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Combat Weapon":
                        treasures.add(new CombatWeapon(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Gem":
                        treasures.add(new Gem(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + treasureType);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }
        return treasures;
    }
}

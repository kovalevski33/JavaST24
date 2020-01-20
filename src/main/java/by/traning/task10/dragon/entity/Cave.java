package by.traning.task10.dragon.entity;


import by.traning.task10.dragon.service.ServiceTreasure;

import java.util.List;

    public class Cave {
        private String name;
        private int numberOfTreasure;
        private List<Treasure> treasures;
        private ServiceTreasure serviceTreasure;

        public Cave(String name) {
            this.name = name;
            this.numberOfTreasure = 0;
            serviceTreasure = new ServiceTreasure();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfTreasure() {
            return numberOfTreasure;
        }

        public void setNumberOfTreasure(int numberOfTreasure) {
            this.numberOfTreasure = numberOfTreasure;
            this.treasures = serviceTreasure.fillCaveWithTreasures(numberOfTreasure);
        }

        public List<Treasure> getTreasures() {
            return treasures;
        }
    }


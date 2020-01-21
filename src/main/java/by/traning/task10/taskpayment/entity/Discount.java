package by.traning.task10.taskpayment.entity;

public enum Discount {

    SALE(50,"Распродажа"), STOCK(25,"Акция"),NONE(0,"Нет скидки");

    private int percent;
    private String name;

    Discount(int percent, String name) {
        this.percent = percent;
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "percent=" + percent +
                ", name='" + name + '\'' +
                '}';
    }
}

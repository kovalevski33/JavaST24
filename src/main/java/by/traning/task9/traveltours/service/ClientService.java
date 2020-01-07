package by.traning.task9.traveltours.service;

import by.traning.task9.traveltours.bean.Client;

import java.util.Objects;

public class ClientService {
   private String name;
   private String surname;
   private int phoneNumber;

    public Client createClient(){
        System.out.println("Введите имя клиента: ");
        name = ConsoleHelper.readString();
        System.out.println("Введите фамилию клиента: ");
        surname = ConsoleHelper.readString();
        System.out.println("Введите телефон клиента: ");
        phoneNumber = Integer.parseInt(Objects.requireNonNull(ConsoleHelper.readString()));
        System.out.println("Приветсвую тебя, уважаемый " + name + " " + surname + " сейчас мы найдём Вам подходящий тур...," + "а если не подберём, мы перезвоним Вам по телефону " + phoneNumber + "\n");
        return new Client(name,surname,phoneNumber);
    }
}

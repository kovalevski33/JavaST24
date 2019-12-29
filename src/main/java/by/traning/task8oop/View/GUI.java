package by.traning.task8oop.View;

import by.traning.task8oop.Bean.City;
import by.traning.task8oop.Bean.Weekday;
import by.traning.task8oop.Controller.Controller;
import by.traning.task8oop.DAO.FileReaderAirline;
import by.traning.task8oop.DAO.FileWriterAirline;
import by.traning.task8oop.Bean.Airline;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GUI extends JFrame
{
    private static final long serialVersionUID = 1L;
    private  final  String  BUTTON_NAME = "button1";
    private ArrayList<Airline> airlineArrayList = Airline.createAirlineList();
    private Controller controller = new Controller();
    private Weekday weekday;

    public GUI()
    {
        super("Пример использования Action");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Панель содержимого
        Container container = getContentPane();
        // Устанавливаем менеджер последовательного расположения
        container.setLayout(new FlowLayout());
        // Создание кнопок, выполняющих одно действие
        Action action = new SimpleAction();
        JButton button1 = new JButton(action);
        button1.setName(BUTTON_NAME);
        button1.setText("Read File");
        button1.setMnemonic('F');
        JButton button2 = new JButton(action);
        button2.setName("button2");
        button2.setText("Write File");
        button2.setMnemonic('S');
        container.add(button1);
        container.add(button2);


        String[] items = {
                City.Kiev.toString(),
                City.Minsk.toString(),
                City.Moscow.toString()
        };

        JComboBox editComboBox = new JComboBox(items);
        editComboBox.setEditable(true);
        container.add(editComboBox);
        editComboBox.addActionListener(actionListener);

        String[] weekday = {
                Weekday.MONDAY.toString(),
                Weekday.TUESDAY.toString(),
                Weekday.WEDNESDAY.toString(),
                Weekday.THURSDAY.toString(),
                Weekday.FRIDAY.toString(),
                Weekday.SATURDAY.toString(),
                Weekday.SUNDAY.toString()
        };

        JComboBox editWeekDayComboBox = new JComboBox(weekday);
        editComboBox.setEditable(true);
        container.add(editWeekDayComboBox);
        editWeekDayComboBox.addActionListener(actionListener);

        JTextField jTextField = new JTextField();
        jTextField.setColumns(20);
        container.add(jTextField);
        jTextField.addActionListener(actionListener1);

        setSize(640, 480);
        setVisible(true);
    }
    // Внутренний класс
    class SimpleAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            System.out.println("Нажатие на кнопку <" + btn.getName() + ">");

            if (btn.getName().equalsIgnoreCase(BUTTON_NAME)) {
                btn.setEnabled(false);
                FileReaderAirline fileReaderAirline = new FileReaderAirline();
                fileReaderAirline.readAirlineFile();
                btn.setText("Disabled button");
            } else {
                FileWriterAirline fileWriterAirline = new FileWriterAirline();
                fileWriterAirline.writeFileCity(airlineArrayList);
                System.out.println("Запись всех рейсов в файл");
            }
        }
    }

    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JComboBox box = (JComboBox)e.getSource();
            String item = (String) box.getSelectedItem();
            System.out.println(item);
            boolean exists = true;
            try {
                Weekday.valueOf(item);
                weekday = Weekday.valueOf(item);
            } catch (IllegalArgumentException ex) {
                exists = false;
            }
            if (exists){
                controller.createWeekdayFile(Weekday.valueOf(item));
            }
            else {
                controller.createCityFile(City.valueOf(item));
            }

        }
    };

    ActionListener actionListener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField jTextField = (JTextField) e.getSource();
            int a = Integer.parseInt(jTextField.getText());
            controller.createTimeFile(a,weekday);
        }
    };

}

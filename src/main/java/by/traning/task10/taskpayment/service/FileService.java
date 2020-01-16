package by.traning.task10.taskpayment.service;

import by.traning.task10.taskpayment.dao.FileWriter;


public class FileService {
    FileWriter fileWriter = new FileWriter();

    public void createFile(){
        fileWriter.createFile();
    }


    public void writeText(String s) {
        fileWriter.writeText(s);
    }
}

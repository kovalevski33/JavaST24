package by.traning.task10.taskpayment.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileWriter {
    private String pathName = "C:\\Users\\Вероника\\Desktop\\JavaST_24\\paymentFile.txt";
    private String pathNameManual = "C:\\Users\\Вероника\\Desktop\\JavaST_24\\ManualPaymentFile.txt";


    public void writeText(String text){
        try (java.io.FileWriter writer = new java.io.FileWriter(pathName, true)){
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeManualPaymentFile(String text){
        createFileManual();
        try (java.io.FileWriter writer = new java.io.FileWriter(pathNameManual, true)){
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFileManual() {
        File file = new File(pathNameManual);
        try {
            if (file.createNewFile()) {
                System.out.println("Успешно создан файл");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile() {
        File file = new File(pathName);
        try {
            if (file.createNewFile()) {
                System.out.println("Успешно создан файл");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
}

package by.traning.task10.textfile.service;

import by.traning.task10.textfile.entity.Directory;
import by.traning.task10.textfile.entity.TextFile;
import by.traning.task10.textfile.dao.TextFileWriter;
import by.traning.task10.textfile.view.ConsoleHelper;
import by.traning.task10.textfile.view.NoElementToShowException;

import java.io.*;

public class FileService {

    public void create(Directory directory){
        new TextFileWriter().createTextFile(directory);
    }

    public void rename(Directory directory, String name){
        File file = new File(directory.getDirect());
        File file1 = new File(name);

        if (file.renameTo(file1)) {
            System.out.println("Успешно переименовано");
        }

    }

    public void writeText(String text, TextFile textFile){
        try (FileWriter writer = new FileWriter(textFile.getDirectory(), true)){
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(TextFile textFile){
        new TextFileWriter().deleteTextFile(textFile);
    }

    public void show(String directory){
        ConsoleHelper  consoleHelper = new ConsoleHelper();
        try {
            consoleHelper.show(directory);
        } catch (NoElementToShowException e) {
            e.printStackTrace();
        }
    }
}

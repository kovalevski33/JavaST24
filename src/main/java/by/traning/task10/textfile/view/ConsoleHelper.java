package by.traning.task10.textfile.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleHelper {
    public void show(String directory) {
        File f = new File(directory);
        try (BufferedReader fin = new BufferedReader(new FileReader(f))){
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

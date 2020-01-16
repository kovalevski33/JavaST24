package by.traning.task10.textfile.dao;

import by.traning.task10.textfile.entity.Directory;
import by.traning.task10.textfile.entity.TextFile;

import java.io.File;
import java.io.IOException;

public class TextFileWriter {
    private File file;
    public void createTextFile(Directory directory){
            file = new File(directory.getDirect());
            try {
                if (file.createNewFile()){
                    System.out.println("Успешно создан файл");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void deleteTextFile(TextFile textFile) {
            file = new File(textFile.getDirectory());
            if (file.delete()){
                System.out.println("Файл успешно удалён");
            } else {
                System.out.println("Не удалось удалить файл");
            }
    }
}


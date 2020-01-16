package by.traning.task10.textfile.controller;

import by.traning.task10.textfile.entity.Directory;
import by.traning.task10.textfile.entity.TextFile;
import by.traning.task10.textfile.service.FileService;

public class Controller {
    FileService fileService = new FileService();
    public void create(Directory directory){
        fileService.create(directory);
    }

    public void writeText(String text, TextFile textFile) {
        fileService.writeText(text, textFile);
    }

    public void rename(Directory directory, String name){
        fileService.rename(directory,name);
    }
    public void show(TextFile textFile){
        fileService.show(textFile.getDirectory());
    }

    public void delete(TextFile textFile) {
        fileService.delete(textFile);
    }
}

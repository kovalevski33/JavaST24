package by.traning.task10.textfile.runner;

import by.traning.task10.textfile.entity.Directory;
import by.traning.task10.textfile.entity.MyFile;
import by.traning.task10.textfile.entity.TextFile;
import by.traning.task10.textfile.controller.Controller;

public class Runner {
    public static void main(String[] args) {
        Directory directory = new Directory("C:\\Users\\Вероника\\Desktop\\JavaST_24\\textFile.txt");
        MyFile myFile = new MyFile("MyFile", directory);
        TextFile textFile = new TextFile(myFile, directory.getDirect());
        Controller controller = new Controller();
        controller.create(directory);
        controller.writeText("Epam training ", textFile);
        controller.rename(directory,"C:\\Users\\Вероника\\Desktop\\JavaST_24\\renameTextFile.txt");
        textFile.setDirectory("C:\\Users\\Вероника\\Desktop\\JavaST_24\\renameTextFile.txt");
        controller.show(textFile);
        controller.delete(textFile);

    }
}

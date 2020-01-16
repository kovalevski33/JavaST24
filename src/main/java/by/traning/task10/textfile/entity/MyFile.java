package by.traning.task10.textfile.entity;


import java.util.Objects;

public class MyFile {
private String fileName;
private Directory directory;

    public MyFile(String fileName, Directory directory) {
        this.fileName = fileName;
        this.directory = directory;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFilename(String fileName) {
        this.fileName = fileName;
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFile myFile = (MyFile) o;
        return Objects.equals(fileName, myFile.fileName) &&
                Objects.equals(directory, myFile.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, directory);
    }
}

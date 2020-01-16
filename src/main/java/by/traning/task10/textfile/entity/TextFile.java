package by.traning.task10.textfile.entity;

import java.util.Objects;

public class TextFile {
   private MyFile myFile;
   private String directory;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(myFile, textFile.myFile) &&
                Objects.equals(directory, textFile.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myFile, directory);
    }

    public TextFile(MyFile myFile, String directory) {
        this.myFile = myFile;
        this.directory = directory;
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public void setMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}

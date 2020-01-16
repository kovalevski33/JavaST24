package by.traning.task10.textfile.entity;

import java.util.Objects;

public class Directory  {
   private String direct;

    public Directory(String direct) {
        this.direct = direct;
    }

    public Directory() {

    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(direct, directory.direct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direct);
    }
}

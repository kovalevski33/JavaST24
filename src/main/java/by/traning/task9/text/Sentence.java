package by.traning.task9.text;

import java.util.Objects;

public class Sentence {
    private String value="";

    public void addValue(Word word) {
        value += " " + word.getValue();
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(value, sentence.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

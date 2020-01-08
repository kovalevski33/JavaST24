package by.traning.task9.text;

import java.util.Objects;

public class Text {
    private String header;
    private String body="";
    private String author;

    public Text(Word word) {
        header = word.getValue();
    }

    public Text(Sentence sentence) {
        header = sentence.getValue();
    }

    public Text(String author) {
        this.author = author;
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getValue();
    }

    public void addBody(Sentence sentence) {
        body += " " + sentence.getValue();
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(body, text.body) &&
                Objects.equals(author, text.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, author);
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

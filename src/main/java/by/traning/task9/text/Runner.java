package by.traning.task9.text;

public class Runner {
    public static void main(String[] args) {
        Word word = new Word("Act III");
        Text text = new Text(word);
        text.setAuthor("Shakespeare");

        Word word1 = new Word("To be, ");
        Word word2 = new Word("or not ");
        Word word3 = new Word("to be?");

        Sentence sentence = new Sentence();
        sentence.addValue(word1);
        sentence.addValue(word2);
        sentence.addValue(word3);

        text.addBody(sentence);

        System.out.println("Head: " + text.getHeader() + "\nBody: " + text.getBody() + "\nAuthor: " + text.getAuthor());

    }
}

package by.traning.cycles.task32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    // Проверить введенную пользователем строку на наличие недопустимых символов.
    // В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        char c = s.charAt(0);

        if (Character.isLetter(c) || c=='_'){
            System.out.println("Введён допустимый символ");
        } else {
            System.out.println("Введён недопустимый символ");
        }
    }
}

package by.traning.decomposition.task1;

public class NodNok {

    public void solution (int a, int b){
        int x = a;
        int y = b;

        while (a != 0 && b != 0){
            if (a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }

        int nod = a + b;
        int nok = x * y / nod;

        System.out.println("НОД чисел " + nod);
        System.out.println("НОК чисел " + nok);
    }

}

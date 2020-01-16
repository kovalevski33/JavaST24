package by.traning.decomposition.task4;

public class ArithmeticHelper {
    int i = 1;
    int a;
    int arm;
    int temp;

    public void armstrongNumber(int z) {
        while(i < z) {
            temp = i;
            arm = 0;
            while (temp > 0) {
                a = temp % 10;
                arm = arm + (a * a * a);
                temp = temp / 10;
            }
            if(arm == i)
                System.out.println("Число Армстронга " + i);
            i++;
        }
    }
}

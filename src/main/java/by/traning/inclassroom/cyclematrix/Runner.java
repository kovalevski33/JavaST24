package by.traning.inclassroom.cyclematrix;

public class Runner {
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17},
                                {7,0,1,12},
                                {8,1,2,3},
                                {67,69,88,11}};


        for (int[] a : twoDimArray) {  //идём по строкам
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + a[j] + " ");
            }
            System.out.println();
        }

    }
}

package by.traning.task7matrix.task4;

public class Runner {
    //Найдите сумму двух матриц

    public static void main(String[] args) {
        int [][] sumMatrix = new int[3][4];
        int[][] matrix = {
                {5, 4, 45, 12},
                {7, 5, 8,  85},
                {6,9,10,11}
        };

        int[][] matrix2 = {
                {16, 11, 5, 2},
                {1, 0, 8,  34},
                {10,22,9,19}
        };
        System.out.println("Первый двумерный массив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Второй двумерный массив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sumMatrix[i][j] =  matrix[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Сумма двумерных массивов:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

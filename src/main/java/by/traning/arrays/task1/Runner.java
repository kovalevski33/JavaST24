package by.traning.arrays.task1;


public class Runner {

    //В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

    public static void main(String[] args) {
        int arr[] = getArray(1, 2, 0, 4, 0, 6, 5, 0, 6, 0,1,1);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] getArray(int ... nums) {
        int count = 0;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 0) count++;
        }

        int arrNums[] = new int[count];

        count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                arrNums[count++] = i;
            }
        }

        return arrNums;
    }


}

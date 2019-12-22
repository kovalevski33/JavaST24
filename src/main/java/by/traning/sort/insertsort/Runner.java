package by.traning.sort.insertsort;

public class Runner {
    //сортировка вставками

    public static void main(String[] args) {

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            int left = 0;
            int right = i-1;
           Integer border;
            while(left!=right) {
                border = (left+right) /2;
                if(array[border]>current){
                    right = border-1;
                } else {

                }
            }
            array[j+1] = current;
        }
    }

    public static void insertionSortBinary(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }


}

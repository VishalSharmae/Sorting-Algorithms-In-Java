public class InsertionSort {
    //The idea behind Insertion Sort is dividing the array into the sorted and unsorted subarrays.


    private static int[] insertionSort(int[] array){
        // 3,5,8,6,7,1,6,4,9
        for (int i = 1; i < array.length; i++){
            int save = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > save) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = save;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i =0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5,8,3,4,7,9,6};
        printArray(array);
        printArray(insertionSort(array));
    }
}

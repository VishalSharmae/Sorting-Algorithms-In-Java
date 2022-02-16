public class SelectionSort {

    //Selection sort also divides the array into a sorted and unsorted subarray. But, this time the sorted subarray is formed
    //by inserting the minimum element of the unsorted subarray at the end of the sorted array, by swapping.

    private static int[] selectionSort(int[] array){
        for (int i =0; i < array.length; i++){
            int min = array[i];
            int minID = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    minID = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minID] = temp;
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5,7,3,4,9,1,8,2};

        printArray(array);
        printArray(selectionSort(array));
    }
}
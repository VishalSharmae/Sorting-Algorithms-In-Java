import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static ArrayList<Integer> sortingNumbers = new ArrayList<Integer>();
    public static Scanner scanner = new Scanner(System.in);

    public static void addIntegersInArray(int number){
        sortingNumbers.add(number);     //automatically adds the number to the arraylist
    }

    public static void main(String[] args) {
        System.out.println("Add five number to your Array List- ");
        System.out.println("Enter 1st number: ");
        addIntegersInArray(scanner.nextInt());
        System.out.println("Enter 2nd number: ");
        addIntegersInArray(scanner.nextInt());
        System.out.println("Enter 3rd number: ");
        addIntegersInArray(scanner.nextInt());
        System.out.println("Enter 4th number: ");
        addIntegersInArray(scanner.nextInt());
        System.out.println("Enter 5th number: ");
        addIntegersInArray(scanner.nextInt());

        //print the new array
        System.out.println("Array is: ");
        for (int i = 0 ; i < sortingNumbers.size(); i++){
            System.out.println(sortingNumbers.get(i));
        }

        //we have a arrayList we will start sorting it
        for (int i = 0; i < sortingNumbers.size()-1; i++) {
            for (int j = 0; j < sortingNumbers.size()-1; j++) {
                int tempValue1 = sortingNumbers.get(j);
                int tempValue2 = sortingNumbers.get(j + 1);
                if (sortingNumbers.get(j) > sortingNumbers.get(j + 1)) {
                    sortingNumbers.set(j, tempValue2);
                    sortingNumbers.set(j + 1, tempValue1);
                }
            }
        }
        System.out.println("Sorting array is: ");
        for (int i = 0 ; i < sortingNumbers.size(); i++){
            System.out.println(sortingNumbers.get(i));
        }
    }
}

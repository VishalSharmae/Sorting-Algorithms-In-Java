public class SwappingNumbers {

    // swapping two numbers without using a third variable


    public static void swapNumber(int num1, int num2){

        System.out.println("Number 1: " + num1 + "\nNumber 2: " + num2 + "\n");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping, Number 1: " + num1 + "\nAfter swapping, Number 2: " + num2);

    }


    public static void main(String[] args) {

        swapNumber(12, 56);

        swapNumber(56,12);

        swapNumber(156, -456);

    }

}

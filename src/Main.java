import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[ ] returnedArray = readIntegers();
        System.out.println((Arrays.toString(returnedArray)));

      /*  int returnMin = findMin(returnedArray);
        System.out.println("min = " + returnMin);

*/
        reverse(returnedArray);
        System.out.println("Final: " + Arrays.toString(returnedArray));
        int[ ] reversedCopy = reverseCopy(returnedArray);
        System.out.println("Reversed: "  + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a list of integer, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return  min;
    }
    public static void reverse (int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length/2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];

        }
    }

    private static int[] reverseCopy(int[] array){
        int [] reversedArray = new int[ array.length];
        int maxIndex = array.length - 1;
        for (int el : array){
            reversedArray[maxIndex--]= el;
        }return reversedArray;
    }


}



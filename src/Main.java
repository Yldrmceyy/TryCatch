import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Defining variables
        int[] arr = {3,8,2,5,4,1,6,7,9,0};
        int index;
        Scanner input = new Scanner(System.in);

        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the index number to get the desired element in the array:");
        index = input.nextInt();

        // Call indexOfArr method
        indexOfArr(arr,index);
    }

    // indexOfArr method
    static public void indexOfArr(int[] arr, int index){
        try{
            //Block of code where an exception is predicted to occur
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            // Throw error message
            System.out.println(e.getMessage());
        }
    }
}
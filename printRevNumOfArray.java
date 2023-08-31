// Print the reverse array

package arrays;
import java.util.Scanner;
public class printRevNumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number in element number "+ i);
            arr[i] = sc.nextInt(); // for taking input from user
        }
        for(int i = arr.length-1;i>=0;i--){ // for printing reverse array
            System.out.println(arr[i]);
        }
    }
}

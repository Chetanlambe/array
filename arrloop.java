// taken the input from the user

package arrays;
import java.util.Scanner;
public class arrloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int arr[] = new int[4];
            for(int i=0;i<arr.length;i++){
                System.out.println("Enter the number for an element of "+ i);
                arr[i] = sc.nextInt(); // taken the input from user
            }

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]); // print the input
            }
    }

}

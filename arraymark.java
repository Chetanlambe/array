// To store the marks of the subject in the array update the mark in one sub
// and calculate the percentage and the length of the array

package arrays;

import java.util.Scanner;
public class arraymark {
    public static void main(String[] args) {
        int mark[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the physics");
        mark[0] = sc.nextInt();
        System.out.println("Enter the marks of the chemistry");
        mark[1] = sc.nextInt();
        System.out.println("Enter the marks of the math");
        mark[2] = sc.nextInt();
        System.out.println("Enter the marks of the biology");
        mark[3] = sc.nextInt();
        System.out.println("Enter the marks of the English");
        mark[4] = sc.nextInt();
        System.out.println("Enter the marks of the marathi");
        mark[5] = sc.nextInt();

        System.out.println("phy    "+ mark[0]);
        System.out.println("Chem   "+ mark[1]);
        System.out.println("math   "+ mark[2]);
        System.out.println("Bio    "+ mark[3]);
        System.out.println("Engsh  "+ mark[4]);
        System.out.println("Marathi "+ mark[5]);

//        For updation of marks
        mark[5] = mark[5] + 1;
        System.out.println("Marathi "+ mark[5]);

//
        float percentage = (mark[0] + mark[1] + mark[2] + mark[3] + mark[4] + mark[5])/6;
        System.out.println("Percentage is "+ percentage+"%");
        System.out.println();

//     for the length of the array
        System.out.println("The length of array is " + mark.length);

    }
}

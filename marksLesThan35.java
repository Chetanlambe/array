//Given an array of marks of students, if the mark of any student is less than
// 35 print its roll number. [roll number here refers to the index of array.]

package arrays;
public class marksLesThan35 {
    public static void main(String[] args) {
        int marks[] = {95, 85, 89, 87,21, 87,30,87,12,65};

        for(int i=0;i<10;i++){
            if(marks[i] < 35){
                System.out.println(i);
            }
        }

    }
}

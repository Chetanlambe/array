package arrays;

public class addressOfArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110,120};
//        int index = 2;
        int element = arr[9];
        int hashcode = System.identityHashCode(arr[9]);
        System.out.println(hashcode);



//        int[] arr = { 10, 20, 30, 40, 50 };
//
//        int index = 2; // Index of the element you want to "find the address" of
//
//        int element = arr[index];
//
//        int hashCode = System.identityHashCode(element);
//
//        System.out.println("Element: " + element);
//        System.out.println("Hash Code (an approximation of address): " + hashCode);


//        import java.util.Arrays;
//
//        public class ArrayElementAddress {
//
//            public static void main(String[] args) {
//                int[] array = {1, 2, 3, 4, 5};
//                int element = 3;
//
//                // Get the base address of the array
//                int baseAddress = Arrays.hashCode(array);
//
//                // Calculate the address of the element
//                int elementAddress = baseAddress + (element * 4); // Assuming the size of an integer is 4 bytes
//
//                // Print the address of the element
//                System.out.println("The address of element " + element + " is " + elementAddress);
//            }
//        }

    }
}

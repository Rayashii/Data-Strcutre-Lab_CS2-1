import java.util.Scanner;

public class oe2_yap {
    public static void main(String[] args){
        int num, x, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to be Bubble Sorted:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " elements: ");

        for (x = 0; x < num; x++) 
      array[x] = input.nextInt();

      for (x = 0; x < ( num - 1 ); x++) {
        for (j = 0; j < num - x - 1; j++) {
          if (array[j] > array[j+1]) {
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
          }
    }
    System.out.println("Unsorted array: ");
    for (x = 0; x < array.length; x++){
        System.out.print(" " + array[x]);
    }
    System.out.println();
    
}
System.out.println("\nSorted list of array:");
 
    for (x = 0; x < num; x++) 
      System.out.print(" " + array[x]);
}
}

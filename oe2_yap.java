import java.util.Scanner;

public class oe2_yap {
    public static void main(String[] args){
        int num, x, y, ctr;
        /* 
        num = how many numbers
        x = array
        y = adjacent
        ctr
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to be Bubble Sorted:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " elements: ");

        for (x = 0; x < num; x++) 
      array[x] = input.nextInt();

      for (x = 0; x < ( num - 1 ); x++) {
        for (y = 0; y < num - x - 1; y++) {
          if (array[y] > array[y+1]) {
            ctr = array[y];
            array[y] = array[y+1];
            array[y+1] = ctr;
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

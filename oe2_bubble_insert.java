public class oe2_bubble_insert {
    
    static void bubbleSort(int[] array1){
        int ctr = array1.length;
        int temp = 0;

        for(int x = 0; x < ctr; x++){
            for(int y = 1; y < (ctr-x); y++){
                if(array1[y-1] > array1[y]){
                    System.out.println("\nElements [" + array1[y-1] + "] [" + array1[y] + "]");
                    //swapping technique
                    temp = array1[y-1];
                    array1[y-1] = array1[y];
                    array1[y] = temp;

                }
            }
        }


    }

    static void insertionSort(int array2[]){
        int ctr = array2.length;
        for (int x = 1; x < ctr; x++){
            int k = array2[x];
            int y = x-1;

            while((y > -1) && (array2[y] > k)){
                array2[y+1] = array2[y];
                y--;
            }
            array2[y+1] = k;
        }
    }

    public static void main(String[] args){
        int b_array[] = {14,33,27,35,10};
        int i_array[] = {14,33,27,10,35,19,42,44};

        System.out.println("Unsorted array: ");
        for (int x = 0; x < i_array.length; x++){
            System.out.print(" " + i_array[x]);
        }
        System.out.println();

        //bubbleSort(b_array);
        insertionSort(i_array);

        System.out.println("\nSorted array after bubble: ");
        for (int x = 0; x < i_array.length; x++){
            System.out.print(" " + i_array[x]);
        }
    }
}

package Array;

import java.util.Scanner;

public class findEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        for(int j = 0; j < size; j++){
            if(array[j] % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
    }
}

package selectionSort;

import java.util.Scanner;

public class MainSelection {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int longIndexArray = in.nextInt();
        String a[] = new String[longIndexArray];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan nama : ");
            a[i] = in.next();
        }
        processSelection.selection(a);
    }
}

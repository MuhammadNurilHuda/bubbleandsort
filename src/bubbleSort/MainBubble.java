package bubbleSort;

import java.util.Scanner;

public class MainBubble {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array : ");
        int longIndexArray = in.nextInt();
        String a[] = new String[longIndexArray];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan nama : ");
            a[i] = in.next();
        }
        processBubble.bubble(a);
    }
}

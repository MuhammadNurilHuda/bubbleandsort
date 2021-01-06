package bubbleSort;

public class processBubble {

    static void bubble(String x[]) {
        System.out.println("Diurutkan : ");
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i].compareTo(x[j]) > 0) {
                    String temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
            System.out.print(x[i] + " ");
        }
    }
}

package selectionSort;

public class processSelection {

    static void selection(String x[]) {
        for (int i = 0; i < x.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].compareTo(x[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = x[minIndex];
            x[minIndex] = x[i];
            x[i] = temp;
        }
        System.out.print("Diurutkan : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}


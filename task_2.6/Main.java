/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i <= 9; i++) {
                int a = arr[j] * i;

                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}

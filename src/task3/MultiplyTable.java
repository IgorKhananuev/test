package task3;

public class MultiplyTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                //String s = String.format();

                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

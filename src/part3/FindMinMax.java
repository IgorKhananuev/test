package part3;

/*
task1:  Заполнить одномерный массив размерностью 10 элементов случайными числами.
        Найти и вывести на экран наибольший и наименьший его элементы и порядковые номера(индексы) для этих элементов.
*/

public class FindMinMax {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println("****");
        int min = array[0];
        int max = array[0];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            } else if(array[i] < min) {
                min = array[i] ;
                indexOfMin = i;
            }
        }
        System.out.println("Min element in array is " + min + " and its index is " + indexOfMin);
        System.out.println("Max element in array is " + max + " and its index is " + indexOfMax);
    }
}





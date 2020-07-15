package part2;
/*
task 1: Переменные, Условия(Ветвления), Вложенные циклы
        Составьте консольную программу которая выводит на экран таблицу умножения
*/

public class MultiplyTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
              System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

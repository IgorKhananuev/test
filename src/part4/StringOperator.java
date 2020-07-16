package part4;
/*
        task1:
        Написать консольное приложение для обработки строки принятой от пользователя по описанным ниже условиям:
        - подсчитать и вывести количество слов в полученной от пользователя строке (* предлоги считать как отдельное
          слово)
        - вывести на экран с самое длинное и самое короткое слово
        - запросить у пользователя букву и символ, на который данная буква будет заменена, произвести замену
          запрошенной буквы на символ по всей строке буква = О; символ - *
        исходная строка - "первоеСлово второеСлово третьеСлово четвертоеСлово пятоеСлово"
        result - "перв*еСл*в* вт*р*еСл*в* третьеСл*в* четверт*еСл*в* пят*еСл*в*"
*/

import java.util.Scanner;

public class StringOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text.trim();

        String[] word = text.split(" +");
        String maxWord = word[0];
        String minWord = word[0];

        for (String s : word) {
            if (s.length() > maxWord.length()) {
                maxWord = s;
            } else if (s.length() < minWord.length()) {
                minWord = s;
            }
        }
        System.out.println("The most length word is " + maxWord);
        System.out.println("The most short word is " + minWord);
        int wordsCount = text.trim().split(" +").length;
        System.out.println("Quantity of words in \"text\" is " + wordsCount);

        System.out.println("Enter replaced letter:");
        char replacedLetter = scanner.next().charAt(0);
        System.out.println("Enter replacing letter:");
        char replacingLetter = scanner.next().charAt(0);
        String modifiedText = text.replace(replacedLetter, replacingLetter);
        if (modifiedText.equals(text)) {
            System.out.println("there are not replaced letters in string named \"text\"");
        }
        else {
            System.out.println("modified string  --- " + modifiedText);
        }
        scanner.close();
    }
}

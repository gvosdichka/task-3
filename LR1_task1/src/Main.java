/*Реализуйте метод «переворота» строки.
Пример, при введенном слове «кот», метод должен вернуть слово «ток».*/
import java.util.Scanner;
public class Main {
    public static String flipper(String word) {
        int length = word.length(); // длина слова
        char[] letters = new char[length]; // массив - кол-во эл-тов == кол-во букв
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i); // извлекли i-й символ из слова
            letters[i] = letter; //пихнули его в массив
        }
        String negativeWord = ""; //объявили пустую строчку
        for (int i = length - 1; i >= 0; i--) { // идем по массиву наоборот
            negativeWord += letters[i]; //к пустой строчке добавляем буковки
        }
        return negativeWord;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine(); //вводим слово
        System.out.println(flipper(word)); //применили метод. вывод
    }
}
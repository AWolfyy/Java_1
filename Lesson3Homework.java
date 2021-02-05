import java.util.Random;
import java.util.Scanner;

public class Lesson3Homework {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    static char[] sign = new char[15];

    static String enterWord;
    static boolean a = true;

    public static void main(String[] args) {
        //1.
        doTask1();

        //2.*
        doTask2();
    }

    //1.
    public static void playGame() {
        int attempt = 3;
        int guessNum = rnd.nextInt(11);
        System.out.println("Угадайте число от 0 до 10 с 3ёх попыток");
        for (int i = 0; i < attempt; i++) {
            System.out.print("Введите загаданное число: ");
            int enterNum = sc.nextInt();
            if (enterNum == guessNum) {
                System.out.println("Поздравляю! Вы угадали! Возьмите с полки пирожок...");
                return;
            }
            if (enterNum < guessNum) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Загаданное число меньше!");
            }
        }
        System.out.println("Попытки кончились, Вы проиграли... Загаданное число: " + guessNum);
    }

    public static void doTask1() {
        do {
            playGame();
            System.out.println("Хотите повторить игру? 1 - Да, 0 - Нет");
        } while (sc.nextInt() == 1);
    }

    //2.*
    //2.*
    public static void printStringArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String GetRndWordFromArr(String arr[]) {
        return words[rnd.nextInt(words.length)];
    }

    public static void stringCompare(String enterWord, String rndWord) {

        if (enterWord.equals(rndWord)) {
            System.out.println("Поздравляю! Вы угадали!");
            a = false;
            return;
        } else if (enterWord.length() < rndWord.length()) {
            System.out.println("Нет... Попробуйте еще раз.");
            for (int i = 0; i < sign.length; i++) {
                sign[i] = '#';
            }
            for (int i = 0; i < enterWord.length(); i++) {
                if (enterWord.charAt(i) == rndWord.charAt(i)) {
                    sign[i] = enterWord.charAt(i);
                }
            }
        } else {
            System.out.println("Нет... Попробуйте еще раз.");
            for (int i = 0; i < sign.length; i++) {
                sign[i] = '#';
            }
            for (int i = 0; i < rndWord.length(); i++) {
                if (enterWord.charAt(i) == rndWord.charAt(i)) {
                    sign[i] = enterWord.charAt(i);
                }
            }
        }
        for (int i = 0; i < sign.length; i++) {
            System.out.print(sign[i]);
        }
        System.out.println();
    }
    public static void doTask2() {

        System.out.println("Вам нужно отгадать одно из этих слов, загаданное компьютером:");
        printStringArr(words);
        String rndWord = GetRndWordFromArr(words);
        while (a) {
            System.out.println("Введите слово: ");
            enterWord = sc.next();
            stringCompare(enterWord, rndWord);
        }

    }
}

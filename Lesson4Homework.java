import java.util.Random;
import java.util.Scanner;

public class Lesson4Homework {
    public static final int SIZE = 3;
    public static final char[][] field = new char[SIZE][SIZE];
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        playGame();

    }

    public static boolean isWin(char[][] field, char symbol) {
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i < SIZE; i++) {
            int countHorizontal = 0;
            int countVertical = 0;
            if (field[i][i] == symbol) {
                countDiagonalA++;
                if (countDiagonalA == DOTS_TO_WIN) {
                    return true;
                }
            }
            if (field[i][SIZE - 1 - i] == symbol) {
                countDiagonalB++;
                if (countDiagonalB == DOTS_TO_WIN) {
                    return true;
                }
            }
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == symbol) {
                    countHorizontal++;
                    if (countHorizontal == DOTS_TO_WIN) {
                        return true;
                    }
                }
                if (field[j][i] == symbol) {
                    countVertical++;
                    if (countVertical == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void playGame() {
        initField(field);
        printField(field);
        while (true) {
            if (!checkNextPlayerMove(field)) {
                return;
            }

            if(!checkNextAiMove(field)) {
                return;
            }
        }
    }

    public static boolean checkNextAiMove(char[][] field) {
        aiTurn();
        printField(field);

        return isNextMoveAvailable("Победил компьютер...");
    }

    public static boolean checkNextPlayerMove(char[][] field) {
        playerTurn();
        printField(field);

        return isNextMoveAvailable("Поздравляю, Вы победили!");
    }

    public static boolean isNextMoveAvailable(String winMessage) {
        if (isWin(field, DOT_X)) {
            System.out.println(winMessage);
            return false;
        }
        if (isFieldFull()) {
            System.out.println("Ничья!");
            return false;
        }
        return true;
    }

    public static boolean diagonalA(int x, int y) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

            }
        }
        return false;
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);

        } while (!(isCellValid(x, y)));

        System.out.println("Компьютер ходит по координатам " + (x + 1) + " - " + (y + 1));
        field[x][y] = DOT_O;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.printf("Введите координату Х в пределе от 1 до %d...%n", SIZE);
            x = sc.nextByte() - 1;
            System.out.printf("Введите координату У в пределе от 1 до %d...%n", SIZE);
            y = sc.nextByte() - 1;
            if (!(isCellValid(x, y))) System.out.println("Вы ввели некорректные координаты...");

        } while (!(isCellValid(x, y)));

        field[x][y] = DOT_X;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (field[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void initField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField(char[][] field) {
        for (int i = 0; i <= field.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < field.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

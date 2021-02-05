public class Lesson1Homework {
    public static void main(String[] args) {
        //2.
        byte aByte, bByte = 120;
        short cShort = 23000;
        int dInt = -1000000;
        long iLong = 9000000000000000L;
        float fFloat = 28.75f;
        double gDouble = -183.285;
        char hChar = '%';
        boolean iBool = false;
        String kString = "Hello, world!";
        //3.
        System.out.println(computation(2.45f, 4.54f, 5.49f, 7.28f));
        //4.
        System.out.println(limit(3, 9));
        //5.
        sign(-2);
        //6.
        System.out.println(signBool(8800));
        //7.
        hello("Александр");
        //8.*
        leapYear(800);
    }
    //3.
    static float computation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //4.
    static boolean limit(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20; // или c = a + b; return c >= 10 && c <= 20;
    }
    //5.
    static void sign(int a) {
        if (a < 0)
            System.out.println("Число отрицательное!");
        else
            System.out.println("Число положительное или равно нулю!");
    }
    //6.
    static boolean signBool(int a) {
        return a < 0;
    }
    //7.
    static void hello(String name) {
        System.out.println("Привет, " + name);
    }
    //8.*
    static void leapYear(int year) {
        if ((year % 4  == 0 && year % 100 != 0)  || year % 400 == 0)
            System.out.println("Год високосный!");
        else System.out.println("Год не високосный!");
    }
}

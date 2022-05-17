public class tasksLesson3 {
    public static void main(String[] args) {
        //Task21
        int a = (int) 40.0, b = 50, c = 60, R = 1;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
//Task22
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


        //task23
        boolean W = (a == 1 || b == 1 || c == 1 || R == 1);
        System.out.println(W);


        //task24
        Boolean E = (a == 2 && a == b || b == 2 && b == c || c == 2 && c == R);
        System.out.println(E);

        //task25
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("y-1");
        else System.out.println("y+1");


        //task26
        if (a % 2 == 0 || b % 2 == 2 || c % 2 == 0 || R % 2 == 0)
            System.out.println(1);
        else System.out.println(2);


        //Task27
        int X = 8, Y = 10, Z = 12;
        Boolean Progress = (Y - X == Z - Y);
        Boolean Progress2 = (a - b == c - b);
        System.out.println(Progress);
        System.out.println(Progress2);


        //Tassk28
        int x = 8, y = 16, z = 32, q = 64;
        Boolean Prg = (y / x == z / y);
        Boolean Prg2 = (q / y == z / y);
        System.out.println(Prg);
        System.out.println(Prg2);
        Boolean $ = (b / a == c / b);//Բուլիանի մեջ  2 հատից ավել չի թողում,էս արտահայտությունն ել թռույա տալի
        System.out.println($);

        //Task29
//        int[] myArray = new int[20];
//        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        System.out.println(Array.length);
//        int i;
//        for (i = 0; i < Array.length; i++) ;
//        System.out.println(myArray[i]);
        //int[] arrNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
// System.out.println(Array.length-1)

        //30

        //Task31
        if (a > b && a > c && a > R && a > X) {
            System.out.println(a);
        } else if (b > a && b > c && b > R && b > X) {
           }System.out.println(b);

    }
}
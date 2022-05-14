public class lesson2 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        double x = 12.5, y = 14.5, z = 16.5;
        boolean q = x + y == 27;
        System.out.println(a + b);
        System.out.println((++a + c) / b);//2
        System.out.println(q);
        System.out.println(++c / (b + a) + 1);
        System.out.println(c);
        System.out.println(++c % --a);
        System.out.println(++a);
        System.out.println(a);
        int D = (a += b);
        double F = (a += y);
        System.out.println(D);
        System.out.println(c);
        System.out.println(D += c);
        System.out.println(F);
        int J = 2, M = 3, K = 4;
        System.out.println(J += M);
        K += M;
        System.out.println(K);
        

    }
}

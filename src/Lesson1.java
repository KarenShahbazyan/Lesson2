import java.sql.SQLOutput;

import static javafx.scene.input.KeyCode.S;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Helo");
        byte K = 14;
        System.out.println(K);
        int Karen = 1282345;
        System.out.println(Karen);
        float Ka = 12.35559f;
        System.out.println(Ka);
        char Sim = 'k';
        System.out.println(Sim);
        String Kar = "\u0214 Hello java \u0210";
        System.out.println(Kar);
        String Symbol = "Byte,Short,Int,Long";
        System.out.println(Symbol);
        char Sym = '\u1254';
        System.out.println(Sym);


        int a = 4, b = 6;
        System.out.println(a + b);
        System.out.println(b / a);
        System.out.println(a * b);
        a = a + 1;
        System.out.println(a);
        a = ++a;
        System.out.println(a);


        Boolean x = a == 5;
        Boolean y = a != 6;
        System.out.println(y);
        System.out.println(x);
        Boolean c = a >= 6;
        System.out.println(c);


        Boolean d = a > 6 && a <= 20;//ev -ev
        System.out.println(d);
        Boolean R = a > 5 || a < 20; //kam-kam
        System.out.println(R);
        Boolean D = !(a > 5 || a < 20);// ժխտական //x=x+1 նույննա ինչ որ x+=1,գօռծում է բոլոր գործ-ների համար /



    }
}

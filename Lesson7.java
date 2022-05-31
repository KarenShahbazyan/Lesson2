import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAnun("Karen");
        human.setAzganun("Shahbazyan");
        human.setTariq(25);
        human.setAzgutyun(true);
        human.setPashton("masnaget");
        human.setSeR("Arakan");
        human.printInfo();


        Scanner mard = new Scanner(System.in);
        System.out.println("Input your name" + " ");
        String name = mard.next();
        human.setAnun(name);
        System.out.println("input your last name");
        String name1 = mard.next();
        human.setAzganun(name1);
        System.out.println("Input your age");
        int age = mard.nextInt();
        human.setTariq(age);
        System.out.println("input your gender");
        String gender = mard.next();
        human.setSeR(gender);
        System.out.print(human.getAnun() + " " + human.getTariq() + " ");
        System.out.println(human.getAzganun() + " " + human.getSeR());
        mard.nextLine();

    }
}

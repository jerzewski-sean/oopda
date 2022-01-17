import java.util.Scanner;

public class Driver {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getName();
        System.out.println("Hello " + name);
        sc.close();
    }

    private static String getName() {
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

}


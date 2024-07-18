import java.util.Scanner;

public class InputUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // similar String
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in); // similar String
        System.out.println("What's your name?");
        String name2 = scanner2.nextLine();


        System.out.println("Hello, " + name);
        // %s <- placeholder contain String variable (ô trống để chứa biến kiểu String)
        // printf -> print with format
        System.out.printf("Hello, %s and %s! Welcome to the AP classroom!\n", name, name2);
    }
}

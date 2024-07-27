import java.util.Scanner; 

public class Boolean {
    public static void main (String[] args){

        // Basic concept
        int x = 10;
        int y = 8;
        boolean z = x > y;
        System.out.println(z);

        String an = "What";
        String bn = "What";
        System.out.println(an.equals(bn));

        // Declare some integer variables to use for practice comparisons below.
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 3;

        // You store the boolean results of each comparison into boolean variables t-z.
        boolean t = a > 0; // true
        boolean u = a == d; // true
        boolean v = d >= b; // false
        boolean w = b > c; // true
        boolean e = a != d; // false
        boolean f = d <= a; // true
        boolean g = 4 <= c; // false

        Scanner userInput = new Scanner(System.in);
        int heightInInches = userInput.nextInt();
        boolean isTallEnough = heightInInches >= 48;
        System.out.println("Can ride on the motorbike: " + isTallEnough);
    }
}

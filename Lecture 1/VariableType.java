import java.util.Scanner;

public class VariableType {
    public static void main(String[] args){
        // Format: type name_of_variable value_of_variable
        int myInt = 7; // This is a variable, using to store data
        int myInt2 = 3;
        double myDouble = 2.5;
        
        String myString = "Hello"; // non-primitive type

        myString.toLowerCase(); // Only non-primitive type has method

        final int numApples = 5; // protect the variable

        // Mulitilication
        double result = myDouble * myInt;

        //Division
        double x = 2;
        int y = 5;
        int z = 2;

        double outXY = x / y;   // 0.4

        double outYX = y / x;   // 2.5
        int outYZ = y / z;   // 2

        int outInt = (int)(y / x);  // 2
        int firstModSecond = y % z;
        
        x += 1;

        System.out.println(outXY);
        System.out.println(outYX);
        System.out.println(outYZ);
        System.out.println(outInt);
        System.out.println(firstModSecond);

    }
}

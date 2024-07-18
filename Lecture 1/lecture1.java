public class lecture1 {
    // Hey, I have a program, lecture1
    public static void main(String[] args){ // method <type1> <method1>
        // Run all line code below
        System.out.print("Hello World! This is the output from print\n"); // enter a new line
        System.out.println("Hello World!");

        // Variables -> object store information such as number, words, true/false, Cat, Dog
        // primitive: built-in in JAVA
        // int, double, char, boolean vs String

        // Numerical
        int age = 10;
        double height = 1.75;

        // Char: ký tự
        char currentScore = 'A'; // <type> <name_var> = <value>
        String alphabet = "ABC"; // non-primitive

        // Boolean: True/False
        boolean hasDog = true;
        boolean hasCat = false;

        // Name of variables
        int a = 4; // bad
        int b = 6; // bad

        int numberOfItemsInStore = 10; // bad, good: numItemsStore = 10

        // Snake vs Camel
        // number_of_items_in_store: Snake (Python)
        // numberOfItemsInStore: Camel (JAVA)

        // Reference Type
        char first = 'A';
        char second = 'B';
        System.out.println(first);
        System.out.println(second);
        first = second;
        System.out.println(first);
        System.out.println(second);


        String firstString = "ABC";
        String secondString = "EDF";
        System.out.println(firstString);
        System.out.println(secondString);
        firstString = secondString;
        System.out.println(firstString);
        System.out.println(secondString);

        // Final keyword
        final char myPassword = 'a';
        System.out.println(myPassword);

        // Operators
        // +, -, *, /, %(số dư)
        int x = 5;
        double z = 2;
        double result = x/z; // int is wrong 

        // int/int -> int: 2 (int); result -> double: 2.0 (double)
        // double/double -> double: 2.5
        // int/double -> double or double/int -> double : 2.5
        
        System.out.println("Kết quả là: "+ result); 

        double myNum = (4.0 + 6 * (2 + 3)); // int is wrong

        // -=, *=, /=
        int counter = 0;
        counter = counter + 1; // = 1
        counter += 2; // = 3 counter +=1 similar with counter = counter + 1
        System.out.println(counter); 

        // Ép kiểu (Casting)
        double myDouble = 10.59;
        System.out.println(myDouble); // 10.59
        System.out.println((int)myDouble); // 10

        int myInt = 10;
        System.out.println(myInt); // 10
        System.out.println((double)myInt); //10.0
    }
}

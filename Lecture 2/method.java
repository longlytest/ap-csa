public class method {
    public static void main(String agrs[]){
        String greeting = printName("Long");
        System.err.println(greeting);
    }

    private static String printName(String name){
        return("My name is "+ name);
    }
}

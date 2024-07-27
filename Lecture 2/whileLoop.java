public class whileLoop {
    /*
        while(boolean expression)
        {
        // code block inside of while loop to execute if the boolean expression is true
        }
        // code outside of while loop to execute if the boolean expression is false
    */
    public static void main(String args[]){
        int i = 5;
        System.out.println("Initiating countdown:");

        while(i >= 0) {
        System.out.println(i + "...");
        i--;
        }
        int result = sumTo(5);
        System.out.println(result);

    }
    // break loop
    private static int sumTo(int num) {
        int i = 1;
        int sum = 0;
        while (true) {
            sum += i;
            if (sum > num) {
                return i;
            }
            i++;
        }
    }
}

import java.util.Scanner;

public class lecture2 {
    public static void main(String[] args) {
        double total_distance;
        double travel_cost = 0;
        Scanner scanner = new Scanner(System.in);

        final int STARTING_FEE = 20000;
        final int NEXT_25KM = 14000;
        final int FROM_25KM = 12000;

        System.err.println("Nhập số km đã đi: ");
        total_distance = scanner.nextDouble();

        if (total_distance <= 1 && total_distance > 0){
            travel_cost = STARTING_FEE;
        }
        else if (total_distance < 25 && total_distance > 0) {
            travel_cost = STARTING_FEE + NEXT_25KM*(total_distance - 1);
        }
        else if (total_distance >= 25) {
            travel_cost = STARTING_FEE + NEXT_25KM*(25 -1) + FROM_25KM*(total_distance - 25 - 1);
        }
        else{
            System.err.println("Vui lòng nhập số km > 0");
        }
        System.err.println("Số tiền đi: " + travel_cost);

        // while loop
        int num = 10;
        while(num >=0){
            System.out.println(num +"...");
            num = num - 1; // == num--
        }
    }
}

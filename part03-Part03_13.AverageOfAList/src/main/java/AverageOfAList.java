
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;

        for (Integer number : list) {
            sum += number;
        }

        int length = list.size();
        double avg = (float) sum / length;

        System.out.println("Average: " + avg);

    }
}

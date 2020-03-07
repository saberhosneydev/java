import java.util.Scanner;

// Theory :
/*Snail creeps up the vertical pole of height H feets.
Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?
Input data format
On the input the program receives non-negative integers H, A, B,
where H > B and A > B. Every integer does not exceed 100.

Samples Respectivly Height, Day , Night
10, 3,2 = 8 : PASSED
20, 7,3 = 5 : PASSED
 */
public class Snail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading inputs
        int Height = scanner.nextInt();
        int Day = scanner.nextInt();
        int Night = scanner.nextInt();

        // Initialize the recorders
        int days = 0;
        int current = 0;

        // Start calculating
        while (true){
            current += Day;
            days++;
            if (current >= Height){
                break;
            }
            current -= Night;

        }
        // Print out the days
        System.out.println(days);


        //Another way to solve it :
        /*
        int days = (Height - Night - 1) / (Day - Night) + 1;
        System.out.println(days);
         */

    }
}

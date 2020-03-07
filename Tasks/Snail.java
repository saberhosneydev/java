import java.util.Scanner;

// Theory :
/*Snail creeps up the vertical pole of height H feets.
Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?
Input data format
On the input the program receives non-negative integers H, A, B,
where H > B and A > B. Every integer does not exceed 100.

Samples Respectivly H, A , B
10, 3,2
20, 7,3
 */
public class Snail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading inputs
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Initialize the recorders
        int days = 1;
        int current = 0;

        // Start calculating
        while (true){
            current += A;
            if (current == H){
                break;
            }else {
                current -= B;
            }
            days++;
        }
        // Print out the days
        System.out.println(days);


    }
}

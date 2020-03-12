import  java.util.Scanner;
/*
A university has decided to open math courses and equip classrooms for 3 groups
with special new desks. The faculty agreed that in the sake of productivity only
two students may share one table. The enrolment has ended, and now the task is to
count the number of desks to order the correct amount from the shop. Of course, the
university is short of money, so you need to calculate the minimum of desks. But don't
forget that each group will sit in its own classroom!

--SAMPLES--
Sample Input 1:

20
21
22
Sample Output 1:

32
Sample Input 2:

16
18
20
Sample Output 2:

27
 */
public class Desks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int desks1 = 0;
        int desks2 = 0;
        int desks3 = 0;
        int totalDesks = 0;
        if (group1%2 == 1){
            group1++;
            desks1 = group1 / 2;
        }else desks1 = group1 / 2;

        if (group2%2 == 1){
            group2++;
            desks2 = group2 / 2;
        }else desks2 = group2 / 2;

        if (group3%2 == 1){
            group3++;
            desks3 = group3 / 2;
        }else desks3 = group3 / 2;

        totalDesks = desks1 + desks2 + desks3;
        System.out.println(totalDesks);

        // Another way to solve it :
        /*
        int totalDesks = (group1 / 2 + group1%2)+(group2 / 2 + group2%2)+(group3 / 2 + group3%2);
        System.out.println(totalDesks);
         */
    }
}
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws IOException {
        //Create the Combination nCr
//        new File("space.txt").createNewFile();
//        FileWriter spaceFile = new FileWriter("space.txt");
//        for (int i = 1; i < 100; i++) {
//            for (int j = 1; j < 100; j++) {
//                for (int k = 1; k < 100; k++) {
//                    String end = i + "," + j + "," + k + "\n";
//                    spaceFile.append(end);
//                }
//            }
//        }

        // Reading file line by line and store output in a file
        FileWriter outputWriter = new FileWriter("output.txt");
        FileWriter correctWriter = new FileWriter("correct.txt");
        BufferedReader reader = new BufferedReader(new FileReader("space.txt"));
        String line = reader.readLine();
        int PNo = 1;
        while (line != null) {
            String[] nums = line.split(",");
            int first = Integer.parseInt(nums[0]);
            int second = Integer.parseInt(nums[1]);
            int third = Integer.parseInt(nums[2]);
            int total = first + second + third;
            if (total == 100){
                Double result = BigDecimal.valueOf((first + second * 0.5 + third * 0.25))
                        .setScale(2, RoundingMode.HALF_UP)
                        .doubleValue();
                String out = String.format("Probability No. [%d] | Set [Men: %d, Women: %d, Kids: %d] | Seats: %d | total: %.2f\n", PNo, first,second,third, total, result);
                outputWriter.append(out);
                if (result == 100.00){
                    correctWriter.append(out);
                }
            }
            PNo++;
            line = reader.readLine();
        }
        outputWriter.append(String.format("Total probabilities examined: %d", PNo));
        System.out.printf("Total probabilities examined: %d", PNo);
        reader.close();
        outputWriter.close();
    }
}

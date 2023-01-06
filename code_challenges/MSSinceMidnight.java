public class MSSinceMidnight {
    public static void main(String[] args) {
        System.out.print("Enter the time using this format h:m:s => ");
        String[] input = System.console().readLine().split(":");
        int hours = Integer.parseInt(input[0]);
        int minutes = Integer.parseInt(input[1]);
        int seconds = Integer.parseInt(input[2]);
        int milliseconds = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000) + (seconds * 1000);
        System.out.println("Time in millseconds: " + milliseconds);
    }
}

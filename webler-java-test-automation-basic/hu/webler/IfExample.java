package hu.webler;

public class IfExample {

    public static void main(String[] args) {

        int dayOfWeek = 6;
        String dayName = "";

        if (dayOfWeek == 1) {
            dayName = "Monday";
        } else if (dayOfWeek == 2) {
            dayName = "Tuesday";
        } else if (dayOfWeek == 3) {
            dayName = "Wednesday";
        } else if (dayOfWeek == 1 || dayOfWeek == 3) {
            dayName = "Nothing";
        } else {
            dayName = "Unknown";
        }

        System.out.println("Today is " + dayName);
    }
}

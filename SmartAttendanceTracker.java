import java.util.Scanner;

public class SmartAttendanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Smart Attendance & Performance Tracker =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Classes Conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Classes Attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
if(attendancePercentage < 60) {
    System.out.println("Warning: Very Low Attendance!");
}

        System.out.println("\nEnter 3 Internal Marks:");
        double totalMarks = 0;

        for(int i = 1; i <= 3; i++) {
            System.out.print("Subject " + i + ": ");
            double mark = sc.nextDouble();
            totalMarks += mark;
        }

        double average = totalMarks / 3;

        String status;

        if(attendancePercentage >= 75 && average >= 40) {
            status = "Eligible for Exam";
        } else {
            status = "Not Eligible for Exam";
        }

        System.out.println("\n===== Result =====");
        System.out.println("Name: " + name);
        System.out.printf("Attendance: %.2f%%\n", attendancePercentage);
       System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("Final Status: " + status);

        sc.close();
    }
}
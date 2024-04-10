import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        char grade = calculateGrade(score);

        System.out.println("Student's grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else if (score >= 0 && score < 60) {
            return 'F';
        } else {
            return 'I'; // 'I' for Invalid score
        }
    }
}

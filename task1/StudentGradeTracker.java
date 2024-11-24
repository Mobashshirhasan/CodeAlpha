package task1;

import java.util.Scanner;

class GradeTracker {

    private int[] grades;
    private int numStudents;
    private double average;
    private int highest;
    private int lowest;

    public GradeTracker(int numStudents) {
        this.numStudents = numStudents;
        grades = new int[numStudents];
     }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student" + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Close the scanner after input is complete
        scanner.close();
    }

    public void calculateResults() {
        int sum = 0;
        highest = grades[0];
        lowest = grades[0];

        for (int grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        average = (double) sum / numStudents;
    }

    public void displayResults() {
        // Display results
        System.out.println("\nResults:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }

    // Getter methods for accessing results from outside the class
    public double getAverage() {
        return average;
    }

    public int getHighest() {
        return highest;
    }

    public int getLowest() {
        return lowest;
    }
}

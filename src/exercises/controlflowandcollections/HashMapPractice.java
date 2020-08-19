package exercises.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        double newID;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number: ");
                newID = input.nextDouble();
                students.put(newID, newStudent);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for(Map.Entry<Double, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " : " + student.getValue());
        }
    }
}

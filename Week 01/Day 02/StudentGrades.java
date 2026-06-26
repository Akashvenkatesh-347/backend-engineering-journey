import java.util.ArrayList;
import java.util.Scanner;
class Student{
    String name;
    int marks;
    char grade;
    Student(String name, int marks, char grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
}
public class StudentGrades{
    public char calculateGrade(int marks){
        char grade;
        if(marks >= 90) grade = 'A';
        else if(marks >= 75) grade = 'B';
        else if(marks >= 60) grade = 'C';
        else if(marks >= 40) grade = 'D';
        else grade = 'F';
        return grade;
    }
    public void displayResult(Student student){
        System.out.println("Name  : " + student.name);
        System.out.println("Marks : " + student.marks);
        System.out.println("Grade : " + student.grade);
        System.out.println("---------------------------");
    }
    public static void main(String[] args){
        StudentGrades grades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        char choice;
        do {
            System.out.print("Enter the Name of the Student: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter the Marks Scored: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            char grade = grades.calculateGrade(marks);
            Student student = new Student(studentName, marks, grade);
            studentList.add(student);
            System.out.print("Add another student? (Y/N): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
        } while (choice == 'Y' || choice == 'y');
        System.out.println("\n===== Student Records =====");
        for (Student student : studentList) {
            grades.displayResult(student);
        }
        scanner.close();
    }
}
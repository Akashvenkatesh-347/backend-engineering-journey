import java.util.Scanner;
public class StudentGrades{
    public char calculateGrade(int marks){
        char grade;
        if(marks > 90) grade = 'A';
        else if(marks > 75 && marks <= 90) grade = 'B';
        else if(marks > 60 && marks <= 75) grade = 'C';
        else if(marks > 40 && marks <= 60) grade = 'D';
        else grade = 'F';
        return grade;
    }
    public void displayResult(String name,int marks,char grade){
        System.out.println("The name of the student is "+name);
        System.out.println("The marks scored by "+name+" is "+ marks);
        System.out.println("The grade of "+name+" is "+grade);
    }
    public static void main(String[] args){
        StudentGrades grades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of the Student:");
        String studentName = scanner.nextLine();
        System.out.println("Enter the Marks Scored:");
        int marks = scanner.nextInt();
        char grade = grades.calculateGrade(marks);
        grades.displayResult(studentName,marks,grade);
    }
}
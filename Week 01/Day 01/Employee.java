import java.util.Scanner;

public class Employee {

    public int calculateBonus(int Salary, char Ratings) {
        int Bonus;
        if (Ratings == 'A') {
            Bonus = (int)(Salary * 0.20);
        } else if (Ratings == 'B') {
            Bonus = (int)(Salary * 0.10);
        } else if (Ratings == 'C') {
            Bonus = (int)(Salary * 0.05);
        } else {
            Bonus = 0;
        }
        return Bonus;
    }

    public void printEmpReport(String EmpName, int Salary, char Ratings,int Bonus) {
        System.out.println("The Name of the Employee is " + EmpName);
        System.out.println("The Salary of the Employee is " + Salary);
        System.out.println("The Performance Ratings of the Employee is " + Ratings);
        System.out.println("The Bonus of the Employee is "+ Bonus);
        System.out.println("The Final Salary of the Employee is "+(Salary+Bonus));
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee Name:");
        String EmpName = scanner.nextLine();
        System.out.println("Enter the Salary:");
        int Salary = scanner.nextInt();
        System.out.println("Enter the Ratings(A/B/C/D):");
        char Ratings = scanner.next().charAt(0);
        int Bonus = emp.calculateBonus(Salary,Ratings);
        emp.printEmpReport(EmpName,Salary,Ratings,Bonus);
    }

}
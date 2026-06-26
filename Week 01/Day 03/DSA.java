import java.util.Scanner;
public class DSA {
    public int factorial(int num){
        if(num == 0 || num == 1) return num;
        else return num * factorial(num-1);
    }
    public void primeNumberCheck(int num) {
        if (num >= 1) {
            int counter = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) counter++;
            }
            if (counter == 2) System.out.println(num + " is a Prime Number");
            else System.out.println(num + " is not a Prime Number");
        }
    }
    public void palindromeCheck(int num){
        int original = num;
        int rev = 0;
        int lastDigit;
        while(num!=0){
            lastDigit = num%10;
            rev = (rev * 10) + lastDigit;
            num/=10;
        }
        if(original == rev) System.out.println(original+" is a Palindrome");
        else System.out.println(original+ " is not a Palindrome");
    }
    public void fibonacciSeries(int num){
        int f0 = 0,f1 = 1;
        if(num <= 0) return;
        System.out.println("The Fibonacci Series of "+num+" is ");
        for(int i = 1;i <= num;i++){
            System.out.print(f0 + " ");
            int next = f0 + f1;
            f0 = f1;
            f1 = next;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DSA obj = new DSA();
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        obj.palindromeCheck(num);
        obj.primeNumberCheck(num);
        obj.fibonacciSeries(num);
        int fact = obj.factorial(num);
        System.out.println("\nThe Factorial of "+num+" is "+fact);
    }
}
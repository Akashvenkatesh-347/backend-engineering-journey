import java.util.Scanner;
public class DSA{
    //Perfect Number
    public void perfectNumber(int num){
        int sum = 0;
        for(int i = 1;i <= num/2;i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        if(sum == num) System.out.println(num+" is a Perfect Number");
        else System.out.println(num+" is not a Perfect Number");
    }
    //Factorial for each digit
    public int factorial(int digit){
        if(digit == 0 || digit == 1) return 1;
        else return digit*factorial(digit-1);
    }
    //Strong Number
    public void strongNumber(int num){
        int original = num;
        int sum = 0;
        while(num!=0){
            int lastDigit = num%10;
            int call = factorial(lastDigit);
            sum+=call;
            num/=10;
        }
        if(original == sum) System.out.println(original+" is a Strong Number");
        else System.out.println(original+" is not a Strong Number");
    }
    //Decimal to Binary
    public void decToBin(int num){
        String ans = "";
        while(num > 0){
            int remainder = num%2;
            ans+=remainder;
            num/=2;
        }
        System.out.println("The binary equivalent of "+num+" is "+ans);
    }
    //Count Vowels in String
    public void countVowels(String text){
        int count = 0;
        for(int i = 0;i < text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'A' || ch == 'a'|| ch == 'E'|| ch == 'e'|| ch == 'I'|| ch == 'i'|| ch == 'O'|| ch == 'o'|| ch == 'U'|| ch == 'u'){
                count++;
            }
        }
        System.out.println("The number of vowels in "+text+" are "+count);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DSA obj = new DSA();
        System.out.println("Enter a String:");
        String sample = scanner.nextLine();
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        obj.countVowels(sample);
        obj.perfectNumber(num);
        obj.strongNumber(num);
        obj.decToBin(num);
    }
}
import java.util.Scanner;
public class DSA{
    public void armstrongNumber(int num){
        int original = num;
        int temp = num;
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        int sum = 0;
        while(temp!=0){
            int lastdigit = temp % 10;
            sum = sum += Math.pow(lastdigit,count);
            temp/=10;
        }
        if(original == sum) System.out.println("The given number is an Armstrong Number");
        else System.out.println("The given number is not an Armstrong Number");
    }
    public int sumOfDigits(int num){
        int sum = 0;
        int lastDigit = 0;
        while(num!=0){
            lastDigit = num % 10;
            sum += lastDigit;
            num/=10;
        }
        return sum;
    }
    public int gcd(int a,int b){
        int mini = Math.min(a,b);
        int gcd = 0;
        for(int i = 1;i <= mini;i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public int lcm(int a,int b){
        int maxi = Math.max(a,b);
        int lcm = 0;
        while(true){
            if(maxi % a == 0 && maxi % b == 0){
                lcm = maxi;
                break;
            }
            maxi++;
        }
        return lcm;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DSA obj = new DSA();
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        int sum = obj.sumOfDigits(num);
        System.out.println(sum);
        obj.armstrongNumber(num);
        int a = 12, b = 18;
        int gcd = obj.gcd(a,b);
        int lcm = obj.lcm(a,b);
        System.out.println("The gcd of "+a+" and "+b+" is "+gcd);
        System.out.println("The lcm of "+a+" and "+b+" is "+lcm);
    }
}
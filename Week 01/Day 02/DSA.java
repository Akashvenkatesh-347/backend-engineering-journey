public class DSA{
    public String isEvenOdd(int num) {
        if (num == 0) return "Zero";
        else if (num % 2 == 0) return "Even";
        else if (num < 0) return "Negative Number";
        else return "Odd";
    }
    public int largestOfThree(int num1,int num2,int num3){
        if(num1 == num2 && num1 == num3){
            System.out.println("All the numbers are same");
        } else if(num1 >= num2 && num1>= num3) {
            return num1;
        } else if(num2 >= num1 && num2 >= num3) {
            return num2;
        }
        else return num3;
        return 0;
    }
    public static void main(String[] args){
        DSA obj = new DSA();
        int num = 256;
        int num1 = 12, num2 = 25, num3 = 19;
        String result = obj.isEvenOdd(num);
        int results = obj.largestOfThree(num1,num2,num3);
        System.out.println(num+" is "+result);
        System.out.println("The largest among "+num1+","+num2+" and "+num3+" is "+ results);
    }
}
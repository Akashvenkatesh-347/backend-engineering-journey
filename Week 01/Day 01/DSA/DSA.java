public class DSA{
    public void N_Numbers(int N){
        for(int i=1;i<=N;i++){
            System.out.println(i);
        }
    }
    public void Sum_N_Numbers(int N){
        int Sum = 0;
        for(int i=1;i<=N;i++){
            Sum += i;
        }
        System.out.println("The Sum of "+ N + " numbers is "+ Sum);
    }
    public void Reverse_Number(int num){
        int original = num;
        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num/=10;
        }
        System.out.println("The reverse of "+original+" is "+rev);
    }
    public static void main(String[] args){
        DSA obj = new DSA();
        int N = 10;
        int num = 567;
        System.out.println("The Printing of N Natural Numbers");
        obj.N_Numbers(N);
        System.out.println("The Sum of N Natural Numbers");
        obj.Sum_N_Numbers(N);
        System.out.println("Reversing a Number");
        obj.Reverse_Number(num);
    }
}
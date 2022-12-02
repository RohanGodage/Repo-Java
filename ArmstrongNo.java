package Random;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        int finalnum=num;
        int Value = 0;
        while(num>0) {
            Value += Math.pow(num%10,3);
            num/=10;


        }
        System.out.println(Value);
        if(Value == finalnum)
        {
            System.out.println("ARMSTRONG NUMBER !!");
        }
        else{
            System.out.println("NOT ARMSTRONG!!");
        }
    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        String[] stringArray = new String[5];

        for(int i =0;i<numArray.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num value at "+i+"th index : ");
            numArray[i]=sc.nextInt();

        }

        for(int i =0;i<stringArray.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string value at "+i+"th index : ");
            stringArray[i]=sc.next();

        }
        Arrays.sort(numArray);
        Arrays.sort(stringArray);

        for(int i =0;i< numArray.length;i++){
            System.out.println(numArray[i]);
        }
        for(int i =0;i< stringArray.length;i++){
            System.out.println(stringArray[i]);
        }
        //REVERSE SORT AN ARRAY
        for(int i = numArray.length-1;i>=0;i--){
            System.out.println("reverse " +numArray[i]);
        }
        for(int i = stringArray.length-1;i>=0;i--){
            System.out.println("reverse " +stringArray[i]);
        }

         /*for(int i =0;i<numArray.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String value at "+i+"th index : ");
            stringArray[i]=sc.next();

        }
        */

/*
            for(int i =0;i< numArray.length-1;i++){
                for(int j =i+1;j<numArray.length;i++)
                {
                    if(numArray[i]<numArray[j]){
                        int temp = numArray[i];
                        numArray[i]=numArray[j];
                        numArray[i]=temp;
                    }

            }
                */

}
}

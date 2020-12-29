import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void fun(int N){
        if(N%2==0){
            
             if(N>1 && N<6){
                System.out.println("Not Weird");
            }
            else if(N>6 && N<20){
                System.out.println("Weird");
            }
            else if(N>20){
                System.out.println("Not Weird");
            }
        } 
        else{
          System.out.println("Weird");
         System.out.println("Test24");
        }
    }

  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        fun(N);
        scanner.close();
        
       
    }
}

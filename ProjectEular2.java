/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First50;

/**
 *
 * @author Chamara Munasinghe
 */
import java.util.*;
public class ProjectEular2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++){
            long N = sc.nextLong();
            int term = 3;
            int sum = 0;
            boolean isboolean = true;
            while(isboolean){
              long temp = fibonacci(term);
              if(temp > N){
                  isboolean = false;
              }
              else{
                  sum += temp;
                  term +=3;
              }
            }
            System.out.println(sum);
        }
    }
            
           
        
    
    public static long fibonacci(long n){
        double Phi = (1+Math.sqrt(5))/2;
        double phi = (1-Math.sqrt(5))/2;
        long fiboValue = (long) ((Math.pow(Phi,n)-Math.pow(phi,n))/Math.sqrt(5));
        return fiboValue;
    }
    
    public static void test(int n){
        for(int i=0; i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}

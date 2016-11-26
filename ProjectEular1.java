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
import java.util.Scanner;
import java.util.ArrayList;
public class ProjectEular1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=0; i<cases;i++){
            int N = sc.nextInt();
            long answer = sum(N,3)+sum(N,5)-sum(N,15);
            System.out.println(answer);
            
        }
    }
    public static long sum(int N,int num){
        
        N = Math.floorDiv(N-1, num);
        long answer = ((N*(N+1))*num)/2;
        return answer;
    }
}
        
        
    

            
            
        
    


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res= new int[n+1];
        for(int j=0;j<n;j++){
            res[n+1]=arr[n-j-1]+j+1;
            System.out.println(res);
            
            
        }
            
            
            
        
        
            
            
            
            
            
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onurhizlan;

/**
 *
 * @author onur_
 */
public class fizzBuzz {
    
    public void  fizzBuzz(int n){
    
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }else if(i % 5 == 0){
            System.out.println("buzz");
        }else if(i % 3 == 0){
            System.out.println("fizz");
        }else{
                System.out.println(i);
        }
    }
    
    }  
    public static void main(String[] args) {
     
        fizzBuzz fizzbuzz = new fizzBuzz();
        int n = 15;
        //System.out.print(fizzbuzz.fizzBuzz(n));
        fizzbuzz.fizzBuzz(n);
    }
}

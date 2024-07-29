/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author talal
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter the amount of cars you want to buy ");
        int cars= input.nextInt();
        
        System.out.println("The amount of cars chosen are " + cars);
        
        int registration []= new int[cars];
         int insurance []= new int[cars];
          int extras []= new int[cars];
           int total  []= new int[cars];
           
           for (int i = 0; i < registration.length; i++) {
               
               System.out.println("enter regustration price for " + cars + " cars ");
                   registration[i]=input.nextInt();
          
        }
          for (int i = 0; i <registration.length; i++) {
            
              System.out.println(registration[i]);
        }
    }
    
}


package claireb;

import java.util.Scanner;

public class NETPAY {
    
      public void getPay(){
        
        Scanner input = new Scanner(System.in);
        
        String name;
        int age,Rphr, Thrs, Tdeduc;
        double Tgross, Netpay;
        
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        System.out.print("Enter rate per hour: ");
        Rphr = input.nextInt();
        
        System.out.print("Enter total hours worked: ");
        Thrs = input.nextInt();
        
        System.out.print("Enter total dedcuction: ");
        Tdeduc = input.nextInt();
        
        Tgross = Rphr * Thrs;
        Netpay = Tgross - Tdeduc;
        
        
        System.out.println("-------------------------------");
         
        System.out.println("----------SEE DETAILS----------");
         
        System.out.println("-------------------------------");
        
        System.out.println("Date: August 14, 2024");
         System.out.println("Name:" +name);
          System.out.println("Age" +age);
          
          
           System.out.printf("Total gross: %.2f", +Tgross);
            System.out.println("\nTotal Deduction: " + Tdeduc);
            
             System.out.println("\n--------------------------");
              System.out.printf("Netpay: %.2f", +Netpay);
               System.out.println("\n-----------------------");
       
    }
    
}



package bank;

import java.io.*;
import java.util.*;

/**
 *
 * @author ABHISHEK BHARTI
 */
class Bankbank
{
    
    double dep,wid,bal;
    
    Scanner s= new Scanner(System.in);
    Bankbank()
    {
       
        dep=wid=0;
        bal=500;
        
    }
    
    void opennew()
    {
        System.out.println("A minimum of Rs.500 must be deposited");
    }
    
    void deposit()
    {
        
        System.out.println("Enter the amount to be deposited");
        dep=s.nextDouble();
        
        bal=bal+dep;
        
    }
    
     void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn");
        wid=s.nextDouble();
       if(wid>bal) 
        System.out.println("Insufficient balance");
       else if(bal-Math.abs(wid)<500)
           System.out.println("Invalid withdraw amount\nMaintain min deposit of Rs.500");
       else
           bal=bal-Math.abs(wid);
           
    }
     
     void enq()
     {
         System.out.println("The balance amount is : "+bal);
     }
}


public class Bank {
    public static void main(String[] args) {
        // TODO code application logic here
 Boolean flag=true,f=false;
        Bankbank b= new Bankbank();
        int ch,i=0;
        Scanner s= new Scanner(System.in);
       
        while(flag==true)
        {
            System.out.println("1.Create a new account\n2.Deposit\n3.Wtihdraw");
            System.out.println("4.Balance Enquiry\n5.Exit\nEnter your choice:");
            ch=s.nextInt();
            
            if(ch==1 && f==true)
                System.out.println("Account already open");
            else{
                switch(ch)
                {
                    case 1: b.opennew();
                           
                            break;
                    case 2: b.deposit();
                            break;
                    case 3: b.withdraw();
                            break;
                    case 4: b.enq();
                            break;
                    case 5: flag=false;
                            break;
                        
                    default: System.out.println("Enter valid choice:");
                }
            }
        }
    }
}




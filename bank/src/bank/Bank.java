
package bank;

import java.util.*;

/**
 *
 * @author ABHISHEK BHARTI
 // a k bharti
 */
class Bankbank
{
    
    double dep_amount,wid_amount,balance;
    
    Scanner s= new Scanner(System.in);
    Bankbank()
    {
       
        dep_amount=wid_amount=0;
        balance=500;
        
    }
    
    void opennew()
    {
        System.out.println("A minimum of Rs.500 must be deposited");
    }
    
    void deposit()
    {
        
        System.out.println("Enter the amount you want to deposit");
        dep_amount=s.nextDouble();
        
        balance=balance+dep_amount;
       
    }
    
     void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn");
        wid_amount=s.nextDouble();
       if(wid_amount>balance) 
        System.out.println("Insufficient balance");
       else if(balance-Math.abs(wid_amount)<500)
           System.out.println("Invalid withdraw amount\nMaintain min deposit of Rs.500");
       else
           balance=balance-Math.abs(wid_amount);
           
    }
     
     void enq()
     {
         System.out.println("The balance amount is : "+balance);
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




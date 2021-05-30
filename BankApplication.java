
package bankacount;

import java.util.Scanner;

public class BankApplication {

 public static void main(String[]args){

     Bankacount obj1= new Bankacount("shs","hfh34");
     
     obj1.showMenu();
             

         }
}

 class Bankacount {
    
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    Bankacount(String cName, String cId){
        
       customerName = cName; 
       customerId = cId;
    }
    
    void deposit(int amount){
        if (amount!= 0){
            
            balance=balance + amount;
            previousTransaction = amount;
        }
    }
    
    void withdraw(int amount){
        
        if (amount != 0){
             balance=balance - amount;
         previousTransaction = - amount;
         
        }
         
    }
      
    void getpreviousTransaction(){
        
            if (previousTransaction > 0){
            
            System.out.println("deposit :" + previousTransaction);
            }
            
            else if (previousTransaction < 0){
                
                
            System.out.println("withdraw :" +Math.abs(previousTransaction) );

            }
            
            else{
           System.out.println("there is no Transaction **" );
            }
 
        }
    
    void showMenu(){
        
        char option = '\0';
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("welcome :" + customerName);
        System.out.println(" kindly Enter Your ID :" + customerId);
        
        
        System.out.println("\n");
        
        System.out.println("a. check balance:");
        System.out.println("b. deposit:");
        System.out.println("c. withdraw:");
        System.out.println("d. previousTransaction:");
        System.out.println("e. exit");

    do{
        
         System.out.println("************");
         System.out.println("Enter your option:");
         option = s.next().charAt(0);

         System.out.println("\n");

        switch(option){
           
            case 'a':
                
         System.out.println("Balance =" +balance );

            break;
            
            
            case 'b':
                
             System.out.println(" enter your Deposit amount " );
             int amount = s.nextInt();
             deposit(amount);
             
             break;

            case 'c':
                
             System.out.println(" enter your withdraw amount " );

             int amount2 = s.nextInt();
             withdraw(amount2);
             
             break;

             
            case 'd':
                
             System.out.println(" check your previousTransaction " );
              
             getpreviousTransaction(); 

            break;
            
            case 'e':
                
             System.out.println(" ********** " );
             
             break;

            default:
                
             System.out.println(" invalid option,, please try again " );
                
             break;
             
       }
      
    } while (option != 'e');
              
         System.out.println(" tank you for using our services " );
         
          
    }

   
    
    }

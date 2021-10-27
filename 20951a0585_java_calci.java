
/*
 simple calculator
 */
package javaapplication27;
import java.util.*;

public class JavaApplication27 {
     static void funSum(int a, int b){
        System.out.println("sum is " + (a+b));
     }
     static void funSub(int a, int b){
        System.out.println("sub is " + (a-b));
     }
     static void funMul(int a, int b){
        System.out.println("mul is " + (a*b));
     }
      static void funDiv(int a, int b){
        System.out.println("Div is " + (a/b));
      }

  
    public static void main(String[] args) {
        int choice;
        System.out.println("menu\n1.add\n2.sub\n3.mul\n4.div ");
        
        int i=1;
        while (i>0 ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice: ");
            choice = sc.nextInt(); 
            int x , y;
            System.out.println("enter x ");
            x = sc.nextInt();
            System.out.println("enter y ");
            y = sc.nextInt();
            if (choice==1){
                 funSum(x,y);
        }
            if (choice==2){
                 funSub(x,y);
        }
            if (choice==3){
                 funMul(x,y);
        }
            if (choice==4){
                 funDiv(x,y);
        }
            if (choice >4 | choice==0){
                System.out.println("enter a valid choice ");
                break;
            }
            
  
      
}
    }
}

Input/Output:
menu
1.add
2.sub
3.mul
4.div 
enter your choice: 
1
enter x 
3
enter y 
6
sum is 9
enter your choice: 
3
enter x 
4
enter y 
6
mul is 24
enter your choice: 
6
enter x 
3
enter y 
5
enter a valid choice 

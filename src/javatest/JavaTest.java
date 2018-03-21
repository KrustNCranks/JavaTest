
package javatest;

import java.util.Scanner;

/**
 *
 * @author Chathu
 */
public class JavaTest {

    
    public static void main(String[] args) {
//        System.out.println("Person\tHeight\tShoeSize");
//        System.out.println("==========================");
//        System.out.println("Hannah\t5'1\"\t7");
//        System.out.println("Jenna\t5'10\"\t9");
//        System.out.println("JJ\t6'1\"\t14");
//        double d = 4.34;
//        double c = 5.76;
//        int i = (int)d;
//        int j = (int)c;
//        System.out.println(i);
//        System.out.println(j);
//
//          String num = "123";
//          System.out.println("Max Double Value: "+Double.MAX_VALUE);
//          System.out.println("Min Byte Value: "+Byte.MIN_VALUE);
//          System.out.println("Converted String: "+Integer.parseInt(num));
//          
//          int arr[] = new int[20];
//          for(int i=0;i<arr.length;i++)
//          {
//              arr[i]= i*2 ;
//              System.out.println(arr[i]);
//          }
//          
//          int[][] mul = {{3,4,8},{1,5},{8,4,7,2}};
//          for(int i=0; i<mul.length;i++)
//          {
//              for(int j = 0;j<mul[i].length;j++)
//              {
//                  mul[i][j] = i;
//                  System.out.println(mul[i][j]);
//              }
////          }
//         System.out.println("Enter a positive number: ");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         
//         do
//         {
//             int digit = number % 10;
//             System.out.println(digit);
//             number = number /10;
//         }
//         while(number !=0);   

           for(int i=0;i<4;i++)
           {
               for(int j=0;j<4;j++)
               {
                   System.out.print("*");
               }  
               System.out.println();
           }
           
           for(int i=1;i<=5;i++)
           {
               for(int k=0;k<(4-i/2);k++)
               {
                   System.out.print(" ");
               }
               for(int j=0;j<i;j++)
               {
                   System.out.print("*");
               }
               System.out.println();
           }
    }
    
}


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

//           for(int i=0;i<4;i++)
//           {
//               for(int j=0;j<4;j++)
//               {
//                   System.out.print("*");
//               }  
//               System.out.println();
//           }
//           
//           for(int i=1;i<=5;i++)
//           {
//               for(int k=0;k<(4-i/2);k++)
//               {
//                   System.out.print(" ");
//               }
//               for(int j=0;j<i;j++)
//               {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }

//        final double KMS_PER_MILE = 1.609;
//        final double YARD_PER_MILE = 1760;
//        int miles = 26, yards = 385;
//        double km,total,total2,total3;       
//        total = miles*KMS_PER_MILE;
//        total2 = yards/YARD_PER_MILE;
//        total3 = total2*KMS_PER_MILE;
//        km = total + total3;
//        System.out.println(km);

//        String arr[] = new String[5];
//        arr[0] = "Irushi";
//        arr[1] = "Chathu";
//        arr[2] = "Rehansa";
//        arr[3] = "Abeywickrama";
//        arr[4] = "Koralage";
//        
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        
        String[][] arr2 = new String[6][6];
        arr2[0][0] = "DIT";
        arr2[0][1] = "\tST2";
        arr2[0][2] = "\tSPD";
        arr2[0][3] = "\tPS";
        arr2[0][4] = "\tDCCN2";
        arr2[0][5] = "\tSE1";
        arr2[1][0] = "DIT10";
        arr2[1][1] = "\tA";
        arr2[1][2] = "\tA-";
        arr2[1][3] = "\tB+";
        arr2[1][4] = "\tA";
        arr2[1][5] = "\tA-";
        arr2[2][0] = "DIT11";
        arr2[2][1] = "\tC-";
        arr2[2][2] = "\tC";
        arr2[2][3] = "\tB";
        arr2[2][4] = "\tB";
        arr2[2][5] = "\tB+";
        arr2[3][0] = "DIT12";
        arr2[3][1] = "\tD";
        arr2[3][2] = "\tC-";
        arr2[3][3] = "\tC";
        arr2[3][4] = "\tB-";
        arr2[3][5] = "\tB";
        arr2[4][0] = "DIT13";
        arr2[4][1] = "\tA";
        arr2[4][2] = "\tA";
        arr2[4][3] = "\tA-";
        arr2[4][4] = "\tA";
        arr2[4][5] = "\tA-";
        arr2[5][0] = "DIT14";
        arr2[5][1] = "\tC";
        arr2[5][2] = "\tC-";
        arr2[5][3] = "\tB";
        arr2[5][4] = "\tB+";
        arr2[5][5] = "\tB";
        
        for(int e=0;e<arr2.length;e++)
        {
            for(int f=0;f<arr2[e].length;f++)
            {
                System.out.print(arr2[e][f]);
            }
            System.out.println();
        }
        
        
    }
    
}

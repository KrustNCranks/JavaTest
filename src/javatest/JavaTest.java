
package javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Chathu
 */
public class JavaTest {

    
    public static void main(String[] args) throws IOException {
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
        
//        String[][] arr2 = new String[6][6];
//        arr2[0][0] = "DIT";
//        arr2[0][1] = "\tST2";
//        arr2[0][2] = "\tSPD";
//        arr2[0][3] = "\tPS";
//        arr2[0][4] = "\tDCCN2";
//        arr2[0][5] = "\tSE1";
//        arr2[1][0] = "DIT10";
//        arr2[1][1] = "\tA";
//        arr2[1][2] = "\tA-";
//        arr2[1][3] = "\tB+";
//        arr2[1][4] = "\tA";
//        arr2[1][5] = "\tA-";
//        arr2[2][0] = "DIT11";
//        arr2[2][1] = "\tC-";
//        arr2[2][2] = "\tC";
//        arr2[2][3] = "\tB";
//        arr2[2][4] = "\tB";
//        arr2[2][5] = "\tB+";
//        arr2[3][0] = "DIT12";
//        arr2[3][1] = "\tD";
//        arr2[3][2] = "\tC-";
//        arr2[3][3] = "\tC";
//        arr2[3][4] = "\tB-";
//        arr2[3][5] = "\tB";
//        arr2[4][0] = "DIT13";
//        arr2[4][1] = "\tA";
//        arr2[4][2] = "\tA";
//        arr2[4][3] = "\tA-";
//        arr2[4][4] = "\tA";
//        arr2[4][5] = "\tA-";
//        arr2[5][0] = "DIT14";
//        arr2[5][1] = "\tC";
//        arr2[5][2] = "\tC-";
//        arr2[5][3] = "\tB";
//        arr2[5][4] = "\tB+";
//        arr2[5][5] = "\tB";
//        
//        for(int e=0;e<arr2.length;e++)
//        {
//            for(int f=0;f<arr2[e].length;f++)
//            {
//                System.out.print(arr2[e][f]);
//            }
//            System.out.println();
//        }
//        
//      
        final double KILOS_PER_POUND = 0.454;
        final double METERS_PER_FOOT = 0.3046;
        final int i = 3;
        int a2 = 2, b =8;
        System.out.println("BMI Calculator");
        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String input = sc.nextLine();
        
        System.out.print("Enter Weight(lbs): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter Height(feet): ");
        double height = sc.nextDouble();
        
        double MW = weight * KILOS_PER_POUND;
        double MH = height * METERS_PER_FOOT;
        
        double bmi = MW / (MH * MH);
        char a = input.charAt(i);
        int h = input.hashCode();
        String up = input.toUpperCase();
        String dw = input.toLowerCase();
        System.out.println("Yo! Your BMI is: "+bmi+ "Character is: "+a+ "hash is: "+h+ "Also: "+up+ "And: "+dw);
        
            
   }
    
}

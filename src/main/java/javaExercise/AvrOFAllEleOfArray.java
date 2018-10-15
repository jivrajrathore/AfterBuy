 package javaExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AvrOFAllEleOfArray {

	 public static void main(String[] args) throws NumberFormatException, IOException  {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("How many elements in array:");
		 int maxElement = Integer.parseInt(br.readLine());
		 
		 double [] num = new double[maxElement];
		 System.out.println(Arrays.toString(num));
		 double add = 0;
		 for(int i=0;i<num.length;i++) {
		 System.out.print("enter "+i+" element: ");
		 num[i]= Double.parseDouble(br.readLine());
		 add+=num[i];
		 }
		 System.out.println("Total element in array : "+maxElement);
		 System.out.println("addition of all element : "+add);
		  double avr = (add/maxElement);
		  System.out.println("average of all element "+avr);
	}
}

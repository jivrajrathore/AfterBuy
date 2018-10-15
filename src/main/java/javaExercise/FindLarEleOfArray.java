package javaExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindLarEleOfArray {
 
	   public static void main(String [] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("How many elements in array:");
	    int maxElement = Integer.parseInt(br.readLine());
	   
	     double arr[] = new double[maxElement];
	     
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.print("enter "+(i+1)+" element");
	    	 arr[i] = Double.parseDouble(br.readLine());
	     }
	     System.out.println(Arrays.toString(arr));
	     
	     double compare = arr[0];
	     double secondLargest = arr[0];
	     for(int j=1;j<arr.length;j++) {
	    	 if(arr[j]>compare) {
	    		 secondLargest = compare;
	    		 compare = arr[j];
	    	 }
	    	 else if(arr[j]>secondLargest){
	    		 secondLargest = arr[j];
	    		 
	    	 }
	     }
	     System.out.println("second largest value in array is :"+secondLargest);
	      double min = arr[0];
	      for(int i= 1;i<arr.length;i++) {
	    	  if(arr[i]<min) {
	    		  min = arr[i];
	    	  }
	      }
	      System.out.println("smallest value of aaray : "+min);
	   }
}

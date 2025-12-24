package srimathi;

import java.util.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
      {
    	  int i;
    	  int [][]arr=new int [2][2];
    	  System.out.println("enter the array value");
    	  for( i=0;i<2;i++)
    	  {
    		  for(int j=0;j<2;j++)
    		
    			  arr[i][j]=sc.nextInt();
    		  System.out.println();
    	  }
    	  System.out.println("The matrix is:");
    	  for( i=0;i<2;i++)
    	  {
    		  for(int j=0;j<2;j++)
    		
    			System.out.printf("\t %d",arr[i][j]);
    		System.out.println();
    	  }
         }
      }
	}

    		
    	  
    	  
    	  

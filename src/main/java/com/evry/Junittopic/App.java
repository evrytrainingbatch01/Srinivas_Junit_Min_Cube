package com.evry.Junittopic;

public class App 
{
   public static int checkMin(int arr[]) {
	   int min=arr[0];
	   for(int i=1;i<arr.length;i++) {
		   if(min>arr[i]) {
			   min=arr[i];
		   }
	   }return min;
   }
   
   public static int calCube(int n) {
	   return n*n*n;
   }
}

/* I/P: arr={30,20,10,40,50}
 * Largest Num:50
 * Smallest Num:10
 * 
 */
package main1;

public class Day2FindSmallLarge {
	public static void main(String[] args) {
		
		
		
		int min = 0,max = 0;
		int arr[]={30,20,10,40,50};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Smallest num: "+min);
		System.out.println("Largest num: "+max);
	}

}

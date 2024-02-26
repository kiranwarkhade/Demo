package test;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		System.out.println("Arrays");
		int[] a1= {1,3,5,7};
		int[] a2= {2,4,6,8};
		
		int[] mergedArray= mergeArrays(a1,a2);
 System.out.println("Merged Array: "+ Arrays.toString(mergedArray));
	}
	
	public static int[] mergeArrays(int[] a1,int[] a2)
	{
		int length=a1.length+a2.length;
		int[] mergedArray=new int[length];
		int i=0, j=0, k=0;
		
		while(i< a1.length && j <a2.length)
		{
			if(a1[i] < a2[j])
			{
				mergedArray[k++]= a1[i++];
			}
			else {
         mergedArray[k++]= a2[j++];
		}
	}
		while(i< a1.length)
		{
			mergedArray[k++]=a1[i++];
		}
		while(j< a2.length)
		{
			mergedArray[k++]=a2[j++];
		}
      return mergedArray;
		}

}

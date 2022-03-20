public class MiddleDidgitNumber  

{  
static int middleDigitNumber(int mid_digit)  
{  
int total_digits = (int)Math.log10(mid_digit) + 1;  
mid_digit = (int)(mid_digit / Math.pow(10, total_digits / 2)) % 10;  
return mid_digit ;  
}  
public static void main(String args[])  
{  
int num = 561480;  
System.out.println("The middle digit number is: "+ middleDigitNumber(num));  
}  
}  



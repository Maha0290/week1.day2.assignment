package week1.day2.assignment1;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		int n=454;
		int sum=0, temp, r;
		temp=n;    
		  while(n>0){    
		   r=n%10;  
		   		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number");    
		  else    
		   System.out.println("not palindrome");    
		}  

	}



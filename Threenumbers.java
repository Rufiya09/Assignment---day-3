//write a java program to add , sub , mul , sum , avg of three numbers 

class Threenumbers
{
	public static void main(String args[])
	{
	  int num1 = 10;
	  int num2 = 12;
	  int num3 = 50;
	  int sum = num1+num2+num3;
	  int sub = num1-num2-num3;
	  int mul = num1*num2*num3;
	  int avg = sum/2 ;
	  int rem = sum%2;
	  
	System.out.println("the sum is");
	System.out.println(sum);
	System.out.println("the sub is");
	System.out.println(sub);
	System.out.println("the mul is");
    System.out.println(mul);
	System.out.println("the avg is");
	System.out.println(avg);
	System.out.println("the rem is");
	System.out.println(rem);
	}
}

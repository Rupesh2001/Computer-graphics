import java.util.Scanner;
class sum
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.print("enter 2 numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a+b;
		
		System.out.println("sum is : "+c);
	}
}
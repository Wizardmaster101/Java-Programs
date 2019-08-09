
import java.util.*;


public class Amstrong {
	
	public static int power(int a,int b){
		int result = 1;
		for(int i = 1;i<=b;i++){
			result = result * a;  
		}
		return result;
	}
	
	public static void main(String args[]){
		char repeat;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int len = String.valueOf(num).length();
			int newnum = 0;
			int orgnum = num;
			while(num>0){
				int n = num%10;
				int pow = power(n,len);
				newnum = newnum + pow;
				num = num/10;
			}
			System.out.println(newnum);
			System.out.println("Do u want to continue");
			repeat = sc.next().charAt(0);
		}while(repeat == 'y' || repeat == 'Y');
	}
}

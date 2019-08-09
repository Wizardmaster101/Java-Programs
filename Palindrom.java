
public class Palindrom {

	public static void main(String[] args) {
	    char repeat;
	    do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is palindrome or not : ");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		int orignalnum = num;
		int newval = 0;
		while(num>0){
			int n = num%10;
			newval = (newval*10) + n;
			num = num/10;
		}
		
		if(newval == orignalnum){
			System.out.println("Number is palindrom");
		}
		else{
			System.out.println("Number is not palindrom");
		}
		System.out.println();
		System.out.println("Do you want to continue :");
		repeat = sc.next().charAt(0);
	    }while(repeat == 'y' || repeat == 'Y');
				
}
}

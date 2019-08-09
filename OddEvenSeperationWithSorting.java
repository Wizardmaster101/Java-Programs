
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		char repeat;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of element in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value of Array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(arr[i]%2 != 0){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		
		}
		
		for(int i = 0;i<n;i++){
			if(arr[i]%2 != 0 && arr[n-1]%2 != 0 && arr[n-1]<arr[i]){
				int temp = arr[i];
				arr[i] = arr[n-1];
				arr[n-1] = temp;
			}
		}
		
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Do you want to continue :");
		repeat = sc.next().charAt(0);
		}while(repeat == 'y' || repeat == 'Y');
	}

}

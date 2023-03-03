package day2;

public class Program7 {
	public static void main(String[] args) {
		int arr[] = {2,2,2,2,2};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
		int avg = sum/arr.length;
		System.out.println(avg);
	}
}

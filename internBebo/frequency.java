package internBebo;

public class frequency {

			public static void main(String[] args) {
			int arr[]= {2,3,5,4,6,3};
			int f[]= {-1,-1,-1,-1,-1,-1};		
		
			for(int i=0;i<arr.length;i++) {
				int count= 1;
				for(int j=i+1;i<arr.length;i++) {
					
					if (arr[i]==arr[j]) {
						
						count++;
						
						f[j]=0;
						
					}
					if (f[i]!=0) {
						f[i]=count;
					}
					
					
					
					
				}


		}
			int temp[]=new int[arr.length];
	System.out.println("frequncy:");
	for(int i=0 ;i<arr.length;i++) {
		if(f[i]!=0) {
			System.out.println(arr[i]+" comes "+f[i]+" times");
		}
	}
	}

	}



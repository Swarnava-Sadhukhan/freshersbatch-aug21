public class Bubble {
	
	public static void main(String[] args) {
		
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array before sorting");
		for(int i=0;i<15;i++)
			System.out.println(arr[i]);
		System.out.println("Array after sorting");
		for (int i = 0; i < 15-1; i++)
            for (int j = 0; j < 15-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		for(int i=0;i<15;i++)
			System.out.println(arr[i]);
	}

}

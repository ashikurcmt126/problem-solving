public class MaxProduc {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			
			long max=Integer.MIN_VALUE;
			for(int i=0;i<n-2;i++){
				for(int j=i+1;j<n-1;j++){
					for(int k=j+1;k<n;k++){
						max=Math.max(max,a[i]*a[j]*a[k]);
					}
				}
			}
			System.out.println(max);
		}
	}

}
public class Maximum1s {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					a[i][j]=sc.nextInt();
				}
			}
			int count=0;
			int max=0;
			int ashikur=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(a[i][j]==1){
						count++;
					}
				}
				if(count>max){
					max=count;
					ashikur=i;
				}
				count=0;
			}
			System.out.println(ashikur);
		}
	}

}
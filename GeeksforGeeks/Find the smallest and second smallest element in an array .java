public class NextSmall {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int ashikur=a[0];
			int check=0;
			for(int i=1;i<n;i++){
				if(a[i]==ashikur){
					
				}else{
					check=1;
					System.out.println(ashikur+" "+a[i]);
					break;
				}
			}
			if(check==0){
				System.out.println(-1);
			}
		}
	}

}
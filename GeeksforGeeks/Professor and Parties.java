public class Professor {
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
			int k=a[0];
			int c=0;
			for(int i=1;i<n;i++){
				if(k==a[i]){
					c=1;
					break;
				}else{
					k=a[i];
				}
			}
			if(c==0)System.out.println("GIRLS");else{
				System.out.println("BOYS");
			}
		}
	}

}

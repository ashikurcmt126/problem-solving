public class FightDark {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(a[i]>b){
					b=a[i];
				}
				
			}
			System.out.println(b);
			
		}
	}

}
import java.util.Scanner;
public class arrelements {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count = 0, n,n1,i,j,k;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
           arr[i]=sc.nextInt();
           }
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
					if((i<j && j<k )&&(arr[i]<arr[j] && arr[j]<arr[k])){
						if(arr[i]+arr[j] == arr[k]){
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						}
					}
				}
			}
		}
}
}

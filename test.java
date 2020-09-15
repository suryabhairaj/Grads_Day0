import java.util.*;

public class test{
	public static void main(String dfg[]){
		int n;
		//first n natural numbers
		boolean a[] = new boolean[n+1];
		for(int i=1;i<=n;i++){
			a[i] = false;
		}
		for(int i=2;i<=n;i++){
			if(!a[i])
			for(int j=i*i;j<=n;j+=i){
				a[j] = true;
			}

		}
		for(int i=2;i<=n;i++){
			System.out.print(i+" ");
		}
	}

	
}
package patterns;
import java.math.*;

public class Triangle {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for (int k = 8; k > 1; k--) {
			for (int l = 1; l < k - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		{
			int i = 1;
			int j = 1;
			int k = 1;
			int max = 7;

			while (i < max) {
				k = 1;
				while (k < max - i) {
					System.out.print(' ');
					++k;
				}
				while (j > 0) {
					/* System.out.print(max - (max - j)); */
					System.out.print("*");
					--j;
				}
				++i;
				/* System.out.println(j); */
				j += i;
				System.out.println("");
			}
		}
		System.out.println();
		{
			int i = 1;
			int j = 1;
			int k = 1;
			int max = 7;
			int max2 = 8;
			int tmp = 0;

			while (i < max) {
				k = 1;
				while (k < max - (max - i)) {
					System.out.print(' ');
					++k;
				}
				tmp = max2 - i;
				j = 1;
				while (j < tmp) {
					/* System.out.print(max - (max - j)); */
					System.out.print("*");
					++j;
				}
				++i;
				System.out.println("");
			}
		}
		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 6 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
	
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==j){
					 System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		{
			
			/*for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(i==j){
						 System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}*/
			
			int n=9;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					
					if(i<Math.ceil(n/2)&&j==0){
						System.out.print("*");
					}
	
						       
					else if(i>Math.ceil(n/2)&&j==(n-1)){
						System.out.print("*");
					}
						
								
					else if(i==Math.ceil(n/2)||j==Math.ceil(n/2)){						
						System.out.print("*");
					}					
					else{
						  System.out.print(" ");
					}
					
					
				}
				System.out.println();
				}
		}
		
	}

}

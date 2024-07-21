import java.io.IOException;
import java.util.Scanner;

public class Main1478 {

    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
    	int val;
    	while (num != 0) {
    		for (int i = 1; i <= num; i++) {
    			val = i;
    			for (int j = 1; j <= num; j++) {
    				if (i == j) val = 1;
    				
                    System.out.printf("%3d", val);
                    if (j < num) System.out.print(" ");
                    else System.out.print("\n");
                    
    				if (j >= i) val++;
    				else val--;
    			}
    		}
    		System.out.printf("\n");
    		num = input.nextInt();
    	}
		input.close();
    }
	
}
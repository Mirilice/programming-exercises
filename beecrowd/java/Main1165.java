import java.io.IOException;
import java.util.Scanner;

public class Main1165{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int casos= input.nextInt();
        for(int i = 0; i < casos; i++){
            int quant = 0;
            int num = input.nextInt();

            for(int j = 1; j <= num; j++){
                if (num % j == 0){
                    quant++;
                }
            }
            if (quant == 2){
                System.out.println(num + " eh primo");
            }else {
                System.out.println(num + " nao eh primo");
            }
        }
        input.close();
    }
}
    
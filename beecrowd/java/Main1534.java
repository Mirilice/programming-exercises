import java.io.IOException;
import java.util.Scanner;

public class Main1534 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) { //EOF
            int matriz = input.nextInt();
            for (int i = 0; i < matriz; i++) {
                for (int j = 0; j < matriz; j++) {
                    if ((j == i && j + i == matriz - 1) || (j + i == matriz - 1)) {
                        System.out.print(2);
                    } else if (j == i) {
                        System.out.print(1); 
                    } else {
                        System.out.print(3);
                    }
                }
                System.out.println();
            }
        }
        input.close();
    }
}

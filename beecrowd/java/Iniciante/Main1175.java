package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Main1175{

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[20];
        for(int i = 0; i < 20; i++) {
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[19 - i];
            numeros[19 - i] = temp;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + numeros[i]);
        }
        input.close();
    }
    
}
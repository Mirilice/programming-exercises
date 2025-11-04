package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Main1179 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 15; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                if (contPar == 5) {
                    for (int j = 0; j < par.length; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    contPar = 0;
                }
                par[contPar] = num;
                contPar++;
            } else {
                if (contImpar == 5) {
                    for (int j = 0; j < impar.length; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    contImpar = 0;
                }
                impar[contImpar] = num;
                contImpar++;
            }
        }

        for (int i = 0; i < contImpar; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }

        for (int i = 0; i < contPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }

        input.close();
    }
}

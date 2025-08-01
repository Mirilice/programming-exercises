import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1182{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int coluna = input.nextInt();
        input.nextLine();
        String operacao = input.nextLine().trim();

        double soma = 0;
        double media = 0;
        int cont = 0;

        for(int i = 0; i <12; i++) {
            for(int j = 0; j < 12; j++) {
                double num = input.nextDouble();
                if(j == coluna){
                    soma += num;
                    cont++;
                }
            }
        }
        if(operacao.equalsIgnoreCase("S")){
            System.out.printf("%.1f%n", soma);

        }else{
            media = soma / cont;
            System.out.printf("%.1f%n", media);
        }
        input.close();
    }

}
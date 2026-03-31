package Iniciante;
import java.util.Scanner;
import java.io.IOException;

public class Main1865 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String hero = "Thor";
        int C = input.nextInt();
        for (i = 0; i < C; i++) {
            String name = input.next();
            int power = input.nextInt();
            if (name.equals(hero)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        input.close();
    }
}


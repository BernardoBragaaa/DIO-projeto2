package app;

import java.util.Scanner;
import exeption.ParametrosInvalidosException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) { 
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            int contagem = parametroUm - parametroDois;

            for (int i = 0; contagem >= i; i++) {
                System.out.println(i);
            }

            System.out.println("Parametro um é maior que o parametro dois!");
        } else {
            throw new ParametrosInvalidosException("Parametro dois não é maior que o parametro um.");
        }
    }
}

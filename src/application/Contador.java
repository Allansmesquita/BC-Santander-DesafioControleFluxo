package application;

import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois numeros inteiros (o segundo deve ser maior que o primeiro):");
        int param1 = sc.nextInt();
        int param2 = sc.nextInt();

        try{
            contar(param1,param2);
        } catch (ParametrosInvalidosException e){
            System.err.println("Erro:" + e.getMessage());
        }
        sc.close();
    }
    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if (param1 > param2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        } else{
            int contagem = param2 - param1;
            for (int i=1;i<=contagem;i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }

}
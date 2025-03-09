package com.geradordesenhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        tamanho = 0;

        while (true) {
            try {
                System.out.println("========= | Gerador de senhas seguras | =========");
                System.out.println("Digite o tamanho da senha desejada: ");
                tamanho = Integer.parseInt(scanner.nextLine());
                
                if (tamanho >= 5) {
                    break;
                } else {
                    System.out.println("Por favor, insira um valor acima de 5.");
                }
    
            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor invalido, insira um valor inteiro.");
            } 
        }

        scanner.close();

        PasswordGenerator exibirSenha = new PasswordGenerator();
        String senhaFinal = exibirSenha.gerarSenha(tamanho).toString();
        
        System.out.println("Senha: " + senhaFinal);

        PasswordGenerator gerador = new PasswordGenerator();
        String senhaGerada = gerador.gerarSenha(tamanho);

        System.out.println("\n Tamanho da senha gerada: " + tamanho);

        PasswordStrengthChecker avaliador = new PasswordStrengthChecker();
        String forca = avaliador.avaliarForca(senhaGerada);

        System.out.println("Força da senha: " + forca);

        scanner.close();
    }
}

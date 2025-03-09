package com.geradordesenhas;

import java.security.SecureRandom;

public class PasswordGenerator {
    
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*_-+";

    public String gerarSenha(int tamanho) {

        SecureRandom random = new SecureRandom(); // Usamos SecureRandom para gerar números aleatórios de forma mais segura
        StringBuilder senha = new StringBuilder(tamanho); // StringBuilder é mais eficiente para concatenar strings

        for (int i = 0; i < tamanho; i++){
        int indice = random.nextInt(CARACTERES.length()); // Gera um número aleatório dentro do tamanho dos caracteres
        senha.append(CARACTERES.charAt(indice)); // Adiciona o caractere escolhido à senha
        }

        return senha.toString();
    }
}


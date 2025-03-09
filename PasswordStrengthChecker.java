package com.geradordesenhas;

import java.util.regex.Pattern;

public class PasswordStrengthChecker {
    
    public String avaliarForca(String senha) {
        if(senha.length() <  8 ) {
            return "Senha fraca"; // senha com menos de 8 digitos, é considerada fraca.
        } else if (senha.length() >= 9 && senha.length() <= 18) {
            return "Senha mediana";
        } else if (senha.length() > 19) {
            return "Senha forte";
        }
    
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean simbolo = false;

        // Verifica se a senha contém pelo menos um caractere maiúsculo, minúsculo, número e símbolo

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isUpperCase(c)) {
                maiuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            } else if (Pattern.matches("^*_-", String.valueOf(c))) {
                simbolo = true;
            }
        }

        // Se a senha tiver todos os critérios de segurança, será considerada "Forte"

        if(maiuscula && minuscula && numero && simbolo) {
            return "Senha Forte";
        } else if (maiuscula && minuscula && numero) {
            return "Senha mediana";
        } else if (maiuscula && minuscula) {
            return "Senha fraca";
        }
        
        return senha;
    }

}

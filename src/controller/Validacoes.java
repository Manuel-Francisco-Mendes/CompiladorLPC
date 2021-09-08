/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author user
 */
public class Validacoes {
    
    public static boolean simbolo(String caratere) {

        for (int i = 0; i < Regex.SIMBOLOS_ESPECIAIS.size() - 1; i++) {
            if (Regex.SIMBOLOS_ESPECIAIS.get(i).equalsIgnoreCase(caratere)) {
                return true;
            }
        }

        return false;
    }


    public static boolean digito(String caratere) {
        return caratere.matches(Regex.DIGITOS);
    }

    static boolean identificador(String caratere) {
        return caratere.matches(Regex.INDENTIFICADOR);
    }
    

    public static String validar(String str1) {
        String str = "";
        if (str1.endsWith(" ")) {
            str = str1.substring(0, str1.length() - 1);
        } else {
            str = str1;
        }
        if (simbolo(str)) {
            return "Simbolo especial";
        } else if (digito(str)) {
            return "Digito";
        } else if (identificador(str)) {
            return "Identificador";
        } else {
            return "Indefinido";
        }
    }
}

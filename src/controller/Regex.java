/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Regex {
    
    public static final String DIGITOS = "[0-9]+";
    
    public static final List<String> SIMBOLOS_ESPECIAIS  = Arrays.asList("=", "<>", "<", ">", "<=", 
        ">=", "(", ")", "[", "]", ":=", ".", ",", ";", ":", "..","div", "or", "and", "not" ,"if" ,"then", "else", "of", "while", "do", "begin", "end",
      "read", "write", "var", "array", "function", "procedure", "program", "true", "false", "char", "integer", "boolean","=", "<>", "<", ">", "<=", 
        ">=","+","-","*");
        
    public static final String INDENTIFICADOR = "[a-zA-Z]+[0-9]*[a-zA-Z]*";

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palavrainvertida;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class PalavraInvertida {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        String pinvertida;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.next();
       // System.out.println("A palavra digitada foi: "+palavra);
        
        char[]ch =palavra.toCharArray();
        int inicio=0;
        int fim = ch.length-1;
        char aux;
        
        while(fim>inicio){
            aux=ch[inicio];
            ch[inicio]=ch[fim];
            ch[fim]=aux;
            fim--;
            inicio++;
        
        }
        
        
        pinvertida=new String(ch);
        System.out.println("O inverso de caracteres de: "+palavra+" alan= "+pinvertida);
    }
    
}

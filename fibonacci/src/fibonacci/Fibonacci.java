/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Micro
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
         int entrada;
         int ant=0;
         int pos=1;
         int cont=1;
         int aux;
         boolean pertSequencia = false;
        
       
        System.out.print("Digite um numero para saber se pertence a sequencia de Fibonacci: ");
       //inicialização scanner
        entrada = new Scanner(System.in).nextInt();
       
        
        while(cont<entrada){
        aux = ant+pos;
        ant=pos;
        pos=aux;
        
        
            if (entrada==aux) {
                pertSequencia=true;
                
            }
           cont++;
             System.out.println(ant+","); 
                }
        if((entrada==1)||(entrada==2)||(entrada==3)){
           pertSequencia=true;
    
    
    }   
        if (pertSequencia) {
            System.out.println("O numero "+entrada+" pertence a sequencia.");
            
        }else{
         System.out.println("O numero "+entrada+" nao pertence a sequencia.");
        }
     
             
    }
    
}

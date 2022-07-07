/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faturamentodistestado;

/**
 *
 * @author Micro
 */
public class FaturamentoDistEstado {

    /**
     * @param args the command line arguments
     */
    
    /*
    SP – R$67.836,43
    RJ – R$36.678,66
    MG – R$29.229,88
    ES – R$27.165,48
    Outros – R$19.849,53
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        float fatSp = (float) 67836.43;
        float fatRJ= (float) 36678.66;
        float fatMG = (float) 29229.88;
        float fatES = (float) 27165.48;
        float fatOutros=(float) 19849.53;
        float vlTotal;
        
        float porcentSP,porcentRJ,porcentMG;
        float porcentES,porcentOutros;
        
      //soma total do faturamento  
       vlTotal=fatES+fatMG+fatOutros+fatRJ+fatSp;
       
       //calculo das porcentagens
       
       porcentSP=(fatSp*100)/vlTotal;
       porcentRJ=(fatRJ*100)/vlTotal;
       porcentMG=(fatMG*100)/vlTotal;
       porcentES=(fatES*100)/vlTotal;
       porcentOutros=(fatOutros*100)/vlTotal;
       
       System.out.println("Faturamento total foi de: R$"+vlTotal);
       
       //System.out.println("S.Paulo contribuiu com "+porcentSP+"% desse valor");
       
      // System.out.println("Espirito Santo contribuiu com "+porcentES+"/n %desse valor");
      // System.out.println("faturamentodistestado"+porcentMG+"%");
       //System.out.println("faturamentodistestado"+porcentOutros+"%");
      // System.out.println("faturamentodistestado"+porcentRJ+"%");
       
        System.out.println("Porcentagem de cada estado em cima do faturamneto total:\r\nS.PAULO:"+porcentSP+"%\r\n"
                           +"E.Santo: "+porcentES+"%\r\n"+"M.Gerais: "+porcentMG+"%\r\n"+"R.Janeiro: "+porcentRJ+"%\r\n"
                           +"Outros Estados: "+porcentOutros+"%" );
         
        
        
        

    }
    
}

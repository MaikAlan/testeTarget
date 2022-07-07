/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faturamentodistribuidora;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Micro
 */
public class FaturamentoDistribuidora {

    /**
     * @param args the command line arguments
     * @throws org.json.simple.parser.ParseException
     */
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
        // TODO code application logic here
       
        JSONParser parser = new JSONParser();
		FileReader fileReader;
		try {
			File file = new File("src\\faturamentodistribuidora\\jsonDados\\dados.json");
			fileReader = new FileReader(file);
			
                        Object obj =parser.parse(fileReader);
                        JSONArray fatarray = (JSONArray)obj;
                        
                      int i=0;int dia=0;
                      float maxvalor=0;
                      double somaValores=0;
                      double auxSoma=0;
                      float minvalor=Float.MAX_VALUE;
                       
                     double media=0;
                     for (Object myObject : fatarray) {
                      
                     float vlucro     = Float.parseFloat(((JSONObject) myObject).get("valor").toString());
                      double lucroDia     = Double.parseDouble(((JSONObject) myObject).get("valor").toString());
                     
                    //calcula maior venda diaria domes 
                      if(vlucro>maxvalor){
                     
                          maxvalor=vlucro;
                    
                     
                     }
                     //calcula a menor venda diaria do mes
                    if( vlucro<minvalor &&vlucro>0){
                         minvalor= vlucro;
                     }
                     //quantidade de dias com faturamento
                      if( vlucro>0){
                        //incrementa os dias
                          i++;
                         
                         
                      }
                      //calcula a soma de todos os dias com venda
                      if(lucroDia>0&&lucroDia!=somaValores){
                     
                          somaValores =lucroDia;
                          auxSoma+=somaValores;
                       // System.out.println("auxSoma"+auxSoma);
                      }
                      
                      //media de faturamento
                         media = auxSoma/i;
                         
                       //dias com vendas superior a media 
                         if (vlucro>media) {
                             
                             dia++;
                              
                         }
                     }
                     
                      // System.out.println("---------------------------------------------------------------- ");
                       //System.out.println(" A media  de vendas do mes é: "+media);
                       System.out.println("---------------------------------------------------------------- ");
                       System.out.println(" Quantidade de dias com faturamento superior a media: "+dia);
                       System.out.println("---------------------------------------------------------------- ");
                       System.out.println(" O menor valor de faturamento ocorrido em um dia do mês: "+minvalor);
                       System.out.println("---------------------------------------------------------------- ");
		       System.out.println(" O maior valor de faturamento ocorrido em um dia do mês: "+maxvalor);
                       System.out.println("---------------------------------------------------------------- ");
		}
                
                

		catch(FileNotFoundException e)
		{
			System.out.println(Arrays.toString(e.getStackTrace())+ " :File Not Found");
		}
		catch(IOException e)
		{
			System.out.println(Arrays.toString(e.getStackTrace())+ " :IOException");
		}
    }
  }
          
           
           
         
        

    


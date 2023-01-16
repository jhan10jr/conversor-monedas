/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controlador.ControlNewFrame;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;





/**
 *
 * @author jhan_
 */
public class Conversor {
    
    public static String ocurrencia1;
    
    public   static String ocurrencia2;
   
    
    public  static String valor;

  
    
    
    
    
    
     public static void convertirDivisa() throws IOException{
           
            if(ControlNewFrame.validarValor(valor)){
            
             OkHttpClient client = new OkHttpClient().newBuilder().build();
            
            Request request = new Request.Builder()
                    .url("https://api.apilayer.com/fixer/convert?to=" + ocurrencia2+"&from=" + ocurrencia1 + "&amount=" + valor)
                    .addHeader("apikey", "1bxL4w1AdfYN2Wxk43huzvAJpCCUB85t")
                    .get()
                    .build();
            Response response = client.newCall(request).execute();
            
            
            String jsonData = response.body().string();
                System.out.println(jsonData);
           JSONObject js = new JSONObject(jsonData);
           
           
           JOptionPane.showMessageDialog(null, "Tienes en  total $" + js.getDouble("result") + "(" + ocurrencia2 +  ")");

             
            System.out.println();
            }else{
            
               JOptionPane.showMessageDialog(null, "El valor ingresado no es un numero");
            }
           
           }
          
            
                
            
            

     }


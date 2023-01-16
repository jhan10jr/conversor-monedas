/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import javax.swing.JComboBox;
import modelo.Conversor;
import modelo.TipodeCambioDivisa;
import modelo.TipodeCambioTemperatura;
import vista.InterfazConversor;


/**
 *
 * @author jhan_
 */
public class ControlNewFrame {
 
   public static InterfazConversor interfaz = new InterfazConversor();
    
   
   
   public static void mostrarI(){
       
       interfaz.setVisible(true);
       
   }
   
   public static void seleccionarConversion(JComboBox<String> tipoDeCambio,JComboBox<String> tipoDeCambio2, JComboBox<String> tipoDeConversion){
       
       String opcionSeleccionada =  (String) tipoDeConversion.getSelectedItem();
      
       tipoDeCambio.removeAllItems();
       tipoDeCambio2.removeAllItems();
       switch(opcionSeleccionada){
            
           case "Conversor de moneda" :
               añadirOpcionesDivisa(tipoDeCambio,tipoDeCambio2);
           break;
           
           case "Conversor de temperatura" :
             añadirOpcionesMagnitud(tipoDeCambio,tipoDeCambio2);
           break;
       }
       
   }
    public static void añadirOpcionesDivisa(JComboBox<String> tipoDeCambio, JComboBox<String> tipoDeCambio2){
    
       for(TipodeCambioDivisa moneda : TipodeCambioDivisa.values()){
       
           
           tipoDeCambio.addItem(moneda.getTipodeCambio());
       
       
       }
       
       for(TipodeCambioDivisa moneda : TipodeCambioDivisa.values()){
       
           
           tipoDeCambio2.addItem(moneda.getTipodeCambio());
       
       
       }
       

   }
  
   
   public static void añadirOpcionesMagnitud(JComboBox<String> tipoDeCambio, JComboBox<String> tipoDeCambio2){
    
       for(TipodeCambioTemperatura magnitud : TipodeCambioTemperatura.values()){
       
           
           tipoDeCambio.addItem(magnitud.getTipodeCambio());
       
       
       }
       
       for(TipodeCambioTemperatura magnitud : TipodeCambioTemperatura.values()){
       
           
           tipoDeCambio2.addItem(magnitud.getTipodeCambio());
       
       
       }
       
   }
       
       public static boolean  validarValor(String valor){
       
       
       return valor.matches("[0-9]*");
       
       }
       
       
       
   }
   
   
   
   
   
   
   
   
   
   
   
   
    
    


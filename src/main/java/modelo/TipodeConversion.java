/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jhan_
 */
public enum TipodeConversion {                                
    MONEDA("Conversor de moneda"),TEMPERATURA("Conversor de temperatura");
  
      private String tipodeConversion;   

        private TipodeConversion(String tipodeConversion) {
            this.tipodeConversion = tipodeConversion;
        }

        public String getTipodeConversion() {
            return tipodeConversion;
        }

        public void setTipodeCambio(String tipodeConversion) {
            this.tipodeConversion = tipodeConversion;
        }
}

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
public enum TipodeCambioTemperatura {
   GRADOS_CELSIUS("C"),KELVIN("KELVIN");
    
      private String tipodeCambio;   

        private TipodeCambioTemperatura (String tipodeCambioMagnitud) {
            this.tipodeCambio = tipodeCambioMagnitud;
        }

        public String getTipodeCambio() {
            return tipodeCambio;
        }

        public void setTipodeCambio(String tipodeCambio) {
            this.tipodeCambio = tipodeCambio;
        }
}

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
public enum TipodeCambioDivisa {
     DOLAR_ESTADOUNIDENSE("DOLAR ESTADOUNIDENSE (USD)"),
    PESO_COLOMBIANO("PESO COLOMBIANO (COP)"),
    EURO("EURO"),
    PESO_MEXICANO("PESO MEXICANO (MXN)"),
    LIBRA_ESTERLINA("LIBRA ESTERLINA (GBP)"),
    YEN_JAPONES("YEN JAPONES (JPY)"),
    DOLAR_CANADIENSE("DOLAR CANADIENSE (CAD)"),
    DOLAR_AUSTRALIANO("DOLAR AUSTRALIANO (AUD)"),
    RUPIA_INDIA("RUPIA INDIA (INR)"),
    RAND_SUDAFRICANO("RAND SUDAFRICANO (ZAR)"),
    REAL_BRASILENO("REAL BRASILEÑO (BRL)"),
    PESO_ARGENTINO("PESO ARGENTINO (ARS)"),
    RUBLO_RUSO("RUBLO RUSO (RUB)"),
    RENMINBI_CHINO("RENMINBI CHINO (CNY)"),
    DIRHAM_EMIRATI("DIRHAM EMIRATI (AED)"),
    WON_COREANO("WON COREANO (KRW)"),
    FRANCO_SUIZO("FRANCO SUIZO (CHF)")
    ;
    
      private String tipodeCambio;   

        private TipodeCambioDivisa(String tipodeConversion) {
            this.tipodeCambio = tipodeConversion;
        }

        public String getTipodeCambio() {
            return tipodeCambio;
        }

        public void setTipodeCambio(String tipodeCambio) {
            this.tipodeCambio = tipodeCambio;
        }
}

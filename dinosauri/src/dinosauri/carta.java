/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author caibugatti.ruben
 */
public class carta {
    private int punti;
    
    public carta(String ca){
        ca =ca.toUpperCase();
        colori c=colori.valueOf(ca);
        if(c.equals(colori.ROSSO)){
            this.punti=5;
        }
        else if(c.equals(colori.GIALLO)){
            this.punti=3;
        }
        else{
            this.punti=1;
        }
    }
    
    @Override
    public String toString(){
        return "siamo su carta vale "+punti;
    }
}

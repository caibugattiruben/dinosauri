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
    /**
     * Punteggio della carta carta.
     */
    protected int punti;
    /**
     * Colore della carta.
     */
    protected colori c;
    /**
     * Crea una carta dato una stringa contenente il colore del file txt.
     * La stringa viene convertita in maiuscolo per poi farla diventare di tipo colri(enum).
     * 
     * @param ca stringa che rappresenta il colore della carta
     */
    public carta(String ca){
        ca =ca.toUpperCase();
        c=colori.valueOf(ca);
        if(c.equals(colori.ROSSO)){
            this.punti=5;
        }
        else if(c.equals(colori.VERDE)){
            this.punti=3;
        }
        else{
            this.punti=1;
        }
    }
    /**
     * Restituisce il colore della carta sotto forma di stringa.
     * 
     * @return il colore della carta
     */
    @Override
    public String toString(){
        return c.toString();
    }
    /**
     * Confronta due carte.
     * Due carte sono uguali se hanno lo stesso colore.
     * 
     * @param o oggetto da confrontare
     * @return true se le carte hanno lo stesso colore, altrimenti false 
     */
    @Override
    public boolean equals(Object o){
        if(o.getClass()!=this.getClass()){
            return false;
        }
        carta obj=(carta)o;
        if(obj.c.equals(this.c)){
            return true;
        }
        return false;
    }
}

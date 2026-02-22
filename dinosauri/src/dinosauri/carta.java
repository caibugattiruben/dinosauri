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
    protected colori c;
    
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
    
    @Override
    public String toString(){
        return c.toString();
    }
    
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

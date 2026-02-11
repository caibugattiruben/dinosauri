/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.util.ArrayList;

/**
 *
 * @author caibugatti.ruben
 */
public class gestoreGioco {
    mazzo mazzoTavola;
    mazzo carteTavola;
    fileManager f=new fileManager();
    Giocatore g1;
    Giocatore g2;
    
    public void preparoMazzoTavola(){
        ArrayList<String> vuoto=new ArrayList();
        mazzoTavola=f.leggo();
        carteTavola=new mazzo(vuoto);
    }
    
    public void distribuiscoMazzi(){
        int i=0;
        mazzo m1;
        mazzo m2;
        ArrayList<String> c1=new ArrayList();
        ArrayList<String> c2=new ArrayList();
        for(carta c:mazzoTavola.carte){
            i=i+1;
            String ca=c.toString();
            if(i%2==0){
                c2.add(ca);
            }
            else{
                c1.add(ca);
            }
        }
        System.out.println(c1);
        System.out.println(c2);
        m1=new mazzo(c1);
        m2=new mazzo(c2);
        
        g1=new Giocatore(m1);
        g2=new Giocatore(m2);
    }
    public void giocaCarta(){
        aggiungiCarta(carteTavola,g1.giocaCarta());
        aggiungiCarta(carteTavola,g2.giocaCarta());
        
    }
    public void contaPunti(){
        
    }
    public void rimuoviCarta(carta c){
        
    }
    public void aggiungiCarta(mazzo m,carta c){
        m.aggiungiCarta(c);
    }
    public void vincitoreMano(){
        
    }
    
    public void out(){
        System.out.println(carteTavola+"");
    }
}

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
    public void gioca(){
        preparoMazzoTavola();
        distribuiscoMazzi();
        
        while(g1.getSize()!=0&&g2.getSize() !=0){
            giocaCarta();
            int v=vincitoreMano();
            if(v==1){
                g1.aggiungiCartaPrese(carteTavola.carte);
                carteTavola.pulisci();
            }
            else if(v==2){
                g2.aggiungiCartaPrese(carteTavola.carte);
                carteTavola.pulisci();
            }
            else{
                carteTavola.aggiungiCarta(g1.ultimaGiocata);
                carteTavola.aggiungiCarta(g2.ultimaGiocata);
            }
            out();
        }
        System.out.println(g1.contaPunti());
        System.out.println(g2.contaPunti());
    }
    public void aggiungiCarta(mazzo m,carta c){
        m.aggiungiCarta(c);
    }
    public int vincitoreMano(){
        switch (g1.ultimaGiocata.toString()){
            case "ROSSO":
                if(!g2.ultimaGiocata.toString().equals("ROSSO")){
                    return 1;
                }
                else{
                    return 0;
                }
            case "VERDE":
                if(g2.ultimaGiocata.toString().equals("ROSSO")){
                    return 2;
                }
                else if(g2.ultimaGiocata.toString().equals("VERDE")){
                    return 0;
                }
                else{
                    return 1;
                }
            case "GIALLO":
                if(g2.ultimaGiocata.toString().equals("ROSSO")||g2.ultimaGiocata.toString().equals("VERDE")){
                    return 2;
                }
                else{
                    return 0;
                }
        }
        return 0;
    }
    
    public void out(){
        System.out.println(carteTavola+"");
    }
}

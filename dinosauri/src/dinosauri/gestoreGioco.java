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
            String ca=c.toString();
            if(i%2==0){
                c1.add(ca);
            }
            else{
                c2.add(ca);
            }
            i=i+1;
        }
        m1=new mazzo(c1);
        m2=new mazzo(c2);
        
        g1=new Giocatore(m1);
        g2=new Giocatore(m2);
        
          
    }//ok
    public carta[] giocaCarta(){
        carta c1=g1.giocaCarta();
        carta c2=g2.giocaCarta();
        
        carteTavola.aggiungiCarta(c1);
        carteTavola.aggiungiCarta(c2);
        
        carta[] ritorno={c1,c2};
        return ritorno;
        
        
    }
    public int contaPunti(Giocatore g){
        return g.contaPunti();
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
                    if(g2.ultimaGiocata.toString().equals("GIALLO")){
                    return 0;
                }
                else{
                    return 2;
                }
        }
        return 0;
    }
}
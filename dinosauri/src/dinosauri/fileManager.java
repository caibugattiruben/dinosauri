/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author caibugatti.ruben
 */
public class fileManager {
    private static String path="mazzo.txt";
    
    public static mazzo leggo(){
        ArrayList<String> ritorno=new ArrayList<String>();
        try{
            BufferedReader reader=new BufferedReader(new FileReader(path));
            String line;
            while((line=reader.readLine())!=null){
                ritorno.add(line);
            }
        }
        catch(IOException E){   
        }
        mazzo a=new mazzo(ritorno);
        return a;
    }
    
}

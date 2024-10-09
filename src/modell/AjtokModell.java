/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Random;

/**
 *
 * @author SasGyula(SZF_2023_20
 */
public class AjtokModell {
    Random rnd = new Random();
    int[] ajtoLista = new int[3]; 
    public void ajtofeltoltes(int[] ajtolista){
        for(int i=0; i<ajtoLista.length; i++){
            ajtoLista[i]=rnd.nextInt(2)+1;
        }
        
    }
}

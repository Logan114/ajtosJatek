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

    private int[] ajtoLista;
    private int kattintott;

    public AjtokModell() {
        ajtoLista = new int[3];
        Random rnd = new Random();
        getAjtoLista();
        ajtoFeltoltes(ajtoLista, rnd);
        
        
    }

    public AjtokModell(int[] ajtoLista, int kattintott) {
        this.ajtoLista = ajtoLista;
        this.kattintott = kattintott;
        eldontes(kattintott);
    }
    

    private void eldontes(int kattintott) {
        
        if(ajtoLista[kattintott] <2){
            String statusz = "Nem nyert";
        }
        else{
            String statusz = "Ön nyert";
        }
    }

    public void ajtoFeltoltes(int[] ajtoLista1, Random rnd) {
        for (int i = 0; i < ajtoLista1.length; i++) {
            ajtoLista1[i] = rnd.nextInt(2)+1;
        }
    }

    public void setAjtoLista(int[] ajtoLista) {
        this.ajtoLista = ajtoLista;
    }

    public int[] getAjtoLista() {
        return ajtoLista;
    }
    

}

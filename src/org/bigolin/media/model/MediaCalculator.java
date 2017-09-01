/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bigolin.media.model;

import java.util.ArrayList;

/**
 *
 * @author marcio
 */
public class MediaCalculator {
    private ArrayList<Double> notas = new ArrayList<Double>();
    
    public void addNota(double d){
        notas.add(d);
    }
    
    public double calcular(){
        double media = 0;
        for(Double d : notas){
           media = media + d; 
        }
        return media/notas.size();
    }

    
}

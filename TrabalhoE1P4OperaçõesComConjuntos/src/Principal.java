/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
package com.doctum.occ;

public class Principal
{

    public static void main(String[] args)
    {
        
        int[] CA = {1, 3, 5};
        int[] CB = {8, 2};
        int[] CC = new int[20];
        int[] CD = new int[11];
        
        for(int i = 0 ; i < 20; i++){
            CC[i]=i+1;
        }
        for(int i = 0 ; i < 11; i++){
            CD[i]=i*10;
        }
        
        System.out.println("4 pertence  A: " + OperacaoComConjuntos.pertence(4,CA));
        System.out.println("2 pertence  B : " + OperacaoComConjuntos.pertence(2,CB));
        System.out.println("3 pertence  C: " + OperacaoComConjuntos.pertence(3,CC));
        System.out.println("9 pertence  B: " + OperacaoComConjuntos.pertence(9,CB));
        System.out.println("7 pertence  A: " + OperacaoComConjuntos.pertence(7,CA));
        System.out.println("5 pertence  C: " + OperacaoComConjuntos.pertence(5,CC));
        System.out.println("18 pertence C: " + OperacaoComConjuntos.pertence(18,CC));
        System.out.println("13 pertence C: " + OperacaoComConjuntos.pertence(13,CC));
        System.out.println("30 pertence C: " + OperacaoComConjuntos.pertence(30,CC));
        System.out.println("15 pertence D: " + OperacaoComConjuntos.pertence(15,CD));
        System.out.println("60 pertence D: " + OperacaoComConjuntos.pertence(60,CD));
        System.out.println("95 pertence D: " + OperacaoComConjuntos.pertence(95,CD));
    }
    
}
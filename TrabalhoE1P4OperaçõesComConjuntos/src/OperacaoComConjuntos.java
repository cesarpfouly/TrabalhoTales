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

public class OperacaoComConjuntos
{
    
        public static boolean pertence(int elementoAPesquisar, int[] conjunto)
        {
        for (int elemento : conjunto)
        {
            if (elementoAPesquisar == elemento)
            {
                return true;
            }
        }
        
        return false;
        
        }
}
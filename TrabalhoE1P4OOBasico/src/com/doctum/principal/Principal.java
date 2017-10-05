/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.doctum.principal;

import com.doctum.oo.Compra;
import com.doctum.oo.Cachorro;
import com.doctum.oo.Retangulo;
import com.doctum.oo.Pessoa;

public class Principal {


    public static void main(String[] args) {
        
        
        Compra co1 = new Compra(2000,8);
        
        System.out.println("- Compra -");
        System.out.println("Total da compra: " + co1.getValorTotal());
        System.out.println("Numero de parcelas: " + co1.getNumeroParcelas());
        System.out.println("Total das parcelas: " + co1.valorParcela() + "\n");
        
        Cachorro c1 = new Cachorro("Cristal", 0.90);
        
        System.out.println("- Cachorro -");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Tamanho: " + c1.getTamanho());
        c1.brincar();
        c1.latir();
        System.out.println("Quantidade de cachorro(s) criado(s) " + Cachorro.mostrarQuantidade() + "\n" );

        Retangulo r1 = new Retangulo(30,60);
        
        System.out.println("- Retangulo -");
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());
        System.out.println("E um quadrado? " + r1.eQuadrado() + "\n");
        
        
        Pessoa p1 = new Pessoa("Rafaella",1.64, 67, 27, 01, 1997);
        
        System.out.println("- Pessoa -");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Idade: " + p1.idade());
        System.out.println("IMC: " + p1.imc());
    }    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doctum.oo;

public class Cachorro {
    
    private String nome;
    private double tamanho;
    private static int total;
    
    public Cachorro(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        total++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public void latir(){
        System.out.println(this.nome + " latindo"); 
    }
    
    public void brincar(){
        System.out.println(this.nome + " brincando");       
    }
    
    public static int mostrarQuantidade(){
        return total;
    }
}

    
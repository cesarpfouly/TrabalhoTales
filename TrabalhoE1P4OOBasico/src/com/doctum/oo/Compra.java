/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doctum.oo;

public class Compra {
    
    private double valorTotal;
    private double numeroParcelas;
    
    public Compra(double valorTotal, double numeroParcelas) {
        this.valorTotal = valorTotal;
        this.numeroParcelas = numeroParcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public double getNumeroParcelas() {
        return numeroParcelas;
    }    

    public void setNumeroParcelas(double numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    
    public double valorParcela(){
        return valorTotal/numeroParcelas;
    }
}

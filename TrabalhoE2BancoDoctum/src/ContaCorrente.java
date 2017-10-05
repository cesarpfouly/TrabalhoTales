/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
package com.doctum.bancodados;

public class ContaCorrente extends Conta
{    
    public ContaCorrente(int numero, String nome, double saldo)
    {       
        this.setNumero(numero);
        this.setNome(nome);
        this.setSaldo(saldo);
    }    
    
    public void depositar(double VDeposito)
    {
        if(VDeposito > 0){
            this.setSaldo(this.getSaldo()+ VDeposito);
            System.out.println("Efetuado com sucesso!");
        }
        else
        {
            System.out.println("Valor inválido!");
        }
    }
    public void sacar(double VSaque)
    {
        if(VSaque > 0)
        {
            if(VSaque <= this.getSaldo())
            {
                this.setSaldo(this.getSaldo()- VSaque);
                System.out.println("Efetuado com sucesso!");
            }
            else
            {
                System.out.println("Saque inválido!");
            }
        }
        else
        {
            System.out.println("Saque inválido!");
        }
    }
}
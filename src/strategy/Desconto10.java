/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Sony
 */
public class Desconto10 implements Descontos{

    private double valorCompra;
    
    public Desconto10(double valor) {
        this.valorCompra = valor;
    }
    
    @Override
    public double calcular() {
        return this.valorCompra * 0.90; 
    }
    
}

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
public class Desconto30 implements Descontos {

    private double valorCompra;

    public Desconto30(double valor) {
        this.valorCompra = valor;
    }
    
    @Override
    public double calcular() {
        return this.valorCompra * 0.70;
    }
    
}

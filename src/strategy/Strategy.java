/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor total da compra? ");
        double total = teclado.nextDouble();
        
        System.out.println("Quantos produtos foram selecionados: ");
        int produtos = teclado.nextInt();
        
        CalcularDescontos calculadora = new CalcularDescontos();
        
        switch (produtos) {
            case 0:
                System.out.println("Erro, tente novamente!");
                break;
            case 1:
                Desconto10 desc10 = new Desconto10(total);
                System.out.println("O valor final será: " + calculadora.calcular(desc10));
                break;
            case 2:
                Desconto20 desc20 = new Desconto20(total);
                System.out.println("O valor final será: " + calculadora.calcular(desc20));
                break;
            default:
                Desconto30 desc30 = new Desconto30(total);
                System.out.println("O valor final será: " + calculadora.calcular(desc30)); 
        } 
    }
}

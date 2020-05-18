/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJava;

import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class Exercicio0707 {

    public static void main(String[] args) {
        double imc = 0, altura = 0, peso = 0;
        String aux;
        aux = "";
        aux = JOptionPane.showInputDialog(null, "Insira seu peso :");
        aux = JOptionPane.showInputDialog(null, "Insira sua altura :");
        String replace = aux.replace(",", ".");
        imc = peso / Math.pow(altura, 2);
        if (imc <= 18.5) {
            JOptionPane.showMessageDialog(null, "Excesso de magreza");

        }
        if (imc > 18.5 && imc >= 25) {
            JOptionPane.showMessageDialog(null, "Peso normal");
        }
        if (imc > 25 && imc >= 30) {
            JOptionPane.showMessageDialog(null, "Excesso de Peso");
        }
        if (imc > 30 && imc >= 35) {
            JOptionPane.showMessageDialog(null, "Obesidade I");

        }
        if (imc > 35 && imc >= 40) {
            JOptionPane.showMessageDialog(null, "Obesidade II");

        }
        if (imc > 40) {
            JOptionPane.showMessageDialog(null, "Obesidade III");

        }
    }

}

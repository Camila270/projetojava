/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJava;

import javax.swing.*;

/**
 *
 * @author Sra Camila
 */
public class Exercicio0107 {

    public static void main(String[] args) {
        double num = 0, num1 = 0;
        String aux = "";
        aux = JOptionPane.showInputDialog(null, "Digite um número");
        String replace = aux.replace(".", ",");
        num = Double.parseDouble(aux);
        num1 = num - (num * 8 / 100);
        JOptionPane.showMessageDialog(null, " O valor agora é de: " + num1);
    }

}

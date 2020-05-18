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
public class Exercicio0112 {

    public static void main(String[] args) {
        double num;
        String aux = "";
        aux = JOptionPane.showInputDialog(null, "Digite um número:");
        num = Double.parseDouble(aux);
        JOptionPane.showMessageDialog(null, "O número:" + num + "\n Anterior: " + (num - 1) + "\n Sucessor: " + (num + 1));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJava;

import javax.swing.JOptionPane;

/**
 *
 * @author Sra Camila
 */
public class Exercicio0111 {

    public static void main(String[] args) {
        double num1=0 , num2=0 , resp = 0;
        String senha1, senha2;
        String aux = "";
        aux = JOptionPane.showInputDialog(null, "Insira uma senha");
        senha1= aux;
        aux = JOptionPane.showInputDialog(null, "Insira o 1º número: ");
        num1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o 2º número: ");
        num2 = Double.parseDouble(aux);
        resp = num1 / num2;
        aux = JOptionPane.showInputDialog(null, "Insira novamente sua senha");
        senha2 = aux;
        if (senha1.equals(senha2)) {
            JOptionPane.showMessageDialog(null, "O resultado é: " + resp);
        }

    }

}



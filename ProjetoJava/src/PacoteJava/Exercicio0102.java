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
public class Exercicio0102 {
    public static void main(String[] args) {
        double salario = 0,prestacao = 0, em = 0;
        String aux = "";
        aux = JOptionPane.showInputDialog(null, "Digite o salario:");
        salario= Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite o valor máximo da prestação:");
        prestacao = Double.parseDouble(aux);
        em = salario - (salario *30/100);
        if (em < prestacao) {
            JOptionPane.showMessageDialog(null, "O empréstimo foi aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "O empréstimo foi reprovado");
        }
    }
    
}

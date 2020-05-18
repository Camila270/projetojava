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
public class CalculoInss {
        
    public static void main(String[] args) {
        double salario = 0, aliquota = 0, valdesconto = 0, valliquido = 0;
        String aux;
        aux = "";
        aux = JOptionPane.showInputDialog(null, "Insira o salário: \n", "Salário", -1);
        String replace = aux.replace(".", ",");
        salario = Double.parseDouble(aux);
        valdesconto=Double.parseDouble(aux);
        if (salario > 465.00 && salario <= 965.67) {
            valliquido = salario - (salario * 8 / 100);
            aliquota = 8;
            valdesconto = valliquido - salario;
            }
        if (salario > 965.67 && salario < 1609.45) {
            valliquido = salario - (salario * 9 / 100);
            aliquota = 9;
            valdesconto = valliquido - salario;
        }
        if (salario > 1609.45 && salario < 32018.90) {
            valliquido = salario - (salario * 11 / 100);
            aliquota = 11;
            valdesconto = valliquido - salario;
         
        }
            
         JOptionPane.showMessageDialog(null, "Salário: R$ " +salario + "\n AliquotaINSS: " + aliquota + "\n Valor Desconto: R$ " +valdesconto + "\n Valor Liquido: R$ " +valliquido);
    }

}

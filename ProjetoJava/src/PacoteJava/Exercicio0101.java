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
public class Exercicio0101 {
    public static void main(String[] args) {
        double salario = 0, aumento = 0, novosalario =0;
        String aux= "";
        aux = JOptionPane.showInputDialog(null, "Digite o salario : ");
        salario = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Qual vai ser o aumento dele: ");
        aumento = Double.parseDouble(aux);
        aumento = (salario*(aumento/100));
        novosalario = aumento + salario;
        JOptionPane.showMessageDialog(null, " O aumento foi de: R$ " +aumento+ "\n O novo salário agora é: R$ " +novosalario); 
    }
}

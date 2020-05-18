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
public class Exercicio0113 {

    public static void main(String[] args) {
        int idade;
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            idade =Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa: "));
            
            if (idade>18) {
                cont = cont+1;
                
            }
        }
            JOptionPane.showMessageDialog(null, "A idade de pessoas com idade maior ou igual a 18 anos é de: " + cont);
        }
        
        

        }
    



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
public class ExercicioIdade {

    public static void main(String[] args) {
        double altura = 0, idade = 0, altmulher = 0;
        double mediamulher = 0, maisnov = 0, maisvel = 0, maisalto = 0, maisbaixo = 0;
        String aux = "";
        String sexo;
        for (int i = 0; i < 3; i++) {
            aux = JOptionPane.showInputDialog(null, "Digite sua altura:");
            altura = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite sua idade");
            idade = Double.parseDouble(aux);
            sexo = JOptionPane.showInputDialog(null, "Digite seu sexo");
            if (sexo == "f") {
                altmulher = altmulher + altura;
                mediamulher++;
            }
            if (idade < maisvel && sexo == "m") {
                idade = maisvel;
            } else if (idade > maisnov && sexo == "f") {
                idade = maisnov;
            }
            if (altura < maisalto) {
                altura = maisalto;
            } else if(altura > maisbaixo){
                altura = maisbaixo;
            }
        }
        System.out.println(" A média da altura das mulheres é :");
        System.out.println("O homem mais velho tem :" +maisvel+ " anos");
        System.out.println("A mulher mais nova tem :" +maisnov+ "anos");
        System.out.println("A pessoa mais alta tem :"+maisalto+ "m de altura");
        System.out.println("O mais baixo tem :" +maisbaixo+ " m de altura");
    }
}

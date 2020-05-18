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
public class ExercicioMedia {

    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, media = 0, mediaclass = 0;
        double aprovados = 0, reprovados = 0, exame = 0;
        String aux = "";
        for (int i = 0; i < 6; i++) {
            aux = JOptionPane.showInputDialog(null, "Digite a primeira nota: ");
            nota1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite a segunda nota: ");
            nota2 = Double.parseDouble(aux);
            media = (nota1 + nota2) / 2;
           mediaclass= (nota1+nota2)/6;
            if (media <= 3) {
                System.out.println(" A média do aluno é " + (i + 1) + ":" + media +  "Reprovado");
                reprovados++;
            }
            if (media >= 3 && media <= 7) {
                System.out.println(" A média do aluno é " + (i + 1) + ":" + media +  "Em exame");
                exame++;
            }
            if (media > 7) {
                System.out.println(" A média do aluno é  " + (i + 1) + ":" + media +  "Aprovado");
                aprovados++;
            }
        }
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos em exame: " + exame);
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println("Média da Classe: " + mediaclass);
    }

}

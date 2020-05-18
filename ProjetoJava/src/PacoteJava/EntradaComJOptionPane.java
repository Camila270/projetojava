package PacoteJava;

import javax.swing.*;

public class EntradaComJOptionPane {

    public static void main(String args[]) {
        double nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
        String aux = "";
        aux = JOptionPane.showInputDialog(null, "Digite a primeira nota: ");
        nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite a segunda nota: ");
        nota2 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite a nota do trabalho: ");
        trabalho = Double.parseDouble(aux);
        media = (nota1 + nota2 + trabalho) / 3;
        JOptionPane.showMessageDialog(null, "A média é :" + media);

    }

}

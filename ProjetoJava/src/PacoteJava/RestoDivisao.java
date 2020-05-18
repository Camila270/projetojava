
package PacoteJava;
import javax.swing.*;
public class RestoDivisao {
     
    public static void main (String args[]) {
        double num1, num2, resp = 0;
        String aux = "";
        aux= JOptionPane.showInputDialog(null, "Digite um número: ");
        num1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite outro número: ");
        num2 = Double.parseDouble(aux);
        resp = num1%num2;
        JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resp);
                
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}

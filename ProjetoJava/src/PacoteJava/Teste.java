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
     

public class Teste {
    
 public static void main (String args []){  
        double resultado;     
	double alturainf, maior=0, menor=0, aux1, aux3;    
	int idadeinf, mediamulher=0, maisnova=0, maisvelho=0, aux2, aux4;    
	char sexoinf;    
	boolean condiction = false;

	for(int i = 0; i < 4; i++){   
		if (!condiction){


			String altura = JOptionPane.showInputDialog ((i+1)+"º Pessoa - Digite a altura");    
			alturainf = Double.parseDouble(altura);    
			maior = alturainf;
			menor = alturainf;

			String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a idade");     
			idadeinf = Integer.parseInt(idade);    

			String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite o sexo");     
			sexoinf = sexo.charAt(0);    
			if (sexoinf == 'F'){
				mediamulher += alturainf;
				maisnova = idadeinf;

			}else{
				maisvelho = idadeinf;
			}
			condiction = true;
		}else{
			String altura = JOptionPane.showInputDialog ((i+1)+"º Pessoa - Digite a altura");    
			aux1 = Double.parseDouble(altura);    
			if (aux1 > maior){
				maior = aux1;

			}else if (aux1 < menor){
				menor = aux1;
			}
			String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a idade");     
			aux2 = Integer.parseInt(idade);    

			String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite o sexo");     
			sexoinf = sexo.charAt(0); 
			if (sexoinf == 'F'){
				mediamulher += aux2;
				if (aux2<maisnova){
					maisnova = aux2;
				}

			}else if (sexoinf =='M'){
				if (aux2>maisvelho){
					maisvelho=aux2;
				}
			}
		}

	}

	System.out.println("A maior altura é:" + maior + "\n" + "A menor altura é:" + menor + "\n" + "A média de altura das mulheres é:" + (mediamulher)/50 + "\n" + "A idade do homem mais velho é: " + maisvelho + "\n" + "A idade da mulher mais nova é: " + maisnova  );

}
}
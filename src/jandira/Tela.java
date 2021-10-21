package jandira;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	
	public void criarTela() {
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(400,600);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);

	
		
		//JLabel
		
		JLabel lblImc = new JLabel();
		lblImc.setText("Cálculo IMC");
		lblImc.setBounds(140,10,110,80);
		lblImc.setForeground(Color.BLUE);
		telaImc.getContentPane().add(lblImc);
		
		JLabel lblPeso = new JLabel ();
		lblPeso.setText("Seu peso:");
		lblPeso.setBounds(20,80,110,50);
		telaImc.getContentPane().add(lblPeso);
		
		
		JLabel lblAltura = new JLabel ();
		lblAltura.setText("Sua altura:");
		lblAltura.setBounds(20,120,110,50);
		telaImc.getContentPane().add(lblAltura);
		
		JLabel resultado = new JLabel();
		resultado.setText("Resultados:");
		resultado.setForeground(Color.RED);
		resultado.setBounds(40,240,100,20);
		telaImc.getContentPane().add(resultado);
		
		JLabel lblestado= new JLabel();
		lblestado.setText("Estado:");
		lblestado.setBounds(20, 310, 110, 50);
		telaImc.getContentPane().add(lblestado);
		
		JLabel valor = new JLabel();
		valor.setText("Valor:");
		valor.setBounds(20,280, 110, 50);
		telaImc.getContentPane().add(valor);
		
		
		//Botao
		
		JButton bTxt = new JButton ();
		bTxt.setText("CALCULAR");
		bTxt.setBounds(150, 190,100,20);
		telaImc.getContentPane().add(bTxt);
		
		JTextField pesoTxt = new JTextField();
		pesoTxt.setBounds(120, 90, 90, 30);
		telaImc.getContentPane().add(pesoTxt);
		
		JTextField alturaTxt = new JTextField();
		alturaTxt.setBounds(120,130,90,30);
		telaImc.getContentPane().add(alturaTxt);
		telaImc.setVisible(true);
		
		
	}
	

}

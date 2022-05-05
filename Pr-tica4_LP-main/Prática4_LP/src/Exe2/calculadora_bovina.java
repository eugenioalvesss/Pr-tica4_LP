package Exe2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora_bovina extends JFrame {

	private JPanel contentPane;
	private JTextField val_arroba;
	private JTextField quant_arroba;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora_bovina frame = new calculadora_bovina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadora_bovina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		val_arroba = new JTextField();
		val_arroba.setBounds(172, 55, 86, 20);
		contentPane.add(val_arroba);
		val_arroba.setColumns(10);
		
		quant_arroba = new JTextField();
		quant_arroba.setColumns(10);
		quant_arroba.setBounds(172, 100, 86, 20);
		contentPane.add(quant_arroba);
		
		JLabel lblNewLabel = new JLabel("Valor da Arroba");
		lblNewLabel.setBounds(35, 53, 116, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblQuantDeArrobas = new JLabel("Quant. de Arrobas");
		lblQuantDeArrobas.setBounds(35, 94, 127, 33);
		contentPane.add(lblQuantDeArrobas);
		
		JButton btnNewButton = new JButton("Calcular Total a Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int quantidade_arroba;
				int valor_arroba;
				int preco_final;
				
				quantidade_arroba= Integer.parseInt(quant_arroba.getText());
				valor_arroba = Integer.parseInt(val_arroba.getText());
				
				preco_final = quantidade_arroba * valor_arroba;
				
				JOptionPane.showMessageDialog(null, String.format("O valor a pagar é : R$%d", preco_final ,JOptionPane.INFORMATION_MESSAGE));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(145, 151, 152, 43);
		contentPane.add(btnNewButton);
	}
}

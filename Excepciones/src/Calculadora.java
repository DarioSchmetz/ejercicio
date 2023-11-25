import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String pantalla = "";
	public String uno = "";
	public String dos = "";
	public String operador = "";
	public String temp = "";
	public int resultado;
	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(20, 28, 221, 14);
		contentPane.add(lblNewLabel);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 101, 43, 23);
		contentPane.add(btn7);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "7";
				lblNewLabel.setText(pantalla);
				temp = "7";
				calculo();
			}
			
		});
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(63, 101, 43, 23);
		contentPane.add(btn8);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "8";
				lblNewLabel.setText(pantalla);
				temp = "8";
				calculo();
			}
			
		});
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(116, 101, 43, 23);
		contentPane.add(btn9);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "9";
				lblNewLabel.setText(pantalla);
				temp = "9";
				calculo();
			}
			
		});
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.RED);
		btnC.setForeground(Color.WHITE);
		btnC.setBounds(169, 101, 89, 23);
		contentPane.add(btnC);
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(null);
				pantalla = "";
				
			}
			
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 135, 43, 23);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "4";
				lblNewLabel.setText(pantalla);
				temp = "4";
				calculo();
			}
			
		});
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(63, 135, 43, 23);
		contentPane.add(btn5);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "5";
				lblNewLabel.setText(pantalla);
				temp = "5";
				calculo();
			}
			
		});
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(116, 135, 43, 23);
		contentPane.add(btn6);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "6";
				lblNewLabel.setText(pantalla);
				temp = "6";
				calculo();
			}
			
		});
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(169, 135, 43, 23);
		contentPane.add(btnMenos);
		btnMenos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += " - ";
				lblNewLabel.setText(pantalla);
				operador = "-";
				calculo();
			}
			
		});
		
		JButton btnMas = new JButton("+");
		btnMas.setBounds(215, 135, 43, 23);
		contentPane.add(btnMas);
		btnMas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += " + ";
				lblNewLabel.setText(pantalla);
				operador = "+";
				calculo();
			}
			
		});
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 169, 43, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "1";
				lblNewLabel.setText(pantalla);
				temp = "1";
				calculo();
			}
			
		});
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(63, 169, 43, 23);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "2";
				lblNewLabel.setText(pantalla);
				temp = "2";
				calculo();
			}
			
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(116, 169, 43, 23);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "3";
				lblNewLabel.setText(pantalla);
				temp = "3";
				calculo();
			}
			
		});
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(179, 165, 65, 57);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				pantalla += " = ";
				pantalla += Double.toString(resultado);
				result();
				lblNewLabel.setText(pantalla);
				limpiar();
				
			}
			
		});
		
		JButton btnDiv = new JButton("%");
		btnDiv.setBounds(10, 199, 43, 23);
		contentPane.add(btnDiv);
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += " % ";
				lblNewLabel.setText(pantalla);
				operador = "%";
				calculo();
			}
			
		});
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(63, 199, 43, 23);
		contentPane.add(btn0);
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += "0";
				lblNewLabel.setText(pantalla);
				temp = "0";
				calculo();
			}
			
		});
		
		JButton btnPor = new JButton("x");
		btnPor.setBounds(116, 199, 43, 23);
		contentPane.add(btnPor);
		btnPor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla += " x ";
				lblNewLabel.setText(pantalla);
				operador = "x";
				calculo();
			}
			
		});
		
		
	}
	
	public void calculo () {
		if (operador.length() == 0) {
			uno += temp;
			System.out.println("uno: " + uno);
			temp = "";
		}
		else {
			dos += temp;
			System.out.println("dos: " + dos);
			temp = "";
		}
		
	}
	public void result() {
		try {
			switch(operador) {
			case "-":
				resultado = Integer.parseInt(uno) - Integer.parseInt(dos);
				break;
					
			case "+":
				resultado = Integer.parseInt(uno) + Integer.parseInt(dos);
				break;
				
			case "x":
				resultado = Integer.parseInt(uno) * Integer.parseInt(dos);
				break;
					
			case "%":
				resultado = Integer.parseInt(uno) / Integer.parseInt(dos);
				break;
				
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(new JDialog(), e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
			pantalla = "Syntax Error";
		}
		System.out.println("Resultado: " + resultado);
		System.out.println(operador);
		
		
	}
	public void limpiar() {
		uno = "";
		dos = "";
		operador = "";
		temp = "";
		System.out.println(operador);
	}
}

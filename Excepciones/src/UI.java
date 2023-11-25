import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseTresValores = new JLabel("Ingrese tres valores:");
		lblIngreseTresValores.setBounds(10, 22, 112, 14);
		contentPane.add(lblIngreseTresValores);
		
		textField = new JTextField();
		textField.setBounds(132, 19, 26, 20);
		contentPane.add(textField);
		textField.setColumns(1);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 47, 26, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(1);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 79, 26, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(1);
		
		JButton btnAsd = new JButton("calcular");
		btnAsd.setBounds(103, 124, 89, 23);
		contentPane.add(btnAsd);
		
		label = new JLabel("");
		label.setBounds(57, 183, 185, 67);
		contentPane.add(label);
		
		
		btnAsd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String num1 = textField.getText();
				String num2 = textField_1.getText();
				String num3 = textField_2.getText();
				String[] arr = {num1, num2, num3};
				calcular(arr);
				String res = String.valueOf(resultG);
				if (resultS.length() > 0) {
					label.setText("Error: " + resultS);
				}
				else {
					label.setText(res);
				}
				
			}
			
		});
		
	}
	int resultG = 0;
	String resultS = "";
	
	private void calcular (String[] arr) {
		int result = 0;
		try {
			
			int nro1 = new Integer(arr[0]);
			String op = arr[1];
			int nro2 = new Integer(arr[2]);
			
			if (op.equals("+")) {
				result = nro1 + nro2;
			}else if (op.equals("-")) {
				result = nro1 - nro2;
			}else if (op.equals("x")) {
				result = nro1 * nro2;
			}else if(op.equals("/")) {
				result = nro1 / nro2;
			}
			System.out.println(op);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error ArrayIndexOutOfBounds: " + e.getMessage());
			resultS = e.getMessage();
		} catch (NumberFormatException e) {
			System.out.println("error NumberFormatException: " + e.getMessage());
			resultS = e.getMessage();
		} catch (NullPointerException e) {
			System.out.println("error NullPointerException: " + e.getMessage());
			resultS = e.getMessage();
		} catch (ArithmeticException e) {
			System.out.println("error ArithmeticException: " + e.getMessage());
			resultS = e.getMessage();
		}
		
		System.out.println("Resultado = " + result);
		resultG = result;
		
	}
}

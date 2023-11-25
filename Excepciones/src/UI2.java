import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class UI2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI2 frame = new UI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int resultG = 0;
	String error = "";
	
	/**
	 * Create the frame.
	 */
	public UI2() {
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
		
		
		
		textField_1 = new JTextField(1);
		textField_1.setBounds(132, 47, 26, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(1);
		
		textField_1.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (textField_1.getText().length() >= 1 ) // limita textfield_1 a 1 caracter
		            e.consume(); 
		    }
		});
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 79, 26, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(1);
		
		
		JButton btnAsd = new JButton("calcular");
		btnAsd.setBounds(103, 124, 89, 23);
		contentPane.add(btnAsd);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(77, 176, 139, 55);
		contentPane.add(lblNewLabel);
		
		
		btnAsd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String num1 = textField.getText();
				String num2 = textField_1.getText();
				String num3 = textField_2.getText();
				String[] arr = {num1, num2, num3};
				calcular(arr);
				String res = String.valueOf(resultG);
				if (error.length() > 0) {
					JOptionPane.showMessageDialog(new JDialog(), error, "Error", JOptionPane.WARNING_MESSAGE);
				}
				else {
					lblNewLabel.setText(res);
				}
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
			
		});
		
	}
	
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
			
		} catch (ArrayIndexOutOfBoundsException e) {
			error = e.getMessage();
		} catch (NumberFormatException e) {
			error = e.getMessage();
		} catch (NullPointerException e) {
			error = e.getMessage();
		} catch (ArithmeticException e) {
			error = e.getMessage();
		}
		
		resultG = result;
		
	}
}
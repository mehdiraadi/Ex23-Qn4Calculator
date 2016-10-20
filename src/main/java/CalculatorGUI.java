import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	private JFrame frmCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Calculator cr=new Calculator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 465, 414);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblNumber = new JLabel("number1");
		lblNumber.setBounds(37, 61, 69, 20);
		frmCalculator.getContentPane().add(lblNumber);
		
		textField = new JTextField();
		textField.setBounds(121, 58, 146, 26);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber_1 = new JLabel("number2");
		lblNumber_1.setBounds(37, 113, 69, 20);
		frmCalculator.getContentPane().add(lblNumber_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 110, 146, 26);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber=textField.getText().toString();
				System.out.println(firstNumber);
				Double number1=0.0;
				number1=Double.parseDouble(firstNumber);
				String secondNumber=textField_1.getText().toString();
				Double number2=0.0;
				number2=Double.parseDouble(secondNumber);
				Double result;
				result=cr.add(number1, number2);
				textField_2.setText(String.valueOf(result));
				
				
			}
		});
		button.setBounds(59, 205, 52, 29);
		frmCalculator.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber=textField.getText().toString();
				System.out.println(firstNumber);
				Double number1=0.0;
				number1=Double.parseDouble(firstNumber);
				String secondNumber=textField_1.getText().toString();
				Double number2=0.0;
				number2=Double.parseDouble(secondNumber);
				Double result;
				result=cr.subtract(number1, number2);
				textField_2.setText(String.valueOf(result));
				
			}
		});
		btnNewButton.setBounds(124, 205, 52, 29);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber=textField.getText().toString();
				System.out.println(firstNumber);
				Double number1=0.0;
				number1=Double.parseDouble(firstNumber);
				String secondNumber=textField_1.getText().toString();
				Double number2=0.0;
				number2=Double.parseDouble(secondNumber);
				Double result;
				result=cr.multiply(number1, number2);
				textField_2.setText(String.valueOf(result));
			}
		});
		button_1.setBounds(183, 205, 52, 29);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber=textField.getText().toString();
				System.out.println(firstNumber);
				Double number1=0.0;
				number1=Double.parseDouble(firstNumber);
				String secondNumber=textField_1.getText().toString();
				Double number2=0.0;
				number2=Double.parseDouble(secondNumber);
				Double result;
				result=cr.divide(number1, number2);
				textField_2.setText(String.valueOf(result));
			}
		});
		button_2.setBounds(249, 205, 57, 29);
		frmCalculator.getContentPane().add(button_2);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(37, 275, 69, 20);
		frmCalculator.getContentPane().add(lblResult);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 272, 146, 26);
		frmCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}

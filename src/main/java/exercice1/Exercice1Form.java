package exercice1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exercice1Form {

	private JButton unNomInteressant;
	private JPanel panel1;
	private JTextField textField1;
	private  JTextField textField2;

	public Exercice1Form(){
		unNomInteressant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText(textField1.getText());
			}
		});
	}

	public static void main(String[] args){
		JFrame frame = new JFrame("ExerciceForm");
		frame.setContentPane(new Exercice1Form().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}


}

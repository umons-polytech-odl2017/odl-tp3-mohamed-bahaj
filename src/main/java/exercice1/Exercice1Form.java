package exercice1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exercice1Form {

	private JPanel rootPanel;
	private JPanel JPanelDraw;
	private JPanel JPanelBtn;
	private JRadioButton btn_Rectangle;
	private JRadioButton btn_Circle;
	private JRadioButton btn_Ellipsis;
	private JRadioButton btn_Square;
	private JTextArea messageArea;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Exercice1Form");
		frame.setContentPane(new Exercice1Form().rootPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	

}

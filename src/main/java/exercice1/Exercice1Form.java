package exercice1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.MouseEvent;


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


	public Exercice1Form(){
		btn_Rectangle.addActionListener(new ActionListener() {
			@Override
			public void mousePressed(MouseEvent e) {

			}

			public void mouseReleased(MouseEvent e){

			}
		});
	}


	private void createUIComponents() {
		JPanelDraw = new JPanel();
	}




}

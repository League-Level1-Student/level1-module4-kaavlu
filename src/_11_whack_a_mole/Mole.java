package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mole implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	public void run() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,600));
		
		JPanel panel = new JPanel();
		int x = 100;
		int y = 100;
		
		button1.setPreferredSize(new Dimension(x,y));
		button1.addActionListener(this);
		
		button2.setPreferredSize(new Dimension(x,y));
		button2.addActionListener(this);

		button3.setPreferredSize(new Dimension(x,y));
		button3.addActionListener(this);
		
		button4.setPreferredSize(new Dimension(x,y));
		button4.addActionListener(this);
		
		button5.setPreferredSize(new Dimension(x,y));
		button5.addActionListener(this);
		
		button6.setPreferredSize(new Dimension(x,y));
		button6.addActionListener(this);
		
		button7.setPreferredSize(new Dimension(x,y));
		button7.addActionListener(this);
		
		button8.setPreferredSize(new Dimension(x,y));
		button8.addActionListener(this);
		
		button9.setPreferredSize(new Dimension(x,y));
		button9.addActionListener(this);
		
		button10.setPreferredSize(new Dimension(x,y));
		button10.addActionListener(this);
		
		button11.setPreferredSize(new Dimension(x,y));
		button11.addActionListener(this);
		
		button12.setPreferredSize(new Dimension(x,y));
		button12.addActionListener(this);
		
		button13.setPreferredSize(new Dimension(x,y));
		button13.addActionListener(this);
		
		button14.setPreferredSize(new Dimension(x,y));
		button14.addActionListener(this);
		
		button15.setPreferredSize(new Dimension(x,y));
		button15.addActionListener(this);
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		
		
		frame.add(panel);
		frame.pack();
		
	}
	public void drawButtons(int randomNumber1through15) {
		if(randomNumber1through15==1) {
			button1.setText("Mole!");
		}else if(randomNumber1through15==2) {
			button2.setText("Mole!");
		}else if(randomNumber1through15==3) {
			button3.setText("Mole!");
		}else if(randomNumber1through15==4) {
			button4.setText("Mole!");
		}else if(randomNumber1through15==5) {
			button5.setText("Mole!");
		}else if(randomNumber1through15==6) {
			button6.setText("Mole!");
		}else if(randomNumber1through15==7) {
			button7.setText("Mole!");
		}else if(randomNumber1through15==8) {
			button8.setText("Mole!");
		}else if(randomNumber1through15==9) {
			button9.setText("Mole!");
		}else if(randomNumber1through15==10) {
			button10.setText("Mole!");
		}else if(randomNumber1through15==11) {
			button11.setText("Mole!");
		}else if(randomNumber1through15==12) {
			button12.setText("Mole!");
		}else if(randomNumber1through15==13) {
			button13.setText("Mole!");
		}else if(randomNumber1through15==14) {
			button14.setText("Mole!");
		}else if(randomNumber1through15==15) {
			button15.setText("Mole!");
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

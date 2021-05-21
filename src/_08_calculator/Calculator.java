package _08_calculator;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JTextField input1 = new JTextField();
	
	JTextField input2 = new JTextField();
	
	JTextField output = new JTextField();
	
	JButton button1 = new JButton();
	
	JButton button2 = new JButton();
	
	JButton button3 = new JButton();
	
	JButton button4 = new JButton();
	
public void run() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500,300));
		
		JPanel panel = new JPanel();
		
		
		input1.setPreferredSize(new Dimension(200,50));
		input1.setLocation(50, 50);
		
		input2.setPreferredSize(new Dimension(200,50));
		input2.setLocation(250, 50);
		
		output.setPreferredSize(new Dimension(200,50));
		input2.setLocation(150, 200);
		
		JLabel label = new JLabel();
		
		button1.setPreferredSize(new Dimension(100,50));
		button2.setPreferredSize(new Dimension(100,50));
		button3.setPreferredSize(new Dimension(100,50));
		button4.setPreferredSize(new Dimension(100,50));

		button1.setText("add");
		button2.setText("sub");
		button3.setText("mul");
		button4.setText("div");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		panel.add(input1);
		panel.add(input2);
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		panel.add(output);
		
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int input1Text = Integer.parseInt(input1.getText());
		int input2Text = Integer.parseInt(input2.getText());
		int answer;
		if(e.getSource() == button1) {
			input1Text = Integer.parseInt(input1.getText());
			input2Text = Integer.parseInt(input2.getText());
			answer = input1Text + input2Text;
			output.setText(String.valueOf(answer));
		}
		else if(e.getSource() == button2) {	
			input1Text = Integer.parseInt(input1.getText());
			input2Text = Integer.parseInt(input2.getText());
			answer = input1Text - input2Text;
			output.setText(String.valueOf(answer));
		}
		else if(e.getSource() == button3) {
			input1Text = Integer.parseInt(input1.getText());
			input2Text = Integer.parseInt(input2.getText());
			answer = input1Text * input2Text;
			output.setText(String.valueOf(answer));
		}
		else if(e.getSource() == button4) {
			input1Text = Integer.parseInt(input1.getText());
			input2Text = Integer.parseInt(input2.getText());
			answer = input1Text / input2Text;
			output.setText(String.valueOf(answer));
		}
		
		}
	}


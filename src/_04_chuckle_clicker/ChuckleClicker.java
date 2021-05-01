package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}
	public void makeButtons(){
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		
		button1.setText("Joke");
		button1.addActionListener(this);
		
		
		button2.setText("Punchline");
		button2.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		
		frame.add(panel);
		
		frame.pack();
		frame.show();
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, “What’s the word on the street?");
		}else {
			JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he doesn’t want to be spotted.");
		}
	}
}

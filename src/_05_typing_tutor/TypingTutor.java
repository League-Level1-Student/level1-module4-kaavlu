package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel label = new JLabel();
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.setup(); 
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	 public void setup(){
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         
         
         currentLetter = generateRandomLetter();
         
         label.setText(currentLetter+"");
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
         
         frame.addKeyListener(this);
         panel.add(label);
         frame.add(panel);
         frame.setVisible(true);
         
	 }
  
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("You pressed:" + arg0.getKeyChar());
		if(arg0.getKeyChar()==currentLetter) {
			System.out.println("correct");
		}else {
			System.out.println("incorrect");
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
         
         label.setText(currentLetter+"");
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

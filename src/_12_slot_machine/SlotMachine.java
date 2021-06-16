package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	String image1 = "eye.jpg";
	String image2 = "cherry.jpg";
	String image3 = "number.jpg";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JLabel eye1;
	JLabel eye2;
	JLabel eye3;
	
	JLabel cherry1;
	JLabel cherry2;
	JLabel cherry3;
	
	JLabel number1;
	JLabel number2;
	JLabel number3;
	JButton button = new JButton();
	Random random = new Random();
	
	public void run() throws MalformedURLException {
		// TODO Auto-generated method stub
		button.addActionListener(this);
		eye1 = createLabelImage(image1);
		eye2 = createLabelImage(image1);
		eye3 = createLabelImage(image1);
		
		cherry1 = createLabelImage(image2);
		cherry2 = createLabelImage(image2);
		cherry3 = createLabelImage(image2);
		
		number1 = createLabelImage(image3);
		number2 = createLabelImage(image3);
		number3 = createLabelImage(image3);
		
		imageorder();
	}
	
	public void imageorder() {
		frame.setVisible(true);
		int randNum1 = random.nextInt(2);
		int randNum2 = random.nextInt(2);
		int randNum3 = random.nextInt(2);
		
		if(randNum1==0) {
			panel.add(eye1);
		}else if(randNum1==1) {
			panel.add(cherry1);
		}else if(randNum1==2) {
			panel.add(number1);
		}
		
		if(randNum2==0) {
			panel.add(eye2);
		}else if(randNum2==1) {
			panel.add(cherry2);
		}else if(randNum2==2) {
			panel.add(number2);
		}
		
		if(randNum3==0) {
			panel.add(eye3);
		}else if(randNum3==1) {
			panel.add(cherry3);
		}else if(randNum3==2) {
			panel.add(number3);
		}
		panel.add(button);
		frame.add(panel);
		frame.pack();
		
		if(randNum1==randNum2 && randNum1==randNum3) {
			System.out.println("You win");
		}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			frame.dispose();
			panel.removeAll();
			imageorder();
			
		}
	}
  
}

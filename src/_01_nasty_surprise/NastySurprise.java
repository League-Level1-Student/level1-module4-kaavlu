package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;


public class NastySurprise implements ActionListener {
	
	JButton button = new JButton();
	JButton button1 = new JButton();
	public void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void run() {
			
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,100));
		
		JPanel panel = new JPanel();	
		
		
		
		button.setPreferredSize(new Dimension(50,25));
		button1.setPreferredSize(new Dimension(50,25));
		button.addActionListener(this);
		button1.addActionListener(this);
		panel.add(button);
		panel.add(button1);
		frame.add(panel);
		frame.pack();
	}
		
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button) {
		showPictureFromTheInternet("https://thezebra.org/wp-content/uploads/2020/07/Training-Time-Aug2020-GR-with-ball-scaled.jpg");
		}else {
		showPictureFromTheInternet("https://www.cnet.com/a/img/XQ14jnBBOSGF4ZYSFir0Si5_1i8=/470x836/2014/10/28/4299ece2-de9b-4ab2-9450-cc3675c11008/spooky24.jpg");
	}
}
}



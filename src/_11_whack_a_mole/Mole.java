package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;
public class Mole implements ActionListener{
	JFrame frame = new JFrame();
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
	Random random = new Random();
	int randNum = random.nextInt(15);
	int goal = 10;
	int count = 0;
	public void run() {
		// TODO Auto-generated method stub
		drawButtons(randNum);
		if(count==10) {
			endGame(null, count);
		}
	}
	public void drawButtons(int randomNumber1through15) {
		
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
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
	public void output() {
		System.out.println("Good Shot!");
		count++;
		frame.dispose();
		drawButtons(randNum);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1 && randNum==1) {
			output();
		}else if(e.getSource() == button1 && randNum==1) {
			output();
		}else if(e.getSource() == button2 && randNum==2) {
			output();
		}else if(e.getSource() == button3 && randNum==3) {
			output();
		}else if(e.getSource() == button4 && randNum==4) {
			output();
		}else if(e.getSource() == button5 && randNum==5) {
			output();
		}else if(e.getSource() == button6 && randNum==6) {
			output();
		}else if(e.getSource() == button7 && randNum==7) {
			output();
		}else if(e.getSource() == button8 && randNum==8) {
			output();
		}else if(e.getSource() == button9 && randNum==9) {
			output();
		}else if(e.getSource() == button10 && randNum==10) {
			output();
		}else if(e.getSource() == button11 && randNum==11) {
			output();
		}else if(e.getSource() == button12 && randNum==12) {
			output();
		}else if(e.getSource() == button13 && randNum==13) {
			output();
		}else if(e.getSource() == button14 && randNum==14) {
			output();
		}else if(e.getSource() == button15 && randNum==15) {
			output();
		}else {
			
			speak("missed");
			frame.dispose();
		}
		
		
	}

}

package prGmailClient;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GmailClientDemo {
	public static void main(String[] args){
		GmailClientView gmailClientView = new GmailClientPanel();
		ActionListener gmailClientCtr = new GmailClientCtr(gmailClientView);
		gmailClientView.controller(gmailClientCtr);
		JFrame window = new JFrame("Gmail Client");  	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(new Dimension(400,400));
		window.setContentPane((JPanel) gmailClientView);
		window.setVisible(true);    
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}
}

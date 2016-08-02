package prGmailClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GmailClientCtr implements ActionListener{
	private	GmailClientView gmailClientView;
	public GmailClientCtr(GmailClientView gmailClientView){
		this.gmailClientView=gmailClientView;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command){
		case "SEND":
			GmailClient gmailClient = new GmailClient(gmailClientView.getTo(),gmailClientView.getSubject(),gmailClientView.getMessage());
		break;
		}
	}
}

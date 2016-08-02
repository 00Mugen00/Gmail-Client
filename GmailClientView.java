package prGmailClient;

import java.awt.event.ActionListener;

public interface GmailClientView {
	String SEND = "SEND";
	void controller(ActionListener gmailClientCtr);
	String getTo();
	String getSubject();
	String getMessage();
}

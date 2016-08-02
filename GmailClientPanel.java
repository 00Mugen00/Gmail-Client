package prGmailClient;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GmailClientPanel extends JPanel implements GmailClientView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel toLabel,subjectLabel,messageLabel;
	private JTextField toTextField,subjectTextField;
	private JTextArea messageTextArea;
	private JScrollPane messageScrollPane;
	private JButton send;
	
	public GmailClientPanel(){
		toLabel=new JLabel("TO:");
		subjectLabel=new JLabel("SUBJECT:");
		messageLabel=new JLabel("MESSAGE:");
		
		toTextField=new JTextField();
		subjectTextField=new JTextField();
	
		messageTextArea=new JTextArea();
		messageTextArea.setLineWrap(true);
		
		messageScrollPane = new JScrollPane(messageTextArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		send = new JButton("SEND");
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(5,1));
		northPanel.add(toLabel);
		northPanel.add(toTextField);
		northPanel.add(subjectLabel);
		northPanel.add(subjectTextField);
		northPanel.add(messageLabel);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(messageScrollPane);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());
		southPanel.add(send);
		
		add(northPanel,BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
	}

	public void controller(ActionListener gmailClientCtr) {
		send.addActionListener(gmailClientCtr);
		send.setActionCommand(SEND);
	}
	
	public String getTo(){
		return toTextField.getText();
	}
	
	public String getSubject(){
		return subjectTextField.getText();
	}
	
	public String getMessage(){
		return messageTextArea.getText();
	}
	
	
	
}

package telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {
	
	private JFrame frame;
	private JButton login, cancel;
	private JPanel panel_buttons,panel_text,panel;
	private JTextField userText,passText;
	private JLabel userLabel,passLabel;
	public Login() {
		frame=new JFrame();
		frame.setTitle("Login Here");
		frame.setSize(500,150);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		userLabel=new JLabel("Username");
		userText=new JTextField(20);
		
		passLabel=new JLabel("Password");
		passText=new JTextField(20);
		
		login=new JButton("Login");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(userText.getText().isEmpty()||passText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Either password or username is incorrect","Oops!!!",JOptionPane.ERROR_MESSAGE);
				}
				else if(userText.getText().isBlank()||passText.getText().isBlank()) {
					JOptionPane.showMessageDialog(frame, "Success","Hullo!!!", JOptionPane.INFORMATION_MESSAGE);
				}else {
					new Calculus();
				}
			}
			
		});
		
		cancel=new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		panel_buttons=new JPanel();
		panel_buttons.add(login);
		
		panel_text=new JPanel();
		panel_text.setLayout(new GridLayout(2,2));
		
		panel_text.add(userLabel);
		panel_text.add(userText);
		panel_text.add(passLabel);
		panel_text.add(passText);
		
		panel_buttons.add(login);
		panel_buttons.add(cancel);
		
		panel=new JPanel();
		panel.add(panel_text);
		panel.add(panel_buttons);
		
		frame.add(panel);
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		new Login();
	}
}

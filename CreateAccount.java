import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount {

	private JFrame frame;
	private JTextField email_field;
	private JTextField username_field;
	private JPasswordField password_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] usernames = new String[100];
		String[] emails = new String[100];
		String[] passwords = new String[100];
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(42, 13, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(42, 57, 56, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(42, 111, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		email_field = new JTextField();
		email_field.setBounds(172, 10, 116, 22);
		frame.getContentPane().add(email_field);
		email_field.setColumns(10);
		
		username_field = new JTextField();
		username_field.setBounds(172, 57, 116, 22);
		frame.getContentPane().add(username_field);
		username_field.setColumns(10);
		
		password_field = new JPasswordField();
		password_field.setBounds(172, 111, 116, 22);
		frame.getContentPane().add(password_field);
		password_field.setColumns(10);
		

		
		JButton btnCreate = new JButton("create");
		btnCreate.addActionListener(new ActionListener() {
			int ctrl = 1;
			int count=0;
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String tempUsername = username_field.getText();
					String tempEmail = email_field.getText();
					String tempPassword = password_field.getText();
					for(int i =0;i<usernames.length;i++) {
						if(tempUsername.equals(usernames[i])) {
							System.out.println("This username is already taken. Please try again");
							ctrl =0;
						}
						if(tempEmail.equals(emails[i])) {
							System.out.println("email already taken. Please try again");
							ctrl =0;
						}
						
					}
					
					String subTempString1;
					subTempString1 = tempEmail.substring(tempEmail.indexOf('@'), tempEmail.length());
						
					
					
					if(subTempString1.length()<4) {
						System.out.println("Invalid email address entered. please try again!");
						ctrl=0;
					}
					
					
					if(ctrl==1) {
						usernames[count]=tempUsername;
						emails[count]=tempEmail;
						passwords[count]=tempPassword;
						count++;
						System.out.println("Account Succesfully created");
						System.out.println("Your Username is: "+tempUsername);
						System.out.println("Your email address is: "+tempEmail);
					}
					ctrl=1;
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				System.out.println("-------------------------------------------------------------------------------------");
				
				
				
			}
		});
		btnCreate.setBounds(42, 186, 97, 25);
		frame.getContentPane().add(btnCreate);
	}
}

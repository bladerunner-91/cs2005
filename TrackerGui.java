package javaapplication37;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class TrackerGui extends JFrame {

	
	private JTextField txtUsersRecentStatistics;
	private JTextField txtUserWillBe;
	private JTextField txtStatisticsOfFriend;
	private JTextField txtStatisticsOfFriend_1;
	private JTextField txtStatisticsOfFriend_2;
        private Map<String, JButton> buttonMap=new HashMap<String, JButton>();
        
        private String[] buttonLabels = {
                                        "Friend's List",  "Edit Profile" ,  "UpdateStats" ,
                                        "My Statistics" , "ActivityTracker" , "Logo" 
                                            };
        
        
        
       
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrackerGui window = new TrackerGui();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
        
        public void addActionListeners(String button){
            
            // add more action listeners here 
            if (button.equals("Friend's List")){
                buttonMap.get(button).addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            System.out.println("Hello from button");
			}
		});
            }
            if (button.equals("Edit Profile")){
                buttonMap.get(button).addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            System.out.println("Hello from button");
			}
		});
            }
            if (button.equals("UpdateStats")){
                buttonMap.get(button).addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            System.out.println("Hello from button");
			}
		});
            }
       
            //etc.
        }
        
        
        
        
        
        
        
        
        /**
	 * Create the application.
	 */
	public TrackerGui() {
		super("my frame");
		this.setBounds(200, 200, 1182, 779);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2,3));
		
                
                for (int i=0; i<buttonLabels.length;i++){
                    JButton button = new JButton(buttonLabels[i]);
                    this.getContentPane().add(button);
                    buttonMap.put(button.getText(), button);
                    addActionListeners(button.getText());
                    
                    
                }
                
		
		
		txtUsersRecentStatistics = new JTextField();
		txtUsersRecentStatistics.setText("User's Recent Statistics will be shown here");
		txtUsersRecentStatistics.setBounds(10, 37, 558, 327);
		this.getContentPane().add(txtUsersRecentStatistics);
		txtUsersRecentStatistics.setColumns(10);
		
		txtUserWillBe = new JTextField();
		txtUserWillBe.setText("User will be able to update statistics here");
		txtUserWillBe.setBounds(10, 377, 558, 342);
		this.getContentPane().add(txtUserWillBe);
		txtUserWillBe.setColumns(10);
		
		txtStatisticsOfFriend = new JTextField();
		txtStatisticsOfFriend.setText("Statistics of friend 1 will be shown here");
		txtStatisticsOfFriend.setBounds(610, 37, 542, 203);
		this.getContentPane().add(txtStatisticsOfFriend);
		txtStatisticsOfFriend.setColumns(10);
		
		txtStatisticsOfFriend_1 = new JTextField();
		txtStatisticsOfFriend_1.setText("Statistics of friend 2 will be shown here");
		txtStatisticsOfFriend_1.setBounds(610, 253, 542, 221);
		this.getContentPane().add(txtStatisticsOfFriend_1);
		txtStatisticsOfFriend_1.setColumns(10);
		
		txtStatisticsOfFriend_2 = new JTextField();
		txtStatisticsOfFriend_2.setText("Statistics of friend 3 will be shown here");
		txtStatisticsOfFriend_2.setBounds(610, 487, 542, 221);
		this.getContentPane().add(txtStatisticsOfFriend_2);
		txtStatisticsOfFriend_2.setColumns(10);
		
               
		
	}
	

		
}
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class RainbowGUI {

	public JFrame frame;
	public JTextArea input;
	public JTextArea output;
	public JButton btnCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RainbowGUI window = new RainbowGUI();
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
	public RainbowGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setName("frame");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		input = new JTextArea();
		input.setName("input");
		input.setFont(new Font("Monospaced", Font.PLAIN, 18));
		input.setBounds(134, 13, 158, 30);
		frame.getContentPane().add(input);
		
		output = new JTextArea();
		output.setName("output");
		output.setFont(new Font("Monospaced", Font.PLAIN, 16));
		output.setBounds(29, 172, 380, 41);
		frame.getContentPane().add(output);
		
		JLabel lblColorInput = new JLabel("Color Input:");
		lblColorInput.setBounds(44, 16, 78, 16);
		frame.getContentPane().add(lblColorInput);
		
		String colors[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
		
		btnCheck = new JButton("Check");
		btnCheck.setName("btnCheck");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userColor = input.getText();
				boolean done = false;
				 for(String s : colors)
				 {
					 if(userColor.equals(s))
					 {
						 done = true;
						 output.setText(userColor + " is a color of the Rainbow");
					 }
				 }
				 if(done == false)
					 output.setText(userColor + " is not a color of the Rainbow");
				 input.setText("");
			}
		});
		btnCheck.setBounds(171, 77, 97, 25);
		frame.getContentPane().add(btnCheck);
		
	
		
	}
}

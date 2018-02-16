package Week9;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Clicker extends JFrame implements ActionListener {
	private JLabel lblCounter;
	private JButton btnClick;
	private int count = 0;
	
	public Clicker() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clicker App");
		btnClick = new JButton("Click");
		lblCounter = new JLabel("0");
		lblCounter.setHorizontalAlignment(SwingConstants.RIGHT);
		this.getContentPane().add(btnClick, BorderLayout.NORTH);
		this.getContentPane().add(lblCounter, BorderLayout.EAST);
		
		btnClick.addActionListener(this);
		this.setSize(200, 150);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//count++;
		lblCounter.setText(++count+"");
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(     
				new Runnable() {
			public void run() {
				JFrame.setDefaultLookAndFeelDecorated(true);
				new Clicker();
			}
		}
							
				);

	
	}
	}


import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Listener extends JFrame {
	Listener(){
		this.setTitle("Listener");
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		JPanel Button = new JPanel(new BorderLayout());
		JLabel Lab = new JLabel("Enter a Word to Reverse: ");
		JLabel Lab2 = new JLabel("Result: ");
		this.add(panel);
		this.add(panel2);
		this.add(Button);
		panel.add(Lab, BorderLayout.WEST);
		panel2.add(Lab2, BorderLayout.WEST);
		JTextField f1 = new JTextField(50);
		panel.add(f1,BorderLayout.CENTER);
		JTextField f2 = new JTextField(50);
		panel2.add(f2, BorderLayout.CENTER);
		JButton Reverse = new JButton("Reverse");
		Button.add(Reverse, BorderLayout.SOUTH);
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(panel2, BorderLayout.CENTER);
		this.getContentPane().add(Button, BorderLayout.SOUTH);
		Reverse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v1 = f1.getText();
				String v2 = "";
				for(int i = v1.length() - 1; i >= 0; i--) {
					v2 += v1.charAt(i);
				}
				f2.setText(v2);
			}
		});
		f1.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
				String v1 = f1.getText();
				String v2 = "";
				for(int i = v1.length() - 1; i >= 0; i--) {
					v2 += v1.charAt(i);
				}
				f2.setText(v2);
		    }
		});

				
			
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Listener frame = new Listener();

	}

}

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator extends JFrame {
	Calculator(){
		this.setTitle("Calculator");
		JPanel p = new JPanel(new BorderLayout());
		this.add(p);
		JPanel labelPanel = new JPanel();
		this.add(labelPanel);
		JPanel p1 = new JPanel(new GridLayout(3,2,3,3));
		this.add(p1);
		JTextField f1 = new JTextField("0.0", 15);
		JTextField f2 = new JTextField("0.0", 16);
		JLabel ans = new JLabel("0.0");
		ans.setMinimumSize(new Dimension(200, 15));
		JLabel labelanswer = new JLabel("Answer: ");
		labelPanel.setLayout(new BorderLayout());
		labelPanel.add(labelanswer,BorderLayout.WEST);
		labelPanel.add(ans, BorderLayout.CENTER);
		p.add(f1, BorderLayout.WEST); 
		p.add(f2, BorderLayout.EAST);
		this.getContentPane().add(labelPanel,BorderLayout.CENTER);
		this.getContentPane().add(p,BorderLayout.NORTH);
		this.getContentPane().add(p1,BorderLayout.SOUTH);
		JButton mult = new JButton("*");
		p1.add(mult);
		JButton add = new JButton("+");
		p1.add(add);
		JButton sub = new JButton("-");
		p1.add(sub);
		JButton div = new JButton("/");
		p1.add(div);
		JButton CopyF1 = new JButton("Copy Answer to F1");
		JButton CopyF2 = new JButton("Copy Answer to F2");
		p1.add(CopyF1);
		p1.add(CopyF2);
		JButton quit = new JButton("Quit");
		p1.add(quit);
		this.pack();
		this.setVisible(true);
		mult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v1 = f1.getText();
				String v2 = f2.getText();
				if(v1.equals("") || v2.equals("") || v1.equals(null) || v2.equals(null) || v1.equals("ERROR") || v2.equals("ERROR")) {
					ans.setText("ERROR");
				} else {
				double val1 = Double.parseDouble(v1);
				double val2 = Double.parseDouble(v2);
				double amt = val1 * val2;
				String total = String.valueOf(amt);
				ans.setText(total);
				}
			}
			
		});
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v1 = f1.getText();
				String v2 = f2.getText();
				if(v1.equals("") || v2.equals("") || v1.equals(null) || v2.equals(null) || v1.equals("ERROR") || v2.equals("ERROR")) {
					ans.setText("ERROR");
				} else {
				double val1 = Double.parseDouble(v1);
				double val2 = Double.parseDouble(v2);
				double amt = val1 + val2;
				String total = String.valueOf(amt);
				ans.setText(total);
				}
			}
			
		});
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v1 = f1.getText();
				String v2 = f2.getText();
				if(v1.equals("") || v2.equals("") || v1.equals(null) || v2.equals(null) || v1.equals("ERROR") || v2.equals("ERROR")) {
					ans.setText("ERROR");
				} else {
				double val1 = Double.parseDouble(v1);
				double val2 = Double.parseDouble(v2);
				double amt = val1 - val2;
				String total = String.valueOf(amt);
				ans.setText(total);
				}
			}
			
		});
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String v1 = f1.getText();
				String v2 = f2.getText();
				if(v1.equals("") || v2.equals("") || v1.equals(null) || v2.equals(null) || v1.equals("ERROR") || v2.equals("ERROR")) {
					ans.setText("ERROR");
				} else {
				double val1 = Double.parseDouble(v1);
				double val2 = Double.parseDouble(v2);
				double amt = val1 / val2;
				String total = String.valueOf(amt);
				ans.setText(total);
				}
			}
			
		});
		CopyF1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String getAns = ans.getText();
				f1.setText(getAns);
				}
			
			
		});
		
		CopyF2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String getAns = ans.getText();
				f2.setText(getAns);
			}
				
			
		});
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
				
			
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		
		Calculator frame = new Calculator();

	}

}

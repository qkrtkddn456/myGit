package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
	
	public MyEventColor(JFrame f , Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}

	public static void main(String[] args) {
		new Event2();
	}
}

class Event2 extends JFrame{
	private JButton b1,b2,b3,b4;
	public Event2() {
		setLayout(new BorderLayout());
		b1 = new JButton("North");
		b2 = new JButton("East");
		b3 = new JButton("South");
		b4 = new JButton("West");
		
		add(b1,"North");add(b2,"East");add(b3,"South");add(b4,"West");
		
		b1.addActionListener(new MyEventColor(this, Color.red));
		b2.addActionListener(new MyEventColor(this, Color.green));
		b3.addActionListener(new MyEventColor(this, Color.blue));
		b4.addActionListener(new MyEventColor(this, Color.yellow));
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
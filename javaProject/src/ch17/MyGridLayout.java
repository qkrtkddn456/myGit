package ch17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		super("과제1");
		setLayout(new GridLayout(4, 2));
		Container c = getContentPane();
		c.add(new JLabel("ID"));
		c.add(new JTextField("Hong",20));
		c.add(new JLabel("비밀번호"));
		c.add(new JPasswordField("qwer",20));
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net", 20));
		c.add(new JLabel("hp"));
		c.add(new JTextField("010-1234-5678", 20));
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}

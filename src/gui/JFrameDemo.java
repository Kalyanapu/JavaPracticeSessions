package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameDemo {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(420, 520);
		jf.setVisible(true);
		jf.setTitle("JSWING");
		jf.setResizable(false);

		ImageIcon i = new ImageIcon();
		jf.setIconImage(i.getImage());
		jf.getContentPane().setBackground(Color.BLACK);

	}

}

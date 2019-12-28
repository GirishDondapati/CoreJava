package com.girish.awtswing;

import java.awt.Color;
import javax.swing.*;

public class JTextAreaEx {
    JTextArea area;
    JFrame f;
	JTextAreaEx(){
	f=new JFrame();
		
	area=new JTextArea(100,100);
	area.setBounds(10,30,300,300);
	
	area.setBackground(Color.green);
	area.setForeground(Color.red);
		
	f.add(area);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
}
	public static void main(String[] args) {
		new JTextAreaEx();
	}
}

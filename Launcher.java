/* 
 * Copyright (C) 2014, Sylvester Saracevas
 * 
 */
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;


public class Launcher extends JFrame {
		
		public Generator gen;

		public Launcher() {
			startUI();
		}

		private void startUI() {
			//set LookAndFeel
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}catch (Exception e) {
				e.printStackTrace();
			}
			gen = new Generator();
			setJMenuBar(gen.menu.menuBar());
	        add(gen);
	        setTitle("Simple Crawler");
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(700,700);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        pack();
		}

		public static void main(String[] args) {
			Launcher launch = new Launcher();
		}

		

}

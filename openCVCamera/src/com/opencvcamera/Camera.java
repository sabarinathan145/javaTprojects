package com.opencvcamera;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.opencv.core.Core;

import org.opencv.videoio.VideoCapture;

public class Camera extends JFrame{
	   private JLabel camerascreen;
	   private JButton btnCapture;
	   private VideoCapture capture;
	 
	
	public Camera () {
		setLayout(null);
		camerascreen = new JLabel();
		camerascreen.setBounds(0, 0, 640 , 480);
		add(camerascreen);
		
		btnCapture = new JButton("Capture");
		btnCapture.setBounds(300,480,80,40);
		add(btnCapture);
		
		btnCapture.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				
			}
		});
	
		setSize(new Dimension(640,560));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	//creat camera
	
	
	public static void main(String[] args) {
	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	EventQueue.invokeLater(new Runnable() {
	
		public void run() {
		 Camera	camera  = new Camera();
		 
		}
	});
	
	
	System.out.print("Load successfully");
	}

}

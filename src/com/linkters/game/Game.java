package com.linkters.game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 160;
    public static final int HEIGHT = WIDTH/12*9;
    public static final int SCALE = 3;
    public static final String NAME = "Game";
    
    private JFrame frame;
    
    public Game(){
    	setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
    	setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
    	setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
    	
    	frame = new JFrame(NAME);
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(new BorderLayout());
    	
    	frame.add(this, BorderLayout.CENTER);
    	frame.pack();
    	
    	frame.setResizable(false);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }
    
    
	public void run() {
		
	}
	
	public static void main(String args) {
		new Game().start();		
	}


	public synchronized void start() {
		
	}
	
public synchronized void stop() {
		
	}
}

package tictactoe;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;  //needed to use swing components e.g. JFrame 
import javax.swing.JLabel;

import java.awt.event.*; 

public class TicTacWindow extends JFrame implements ActionListener,MouseListener{
	// Set up constants for width and height of frame 
//		Game newgame = new Game();
		static final int WIDTH = 400; 
		static final int HEIGHT = 400;
		
		private static int bWidth = 100;
		private static int bHeight = 50;
		
		private JButton[] button;
		private JButton	  exitButton, resetButton;
		private JLabel    playerLabel, statusLabel;
		private Font      fancyFont, playerFont;
		
		
		// model
		//private TicTacToe aTicTacToe;
		
		// constructor
	    public TicTacWindow(String title) { 
	    	
	    	//aTicTacToe = new TicTacToe();
	    	
	    	// Set the title of the frame, must be before variable declarations 
	    	super(title); 
	    	
	    	
	    	getContentPane().setLayout(null); 
	    	getContentPane().setBackground(Color.getHSBColor(120, 200, 150));
	  
	    	
	    	button = new JButton[9];
	    	for (int row=0; row<3; row++){
	    		for(int col=0; col < 3; col++) {
				button[(row*3+col)] = new JButton(""); 
				button[(row*3+col)].setBackground(SystemColor.control); 
				button[(row*3+col)].setLocation(((-50+row*100)+(bWidth)), (100+(col*bHeight))); 
			    button[(row*3+col)].setSize(bWidth,bHeight); 
			    getContentPane().add(button[(row*3+col)]);
			     
			        //Set all buttons to work with the event handlers
			    button[(row*3+col)].addActionListener(this);
			    button[(row*3+col)].addMouseListener(this);
	    		}
	    	}
				
			        	  
	     // Create and add a player JLabel 
			playerLabel = new JLabel("Player 1"); 
			playerFont = new Font("Verdana", Font.BOLD, 28);
			playerLabel.setFont(playerFont);
			playerLabel.setBounds(140, 25, 240, 45);
			getContentPane().add(playerLabel);
			
			exitButton = new JButton("Exit"); 
			exitButton.setBackground(SystemColor.control); 
			exitButton.setLocation(250, 300); 
		    exitButton.setSize(100,40); 
		    getContentPane().add(exitButton);
		        
		    resetButton = new JButton("New Game"); 
			resetButton.setBackground(SystemColor.control); 
			resetButton.setLocation(25, 300); 
		    resetButton.setSize(125,40); 
		    getContentPane().add(resetButton);
		    
		    resetButton.addMouseListener(this); 
		    exitButton.addMouseListener(this);
	        addMouseListener(this);
	        exitButton.addActionListener(this);
	    	    	
	    } 
	    
	    //This is the event handler for the button 
	    public void actionPerformed(ActionEvent e) { 
	        //Ask the event which button it represents 
	        if (e.getActionCommand().equals("Exit")) 
	            System.exit(0); 
	       // else 
	         //   System.out.println("Ouch! Stop that!"); 
	    }
	    public void mousePressed(MouseEvent event) { 
	        System.out.println("MousePressed");
	        Point location = MouseInfo.getPointerInfo().getLocation();
	        System.out.print(location.getX());
	        for(int i = 0; i < 3; i++) {
	        	for(int j = 0; j < 3; j++) {
	        		if(location.getX()>((i)*100+50)&&location.getX()<((i+1)*100+50)) {
	        	        System.out.print("hi");
	        		}
	        	}
	        }
	    
	    }

	    public void mouseReleased(MouseEvent event) { 
	    	System.out.println("MouseReleased"); 
	    }

	    public void mouseEntered(MouseEvent event) { 
	    	System.out.println("MouseEntered"); 
	    }

	    public void mouseExited(MouseEvent event) { 
	    	System.out.println("MouseExited"); 
	    }
	    public void mouseClicked(MouseEvent event) { 
	        String s; 
	        if (event.getButton() == 1) 
	            s = "Right"; 
	        else s = "Left"; // Ignores the middle button case 
	        System.out.printf("Mouse" + s + "-Clicked " + event.getClickCount() + 
	                          " times successively ", event); 
	    }
	    
	    public static void main(String args[]) { 
	         // Instantiate a FirstApplication object so you can display it 
	         TicTacWindow frame =  new TicTacWindow("TicTacToe Game"); 
	         frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	         
	         // Set the size of the application window (frame) 
	         frame.setSize(WIDTH, HEIGHT); 
	         frame.setVisible(true); // Show the application (frame) 
	    } 
}

package lights_out.view;

import javax.swing.*;


import java.awt.*;
import java.net.URL;

public class Tp_View {
    private JFrame frame;
    
    
    private JButton[][] lights;
    
    
    private JButton bottonStart;
    private JButton bottonExit;
    private JButton bottonNewGame;
    private JButton bottonDificulty;
    private JButton bottonRanking;
    private JButton buttonBackRanking;
    private JButton bottonChangeName;
    private JButton bottonvolverAlMenu;
    private JButton buttonEnter;
    private JButton button3x3;
    private JButton button4x4;
    private JButton button5x5;
    private JButton buttonMenu;
    
    private JLabel attemptsLabel;
    private JLabel victoryLabel;
    private JLabel victoryAttemptsLabel;
    private JLabel showRanking;
    private JTextField textField;
    private JLabel whatsYourName;
    
    
    private URL lighOff = getClass().getResource("/images/Light Off.png");
    
    public Tp_View() {
		initialize();
	}


    private void initialize() {
    	frame = new JFrame();
        frame.getContentPane().setBackground(new Color(238, 184, 18));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Lights Out");
        
        ImageIcon icon = new ImageIcon(lighOff);
        frame.setIconImage(icon.getImage());
		
		
		
		
		buttonEnter = new JButton("Enter");
		buttonEnter.setBounds(325, 325, 138, 45);
		frame.getContentPane().add(buttonEnter);
	
		
    }
    private JButton bottonStart() {
    	bottonStart = new JButton("Game Start");
		bottonStart.setBounds(325, 125, 138, 45);
		getFrame().getContentPane().add(bottonStart);
		return bottonStart;
    }
    
    public JButton getBottonStart() {
    	return bottonStart();
    }
    private JButton bottonDificulty() {
    	bottonDificulty = new JButton("Dificulty");
		bottonDificulty.setBounds(325, 225, 138, 45);
		frame.getContentPane().add(bottonDificulty);
		return bottonDificulty;
    }
    
    public JButton getBottonDificulty() {
    	return bottonDificulty();
    }
    private JButton bottonExit() {
    	bottonExit = new JButton("Exit");
		bottonExit.setBounds(325, 325, 138, 45);
		frame.getContentPane().add(bottonExit);
		return bottonExit;
    }
    
    public JButton getBottonExit() {
    	return bottonExit();
    }
    private JButton bottonRanking() {
    	bottonRanking = new JButton("Ranking");
    	bottonRanking.setBounds(450, 425, 138, 45);
		frame.getContentPane().add(bottonRanking);
		return bottonRanking;
    }
    
    public JButton getBottonRanking() {
    	return bottonRanking();
    }
    private JButton bottonChangeName() {
    	bottonChangeName = new JButton("Change Name");
    	bottonChangeName.setBounds(200, 425, 138, 45);
		frame.getContentPane().add(bottonChangeName);
		return bottonChangeName;
    }
    
    public JButton getBottonChangeName() {
    	return bottonChangeName();
    }
    
    private JButton bottonNewGame() {
    	bottonNewGame = new JButton("New Game");
		bottonNewGame.setBounds(650, 63, 109, 45);
		frame.getContentPane().add(bottonNewGame);
		return bottonNewGame;
    }
    
    public JButton getBottonNewGame() {
    	return bottonNewGame();
    }
    
    private JButton buttonMenu() {
    	buttonMenu = new JButton("Menu");
		buttonMenu.setBounds(650, 160,109, 45);
		frame.getContentPane().add(buttonMenu);
		return buttonMenu;
    }
    
    public JButton getButtonMenu() {
    	return buttonMenu();
    }
    
    private JButton buttonBackRanking() {
    	buttonBackRanking = new JButton("Menu");
    	buttonBackRanking.setBounds(650, 160,109, 45);
		frame.getContentPane().add(buttonBackRanking);
		return buttonBackRanking;
    }
    
    public JButton getButtonBackRanking() {
    	return buttonBackRanking();
    }
    
    private JButton bottonBacktoMainMenu() {
    	bottonvolverAlMenu = new JButton("Back to main menu");
    	bottonvolverAlMenu.setBounds(310, 400, 150, 45);
		frame.getContentPane().add(bottonvolverAlMenu);
		return bottonvolverAlMenu;
    }
    
    public JButton getBottonvolverAlMenu() {
    	return bottonBacktoMainMenu();
    }
    private JTextField yourName() {
    textField = new JTextField();
    textField.setForeground(new Color(255, 128, 64));
    textField.setFont(new Font("Tahoma", Font.BOLD, 24));
    textField.setBounds(105, 150, 402, 47);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    return textField;
    }
    public JTextField getYourName() {
    	return yourName();
    }
    
    private JLabel whatsYourName() {
    	whatsYourName = new JLabel("What is your name?");
    	whatsYourName.setForeground(new Color(0, 128, 255));
    	whatsYourName.setFont(new Font("Tahoma", Font.BOLD, 24));
    	whatsYourName.setBounds(168, 58, 257, 47);
        frame.getContentPane().add(whatsYourName);
        return whatsYourName;
    }
    public JLabel getWhatsYourName() {
    	return whatsYourName();
    }
    private JLabel labelVictory() {
    	victoryLabel = new JLabel("Congratulations!!!");
		victoryLabel.setForeground(Color.BLUE);
  
    	frame.getContentPane().setLayout(null);
    	victoryLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
    	victoryLabel.setBounds(250, 40, 300, 120);
    	frame.getContentPane().add(victoryLabel);
		return victoryLabel;
    }
    
    public JLabel getLabelVictory() {
    	return labelVictory();
    }
    private JLabel labelVictoryAttempts() {
    	victoryAttemptsLabel = new JLabel("");
    	victoryAttemptsLabel.setForeground(Color.BLUE);
  
    	frame.getContentPane().setLayout(null);
    	victoryAttemptsLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
    	victoryAttemptsLabel.setBounds(230, 240, 340, 120);
    	frame.getContentPane().add(victoryAttemptsLabel);
		return victoryAttemptsLabel;
    }
    
    public JLabel getLabelVictoryAttempts() {
    	return labelVictoryAttempts();
    }
    
    private JLabel labelShowRanking() {
    	showRanking = new JLabel("");
    	showRanking.setForeground(Color.BLUE);
  
    	frame.getContentPane().setLayout(null);
    	showRanking.setFont(new Font("MV Boli", Font.BOLD, 30));
    	showRanking.setBounds(230, 240, 340, 120);
    	frame.getContentPane().add(showRanking);
		return showRanking;
    }
    
    public JLabel getLabelShowRanking() {
    	return labelShowRanking();
    }
    
    //Esta tres funciones configurar el botones para configurar la dificultad
    private JButton button3x3() {
    	button3x3 = new JButton("3x3");
		button3x3.setBounds(325, 125, 138, 45);
		frame.getContentPane().add(button3x3);
		return button3x3;
    }
    
    
    private JButton button4x4() {
    	button4x4 = new JButton("4x4");
		button4x4.setBounds(325, 225, 138, 45);
		frame.getContentPane().add(button4x4);
		return button4x4;
    }

    private JButton button5x5() {
    	button5x5 = new JButton("5x5");
		button5x5.setBounds(325, 325, 138, 45);
		frame.getContentPane().add(button5x5);
		return button5x5;
    }
    
    
    
    public JButton getButton3x3() {
    	return button3x3();
    }
    
    public JButton getButton4x4() {
    	return button4x4();
    }
    
    public JButton getButton5x5() {
    	return button5x5();
    }
    
    
    //Esta tres funciones configurar la matrix para los botones
    
    private JButton[][] gameInterfaceBottons3x3 () {
    	lights = new JButton[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                JButton button = new JButton("");
                
                button.setIcon(new ImageIcon(""));
                button.setBounds(220+column*100, 120+row*90, 50, 50);
                frame.getContentPane().add(button);
                lights[column][row] = button;
            }
        }
        
        return lights;
    }
    private JButton[][] gameInterfaceBottons4x4 () {
    	lights = new JButton[4][4];
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                JButton button = new JButton("");
                
                button.setIcon(new ImageIcon(""));
                button.setBounds(180+column*100, 70+row*90, 50, 50);
                frame.getContentPane().add(button);
                lights[column][row] = button;
            }
        }
        
        return lights;
    }
    
    private JButton[][] gameInterfaceBottons5x5 () {
    	lights = new JButton[5][5];
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                JButton button = new JButton("");
                
                button.setIcon(new ImageIcon(""));
                button.setBounds(140+column*100, 30+row*90, 50, 50);
                frame.getContentPane().add(button);
                lights[column][row] = button;
            }
        }
        
        return lights;
    }
    
    public JButton[][] getGameInterface3x3() {
    	return gameInterfaceBottons3x3();
    }
    public JButton[][] getGameInterface4x4() {
    	return gameInterfaceBottons4x4();
    }
    
    public JButton[][] getGameInterface5x5() {
    	return gameInterfaceBottons5x5();
    }
    
    
    
    private JLabel attemptsLabel() {
    	attemptsLabel = new JLabel("");
        attemptsLabel.setBounds(650, 361, 106, 30);
        frame.getContentPane().add(attemptsLabel);
		return attemptsLabel;
    }
    
    public JLabel getAttemtsLabel () {
    	return attemptsLabel();
    }
 
    
    
    public JButton getButtonEnter() {
    	return buttonEnter;
    }
  

	public JFrame getFrame() {
		return frame;
	}
	public JLabel getlabel() {
        return victoryLabel;
    }


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}

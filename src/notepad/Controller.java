package notepad;

import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Controller {
	
	private JFrame notepadFrame;
	private CustomMenuBar menuBar;
	private CustomTextArea textArea;
	
	public void initialize() {
		
		notepadFrame = new JFrame("Notepad");
		notepadFrame.setSize(500,500);
		
		menuBar = new CustomMenuBar();
		menuBar.initialize();
		
		textArea = new CustomTextArea();
		
		notepadFrame.add(textArea);
		notepadFrame.setJMenuBar(menuBar);
		notepadFrame.setVisible(true);
	
	}
}

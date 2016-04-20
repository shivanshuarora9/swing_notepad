package notepad;

import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Controller {
	
	private JFrame notepadFrame;
	private CustomMenuBar mb;
	private CustomTextArea text;
	
	public void initialize() {
		
		notepadFrame = new JFrame("Notepad");
		notepadFrame.setSize(500,500);
		
		mb = new CustomMenuBar();
		mb.initialize();
		
		text = new CustomTextArea();
		
		notepadFrame.add(text);
		notepadFrame.setJMenuBar(mb);
		notepadFrame.setVisible(true);
	
	}
}

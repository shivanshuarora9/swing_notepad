package notepad;

import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Controller {
	JFrame notepad_frame;
	MenuBar mb;
	TextArea text;
	
	Controller() {
		notepad_frame = new JFrame("Notepad");
		notepad_frame.setSize(500,500);
		mb = new MenuBar();
		text = new TextArea();
		
		//mb.setSize(500, 40);
		//mb.setBounds(0, 0, 500, 100);
		notepad_frame.setLayout(new BorderLayout());
		notepad_frame.add(mb,BorderLayout.NORTH);
		notepad_frame.add(text);
		
		
		notepad_frame.setVisible(true);
		
	}
}

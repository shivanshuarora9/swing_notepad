package notepad;

import javax.swing.JTextArea;

public class TextArea extends JTextArea {
	JTextArea text_area;
	
	TextArea() {
		text_area = new JTextArea();
		text_area.setLineWrap(true);
        text_area.setWrapStyleWord(true);
        
	}
	
	
}

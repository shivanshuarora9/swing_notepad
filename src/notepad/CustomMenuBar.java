package notepad;

import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class CustomMenuBar extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String FILE_MENU = "File";
	private static final String EDIT_MENU = "Edit";
	
    JMenu fileMenu;
    JMenu editMenu;
	
	public void initialize() {
		addMenuItems();
	}
	
	private void addMenuItems() {
		fileMenu = new JMenu(FILE_MENU);
		editMenu = new JMenu(EDIT_MENU);
		this.add(fileMenu);
		this.add(editMenu);
	}
}

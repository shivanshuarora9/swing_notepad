package notepad;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

interface BarItems {
	final public String Edit_menu = "Edit";
	final public String File_menu = "File";
}

public class MenuBar extends JMenuBar implements BarItems {
	JMenuBar menu_bar;
    JMenu fileMenu;
    JMenu editMenu;
	
	MenuBar() {
		menu_bar = new JMenuBar();
        fileMenu = new JMenu(File_menu);
        editMenu = new JMenu(Edit_menu);
		menu_bar.add(fileMenu);
		menu_bar.add(editMenu);
	}
}

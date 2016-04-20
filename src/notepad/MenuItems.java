package notepad;

import javax.swing.JMenuItem;
interface Items {
	final String cut_menu = "cut";
	final String copy_menu = "copy";
	final String paste_menu = "paste";
	final String selectall_menu = "selectall";
}

public class MenuItems implements Items{
	JMenuItem cut,copy,paste,selectall;
	
	MenuItems() {
		cut = new JMenuItem(cut_menu);
        copy = new JMenuItem(copy_menu);
        paste = new JMenuItem(paste_menu);
        selectall = new JMenuItem(selectall_menu);
  /*      
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);
    */    
	}
	
	
}

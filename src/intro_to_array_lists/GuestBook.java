package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame=new JFrame();
	JButton addname=new JButton("Add name");
	JButton viewname=new JButton("View name");
	ArrayList<String> names=new ArrayList<String>();
	String name=new String();
	public void run() {
	
			JPanel panel=new JPanel();
			frame.add(panel);
			panel.add(addname);
			panel.add(viewname);
			frame.setVisible(true);
			addname.addActionListener(this);
			viewname.addActionListener(this);
		
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addname) {
			name=JOptionPane.showInputDialog("Put your name in");
			
			names.add(name);
		}
		else if(e.getSource()==viewname) {
			for (int i = 0; i < names.size(); i++) {
				JOptionPane.showMessageDialog(null, names.get(i));
			}
		}
	}
}

package projectJava2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GDCFrame extends JFrame implements ActionListener {

	JPanel jPanel1;
	JTextArea textArea;
	JLabel label1, label2;;
	JTextField text1;
	JButton btn;
	GDC1 obj;

        // cons
	public GDCFrame(GDC1 gdc) {

		setTitle("GDC");
		setLocation(200, 10);
		setResizable(true); 
		this.pack(); 
		setSize(400, 600);
		

		obj = gdc;
		jPanel1 = new JPanel();
		jPanel1.setLayout(new GridLayout(5, 1)); // Grid Layout To Determine Rows And Columns 
		add(jPanel1); // Add a section of Containers

		textArea = new JTextArea(); 
		textArea.setColumns(20);
		textArea.setRows(40);
		textArea.setBorder(BorderFactory.createLineBorder(Color.black)); 
		textArea.setEditable(false); 
		jPanel1.add(textArea);

		label1 = new JLabel("Enter Customer id:");
		jPanel1.add(label1);

		text1 = new JTextField(); 
		jPanel1.add(text1);

		btn = new JButton("Click");
		jPanel1.add(btn);
		btn.addActionListener(this); // To go to the actionPerformed method

		label2 = new JLabel("");
		jPanel1.add(label2);

		printTextArea();
	}

	public void printTextArea(){
		textArea.setText(""); // must take string
                // For menu display
		textArea.append("1. Add a new customer\n2. Delete a customer\n" +
                        "3. Modify a customeres information\n4. Print the customers information\n5. Exit\n");
		textArea.append(obj.toString() + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == (JButton) btn) {

			String id = text1.getText();
			int ID = Integer.parseInt(id); // Convert from string to int
			boolean isDeleted = obj.deleteCustomer(ID);

			if (isDeleted) {
				label2.setText("");
				label2.setText("Deleted The Customer Correctly");
			} else {
				label2.setText("");
				label2.setText("The customer cannot be deleted! Enter an existed customer:");
			}

                        // Update on textArea
			printTextArea();
		}
	}

}
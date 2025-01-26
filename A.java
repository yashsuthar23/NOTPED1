package m;

//import packages

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("Notepad");
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.jpeg");
		frame.setIconImage(icon);

		MenuBar menuBar = new MenuBar();

		Menu menu = new Menu("File");

		frame.setFont(new Font("Monospaced", 0, 12));

		JTextArea area = new JTextArea();

		frame.add(area);
		frame.setLayout(new BoxLayout(frame, 0));
		area.setBackground(Color.CYAN);

		MenuItem menuItem = new MenuItem("New Window      Ctrl+Shift+N");
		MenuItem menuItem10 = new MenuItem("Save                  Ctrl+S");
		MenuItem menuItem2 = new MenuItem("New                   Ctrl+N");
		MenuItem menuItem3 = new MenuItem("Open                  Ctrl+O");
		MenuItem menuItem11 = new MenuItem("Save As         Ctrl+Shift+S");
		MenuItem menuItem13 = new MenuItem("Print...              Ctrl+P");

		// New Window ------------->
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame ne = new Frame();

				ne.setIconImage(icon);

				Button button = new Button("Click me");
				button.setBounds(50, 80, 100, 30);
				button.setBounds(100, 100, 80, 30);
				ne.setBackground(Color.blue);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Button Clicked");
					}
				});

				ne.add(button);
				ne.setSize(300, 300);
				ne.setLayout(null);
				ne.setVisible(true);

				ne.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						ne.dispose();
					}

				});
			}
		});

		// Save ------------->
		menuItem10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame frame3 = new Frame("Item Listener");
				frame3.setIconImage(icon);

				Label label = new Label();
				label.setBounds(20, 100, 120, 80);

				Checkbox checkbox1 = new Checkbox("Forntend");
				checkbox1.setBounds(20, 80, 100, 30);
				Checkbox checkbox2 = new Checkbox("Backend");
				checkbox2.setBounds(20, 100, 100, 30);

				checkbox1.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						String state = checkbox1.getState() ? "Frontend" : "Deselected";
						label.setText("Option 1: " + state);
						System.out.println("Option 1: " + state);

					}
				});
				checkbox2.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						String state = checkbox2.getState() ? "Backend" : "Deselected";
						label.setText("Option 2: " + state);
						System.out.println("Option 2: " + state);
					}
				});

				frame3.add(checkbox1);
				frame3.add(checkbox2);
				frame3.add(label);

				frame3.setSize(300, 300);
				frame3.setLayout(null);
				frame3.setVisible(true);

				frame3.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						frame3.dispose();
					}

				});
			}
		});

		// New ------------->
		menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame n = new Frame();
				n.setIconImage(icon);

				Button button = new Button("Click me");
				button.setBounds(50, 80, 100, 30);
				button.setBounds(100, 100, 80, 30);
				button.setBackground(Color.green);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Button Clicked");
					}
				});

				n.add(button);
				n.setSize(300, 300);
				n.setLayout(null);
				n.setVisible(true);

				n.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						n.dispose();
					}

				});
			}
		});

		// Open ------------->
		menuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame ff = new Frame();
				ff.setIconImage(icon);

				Button button = new Button("Click me");
				button.setBounds(50, 80, 100, 30);
				button.setBounds(100, 100, 80, 30);
				button.setBackground(Color.red);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Button Clicked");
					}
				});

				ff.add(button);
				ff.setSize(300, 300);
				ff.setLayout(null);
				ff.setVisible(true);

				ff.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						ff.dispose();
					}

				});
			}
		});

		// Save As ------------->
		menuItem11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JFrame f = new JFrame();
				f.setIconImage(icon);
				JTextArea ta = new JTextArea(200, 200);
				JPanel p1 = new JPanel();
				p1.add(ta);
				JPanel p2 = new JPanel();
				JPanel p3 = new JPanel();
				JPanel p4 = new JPanel();
				JPanel p5 = new JPanel();
				JTabbedPane tp = new JTabbedPane();
				tp.setBounds(50, 50, 200, 200);

				tp.add("Main", p1);
				tp.add("Visit", p2);
				tp.add("Help", p3);
				tp.add("Home", p4);
				tp.add("help", p5);
				tp.setBackground(Color.red);
				p2.setBackground(Color.blue);
				p3.setBackground(Color.cyan);
				p4.setBackground(Color.GRAY);
				f.add(tp);
				f.setSize(400, 400);
				f.setLayout(null);
				f.setVisible(true);

				f.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f.dispose();
					}

				});
			}
		});

		// Page Setup ------------->
		MenuItem menuItem12 = new MenuItem("Page Setup..");
		menuItem12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame f1 = new Frame("Menu and Sub Menu");
				f1.setIconImage(icon);

				MenuBar mb = new MenuBar();
				Menu men = new Menu("Menu");
				Menu submenu = new Menu("Sub Menu");
				MenuItem i1 = new MenuItem("Item 1");
				MenuItem i2 = new MenuItem("Item 2");
				MenuItem i3 = new MenuItem("Item 3");
				MenuItem i4 = new MenuItem("Item 4");
				MenuItem i5 = new MenuItem("Item 5");

				men.add(i1);
				men.add(i2);
				men.add(i3);
				submenu.add(i4);
				submenu.add(i5);
				men.add(submenu);

				mb.add(men);
				f1.setMenuBar(mb);
				f1.setSize(300, 200);
				f1.setBackground(Color.MAGENTA);
				f1.setLayout(null);
				f1.setVisible(true);

				f1.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f1.dispose();
					}

				});
			}
		});

		// Print... ------------->
		menuItem13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JFrame f3 = new JFrame();

				f3.setIconImage(icon);

				final JLabel label = new JLabel();
				label.setBounds(20, 150, 200, 50);

				final JPasswordField value = new JPasswordField();
				value.setBounds(100, 75, 100, 30);

				JLabel l1 = new JLabel("Username:");
				l1.setBounds(20, 20, 80, 30);

				JLabel l2 = new JLabel("Password:");
				l2.setBounds(20, 75, 80, 30);

				JButton b = new JButton("Login");
				b.setBounds(100, 120, 80, 30);

				final JTextField text = new JTextField();
				text.setBounds(100, 20, 100, 30);
				f3.add(value);
				f3.add(l1);
				f3.add(label);
				f3.add(l2);
				f3.add(b);
				f3.add(text);
				f3.setSize(300, 300);
				f3.setLayout(null);
				f3.setVisible(true);
				b.setBackground(Color.CYAN);

				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String data = "Username " + text.getText();
						data += ", Password: " + new String(value.getPassword());
						label.setText(data);
					}
				});
				f3.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f3.dispose();
					}

				});
			}
		});

		MenuItem menuItem14 = new MenuItem("Exit");
		menuItem14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// Menu item add

		Menu menu1 = new Menu("Edit");
		MenuItem menuIte = new MenuItem("Undo              Ctrl+Z");

		menuIte.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JFrame f5 = new JFrame();

				f5.setIconImage(icon);

				final JLabel label = new JLabel();
				label.setBounds(20, 150, 200, 50);

				final JPasswordField value = new JPasswordField();
				value.setBounds(100, 75, 100, 30);

				JLabel l1 = new JLabel("Username:");
				l1.setBounds(20, 20, 80, 30);

				JLabel l2 = new JLabel("Password:");
				l2.setBounds(20, 75, 80, 30);

				JButton b = new JButton("Login");
				b.setBounds(100, 120, 80, 30);

				final JTextField text = new JTextField();
				text.setBounds(100, 20, 100, 30);
				f5.add(value);
				f5.add(l1);
				f5.add(label);
				f5.add(l2);
				f5.add(b);
				f5.add(text);
				f5.setSize(300, 300);
				f5.setLayout(null);
				f5.setVisible(true);
				b.setBackground(Color.CYAN);

				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String data = "Username " + text.getText();
						data += ", Password: " + new String(value.getPassword());
						label.setText(data);
					}
				});
				f5.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						f5.dispose();
					}

				});
			}
		});

		MenuItem menuIte2 = new MenuItem("Cut               Ctrl+X");
		MenuItem menuIte3 = new MenuItem("Copy              Ctrl+C");
		MenuItem menuIte15 = new MenuItem("Paste             Ctrl+V");
		MenuItem menuIte16 = new MenuItem("Delete               Del");
		MenuItem menuIte17 = new MenuItem("Search with Bing  Ctrl+E");
		MenuItem menuIte18 = new MenuItem("Find...           Ctrl+F");
		MenuItem menuIte19 = new MenuItem("Find Next             F3");
		MenuItem menuIte20 = new MenuItem("Find Previous   Shift+F3");
		MenuItem menuIte21 = new MenuItem("Replace..         Ctrl+H");
		MenuItem menuIte22 = new MenuItem("Go To..           Ctrl+G");
		MenuItem menuIte23 = new MenuItem("Select All        Ctrl+A");
		MenuItem menuIte24 = new MenuItem("Time/Date             F5");

		Menu menu2 = new Menu("Format");
		MenuItem menuItem4 = new MenuItem("Word Wrap");

		MenuItem menuItem5 = new MenuItem("Font...");
		menuItem5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Frame t = new Frame();
				t.setIconImage(icon);

				Button button = new Button("Click me");
				button.setBounds(50, 80, 100, 30);
				button.setBounds(100, 100, 80, 30);
				button.setBackground(Color.green);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Button Clicked");
					}
				});

				t.add(button);
				t.setSize(300, 300);
				t.setLayout(null);
				t.setVisible(true);

				t.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						t.dispose();
					}

				});
			}
		});

		Menu menu3 = new Menu("View");
		Menu subme = new Menu("Zoom");
		MenuItem v4 = new MenuItem("Zoom In                  Ctrl+Plus");
		MenuItem v5 = new MenuItem("Zoom Out                Ctrl+Minus");
		MenuItem v6 = new MenuItem("Restore Default Zoom        Ctrl+0");

		MenuItem menuItem8 = new MenuItem("Status Bar");

//		MenuItem menuItem7 = new MenuItem("Zoom");
//		MenuItem menuItem9 = new MenuItem();
//		MenuItem menuItem6 = new MenuItem();
//		MenuItem MenuItem25 = new MenuItem();
//		

		// Create a "Help" menu
		Menu menu4 = new Menu("Help");
		MenuItem open = new MenuItem("View Help");
		MenuItem save = new MenuItem("Send Feedback");
		MenuItem about = new MenuItem("About Notepad");

		// Create an "Exit" menu item with an action listener
		MenuItem exitItem = new MenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuBar.add(menu);

		menu.add(menuItem2);
		menu.add(menuItem);
		menu.add(menuItem3);
		menu.add(menuItem10);
		menu.add(menuItem11);
		menu.addSeparator();
		menu.add(menuItem12);
		menu.add(menuItem13);

		menu.addSeparator();
		menu.add(menuItem14);

		menuBar.add(menu1);
		menu1.add(menuIte);
		menu1.add(menuIte2);
		menu1.add(menuIte3);

		menu1.add(menuIte15);
		menu1.add(menuIte16);
		menu1.add(menuIte17);
		menu1.add(menuIte18);
		menu1.add(menuIte19);
		menu1.add(menuIte20);
		menu1.add(menuIte21);
		menu1.add(menuIte22);
		menu1.add(menuIte23);
		menu1.add(menuIte24);

		menuBar.add(menu2);
		menu2.add(menuItem4);
		menu2.add(menuItem5);

		menuBar.add(menu3);
		subme.add(v4);
		subme.add(v5);
		subme.add(v6);

		menu3.add(subme);

//		menu3.add(menuItem7);
		menu3.add(menuItem8);
//		menu3.add(menuItem9);
//		menu3.add(menuItem6);
//		menu3.add(MenuItem25);
//		
		menuBar.add(menu4);
		menu4.add(open);
		menu4.add(save);
		menu4.add(about);
		menu4.addSeparator();
		menu4.add(exitItem);

		frame.setMenuBar(menuBar);
		frame.setSize(300, 300);
//		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressBarOptus {

	static JFrame frmMain;

	static Container pane;
	static JComboBox combo;
	static JProgressBar PBar;
	static JProgressBar PBar1;
	static JProgressBar PBar2;

	static int count = 25;
	static int count1 = 50;
	static int count2 = 75;

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		frmMain = new JFrame("Progress Bar");

		frmMain.setSize(400, 400);

		pane = frmMain.getContentPane();

		String course[] = { "#progresBar1", "#progresBar2", "#progresBar3" };

		pane.setLayout(null);

		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JButton button = new JButton("-25");
		final JButton button1 = new JButton("-10");
		final JButton button2 = new JButton("+10");
		final JButton button3 = new JButton("+25");

		PBar = new JProgressBar(0, 100);
		PBar.setName("#progresBar1");
		PBar1 = new JProgressBar(0, 100);
		PBar.setName("#progresBar2");
		PBar2 = new JProgressBar(0, 100);
		PBar2.setName("#progresBar3");
		PBar.setValue(count);
		UIManager.put("PBar.selectionBackground", Color.BLUE);
		PBar1.setValue(count1);
		UIManager.put("PBar.selectionBackground", Color.BLUE);
		PBar2.setValue(count2);
		UIManager.put("PBar.selectionBackground", Color.BLUE);
		combo = new JComboBox(course);
		PBar.setStringPainted(true);
		PBar1.setStringPainted(true);
		PBar2.setStringPainted(true);

		pane.add(button);
		pane.add(PBar);
		pane.add(button1);
		pane.add(PBar1);
		pane.add(button2);
		pane.add(PBar2);
		pane.add(button3);
		pane.add(combo);

		PBar.setBounds(10, 10, 280, 20);
		button.setBounds(10, 110, 70, 25);
		PBar1.setBounds(10, 40, 280, 20);
		PBar2.setBounds(10, 70, 280, 20);
		button1.setBounds(90, 110, 70, 25);
		button2.setBounds(170, 110, 70, 25);
		button3.setBounds(250, 110, 70, 25);
		combo.setBounds(10, 150, 100, 25);
		frmMain.setResizable(false);
		frmMain.setVisible(true);

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					String str = (String) combo.getSelectedItem();
					System.out.println("Inside button do" + str.toString());

					if (str.equals("#progresBar1")) {

						int current = count;
						int temp = (current - 25);
						if (temp >= 0) {
							count = temp;
							if (temp >= 100) {
								PBar.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar.setString(s + "%");
							} else if (temp < 100) {
								PBar.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar.setString(s + "%");
							}
						} else if (temp < 0) {
							count = 0;
							PBar.setString("0%");

						}

						PBar.setValue(count);

					}

					if (str.equals("#progresBar2")) {

						int current = count1;
						int temp = (current - 25);
						if (temp >= 0) {
							count1 = temp;
							if (temp >= 100) {
								PBar1.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar1.setString(s + "%");
							} else if (temp < 100) {
								PBar1.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar1.setString(s + "%");
							}
						} else if (temp < 0) {
							count1 = 0;
							PBar1.setString("0%");

						}

						PBar1.setValue(count1);

					}
					if (str.equals("#progresBar3")) {

						int current = count2;
						int temp = (current - 25);
						if (temp >= 0) {
							count2 = temp;
							if (temp >= 100) {
								PBar2.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar2.setString(s + "%");
							} else if (temp < 100) {
								PBar2.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar2.setString(s + "%");
							}
						} else if (temp < 0) {
							count2 = 0;
							PBar2.setString("0%");

						}

						PBar2.setValue(count2);

					}
				}
			}
		});
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button1) {

					String str = (String) combo.getSelectedItem();
					System.out.println("Inside button do" + str.toString());

					if (str.equals("#progresBar1")) {

						int current = count;
						int temp = (current - 10);
						if (temp >= 0) {
							count = temp;
							if (temp >= 100) {
								PBar.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar.setString(s + "%");
							} else if (temp < 100) {
								PBar.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar.setString(s + "%");
							}
						} else if (temp < 0) {
							count = 0;
							PBar.setString("0%");

						}

						PBar.setValue(count);

					}

					if (str.equals("#progresBar2")) {

						int current = count1;
						int temp = (current - 10);
						if (temp >= 0) {
							count1 = temp;
							if (temp >= 100) {
								PBar1.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar1.setString(s + "%");
							} else if (temp < 100) {
								PBar1.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar1.setString(s + "%");
							}
						} else if (temp < 0) {
							count1 = 0;
							PBar1.setString("0%");

						}

						PBar1.setValue(count1);

					}
					if (str.equals("#progresBar3")) {

						int current = count2;
						int temp = (current - 10);
						if (temp >= 0) {
							count2 = temp;
							if (temp >= 100) {
								PBar2.setForeground(Color.RED);

								String s = "";
								s = "" + temp + "";
								PBar2.setString(s + "%");
							} else if (temp < 100) {
								PBar2.setForeground(Color.BLUE);

								String s = "";
								s = "" + temp + "";
								PBar2.setString(s + "%");
							}
						} else if (temp < 0) {
							count2 = 0;
							PBar2.setString("0%");

						}

						PBar2.setValue(count2);

					}

				}
			}
		});
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button2) {

					String str = (String) combo.getSelectedItem();
					System.out.println("Inside button do" + str.toString());

					if (str.equals("#progresBar1")) {
						int current = count;

						int temp = (current + 10);
						count = temp;
						if (temp >= 100) {
							PBar.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar.setString(s + "%");
						} else if (temp > 0) {
							PBar.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar.setString(s + "%");
						}
						PBar.setValue(count);

					}

					if (str.equals("#progresBar2")) {

						int current = count1;

						int temp = (current + 10);
						count1 = temp;
						if (temp >= 100) {
							PBar1.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar1.setString(s + "%");
						} else if (temp > 0) {
							PBar1.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar1.setString(s + "%");
						}
						PBar1.setValue(count1);

					}
					if (str.equals("#progresBar3")) {

						int current = count2;

						int temp = (current + 10);
						count2 = temp;
						if (temp >= 100) {
							PBar2.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar2.setString(s + "%");
						} else if (temp > 0) {
							PBar2.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar2.setString(s + "%");
						}
						PBar2.setValue(count2);

					}

				}
			}
		});
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button3) {

					String str = (String) combo.getSelectedItem();
					System.out.println("Inside button do" + str.toString());

					if (str.equals("#progresBar1")) {
						int current = count;

						int temp = (current + 25);
						count = temp;
						if (temp >= 100) {
							PBar.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar.setString(s + "%");
						} else if (temp > 0) {
							PBar.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar.setString(s + "%");
						}
						PBar.setValue(count);

					}

					if (str.equals("#progresBar2")) {
						int current = count1;

						int temp = (current + 25);
						count1 = temp;
						if (temp >= 100) {
							PBar1.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar1.setString(s + "%");
						} else if (temp > 0) {
							PBar1.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar1.setString(s + "%");
						}
						PBar1.setValue(count1);

					}
					if (str.equals("#progresBar3")) {

						int current = count2;

						int temp = (current + 25);
						count2 = temp;
						if (temp >= 100) {
							PBar2.setForeground(Color.RED);

							String s = "";
							s = "" + temp + "";
							PBar2.setString(s + "%");
						} else if (temp > 0) {
							PBar2.setForeground(Color.BLUE);

							String s = "";
							s = "" + temp + "";
							PBar2.setString(s + "%");
						}
						PBar2.setValue(count2);

					}
				}
			}
		});
	}

	public static String selectedString(ItemSelectable is) {
		Object selected[] = is.getSelectedObjects();
		return ((selected.length == 0) ? "null" : (String) selected[0]);
	}
}

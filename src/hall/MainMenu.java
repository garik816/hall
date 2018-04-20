package hall;

// TODO сделать ввод/вывод настроек из/в файл
//		сделать вывод в картинку


import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class MainMenu {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	
	public Color currentColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1009, 878);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/hall_768.jpg")).getImage();
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(824, 21, 34, 23);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(824, 51, 34, 23);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(824, 83, 34, 23);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(824, 114, 34, 23);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(824, 145, 34, 23);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(824, 176, 34, 23);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(824, 207, 34, 23);
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(824, 238, 34, 23);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(824, 269, 34, 23);
		frame.getContentPane().add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(824, 300, 34, 23);
		frame.getContentPane().add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(824, 331, 34, 23);
		frame.getContentPane().add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(824, 362, 34, 23);
		frame.getContentPane().add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(824, 393, 34, 23);
		frame.getContentPane().add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(824, 424, 34, 23);
		frame.getContentPane().add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(824, 455, 34, 23);
		frame.getContentPane().add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(824, 486, 34, 23);
		frame.getContentPane().add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(824, 517, 34, 23);
		frame.getContentPane().add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(824, 547, 34, 23);
		frame.getContentPane().add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(824, 579, 34, 23);
		frame.getContentPane().add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(824, 610, 34, 23);
		frame.getContentPane().add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(824, 641, 34, 23);
		frame.getContentPane().add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(824, 672, 34, 23);
		frame.getContentPane().add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBounds(824, 703, 34, 23);
		frame.getContentPane().add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBounds(824, 734, 34, 23);
		frame.getContentPane().add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBounds(824, 765, 34, 23);
		frame.getContentPane().add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBounds(824, 796, 34, 23);
		frame.getContentPane().add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_27.setBackground(currentColor);
			}
		});
		panel_27.setBounds(203, 192, 10, 16);
		frame.getContentPane().add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_28.setBackground(currentColor);
			}
		});
		panel_28.setBounds(203, 225, 10, 16);
		frame.getContentPane().add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_29.setBackground(currentColor);
			}
		});
		panel_29.setBounds(203, 256, 10, 16);
		frame.getContentPane().add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_30.setBackground(currentColor);
			}
		});
		panel_30.setBounds(203, 288, 10, 16);
		frame.getContentPane().add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_31.setBackground(currentColor);
			}
		});
		panel_31.setBounds(223, 192, 10, 16);
		frame.getContentPane().add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_32.setBackground(currentColor);
			}
		});
		panel_32.setBounds(223, 225, 10, 16);
		frame.getContentPane().add(panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_33.setBackground(currentColor);
			}
		});
		panel_33.setBounds(223, 256, 10, 16);
		frame.getContentPane().add(panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_34.setBackground(currentColor);
			}
		});
		panel_34.setBounds(223, 288, 10, 16);
		frame.getContentPane().add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_35.setBackground(currentColor);
			}
		});
		panel_35.setBounds(244, 192, 10, 16);
		frame.getContentPane().add(panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_36.setBackground(currentColor);
			}
		});
		panel_36.setBounds(244, 225, 10, 16);
		frame.getContentPane().add(panel_36);
		
		JPanel panel_37 = new JPanel();
		panel_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_37.setBackground(currentColor);
			}
		});
		panel_37.setBounds(244, 256, 10, 16);
		frame.getContentPane().add(panel_37);
		
		JPanel panel_38 = new JPanel();
		panel_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_38.setBackground(currentColor);
			}
		});
		panel_38.setBounds(244, 288, 10, 16);
		frame.getContentPane().add(panel_38);
		
		JPanel panel_39 = new JPanel();
		panel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_39.setBackground(currentColor);
			}
		});
		panel_39.setBounds(266, 192, 10, 16);
		frame.getContentPane().add(panel_39);
		
		JPanel panel_40 = new JPanel();
		panel_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_40.setBackground(currentColor);
			}
		});
		panel_40.setBounds(266, 225, 10, 16);
		frame.getContentPane().add(panel_40);
		
		JPanel panel_41 = new JPanel();
		panel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_41.setBackground(currentColor);
			}
		});
		panel_41.setBounds(266, 256, 10, 16);
		frame.getContentPane().add(panel_41);
		
		JPanel panel_42 = new JPanel();
		panel_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_42.setBackground(currentColor);
			}
		});
		panel_42.setBounds(266, 288, 10, 16);
		frame.getContentPane().add(panel_42);
		
		JPanel panel_43 = new JPanel();
		panel_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_43.setBackground(currentColor);
			}
		});
		panel_43.setBounds(286, 192, 10, 16);
		frame.getContentPane().add(panel_43);
		
		JPanel panel_44 = new JPanel();
		panel_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_44.setBackground(currentColor);
			}
		});
		panel_44.setBounds(286, 225, 10, 16);
		frame.getContentPane().add(panel_44);
		
		JPanel panel_45 = new JPanel();
		panel_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_45.setBackground(currentColor);
			}
		});
		panel_45.setBounds(286, 256, 10, 16);
		frame.getContentPane().add(panel_45);
		
		JPanel panel_46 = new JPanel();
		panel_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_46.setBackground(currentColor);
			}
		});
		panel_46.setBounds(286, 288, 10, 16);
		frame.getContentPane().add(panel_46);
		
		JPanel panel_47 = new JPanel();
		panel_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_47.setBackground(currentColor);
			}
		});
		panel_47.setBounds(307, 192, 10, 16);
		frame.getContentPane().add(panel_47);
		
		JPanel panel_48 = new JPanel();
		panel_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_48.setBackground(currentColor);
			}
		});
		panel_48.setBounds(307, 225, 10, 16);
		frame.getContentPane().add(panel_48);
		
		JPanel panel_49 = new JPanel();
		panel_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_49.setBackground(currentColor);
			}
		});
		panel_49.setBounds(307, 256, 10, 16);
		frame.getContentPane().add(panel_49);
		
		JPanel panel_50 = new JPanel();
		panel_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_50.setBackground(currentColor);
			}
		});
		panel_50.setBounds(307, 288, 10, 16);
		frame.getContentPane().add(panel_50);
		
		JPanel panel_51 = new JPanel();
		panel_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_51.setBackground(currentColor);
			}
		});
		panel_51.setBounds(328, 192, 10, 16);
		frame.getContentPane().add(panel_51);
		
		JPanel panel_52 = new JPanel();
		panel_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_52.setBackground(currentColor);
			}
		});
		panel_52.setBounds(328, 225, 10, 16);
		frame.getContentPane().add(panel_52);
		
		JPanel panel_53 = new JPanel();
		panel_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_53.setBackground(currentColor);
			}
		});
		panel_53.setBounds(328, 256, 10, 16);
		frame.getContentPane().add(panel_53);
		
		JPanel panel_54 = new JPanel();
		panel_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_54.setBackground(currentColor);
			}
		});
		panel_54.setBounds(328, 288, 10, 16);
		frame.getContentPane().add(panel_54);
		
		JPanel panel_55 = new JPanel();
		panel_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_55.setBackground(currentColor);
			}
		});
		panel_55.setBounds(348, 192, 10, 16);
		frame.getContentPane().add(panel_55);
		
		JPanel panel_56 = new JPanel();
		panel_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_56.setBackground(currentColor);
			}
		});
		panel_56.setBounds(348, 225, 10, 16);
		frame.getContentPane().add(panel_56);
		
		JPanel panel_57 = new JPanel();
		panel_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_57.setBackground(currentColor);
			}
		});
		panel_57.setBounds(348, 256, 10, 16);
		frame.getContentPane().add(panel_57);
		
		JPanel panel_58 = new JPanel();
		panel_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_58.setBackground(currentColor);
			}
		});
		panel_58.setBounds(348, 288, 10, 16);
		frame.getContentPane().add(panel_58);
		
		JPanel panel_59 = new JPanel();
		panel_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_59.setBackground(currentColor);
			}
		});
		panel_59.setBounds(369, 192, 10, 16);
		frame.getContentPane().add(panel_59);
		
		JPanel panel_60 = new JPanel();
		panel_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_60.setBackground(currentColor);
			}
		});
		panel_60.setBounds(369, 225, 10, 16);
		frame.getContentPane().add(panel_60);
		
		JPanel panel_61 = new JPanel();
		panel_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_61.setBackground(currentColor);
			}
		});
		panel_61.setBounds(369, 256, 10, 16);
		frame.getContentPane().add(panel_61);
		
		JPanel panel_62 = new JPanel();
		panel_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_62.setBackground(currentColor);
			}
		});
		panel_62.setBounds(369, 288, 10, 16);
		frame.getContentPane().add(panel_62);
		
		JPanel panel_63 = new JPanel();
		panel_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_63.setBackground(currentColor);
			}
		});
		panel_63.setBounds(391, 192, 10, 16);
		frame.getContentPane().add(panel_63);
		
		JPanel panel_64 = new JPanel();
		panel_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_64.setBackground(currentColor);
			}
		});
		panel_64.setBounds(391, 225, 10, 16);
		frame.getContentPane().add(panel_64);
		
		JPanel panel_65 = new JPanel();
		panel_65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_65.setBackground(currentColor);
			}
		});
		panel_65.setBounds(391, 256, 10, 16);
		frame.getContentPane().add(panel_65);
		
		JPanel panel_66 = new JPanel();
		panel_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_66.setBackground(currentColor);
			}
		});
		panel_66.setBounds(391, 288, 10, 16);
		frame.getContentPane().add(panel_66);
		
		JPanel panel_67 = new JPanel();
		panel_67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_67.setBackground(currentColor);
			}
		});
		panel_67.setBounds(411, 192, 10, 16);
		frame.getContentPane().add(panel_67);
		
		JPanel panel_68 = new JPanel();
		panel_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_68.setBackground(currentColor);
			}
		});
		panel_68.setBounds(411, 225, 10, 16);
		frame.getContentPane().add(panel_68);
		
		JPanel panel_69 = new JPanel();
		panel_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_69.setBackground(currentColor);
			}
		});
		panel_69.setBounds(411, 256, 10, 16);
		frame.getContentPane().add(panel_69);
		
		JPanel panel_70 = new JPanel();
		panel_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_70.setBackground(currentColor);
			}
		});
		panel_70.setBounds(411, 288, 10, 16);
		frame.getContentPane().add(panel_70);
		
		JPanel panel_71 = new JPanel();
		panel_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_71.setBackground(currentColor);
			}
		});
		panel_71.setBounds(432, 192, 10, 16);
		frame.getContentPane().add(panel_71);
		
		JPanel panel_72 = new JPanel();
		panel_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_72.setBackground(currentColor);
			}
		});
		panel_72.setBounds(432, 225, 10, 16);
		frame.getContentPane().add(panel_72);
		
		JPanel panel_73 = new JPanel();
		panel_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_73.setBackground(currentColor);
			}
		});
		panel_73.setBounds(432, 256, 10, 16);
		frame.getContentPane().add(panel_73);
		
		JPanel panel_74 = new JPanel();
		panel_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_74.setBackground(currentColor);
			}
		});
		panel_74.setBounds(432, 288, 10, 16);
		frame.getContentPane().add(panel_74);
		
		JPanel panel_75 = new JPanel();
		panel_75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_75.setBackground(currentColor);
			}
		});
		panel_75.setBounds(454, 192, 10, 16);
		frame.getContentPane().add(panel_75);
		
		JPanel panel_76 = new JPanel();
		panel_76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_76.setBackground(currentColor);
			}
		});
		panel_76.setBounds(454, 225, 10, 16);
		frame.getContentPane().add(panel_76);
		
		JPanel panel_77 = new JPanel();
		panel_77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_77.setBackground(currentColor);
			}
		});
		panel_77.setBounds(454, 256, 10, 16);
		frame.getContentPane().add(panel_77);
		
		JPanel panel_78 = new JPanel();
		panel_78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_78.setBackground(currentColor);
			}
		});
		panel_78.setBounds(454, 288, 10, 16);
		frame.getContentPane().add(panel_78);
		
		JPanel panel_79 = new JPanel();
		panel_79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_79.setBackground(currentColor);
			}
		});
		panel_79.setBounds(474, 192, 10, 16);
		frame.getContentPane().add(panel_79);
		
		JPanel panel_80 = new JPanel();
		panel_80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_80.setBackground(currentColor);
			}
		});
		panel_80.setBounds(474, 225, 10, 16);
		frame.getContentPane().add(panel_80);
		
		JPanel panel_81 = new JPanel();
		panel_81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_81.setBackground(currentColor);
			}
		});
		panel_81.setBounds(474, 256, 10, 16);
		frame.getContentPane().add(panel_81);
		
		JPanel panel_82 = new JPanel();
		panel_82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_82.setBackground(currentColor);
			}
		});
		panel_82.setBounds(474, 288, 10, 16);
		frame.getContentPane().add(panel_82);
		
		JPanel panel_83 = new JPanel();
		panel_83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_83.setBackground(currentColor);
			}
		});
		panel_83.setBounds(495, 192, 10, 16);
		frame.getContentPane().add(panel_83);
		
		JPanel panel_84 = new JPanel();
		panel_84.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_84.setBackground(currentColor);
			}
		});
		panel_84.setBounds(495, 225, 10, 16);
		frame.getContentPane().add(panel_84);
		
		JPanel panel_85 = new JPanel();
		panel_85.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_85.setBackground(currentColor);
			}
		});
		panel_85.setBounds(495, 256, 10, 16);
		frame.getContentPane().add(panel_85);
		
		JPanel panel_86 = new JPanel();
		panel_86.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_86.setBackground(currentColor);
			}
		});
		panel_86.setBounds(495, 288, 10, 16);
		frame.getContentPane().add(panel_86);
		
		JPanel panel_87 = new JPanel();
		panel_87.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_87.setBackground(currentColor);
			}
		});
		panel_87.setBounds(203, 378, 10, 16);
		frame.getContentPane().add(panel_87);
		
		JPanel panel_88 = new JPanel();
		panel_88.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_88.setBackground(currentColor);
			}
		});
		panel_88.setBounds(203, 411, 10, 16);
		frame.getContentPane().add(panel_88);
		
		JPanel panel_89 = new JPanel();
		panel_89.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_89.setBackground(currentColor);
			}
		});
		panel_89.setBounds(203, 442, 10, 16);
		frame.getContentPane().add(panel_89);
		
		JPanel panel_90 = new JPanel();
		panel_90.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_90.setBackground(currentColor);
			}
		});
		panel_90.setBounds(203, 474, 10, 16);
		frame.getContentPane().add(panel_90);
		
		JPanel panel_91 = new JPanel();
		panel_91.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_91.setBackground(currentColor);
			}
		});
		panel_91.setBounds(223, 378, 10, 16);
		frame.getContentPane().add(panel_91);
		
		JPanel panel_92 = new JPanel();
		panel_92.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_92.setBackground(currentColor);
			}
		});
		panel_92.setBounds(223, 411, 10, 16);
		frame.getContentPane().add(panel_92);
		
		JPanel panel_93 = new JPanel();
		panel_93.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_93.setBackground(currentColor);
			}
		});
		panel_93.setBounds(223, 442, 10, 16);
		frame.getContentPane().add(panel_93);
		
		JPanel panel_94 = new JPanel();
		panel_94.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_94.setBackground(currentColor);
			}
		});
		panel_94.setBounds(223, 474, 10, 16);
		frame.getContentPane().add(panel_94);
		
		JPanel panel_95 = new JPanel();
		panel_95.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_95.setBackground(currentColor);
			}
		});
		panel_95.setBounds(244, 378, 10, 16);
		frame.getContentPane().add(panel_95);
		
		JPanel panel_96 = new JPanel();
		panel_96.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_96.setBackground(currentColor);
			}
		});
		panel_96.setBounds(244, 411, 10, 16);
		frame.getContentPane().add(panel_96);
		
		JPanel panel_97 = new JPanel();
		panel_97.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_97.setBackground(currentColor);
			}
		});
		panel_97.setBounds(244, 442, 10, 16);
		frame.getContentPane().add(panel_97);
		
		JPanel panel_98 = new JPanel();
		panel_98.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_98.setBackground(currentColor);
			}
		});
		panel_98.setBounds(244, 474, 10, 16);
		frame.getContentPane().add(panel_98);
		
		JPanel panel_99 = new JPanel();
		panel_99.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_99.setBackground(currentColor);
			}
		});
		panel_99.setBounds(266, 378, 10, 16);
		frame.getContentPane().add(panel_99);
		
		JPanel panel_100 = new JPanel();
		panel_100.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_100.setBackground(currentColor);
			}
		});
		panel_100.setBounds(266, 411, 10, 16);
		frame.getContentPane().add(panel_100);
		
		JPanel panel_101 = new JPanel();
		panel_101.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_101.setBackground(currentColor);
			}
		});
		panel_101.setBounds(266, 442, 10, 16);
		frame.getContentPane().add(panel_101);
		
		JPanel panel_102 = new JPanel();
		panel_102.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_102.setBackground(currentColor);
			}
		});
		panel_102.setBounds(266, 474, 10, 16);
		frame.getContentPane().add(panel_102);
		
		JPanel panel_103 = new JPanel();
		panel_103.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_103.setBackground(currentColor);
			}
		});
		panel_103.setBounds(286, 378, 10, 16);
		frame.getContentPane().add(panel_103);
		
		JPanel panel_104 = new JPanel();
		panel_104.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_104.setBackground(currentColor);
			}
		});
		panel_104.setBounds(286, 411, 10, 16);
		frame.getContentPane().add(panel_104);
		
		JPanel panel_105 = new JPanel();
		panel_105.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_105.setBackground(currentColor);
			}
		});
		panel_105.setBounds(286, 442, 10, 16);
		frame.getContentPane().add(panel_105);
		
		JPanel panel_106 = new JPanel();
		panel_106.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_106.setBackground(currentColor);
			}
		});
		panel_106.setBounds(286, 474, 10, 16);
		frame.getContentPane().add(panel_106);
		
		JPanel panel_107 = new JPanel();
		panel_107.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_107.setBackground(currentColor);
			}
		});
		panel_107.setBounds(307, 378, 10, 16);
		frame.getContentPane().add(panel_107);
		
		JPanel panel_108 = new JPanel();
		panel_108.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_108.setBackground(currentColor);
			}
		});
		panel_108.setBounds(307, 411, 10, 16);
		frame.getContentPane().add(panel_108);
		
		JPanel panel_109 = new JPanel();
		panel_109.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_109.setBackground(currentColor);
			}
		});
		panel_109.setBounds(307, 442, 10, 16);
		frame.getContentPane().add(panel_109);
		
		JPanel panel_110 = new JPanel();
		panel_110.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_110.setBackground(currentColor);
			}
		});
		panel_110.setBounds(307, 474, 10, 16);
		frame.getContentPane().add(panel_110);
		
		JPanel panel_111 = new JPanel();
		panel_111.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_111.setBackground(currentColor);
			}
		});
		panel_111.setBounds(329, 378, 10, 16);
		frame.getContentPane().add(panel_111);
		
		JPanel panel_112 = new JPanel();
		panel_112.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_112.setBackground(currentColor);
			}
		});
		panel_112.setBounds(329, 411, 10, 16);
		frame.getContentPane().add(panel_112);
		
		JPanel panel_113 = new JPanel();
		panel_113.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_113.setBackground(currentColor);
			}
		});
		panel_113.setBounds(329, 442, 10, 16);
		frame.getContentPane().add(panel_113);
		
		JPanel panel_114 = new JPanel();
		panel_114.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_114.setBackground(currentColor);
			}
		});
		panel_114.setBounds(329, 474, 10, 16);
		frame.getContentPane().add(panel_114);
		
		JPanel panel_115 = new JPanel();
		panel_115.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_115.setBackground(currentColor);
			}
		});
		panel_115.setBounds(349, 378, 10, 16);
		frame.getContentPane().add(panel_115);
		
		JPanel panel_116 = new JPanel();
		panel_116.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_116.setBackground(currentColor);
			}
		});
		panel_116.setBounds(349, 411, 10, 16);
		frame.getContentPane().add(panel_116);
		
		JPanel panel_117 = new JPanel();
		panel_117.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_117.setBackground(currentColor);
			}
		});
		panel_117.setBounds(349, 442, 10, 16);
		frame.getContentPane().add(panel_117);
		
		JPanel panel_118 = new JPanel();
		panel_118.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_118.setBackground(currentColor);
			}
		});
		panel_118.setBounds(349, 474, 10, 16);
		frame.getContentPane().add(panel_118);
		
		JPanel panel_119 = new JPanel();
		panel_119.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_119.setBackground(currentColor);
			}
		});
		panel_119.setBounds(370, 378, 10, 16);
		frame.getContentPane().add(panel_119);
		
		JPanel panel_120 = new JPanel();
		panel_120.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_120.setBackground(currentColor);
			}
		});
		panel_120.setBounds(370, 411, 10, 16);
		frame.getContentPane().add(panel_120);
		
		JPanel panel_121 = new JPanel();
		panel_121.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_121.setBackground(currentColor);
			}
		});
		panel_121.setBounds(370, 442, 10, 16);
		frame.getContentPane().add(panel_121);
		
		JPanel panel_122 = new JPanel();
		panel_122.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_122.setBackground(currentColor);
			}
		});
		panel_122.setBounds(370, 474, 10, 16);
		frame.getContentPane().add(panel_122);
		
		JPanel panel_123 = new JPanel();
		panel_123.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_123.setBackground(currentColor);
			}
		});
		panel_123.setBounds(391, 378, 10, 16);
		frame.getContentPane().add(panel_123);
		
		JPanel panel_124 = new JPanel();
		panel_124.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_124.setBackground(currentColor);
			}
		});
		panel_124.setBounds(391, 411, 10, 16);
		frame.getContentPane().add(panel_124);
		
		JPanel panel_125 = new JPanel();
		panel_125.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_125.setBackground(currentColor);
			}
		});
		panel_125.setBounds(391, 442, 10, 16);
		frame.getContentPane().add(panel_125);
		
		JPanel panel_126 = new JPanel();
		panel_126.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_126.setBackground(currentColor);
			}
		});
		panel_126.setBounds(391, 474, 10, 16);
		frame.getContentPane().add(panel_126);
		
		JPanel panel_127 = new JPanel();
		panel_127.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_127.setBackground(currentColor);
			}
		});
		panel_127.setBounds(411, 378, 10, 16);
		frame.getContentPane().add(panel_127);
		
		JPanel panel_128 = new JPanel();
		panel_128.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_128.setBackground(currentColor);
			}
		});
		panel_128.setBounds(411, 411, 10, 16);
		frame.getContentPane().add(panel_128);
		
		JPanel panel_129 = new JPanel();
		panel_129.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_129.setBackground(currentColor);
			}
		});
		panel_129.setBounds(411, 442, 10, 16);
		frame.getContentPane().add(panel_129);
		
		JPanel panel_130 = new JPanel();
		panel_130.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_130.setBackground(currentColor);
			}
		});
		panel_130.setBounds(411, 474, 10, 16);
		frame.getContentPane().add(panel_130);
		
		JPanel panel_131 = new JPanel();
		panel_131.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_131.setBackground(currentColor);
			}
		});
		panel_131.setBounds(432, 378, 10, 16);
		frame.getContentPane().add(panel_131);
		
		JPanel panel_132 = new JPanel();
		panel_132.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_132.setBackground(currentColor);
			}
		});
		panel_132.setBounds(432, 411, 10, 16);
		frame.getContentPane().add(panel_132);
		
		JPanel panel_133 = new JPanel();
		panel_133.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_133.setBackground(currentColor);
			}
		});
		panel_133.setBounds(432, 442, 10, 16);
		frame.getContentPane().add(panel_133);
		
		JPanel panel_134 = new JPanel();
		panel_134.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_134.setBackground(currentColor);
			}
		});
		panel_134.setBounds(432, 474, 10, 16);
		frame.getContentPane().add(panel_134);
		
		JPanel panel_135 = new JPanel();
		panel_135.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_135.setBackground(currentColor);
			}
		});
		panel_135.setBounds(454, 378, 10, 16);
		frame.getContentPane().add(panel_135);
		
		JPanel panel_136 = new JPanel();
		panel_136.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_136.setBackground(currentColor);
			}
		});
		panel_136.setBounds(454, 411, 10, 16);
		frame.getContentPane().add(panel_136);
		
		JPanel panel_137 = new JPanel();
		panel_137.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_137.setBackground(currentColor);
			}
		});
		panel_137.setBounds(454, 442, 10, 16);
		frame.getContentPane().add(panel_137);
		
		JPanel panel_138 = new JPanel();
		panel_138.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_138.setBackground(currentColor);
			}
		});
		panel_138.setBounds(454, 474, 10, 16);
		frame.getContentPane().add(panel_138);
		
		JPanel panel_139 = new JPanel();
		panel_139.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_139.setBackground(currentColor);
			}
		});
		panel_139.setBounds(474, 378, 10, 16);
		frame.getContentPane().add(panel_139);
		
		JPanel panel_140 = new JPanel();
		panel_140.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_140.setBackground(currentColor);
			}
		});
		panel_140.setBounds(474, 411, 10, 16);
		frame.getContentPane().add(panel_140);
		
		JPanel panel_141 = new JPanel();
		panel_141.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_141.setBackground(currentColor);
			}
		});
		panel_141.setBounds(474, 442, 10, 16);
		frame.getContentPane().add(panel_141);
		
		JPanel panel_142 = new JPanel();
		panel_142.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_142.setBackground(currentColor);
			}
		});
		panel_142.setBounds(474, 474, 10, 16);
		frame.getContentPane().add(panel_142);
		
		JPanel panel_143 = new JPanel();
		panel_143.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_143.setBackground(currentColor);
			}
		});
		panel_143.setBounds(495, 378, 10, 16);
		frame.getContentPane().add(panel_143);
		
		JPanel panel_144 = new JPanel();
		panel_144.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_144.setBackground(currentColor);
			}
		});
		panel_144.setBounds(495, 411, 10, 16);
		frame.getContentPane().add(panel_144);
		
		JPanel panel_145 = new JPanel();
		panel_145.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_145.setBackground(currentColor);
			}
		});
		panel_145.setBounds(495, 442, 10, 16);
		frame.getContentPane().add(panel_145);
		
		JPanel panel_146 = new JPanel();
		panel_146.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_146.setBackground(currentColor);
			}
		});
		panel_146.setBounds(495, 474, 10, 16);
		frame.getContentPane().add(panel_146);
		
		JPanel panel_147 = new JPanel();
		panel_147.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_147.setBackground(currentColor);
			}
		});
		panel_147.setBounds(25, 323, 10, 16);
		frame.getContentPane().add(panel_147);
		
		JPanel panel_148 = new JPanel();
		panel_148.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_148.setBackground(currentColor);
			}
		});
		panel_148.setBounds(25, 356, 10, 16);
		frame.getContentPane().add(panel_148);
		
		JPanel panel_149 = new JPanel();
		panel_149.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_149.setBackground(currentColor);
			}
		});
		panel_149.setBounds(25, 387, 10, 16);
		frame.getContentPane().add(panel_149);
		
		JPanel panel_150 = new JPanel();
		panel_150.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_150.setBackground(currentColor);
			}
		});
		panel_150.setBounds(25, 419, 10, 16);
		frame.getContentPane().add(panel_150);
		
		JPanel panel_151 = new JPanel();
		panel_151.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_151.setBackground(currentColor);
			}
		});
		panel_151.setBounds(45, 323, 10, 16);
		frame.getContentPane().add(panel_151);
		
		JPanel panel_152 = new JPanel();
		panel_152.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_152.setBackground(currentColor);
			}
		});
		panel_152.setBounds(45, 356, 10, 16);
		frame.getContentPane().add(panel_152);
		
		JPanel panel_153 = new JPanel();
		panel_153.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_153.setBackground(currentColor);
			}
		});
		panel_153.setBounds(45, 387, 10, 16);
		frame.getContentPane().add(panel_153);
		
		JPanel panel_154 = new JPanel();
		panel_154.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_154.setBackground(currentColor);
			}
		});
		panel_154.setBounds(45, 419, 10, 16);
		frame.getContentPane().add(panel_154);
		
		JPanel panel_155 = new JPanel();
		panel_155.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_155.setBackground(currentColor);
			}
		});
		panel_155.setBounds(66, 323, 10, 16);
		frame.getContentPane().add(panel_155);
		
		JPanel panel_156 = new JPanel();
		panel_156.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_156.setBackground(currentColor);
			}
		});
		panel_156.setBounds(66, 356, 10, 16);
		frame.getContentPane().add(panel_156);
		
		JPanel panel_157 = new JPanel();
		panel_157.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_157.setBackground(currentColor);
			}
		});
		panel_157.setBounds(66, 387, 10, 16);
		frame.getContentPane().add(panel_157);
		
		JPanel panel_158 = new JPanel();
		panel_158.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_158.setBackground(currentColor);
			}
		});
		panel_158.setBounds(66, 419, 10, 16);
		frame.getContentPane().add(panel_158);
		
		JPanel panel_159 = new JPanel();
		panel_159.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_159.setBackground(currentColor);
			}
		});
		panel_159.setBounds(88, 323, 10, 16);
		frame.getContentPane().add(panel_159);
		
		JPanel panel_160 = new JPanel();
		panel_160.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_160.setBackground(currentColor);
			}
		});
		panel_160.setBounds(88, 356, 10, 16);
		frame.getContentPane().add(panel_160);
		
		JPanel panel_161 = new JPanel();
		panel_161.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_161.setBackground(currentColor);
			}
		});
		panel_161.setBounds(88, 387, 10, 16);
		frame.getContentPane().add(panel_161);
		
		JPanel panel_162 = new JPanel();
		panel_162.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_162.setBackground(currentColor);
			}
		});
		panel_162.setBounds(88, 419, 10, 16);
		frame.getContentPane().add(panel_162);
		
		JPanel panel_163 = new JPanel();
		panel_163.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_163.setBackground(currentColor);
			}
		});
		panel_163.setBounds(108, 323, 10, 16);
		frame.getContentPane().add(panel_163);
		
		JPanel panel_164 = new JPanel();
		panel_164.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_164.setBackground(currentColor);
			}
		});
		panel_164.setBounds(108, 356, 10, 16);
		frame.getContentPane().add(panel_164);
		
		JPanel panel_165 = new JPanel();
		panel_165.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_165.setBackground(currentColor);
			}
		});
		panel_165.setBounds(108, 387, 10, 16);
		frame.getContentPane().add(panel_165);
		
		JPanel panel_166 = new JPanel();
		panel_166.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_166.setBackground(currentColor);
			}
		});
		panel_166.setBounds(108, 419, 10, 16);
		frame.getContentPane().add(panel_166);
		
		JPanel panel_167 = new JPanel();
		panel_167.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_167.setBackground(currentColor);
			}
		});
		panel_167.setBounds(129, 323, 10, 16);
		frame.getContentPane().add(panel_167);
		
		JPanel panel_168 = new JPanel();
		panel_168.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_168.setBackground(currentColor);
			}
		});
		panel_168.setBounds(129, 356, 10, 16);
		frame.getContentPane().add(panel_168);
		
		JPanel panel_169 = new JPanel();
		panel_169.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_169.setBackground(currentColor);
			}
		});
		panel_169.setBounds(129, 387, 10, 16);
		frame.getContentPane().add(panel_169);
		
		JPanel panel_170 = new JPanel();
		panel_170.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_170.setBackground(currentColor);
			}
		});
		panel_170.setBounds(129, 419, 10, 16);
		frame.getContentPane().add(panel_170);
		
		JPanel panel_171 = new JPanel();
		panel_171.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_171.setBackground(currentColor);
			}
		});
		panel_171.setBounds(25, 452, 10, 16);
		frame.getContentPane().add(panel_171);
		
		JPanel panel_172 = new JPanel();
		panel_172.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_172.setBackground(currentColor);
			}
		});
		panel_172.setBounds(25, 485, 10, 16);
		frame.getContentPane().add(panel_172);
		
		JPanel panel_173 = new JPanel();
		panel_173.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_173.setBackground(currentColor);
			}
		});
		panel_173.setBounds(25, 516, 10, 16);
		frame.getContentPane().add(panel_173);
		
		JPanel panel_174 = new JPanel();
		panel_174.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_174.setBackground(currentColor);
			}
		});
		panel_174.setBounds(25, 548, 10, 16);
		frame.getContentPane().add(panel_174);
		
		JPanel panel_175 = new JPanel();
		panel_175.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_175.setBackground(currentColor);
			}
		});
		panel_175.setBounds(45, 452, 10, 16);
		frame.getContentPane().add(panel_175);
		
		JPanel panel_176 = new JPanel();
		panel_176.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_176.setBackground(currentColor);
			}
		});
		panel_176.setBounds(45, 485, 10, 16);
		frame.getContentPane().add(panel_176);
		
		JPanel panel_177 = new JPanel();
		panel_177.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_177.setBackground(currentColor);
			}
		});
		panel_177.setBounds(45, 516, 10, 16);
		frame.getContentPane().add(panel_177);
		
		JPanel panel_178 = new JPanel();
		panel_178.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_178.setBackground(currentColor);
			}
		});
		panel_178.setBounds(45, 548, 10, 16);
		frame.getContentPane().add(panel_178);
		
		JPanel panel_179 = new JPanel();
		panel_179.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_179.setBackground(currentColor);
			}
		});
		panel_179.setBounds(66, 452, 10, 16);
		frame.getContentPane().add(panel_179);
		
		JPanel panel_180 = new JPanel();
		panel_180.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_180.setBackground(currentColor);
			}
		});
		panel_180.setBounds(66, 485, 10, 16);
		frame.getContentPane().add(panel_180);
		
		JPanel panel_181 = new JPanel();
		panel_181.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_181.setBackground(currentColor);
			}
		});
		panel_181.setBounds(66, 516, 10, 16);
		frame.getContentPane().add(panel_181);
		
		JPanel panel_182 = new JPanel();
		panel_182.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_182.setBackground(currentColor);
			}
		});
		panel_182.setBounds(66, 548, 10, 16);
		frame.getContentPane().add(panel_182);
		
		JPanel panel_183 = new JPanel();
		panel_183.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_183.setBackground(currentColor);
			}
		});
		panel_183.setBounds(88, 452, 10, 16);
		frame.getContentPane().add(panel_183);
		
		JPanel panel_184 = new JPanel();
		panel_184.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_184.setBackground(currentColor);
			}
		});
		panel_184.setBounds(88, 485, 10, 16);
		frame.getContentPane().add(panel_184);
		
		JPanel panel_185 = new JPanel();
		panel_185.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_185.setBackground(currentColor);
			}
		});
		panel_185.setBounds(88, 516, 10, 16);
		frame.getContentPane().add(panel_185);
		
		JPanel panel_186 = new JPanel();
		panel_186.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_186.setBackground(currentColor);
			}
		});
		panel_186.setBounds(88, 548, 10, 16);
		frame.getContentPane().add(panel_186);
		
		JPanel panel_187 = new JPanel();
		panel_187.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_187.setBackground(currentColor);
			}
		});
		panel_187.setBounds(108, 452, 10, 16);
		frame.getContentPane().add(panel_187);
		
		JPanel panel_188 = new JPanel();
		panel_188.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_188.setBackground(currentColor);
			}
		});
		panel_188.setBounds(108, 485, 10, 16);
		frame.getContentPane().add(panel_188);
		
		JPanel panel_189 = new JPanel();
		panel_189.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_189.setBackground(currentColor);
			}
		});
		panel_189.setBounds(108, 516, 10, 16);
		frame.getContentPane().add(panel_189);
		
		JPanel panel_190 = new JPanel();
		panel_190.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_190.setBackground(currentColor);
			}
		});
		panel_190.setBounds(108, 548, 10, 16);
		frame.getContentPane().add(panel_190);
		
		JPanel panel_191 = new JPanel();
		panel_191.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_191.setBackground(currentColor);
			}
		});
		panel_191.setBounds(129, 452, 10, 16);
		frame.getContentPane().add(panel_191);
		
		JPanel panel_192 = new JPanel();
		panel_192.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_192.setBackground(currentColor);
			}
		});
		panel_192.setBounds(129, 485, 10, 16);
		frame.getContentPane().add(panel_192);
		
		JPanel panel_193 = new JPanel();
		panel_193.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_193.setBackground(currentColor);
			}
		});
		panel_193.setBounds(129, 516, 10, 16);
		frame.getContentPane().add(panel_193);
		
		JPanel panel_194 = new JPanel();
		panel_194.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_194.setBackground(currentColor);
			}
		});
		panel_194.setBounds(129, 548, 10, 16);
		frame.getContentPane().add(panel_194);
		
		JPanel panel_195 = new JPanel();
		panel_195.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_195.setBackground(currentColor);
			}
		});
		panel_195.setBounds(25, 582, 10, 16);
		frame.getContentPane().add(panel_195);
		
		JPanel panel_196 = new JPanel();
		panel_196.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_196.setBackground(currentColor);
			}
		});
		panel_196.setBounds(25, 615, 10, 16);
		frame.getContentPane().add(panel_196);
		
		JPanel panel_197 = new JPanel();
		panel_197.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_197.setBackground(currentColor);
			}
		});
		panel_197.setBounds(25, 646, 10, 16);
		frame.getContentPane().add(panel_197);
		
		JPanel panel_198 = new JPanel();
		panel_198.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_198.setBackground(currentColor);
			}
		});
		panel_198.setBounds(25, 678, 10, 16);
		frame.getContentPane().add(panel_198);
		
		JPanel panel_199 = new JPanel();
		panel_199.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_199.setBackground(currentColor);
			}
		});
		panel_199.setBounds(45, 582, 10, 16);
		frame.getContentPane().add(panel_199);
		
		JPanel panel_200 = new JPanel();
		panel_200.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_200.setBackground(currentColor);
			}
		});
		panel_200.setBounds(45, 615, 10, 16);
		frame.getContentPane().add(panel_200);
		
		JPanel panel_201 = new JPanel();
		panel_201.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_201.setBackground(currentColor);
			}
		});
		panel_201.setBounds(45, 646, 10, 16);
		frame.getContentPane().add(panel_201);
		
		JPanel panel_202 = new JPanel();
		panel_202.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_202.setBackground(currentColor);
			}
		});
		panel_202.setBounds(45, 678, 10, 16);
		frame.getContentPane().add(panel_202);
		
		JPanel panel_203 = new JPanel();
		panel_203.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_203.setBackground(currentColor);
			}
		});
		panel_203.setBounds(66, 582, 10, 16);
		frame.getContentPane().add(panel_203);
		
		JPanel panel_204 = new JPanel();
		panel_204.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_204.setBackground(currentColor);
			}
		});
		panel_204.setBounds(66, 615, 10, 16);
		frame.getContentPane().add(panel_204);
		
		JPanel panel_205 = new JPanel();
		panel_205.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_205.setBackground(currentColor);
			}
		});
		panel_205.setBounds(66, 646, 10, 16);
		frame.getContentPane().add(panel_205);
		
		JPanel panel_206 = new JPanel();
		panel_206.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_206.setBackground(currentColor);
			}
		});
		panel_206.setBounds(66, 678, 10, 16);
		frame.getContentPane().add(panel_206);
		
		JPanel panel_207 = new JPanel();
		panel_207.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_207.setBackground(currentColor);
			}
		});
		panel_207.setBounds(88, 580, 10, 16);
		frame.getContentPane().add(panel_207);
		
		JPanel panel_208 = new JPanel();
		panel_208.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_207.setBackground(currentColor);
			}
		});
		panel_208.setBounds(88, 613, 10, 16);
		frame.getContentPane().add(panel_208);
		
		JPanel panel_209 = new JPanel();
		panel_209.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_208.setBackground(currentColor);
			}
		});
		panel_209.setBounds(88, 644, 10, 16);
		frame.getContentPane().add(panel_209);
		
		JPanel panel_210 = new JPanel();
		panel_210.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_210.setBackground(currentColor);
			}
		});
		panel_210.setBounds(88, 676, 10, 16);
		frame.getContentPane().add(panel_210);
		
		JPanel panel_211 = new JPanel();
		panel_211.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_211.setBackground(currentColor);
			}
		});
		panel_211.setBounds(108, 580, 10, 16);
		frame.getContentPane().add(panel_211);
		
		JPanel panel_212 = new JPanel();
		panel_212.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_212.setBackground(currentColor);
			}
		});
		panel_212.setBounds(108, 613, 10, 16);
		frame.getContentPane().add(panel_212);
		
		JPanel panel_213 = new JPanel();
		panel_213.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_213.setBackground(currentColor);
			}
		});
		panel_213.setBounds(108, 644, 10, 16);
		frame.getContentPane().add(panel_213);
		
		JPanel panel_214 = new JPanel();
		panel_214.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_214.setBackground(currentColor);
			}
		});
		panel_214.setBounds(108, 676, 10, 16);
		frame.getContentPane().add(panel_214);
		
		JPanel panel_215 = new JPanel();
		panel_215.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_215.setBackground(currentColor);
			}
		});
		panel_215.setBounds(129, 580, 10, 16);
		frame.getContentPane().add(panel_215);
		
		JPanel panel_216 = new JPanel();
		panel_216.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_216.setBackground(currentColor);
			}
		});
		panel_216.setBounds(129, 613, 10, 16);
		frame.getContentPane().add(panel_216);
		
		JPanel panel_217 = new JPanel();
		panel_217.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_217.setBackground(currentColor);
			}
		});
		panel_217.setBounds(129, 644, 10, 16);
		frame.getContentPane().add(panel_217);
		
		JPanel panel_218 = new JPanel();
		panel_218.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_218.setBackground(currentColor);
			}
		});
		panel_218.setBounds(129, 676, 10, 16);
		frame.getContentPane().add(panel_218);
		
		JPanel panel_219 = new JPanel();
		panel_219.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_219.setBackground(currentColor);
			}
		});
		panel_219.setBounds(25, 709, 10, 16);
		frame.getContentPane().add(panel_219);
		
		JPanel panel_220 = new JPanel();
		panel_220.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_220.setBackground(currentColor);
			}
		});
		panel_220.setBounds(25, 742, 10, 16);
		frame.getContentPane().add(panel_220);
		
		JPanel panel_221 = new JPanel();
		panel_221.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_221.setBackground(currentColor);
			}
		});
		panel_221.setBounds(25, 773, 10, 16);
		frame.getContentPane().add(panel_221);
		
		JPanel panel_223 = new JPanel();
		panel_223.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_223.setBackground(currentColor);
			}
		});
		panel_223.setBounds(45, 709, 10, 16);
		frame.getContentPane().add(panel_223);
		
		JPanel panel_224 = new JPanel();
		panel_224.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_224.setBackground(currentColor);
			}
		});
		panel_224.setBounds(45, 742, 10, 16);
		frame.getContentPane().add(panel_224);
		
		JPanel panel_225 = new JPanel();
		panel_225.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_225.setBackground(currentColor);
			}
		});
		panel_225.setBounds(45, 773, 10, 16);
		frame.getContentPane().add(panel_225);
		
		JPanel panel_227 = new JPanel();
		panel_227.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_227.setBackground(currentColor);
			}
		});
		panel_227.setBounds(66, 709, 10, 16);
		frame.getContentPane().add(panel_227);
		
		JPanel panel_228 = new JPanel();
		panel_228.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_228.setBackground(currentColor);
			}
		});
		panel_228.setBounds(66, 742, 10, 16);
		frame.getContentPane().add(panel_228);
		
		JPanel panel_229 = new JPanel();
		panel_229.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_229.setBackground(currentColor);
			}
		});
		panel_229.setBounds(66, 773, 10, 16);
		frame.getContentPane().add(panel_229);
		
		JPanel panel_231 = new JPanel();
		panel_231.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_231.setBackground(currentColor);
			}
		});
		panel_231.setBounds(88, 709, 10, 16);
		frame.getContentPane().add(panel_231);
		
		JPanel panel_232 = new JPanel();
		panel_232.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_232.setBackground(currentColor);
			}
		});
		panel_232.setBounds(88, 742, 10, 16);
		frame.getContentPane().add(panel_232);
		
		JPanel panel_233 = new JPanel();
		panel_233.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_233.setBackground(currentColor);
			}
		});
		panel_233.setBounds(88, 773, 10, 16);
		frame.getContentPane().add(panel_233);
		
		JPanel panel_235 = new JPanel();
		panel_235.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_235.setBackground(currentColor);
			}
		});
		panel_235.setBounds(108, 709, 10, 16);
		frame.getContentPane().add(panel_235);
		
		JPanel panel_236 = new JPanel();
		panel_236.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_236.setBackground(currentColor);
			}
		});
		panel_236.setBounds(108, 742, 10, 16);
		frame.getContentPane().add(panel_236);
		
		JPanel panel_237 = new JPanel();
		panel_237.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_237.setBackground(currentColor);
			}
		});
		panel_237.setBounds(108, 773, 10, 16);
		frame.getContentPane().add(panel_237);
		
		JPanel panel_239 = new JPanel();
		panel_239.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_239.setBackground(currentColor);
			}
		});
		panel_239.setBounds(129, 709, 10, 16);
		frame.getContentPane().add(panel_239);
		
		JPanel panel_240 = new JPanel();
		panel_240.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_240.setBackground(currentColor);
			}
		});
		panel_240.setBounds(129, 742, 10, 16);
		frame.getContentPane().add(panel_240);
		
		JPanel panel_241 = new JPanel();
		panel_241.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_241.setBackground(currentColor);
			}
		});
		panel_241.setBounds(129, 773, 10, 16);
		frame.getContentPane().add(panel_241);
		
		JPanel panel_222 = new JPanel();
		panel_222.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_222.setBackground(currentColor);
			}
		});
		panel_222.setBounds(516, 192, 10, 16);
		frame.getContentPane().add(panel_222);
		
		JPanel panel_226 = new JPanel();
		panel_226.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_226.setBackground(currentColor);
			}
		});
		panel_226.setBounds(537, 192, 10, 16);
		frame.getContentPane().add(panel_226);
		
		JPanel panel_230 = new JPanel();
		panel_230.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_230.setBackground(currentColor);
			}
		});
		panel_230.setBounds(537, 225, 10, 16);
		frame.getContentPane().add(panel_230);
		
		JPanel panel_234 = new JPanel();
		panel_234.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_234.setBackground(currentColor);
			}
		});
		panel_234.setBounds(516, 225, 10, 16);
		frame.getContentPane().add(panel_234);
		
		JPanel panel_238 = new JPanel();
		panel_238.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_238.setBackground(currentColor);
			}
		});
		panel_238.setBounds(516, 256, 10, 16);
		frame.getContentPane().add(panel_238);
		
		JPanel panel_242 = new JPanel();
		panel_242.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_242.setBackground(currentColor);
			}
		});
		panel_242.setBounds(537, 256, 10, 16);
		frame.getContentPane().add(panel_242);
		
		JPanel panel_243 = new JPanel();
		panel_243.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_243.setBackground(currentColor);
			}
		});
		panel_243.setBounds(537, 288, 10, 16);
		frame.getContentPane().add(panel_243);
		
		JPanel panel_244 = new JPanel();
		panel_244.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_244.setBackground(currentColor);
			}
		});
		panel_244.setBounds(516, 288, 10, 16);
		frame.getContentPane().add(panel_244);
		
		JPanel panel_245 = new JPanel();
		panel_245.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_245.setBackground(currentColor);
			}
		});
		panel_245.setBounds(516, 378, 10, 16);
		frame.getContentPane().add(panel_245);
		
		JPanel panel_246 = new JPanel();
		panel_246.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_246.setBackground(currentColor);
			}
		});
		panel_246.setBounds(537, 378, 10, 16);
		frame.getContentPane().add(panel_246);
		
		JPanel panel_247 = new JPanel();
		panel_247.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_247.setBackground(currentColor);
			}
		});
		panel_247.setBounds(537, 411, 10, 16);
		frame.getContentPane().add(panel_247);
		
		JPanel panel_248 = new JPanel();
		panel_248.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_248.setBackground(currentColor);
			}
		});
		panel_248.setBounds(516, 411, 10, 16);
		frame.getContentPane().add(panel_248);
		
		JPanel panel_249 = new JPanel();
		panel_249.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_249.setBackground(currentColor);
			}
		});
		panel_249.setBounds(516, 442, 10, 16);
		frame.getContentPane().add(panel_249);
		
		JPanel panel_250 = new JPanel();
		panel_250.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_250.setBackground(currentColor);
			}
		});
		panel_250.setBounds(537, 442, 10, 16);
		frame.getContentPane().add(panel_250);
		
		JPanel panel_251 = new JPanel();
		panel_251.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_251.setBackground(currentColor);
			}
		});
		panel_251.setBounds(537, 474, 10, 16);
		frame.getContentPane().add(panel_251);
		
		JPanel panel_252 = new JPanel();
		panel_252.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_252.setBackground(currentColor);
			}
		});
		panel_252.setBounds(516, 474, 10, 16);
		frame.getContentPane().add(panel_252);
		
		JPanel panel_253 = new JPanel();
		panel_253.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_253.setBackground(currentColor);
			}
		});
		panel_253.setBounds(516, 506, 10, 16);
		frame.getContentPane().add(panel_253);
		
		JPanel panel_254 = new JPanel();
		panel_254.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_254.setBackground(currentColor);
			}
		});
		panel_254.setBounds(537, 506, 10, 16);
		frame.getContentPane().add(panel_254);
		
		JPanel panel_255 = new JPanel();
		panel_255.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_255.setBackground(currentColor);
			}
		});
		panel_255.setBounds(537, 539, 10, 16);
		frame.getContentPane().add(panel_255);
		
		JPanel panel_256 = new JPanel();
		panel_256.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_256.setBackground(currentColor);
			}
		});
		panel_256.setBounds(516, 539, 10, 16);
		frame.getContentPane().add(panel_256);
		
		JPanel panel_257 = new JPanel();
		panel_257.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_257.setBackground(currentColor);
			}
		});
		panel_257.setBounds(516, 570, 10, 16);
		frame.getContentPane().add(panel_257);
		
		JPanel panel_258 = new JPanel();
		panel_258.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_258.setBackground(currentColor);
			}
		});
		panel_258.setBounds(537, 570, 10, 16);
		frame.getContentPane().add(panel_258);
		
		JPanel panel_259 = new JPanel();
		panel_259.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_259.setBackground(currentColor);
			}
		});
		panel_259.setBounds(202, 507, 10, 16);
		frame.getContentPane().add(panel_259);
		
		JPanel panel_260 = new JPanel();
		panel_260.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_260.setBackground(currentColor);
			}
		});
		panel_260.setBounds(202, 538, 10, 16);
		frame.getContentPane().add(panel_260);
		
		JPanel panel_261 = new JPanel();
		panel_261.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_261.setBackground(currentColor);
			}
		});
		panel_261.setBounds(202, 570, 10, 16);
		frame.getContentPane().add(panel_261);
		
		JPanel panel_262 = new JPanel();
		panel_262.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_262.setBackground(currentColor);
			}
		});
		panel_262.setBounds(222, 507, 10, 16);
		frame.getContentPane().add(panel_262);
		
		JPanel panel_263 = new JPanel();
		panel_263.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_263.setBackground(currentColor);
			}
		});
		panel_263.setBounds(222, 538, 10, 16);
		frame.getContentPane().add(panel_263);
		
		JPanel panel_264 = new JPanel();
		panel_264.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_264.setBackground(currentColor);
			}
		});
		panel_264.setBounds(222, 570, 10, 16);
		frame.getContentPane().add(panel_264);
		
		JPanel panel_265 = new JPanel();
		panel_265.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_265.setBackground(currentColor);
			}
		});
		panel_265.setBounds(243, 507, 10, 16);
		frame.getContentPane().add(panel_265);
		
		JPanel panel_266 = new JPanel();
		panel_266.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_266.setBackground(currentColor);
			}
		});
		panel_266.setBounds(243, 538, 10, 16);
		frame.getContentPane().add(panel_266);
		
		JPanel panel_267 = new JPanel();
		panel_267.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_267.setBackground(currentColor);
			}
		});
		panel_267.setBounds(243, 570, 10, 16);
		frame.getContentPane().add(panel_267);
		
		JPanel panel_268 = new JPanel();
		panel_268.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_268.setBackground(currentColor);
			}
		});
		panel_268.setBounds(265, 507, 10, 16);
		frame.getContentPane().add(panel_268);
		
		JPanel panel_269 = new JPanel();
		panel_269.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_269.setBackground(currentColor);
			}
		});
		panel_269.setBounds(265, 538, 10, 16);
		frame.getContentPane().add(panel_269);
		
		JPanel panel_270 = new JPanel();
		panel_270.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_270.setBackground(currentColor);
			}
		});
		panel_270.setBounds(265, 570, 10, 16);
		frame.getContentPane().add(panel_270);
		
		JPanel panel_271 = new JPanel();
		panel_271.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_271.setBackground(currentColor);
			}
		});
		panel_271.setBounds(285, 507, 10, 16);
		frame.getContentPane().add(panel_271);
		
		JPanel panel_272 = new JPanel();
		panel_272.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_272.setBackground(currentColor);
			}
		});
		panel_272.setBounds(285, 538, 10, 16);
		frame.getContentPane().add(panel_272);
		
		JPanel panel_273 = new JPanel();
		panel_273.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_273.setBackground(currentColor);
			}
		});
		panel_273.setBounds(285, 570, 10, 16);
		frame.getContentPane().add(panel_273);
		
		JPanel panel_274 = new JPanel();
		panel_274.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_274.setBackground(currentColor);
			}
		});
		panel_274.setBounds(306, 507, 10, 16);
		frame.getContentPane().add(panel_274);
		
		JPanel panel_275 = new JPanel();
		panel_275.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_275.setBackground(currentColor);
			}
		});
		panel_275.setBounds(306, 538, 10, 16);
		frame.getContentPane().add(panel_275);
		
		JPanel panel_276 = new JPanel();
		panel_276.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_276.setBackground(currentColor);
			}
		});
		panel_276.setBounds(306, 570, 10, 16);
		frame.getContentPane().add(panel_276);
		
		JPanel panel_277 = new JPanel();
		panel_277.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_277.setBackground(currentColor);
			}
		});
		panel_277.setBounds(328, 507, 10, 16);
		frame.getContentPane().add(panel_277);
		
		JPanel panel_278 = new JPanel();
		panel_278.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_278.setBackground(currentColor);
			}
		});
		panel_278.setBounds(328, 538, 10, 16);
		frame.getContentPane().add(panel_278);
		
		JPanel panel_279 = new JPanel();
		panel_279.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_279.setBackground(currentColor);
			}
		});
		panel_279.setBounds(328, 570, 10, 16);
		frame.getContentPane().add(panel_279);
		
		JPanel panel_280 = new JPanel();
		panel_280.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_280.setBackground(currentColor);
			}
		});
		panel_280.setBounds(348, 507, 10, 16);
		frame.getContentPane().add(panel_280);
		
		JPanel panel_281 = new JPanel();
		panel_281.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_281.setBackground(currentColor);
			}
		});
		panel_281.setBounds(348, 538, 10, 16);
		frame.getContentPane().add(panel_281);
		
		JPanel panel_282 = new JPanel();
		panel_282.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_282.setBackground(currentColor);
			}
		});
		panel_282.setBounds(348, 570, 10, 16);
		frame.getContentPane().add(panel_282);
		
		JPanel panel_283 = new JPanel();
		panel_283.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_283.setBackground(currentColor);
			}
		});
		panel_283.setBounds(369, 507, 10, 16);
		frame.getContentPane().add(panel_283);
		
		JPanel panel_284 = new JPanel();
		panel_284.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_284.setBackground(currentColor);
			}
		});
		panel_284.setBounds(369, 538, 10, 16);
		frame.getContentPane().add(panel_284);
		
		JPanel panel_285 = new JPanel();
		panel_285.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_285.setBackground(currentColor);
			}
		});
		panel_285.setBounds(369, 570, 10, 16);
		frame.getContentPane().add(panel_285);
		
		JPanel panel_286 = new JPanel();
		panel_286.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_286.setBackground(currentColor);
			}
		});
		panel_286.setBounds(257, 604, 10, 16);
		frame.getContentPane().add(panel_286);
		
		JPanel panel_287 = new JPanel();
		panel_287.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_287.setBackground(currentColor);
			}
		});
		panel_287.setBounds(257, 635, 10, 16);
		frame.getContentPane().add(panel_287);
		
		JPanel panel_288 = new JPanel();
		panel_288.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_288.setBackground(currentColor);
			}
		});
		panel_288.setBounds(257, 667, 10, 16);
		frame.getContentPane().add(panel_288);
		
		JPanel panel_289 = new JPanel();
		panel_289.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_289.setBackground(currentColor);
			}
		});
		panel_289.setBounds(277, 604, 10, 16);
		frame.getContentPane().add(panel_289);
		
		JPanel panel_290 = new JPanel();
		panel_290.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_290.setBackground(currentColor);
			}
		});
		panel_290.setBounds(277, 635, 10, 16);
		frame.getContentPane().add(panel_290);
		
		JPanel panel_291 = new JPanel();
		panel_291.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_291.setBackground(currentColor);
			}
		});
		panel_291.setBounds(277, 667, 10, 16);
		frame.getContentPane().add(panel_291);
		
		JPanel panel_292 = new JPanel();
		panel_292.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_292.setBackground(currentColor);
			}
		});
		panel_292.setBounds(298, 604, 10, 16);
		frame.getContentPane().add(panel_292);
		
		JPanel panel_293 = new JPanel();
		panel_293.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_293.setBackground(currentColor);
			}
		});
		panel_293.setBounds(298, 635, 10, 16);
		frame.getContentPane().add(panel_293);
		
		JPanel panel_294 = new JPanel();
		panel_294.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_294.setBackground(currentColor);
			}
		});
		panel_294.setBounds(298, 667, 10, 16);
		frame.getContentPane().add(panel_294);
		
		JPanel panel_295 = new JPanel();
		panel_295.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_295.setBackground(currentColor);
			}
		});
		panel_295.setBounds(320, 604, 10, 16);
		frame.getContentPane().add(panel_295);
		
		JPanel panel_296 = new JPanel();
		panel_296.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_296.setBackground(currentColor);
			}
		});
		panel_296.setBounds(320, 635, 10, 16);
		frame.getContentPane().add(panel_296);
		
		JPanel panel_297 = new JPanel();
		panel_297.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_297.setBackground(currentColor);
			}
		});
		panel_297.setBounds(320, 667, 10, 16);
		frame.getContentPane().add(panel_297);
		
		JPanel panel_298 = new JPanel();
		panel_298.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_298.setBackground(currentColor);
			}
		});
		panel_298.setBounds(340, 604, 10, 16);
		frame.getContentPane().add(panel_298);
		
		JPanel panel_299 = new JPanel();
		panel_299.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_299.setBackground(currentColor);
			}
		});
		panel_299.setBounds(340, 635, 10, 16);
		frame.getContentPane().add(panel_299);
		
		JPanel panel_300 = new JPanel();
		panel_300.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_300.setBackground(currentColor);
			}
		});
		panel_300.setBounds(340, 667, 10, 16);
		frame.getContentPane().add(panel_300);
		
		JPanel panel_301 = new JPanel();
		panel_301.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_301.setBackground(currentColor);
			}
		});
		panel_301.setBounds(361, 604, 10, 16);
		frame.getContentPane().add(panel_301);
		
		JPanel panel_302 = new JPanel();
		panel_302.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_302.setBackground(currentColor);
			}
		});
		panel_302.setBounds(361, 635, 10, 16);
		frame.getContentPane().add(panel_302);
		
		JPanel panel_303 = new JPanel();
		panel_303.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_303.setBackground(currentColor);
			}
		});
		panel_303.setBounds(361, 667, 10, 16);
		frame.getContentPane().add(panel_303);
		
		JPanel panel_304 = new JPanel();
		panel_304.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_304.setBackground(currentColor);
			}
		});
		panel_304.setBounds(383, 604, 10, 16);
		frame.getContentPane().add(panel_304);
		
		JPanel panel_305 = new JPanel();
		panel_305.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_305.setBackground(currentColor);
			}
		});
		panel_305.setBounds(383, 635, 10, 16);
		frame.getContentPane().add(panel_305);
		
		JPanel panel_306 = new JPanel();
		panel_306.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_306.setBackground(currentColor);
			}
		});
		panel_306.setBounds(383, 667, 10, 16);
		frame.getContentPane().add(panel_306);
		
		JPanel panel_307 = new JPanel();
		panel_307.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_307.setBackground(currentColor);
			}
		});
		panel_307.setBounds(403, 604, 10, 16);
		frame.getContentPane().add(panel_307);
		
		JPanel panel_308 = new JPanel();
		panel_308.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_308.setBackground(currentColor);
			}
		});
		panel_308.setBounds(403, 635, 10, 16);
		frame.getContentPane().add(panel_308);
		
		JPanel panel_309 = new JPanel();
		panel_309.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_309.setBackground(currentColor);
			}
		});
		panel_309.setBounds(403, 667, 10, 16);
		frame.getContentPane().add(panel_309);
		
		JPanel panel_310 = new JPanel();
		panel_310.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_310.setBackground(currentColor);
			}
		});
		panel_310.setBounds(424, 604, 10, 16);
		frame.getContentPane().add(panel_310);
		
		JPanel panel_311 = new JPanel();
		panel_311.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_311.setBackground(currentColor);
			}
		});
		panel_311.setBounds(424, 635, 10, 16);
		frame.getContentPane().add(panel_311);
		
		JPanel panel_312 = new JPanel();
		panel_312.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_312.setBackground(currentColor);
			}
		});
		panel_312.setBounds(424, 667, 10, 16);
		frame.getContentPane().add(panel_312);
		
		JPanel panel_313 = new JPanel();
		panel_313.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_313.setBackground(currentColor);
			}
		});
		panel_313.setBounds(391, 506, 10, 16);
		frame.getContentPane().add(panel_313);
		
		JPanel panel_314 = new JPanel();
		panel_314.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_314.setBackground(currentColor);
			}
		});
		panel_314.setBounds(413, 506, 10, 16);
		frame.getContentPane().add(panel_314);
		
		JPanel panel_315 = new JPanel();
		panel_315.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_315.setBackground(currentColor);
			}
		});
		panel_315.setBounds(433, 506, 10, 16);
		frame.getContentPane().add(panel_315);
		
		JPanel panel_316 = new JPanel();
		panel_316.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_316.setBackground(currentColor);
			}
		});
		panel_316.setBounds(433, 539, 10, 16);
		frame.getContentPane().add(panel_316);
		
		JPanel panel_317 = new JPanel();
		panel_317.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_317.setBackground(currentColor);
			}
		});
		panel_317.setBounds(413, 539, 10, 16);
		frame.getContentPane().add(panel_317);
		
		JPanel panel_318 = new JPanel();
		panel_318.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_318.setBackground(currentColor);
			}
		});
		panel_318.setBounds(391, 539, 10, 16);
		frame.getContentPane().add(panel_318);
		
		JPanel panel_319 = new JPanel();
		panel_319.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_319.setBackground(currentColor);
			}
		});
		panel_319.setBounds(391, 570, 10, 16);
		frame.getContentPane().add(panel_319);
		
		JPanel panel_320 = new JPanel();
		panel_320.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_320.setBackground(currentColor);
			}
		});
		panel_320.setBounds(413, 570, 10, 16);
		frame.getContentPane().add(panel_320);
		
		JPanel panel_321 = new JPanel();
		panel_321.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_321.setBackground(currentColor);
			}
		});
		panel_321.setBounds(433, 570, 10, 16);
		frame.getContentPane().add(panel_321);
		
		JPanel panel_322 = new JPanel();
		panel_322.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_322.setBackground(currentColor);
			}
		});
		panel_322.setBounds(454, 507, 10, 16);
		frame.getContentPane().add(panel_322);
		
		JPanel panel_323 = new JPanel();
		panel_323.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_323.setBackground(currentColor);
			}
		});
		panel_323.setBounds(476, 507, 10, 16);
		frame.getContentPane().add(panel_323);
		
		JPanel panel_324 = new JPanel();
		panel_324.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_324.setBackground(currentColor);
			}
		});
		panel_324.setBounds(496, 507, 10, 16);
		frame.getContentPane().add(panel_324);
		
		JPanel panel_325 = new JPanel();
		panel_325.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_325.setBackground(currentColor);
			}
		});
		panel_325.setBounds(496, 540, 10, 16);
		frame.getContentPane().add(panel_325);
		
		JPanel panel_326 = new JPanel();
		panel_326.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_326.setBackground(currentColor);
			}
		});
		panel_326.setBounds(476, 540, 10, 16);
		frame.getContentPane().add(panel_326);
		
		JPanel panel_327 = new JPanel();
		panel_327.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_327.setBackground(currentColor);
			}
		});
		panel_327.setBounds(454, 540, 10, 16);
		frame.getContentPane().add(panel_327);
		
		JPanel panel_328 = new JPanel();
		panel_328.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_328.setBackground(currentColor);
			}
		});
		panel_328.setBounds(454, 571, 10, 16);
		frame.getContentPane().add(panel_328);
		
		JPanel panel_329 = new JPanel();
		panel_329.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_329.setBackground(currentColor);
			}
		});
		panel_329.setBounds(476, 571, 10, 16);
		frame.getContentPane().add(panel_329);
		
		JPanel panel_330 = new JPanel();
		panel_330.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_330.setBackground(currentColor);
			}
		});
		panel_330.setBounds(496, 571, 10, 16);
		frame.getContentPane().add(panel_330);
		
		JPanel panel_331 = new JPanel();
		panel_331.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_331.setBackground(currentColor);
			}
		});
		panel_331.setBounds(445, 603, 10, 16);
		frame.getContentPane().add(panel_331);
		
		JPanel panel_332 = new JPanel();
		panel_332.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_332.setBackground(currentColor);
			}
		});
		panel_332.setBounds(467, 603, 10, 16);
		frame.getContentPane().add(panel_332);
		
		JPanel panel_333 = new JPanel();
		panel_333.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_333.setBackground(currentColor);
			}
		});
		panel_333.setBounds(487, 603, 10, 16);
		frame.getContentPane().add(panel_333);
		
		JPanel panel_334 = new JPanel();
		panel_334.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_334.setBackground(currentColor);
			}
		});
		panel_334.setBounds(487, 636, 10, 16);
		frame.getContentPane().add(panel_334);
		
		JPanel panel_335 = new JPanel();
		panel_335.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_335.setBackground(currentColor);
			}
		});
		panel_335.setBounds(467, 636, 10, 16);
		frame.getContentPane().add(panel_335);
		
		JPanel panel_336 = new JPanel();
		panel_336.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_336.setBackground(currentColor);
			}
		});
		panel_336.setBounds(445, 636, 10, 16);
		frame.getContentPane().add(panel_336);
		
		JPanel panel_337 = new JPanel();
		panel_337.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_337.setBackground(currentColor);
			}
		});
		panel_337.setBounds(445, 667, 10, 16);
		frame.getContentPane().add(panel_337);
		
		JPanel panel_338 = new JPanel();
		panel_338.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_338.setBackground(currentColor);
			}
		});
		panel_338.setBounds(467, 667, 10, 16);
		frame.getContentPane().add(panel_338);
		
		JPanel panel_339 = new JPanel();
		panel_339.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_339.setBackground(currentColor);
			}
		});
		panel_339.setBounds(487, 667, 10, 16);
		frame.getContentPane().add(panel_339);
		
		JPanel panel_340 = new JPanel();
		panel_340.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_340.setBackground(currentColor);
			}
		});
		panel_340.setBounds(610, 386, 10, 16);
		frame.getContentPane().add(panel_340);
		
		JPanel panel_341 = new JPanel();
		panel_341.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_341.setBackground(currentColor);
			}
		});
		panel_341.setBounds(632, 386, 10, 16);
		frame.getContentPane().add(panel_341);
		
		JPanel panel_342 = new JPanel();
		panel_342.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_342.setBackground(currentColor);
			}
		});
		panel_342.setBounds(652, 386, 10, 16);
		frame.getContentPane().add(panel_342);
		
		JPanel panel_343 = new JPanel();
		panel_343.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_343.setBackground(currentColor);
			}
		});
		panel_343.setBounds(652, 419, 10, 16);
		frame.getContentPane().add(panel_343);
		
		JPanel panel_344 = new JPanel();
		panel_344.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_344.setBackground(currentColor);
			}
		});
		panel_344.setBounds(632, 419, 10, 16);
		frame.getContentPane().add(panel_344);
		
		JPanel panel_345 = new JPanel();
		panel_345.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_345.setBackground(currentColor);
			}
		});
		panel_345.setBounds(610, 419, 10, 16);
		frame.getContentPane().add(panel_345);
		
		JPanel panel_346 = new JPanel();
		panel_346.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_346.setBackground(currentColor);
			}
		});
		panel_346.setBounds(610, 450, 10, 16);
		frame.getContentPane().add(panel_346);
		
		JPanel panel_347 = new JPanel();
		panel_347.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_347.setBackground(currentColor);
			}
		});
		panel_347.setBounds(632, 450, 10, 16);
		frame.getContentPane().add(panel_347);
		
		JPanel panel_348 = new JPanel();
		panel_348.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_348.setBackground(currentColor);
			}
		});
		panel_348.setBounds(652, 450, 10, 16);
		frame.getContentPane().add(panel_348);
		
		JPanel panel_349 = new JPanel();
		panel_349.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_349.setBackground(currentColor);
			}
		});
		panel_349.setBounds(673, 386, 10, 16);
		frame.getContentPane().add(panel_349);
		
		JPanel panel_350 = new JPanel();
		panel_350.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_350.setBackground(currentColor);
			}
		});
		panel_350.setBounds(695, 386, 10, 16);
		frame.getContentPane().add(panel_350);
		
		JPanel panel_351 = new JPanel();
		panel_351.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_351.setBackground(currentColor);
			}
		});
		panel_351.setBounds(715, 386, 10, 16);
		frame.getContentPane().add(panel_351);
		
		JPanel panel_352 = new JPanel();
		panel_352.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_352.setBackground(currentColor);
			}
		});
		panel_352.setBounds(715, 419, 10, 16);
		frame.getContentPane().add(panel_352);
		
		JPanel panel_353 = new JPanel();
		panel_353.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_353.setBackground(currentColor);
			}
		});
		panel_353.setBounds(695, 419, 10, 16);
		frame.getContentPane().add(panel_353);
		
		JPanel panel_354 = new JPanel();
		panel_354.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_354.setBackground(currentColor);
			}
		});
		panel_354.setBounds(673, 419, 10, 16);
		frame.getContentPane().add(panel_354);
		
		JPanel panel_355 = new JPanel();
		panel_355.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_355.setBackground(currentColor);
			}
		});
		panel_355.setBounds(673, 450, 10, 16);
		frame.getContentPane().add(panel_355);
		
		JPanel panel_356 = new JPanel();
		panel_356.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_356.setBackground(currentColor);
			}
		});
		panel_356.setBounds(695, 450, 10, 16);
		frame.getContentPane().add(panel_356);
		
		JPanel panel_357 = new JPanel();
		panel_357.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_357.setBackground(currentColor);
			}
		});
		panel_357.setBounds(715, 450, 10, 16);
		frame.getContentPane().add(panel_357);
		
		JPanel panel_358 = new JPanel();
		panel_358.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_358.setBackground(currentColor);
			}
		});
		panel_358.setBounds(610, 482, 10, 16);
		frame.getContentPane().add(panel_358);
		
		JPanel panel_359 = new JPanel();
		panel_359.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_359.setBackground(currentColor);
			}
		});
		panel_359.setBounds(632, 482, 10, 16);
		frame.getContentPane().add(panel_359);
		
		JPanel panel_360 = new JPanel();
		panel_360.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_360.setBackground(currentColor);
			}
		});
		panel_360.setBounds(652, 482, 10, 16);
		frame.getContentPane().add(panel_360);
		
		JPanel panel_361 = new JPanel();
		panel_361.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_361.setBackground(currentColor);
			}
		});
		panel_361.setBounds(652, 515, 10, 16);
		frame.getContentPane().add(panel_361);
		
		JPanel panel_362 = new JPanel();
		panel_362.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_362.setBackground(currentColor);
			}
		});
		panel_362.setBounds(632, 515, 10, 16);
		frame.getContentPane().add(panel_362);
		
		JPanel panel_363 = new JPanel();
		panel_363.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_363.setBackground(currentColor);
			}
		});
		panel_363.setBounds(610, 515, 10, 16);
		frame.getContentPane().add(panel_363);
		
		JPanel panel_364 = new JPanel();
		panel_364.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_364.setBackground(currentColor);
			}
		});
		panel_364.setBounds(610, 546, 10, 16);
		frame.getContentPane().add(panel_364);
		
		JPanel panel_365 = new JPanel();
		panel_365.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_365.setBackground(currentColor);
			}
		});
		panel_365.setBounds(632, 546, 10, 16);
		frame.getContentPane().add(panel_365);
		
		JPanel panel_366 = new JPanel();
		panel_366.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_366.setBackground(currentColor);
			}
		});
		panel_366.setBounds(652, 546, 10, 16);
		frame.getContentPane().add(panel_366);
		
		JPanel panel_367 = new JPanel();
		panel_367.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_367.setBackground(currentColor);
			}
		});
		panel_367.setBounds(674, 482, 10, 16);
		frame.getContentPane().add(panel_367);
		
		JPanel panel_368 = new JPanel();
		panel_368.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_368.setBackground(currentColor);
			}
		});
		panel_368.setBounds(696, 482, 10, 16);
		frame.getContentPane().add(panel_368);
		
		JPanel panel_369 = new JPanel();
		panel_369.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_369.setBackground(currentColor);
			}
		});
		panel_369.setBounds(716, 482, 10, 16);
		frame.getContentPane().add(panel_369);
		
		JPanel panel_370 = new JPanel();
		panel_370.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_370.setBackground(currentColor);
			}
		});
		panel_370.setBounds(716, 515, 10, 16);
		frame.getContentPane().add(panel_370);
		
		JPanel panel_371 = new JPanel();
		panel_371.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_371.setBackground(currentColor);
			}
		});
		panel_371.setBounds(696, 515, 10, 16);
		frame.getContentPane().add(panel_371);
		
		JPanel panel_372 = new JPanel();
		panel_372.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_372.setBackground(currentColor);
			}
		});
		panel_372.setBounds(674, 515, 10, 16);
		frame.getContentPane().add(panel_372);
		
		JPanel panel_373 = new JPanel();
		panel_373.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_373.setBackground(currentColor);
			}
		});
		panel_373.setBounds(674, 546, 10, 16);
		frame.getContentPane().add(panel_373);
		
		JPanel panel_374 = new JPanel();
		panel_374.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_374.setBackground(currentColor);
			}
		});
		panel_374.setBounds(696, 546, 10, 16);
		frame.getContentPane().add(panel_374);
		
		JPanel panel_375 = new JPanel();
		panel_375.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_375.setBackground(currentColor);
			}
		});
		panel_375.setBounds(716, 546, 10, 16);
		frame.getContentPane().add(panel_375);
		
		JPanel panel_376 = new JPanel();
		panel_376.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_376.setBackground(currentColor);
			}
		});
		panel_376.setBounds(610, 579, 10, 16);
		frame.getContentPane().add(panel_376);
		
		JPanel panel_377 = new JPanel();
		panel_377.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_377.setBackground(currentColor);
			}
		});
		panel_377.setBounds(632, 579, 10, 16);
		frame.getContentPane().add(panel_377);
		
		JPanel panel_378 = new JPanel();
		panel_378.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_378.setBackground(currentColor);
			}
		});
		panel_378.setBounds(652, 579, 10, 16);
		frame.getContentPane().add(panel_378);
		
		JPanel panel_379 = new JPanel();
		panel_379.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_379.setBackground(currentColor);
			}
		});
		panel_379.setBounds(652, 612, 10, 16);
		frame.getContentPane().add(panel_379);
		
		JPanel panel_380 = new JPanel();
		panel_380.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_380.setBackground(currentColor);
			}
		});
		panel_380.setBounds(632, 612, 10, 16);
		frame.getContentPane().add(panel_380);
		
		JPanel panel_381 = new JPanel();
		panel_381.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_381.setBackground(currentColor);
			}
		});
		panel_381.setBounds(610, 612, 10, 16);
		frame.getContentPane().add(panel_381);
		
		JPanel panel_382 = new JPanel();
		panel_382.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_382.setBackground(currentColor);
			}
		});
		panel_382.setBounds(610, 643, 10, 16);
		frame.getContentPane().add(panel_382);
		
		JPanel panel_383 = new JPanel();
		panel_383.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_383.setBackground(currentColor);
			}
		});
		panel_383.setBounds(632, 643, 10, 16);
		frame.getContentPane().add(panel_383);
		
		JPanel panel_384 = new JPanel();
		panel_384.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_384.setBackground(currentColor);
			}
		});
		panel_384.setBounds(652, 643, 10, 16);
		frame.getContentPane().add(panel_384);
		
		JPanel panel_385 = new JPanel();
		panel_385.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_385.setBackground(currentColor);
			}
		});
		panel_385.setBounds(673, 579, 10, 16);
		frame.getContentPane().add(panel_385);
		
		JPanel panel_386 = new JPanel();
		panel_386.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_386.setBackground(currentColor);
			}
		});
		panel_386.setBounds(695, 579, 10, 16);
		frame.getContentPane().add(panel_386);
		
		JPanel panel_387 = new JPanel();
		panel_387.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_387.setBackground(currentColor);
			}
		});
		panel_387.setBounds(715, 579, 10, 16);
		frame.getContentPane().add(panel_387);
		
		JPanel panel_388 = new JPanel();
		panel_388.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_388.setBackground(currentColor);
			}
		});
		panel_388.setBounds(715, 612, 10, 16);
		frame.getContentPane().add(panel_388);
		
		JPanel panel_389 = new JPanel();
		panel_389.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_389.setBackground(currentColor);
			}
		});
		panel_389.setBounds(695, 612, 10, 16);
		frame.getContentPane().add(panel_389);
		
		JPanel panel_390 = new JPanel();
		panel_390.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_390.setBackground(currentColor);
			}
		});
		panel_390.setBounds(673, 612, 10, 16);
		frame.getContentPane().add(panel_390);
		
		JPanel panel_391 = new JPanel();
		panel_391.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_391.setBackground(currentColor);
			}
		});
		panel_391.setBounds(673, 643, 10, 16);
		frame.getContentPane().add(panel_391);
		
		JPanel panel_392 = new JPanel();
		panel_392.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_392.setBackground(currentColor);
			}
		});
		panel_392.setBounds(695, 643, 10, 16);
		frame.getContentPane().add(panel_392);
		
		JPanel panel_393 = new JPanel();
		panel_393.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_393.setBackground(currentColor);
			}
		});
		panel_393.setBounds(715, 643, 10, 16);
		frame.getContentPane().add(panel_393);
		
		JPanel panel_394 = new JPanel();
		panel_394.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_394.setBackground(currentColor);
			}
		});
		panel_394.setBounds(610, 741, 10, 16);
		frame.getContentPane().add(panel_394);
		
		JPanel panel_395 = new JPanel();
		panel_395.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_395.setBackground(currentColor);
			}
		});
		panel_395.setBounds(632, 741, 10, 16);
		frame.getContentPane().add(panel_395);
		
		JPanel panel_396 = new JPanel();
		panel_396.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_396.setBackground(currentColor);
			}
		});
		panel_396.setBounds(652, 741, 10, 16);
		frame.getContentPane().add(panel_396);
		
		JPanel panel_397 = new JPanel();
		panel_397.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_397.setBackground(currentColor);
			}
		});
		panel_397.setBounds(673, 741, 10, 16);
		frame.getContentPane().add(panel_397);
		
		JPanel panel_398 = new JPanel();
		panel_398.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_398.setBackground(currentColor);
			}
		});
		panel_398.setBounds(695, 741, 10, 16);
		frame.getContentPane().add(panel_398);
		
		JPanel panel_399 = new JPanel();
		panel_399.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_399.setBackground(currentColor);
			}
		});
		panel_399.setBounds(715, 741, 10, 16);
		frame.getContentPane().add(panel_399);
		
		JPanel panel_400 = new JPanel();
		panel_400.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_400.setBackground(currentColor);
			}
		});
		panel_400.setBounds(715, 772, 10, 16);
		frame.getContentPane().add(panel_400);
		
		JPanel panel_401 = new JPanel();
		panel_401.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_401.setBackground(currentColor);
			}
		});
		panel_401.setBounds(695, 772, 10, 16);
		frame.getContentPane().add(panel_401);
		
		JPanel panel_402 = new JPanel();
		panel_402.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_402.setBackground(currentColor);
			}
		});
		panel_402.setBounds(673, 772, 10, 16);
		frame.getContentPane().add(panel_402);
		
		JPanel panel_403 = new JPanel();
		panel_403.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_403.setBackground(currentColor);
			}
		});
		panel_403.setBounds(652, 772, 10, 16);
		frame.getContentPane().add(panel_403);
		
		JPanel panel_404 = new JPanel();
		panel_404.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_404.setBackground(currentColor);
			}
		});
		panel_404.setBounds(632, 772, 10, 16);
		frame.getContentPane().add(panel_404);
		
		JPanel panel_405 = new JPanel();
		panel_405.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_405.setBackground(currentColor);
			}
		});
		panel_405.setBounds(610, 772, 10, 16);
		frame.getContentPane().add(panel_405);
		
		JPanel panel_406 = new JPanel();
		panel_406.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_406.setBackground(currentColor);
			}
		});
		panel_406.setBounds(203, 774, 10, 16);
		frame.getContentPane().add(panel_406);
		
		JPanel panel_407 = new JPanel();
		panel_407.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_407.setBackground(currentColor);
			}
		});
		panel_407.setBounds(203, 742, 10, 16);
		frame.getContentPane().add(panel_407);
		
		JPanel panel_408 = new JPanel();
		panel_408.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_408.setBackground(currentColor);
			}
		});
		panel_408.setBounds(223, 742, 10, 16);
		frame.getContentPane().add(panel_408);
		
		JPanel panel_409 = new JPanel();
		panel_409.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_409.setBackground(currentColor);
			}
		});
		panel_409.setBounds(223, 774, 10, 16);
		frame.getContentPane().add(panel_409);
		
		JPanel panel_410 = new JPanel();
		panel_410.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_410.setBackground(currentColor);
			}
		});
		panel_410.setBounds(244, 742, 10, 16);
		frame.getContentPane().add(panel_410);
		
		JPanel panel_411 = new JPanel();
		panel_411.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_411.setBackground(currentColor);
			}
		});
		panel_411.setBounds(244, 774, 10, 16);
		frame.getContentPane().add(panel_411);
		
		JPanel panel_412 = new JPanel();
		panel_412.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_412.setBackground(currentColor);
			}
		});
		panel_412.setBounds(266, 774, 10, 16);
		frame.getContentPane().add(panel_412);
		
		JPanel panel_413 = new JPanel();
		panel_413.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_413.setBackground(currentColor);
			}
		});
		panel_413.setBounds(266, 742, 10, 16);
		frame.getContentPane().add(panel_413);
		
		JPanel panel_414 = new JPanel();
		panel_414.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_414.setBackground(currentColor);
			}
		});
		panel_414.setBounds(286, 742, 10, 16);
		frame.getContentPane().add(panel_414);
		
		JPanel panel_415 = new JPanel();
		panel_415.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_415.setBackground(currentColor);
			}
		});
		panel_415.setBounds(286, 774, 10, 16);
		frame.getContentPane().add(panel_415);
		
		JPanel panel_416 = new JPanel();
		panel_416.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_416.setBackground(currentColor);
			}
		});
		panel_416.setBounds(307, 774, 10, 16);
		frame.getContentPane().add(panel_416);
		
		JPanel panel_417 = new JPanel();
		panel_417.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_417.setBackground(currentColor);
			}
		});
		panel_417.setBounds(307, 742, 10, 16);
		frame.getContentPane().add(panel_417);
		
		JPanel panel_418 = new JPanel();
		panel_418.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_418.setBackground(currentColor);
			}
		});
		panel_418.setBounds(329, 742, 10, 16);
		frame.getContentPane().add(panel_418);
		
		JPanel panel_419 = new JPanel();
		panel_419.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_419.setBackground(currentColor);
			}
		});
		panel_419.setBounds(329, 774, 10, 16);
		frame.getContentPane().add(panel_419);
		
		JPanel panel_420 = new JPanel();
		panel_420.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_420.setBackground(currentColor);
			}
		});
		panel_420.setBounds(349, 774, 10, 16);
		frame.getContentPane().add(panel_420);
		
		JPanel panel_421 = new JPanel();
		panel_421.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_421.setBackground(currentColor);
			}
		});
		panel_421.setBounds(349, 742, 10, 16);
		frame.getContentPane().add(panel_421);
		
		JPanel panel_422 = new JPanel();
		panel_422.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_422.setBackground(currentColor);
			}
		});
		panel_422.setBounds(370, 742, 10, 16);
		frame.getContentPane().add(panel_422);
		
		JPanel panel_423 = new JPanel();
		panel_423.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_423.setBackground(currentColor);
			}
		});
		panel_423.setBounds(370, 774, 10, 16);
		frame.getContentPane().add(panel_423);
		
		JPanel panel_424 = new JPanel();
		panel_424.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_424.setBackground(currentColor);
			}
		});
		panel_424.setBounds(392, 774, 10, 16);
		frame.getContentPane().add(panel_424);
		
		JPanel panel_425 = new JPanel();
		panel_425.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_425.setBackground(currentColor);
			}
		});
		panel_425.setBounds(392, 743, 10, 16);
		frame.getContentPane().add(panel_425);
		
		JPanel panel_426 = new JPanel();
		panel_426.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_426.setBackground(currentColor);
			}
		});
		panel_426.setBounds(414, 743, 10, 16);
		frame.getContentPane().add(panel_426);
		
		JPanel panel_427 = new JPanel();
		panel_427.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_427.setBackground(currentColor);
			}
		});
		panel_427.setBounds(414, 774, 10, 16);
		frame.getContentPane().add(panel_427);
		
		JPanel panel_428 = new JPanel();
		panel_428.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_428.setBackground(currentColor);
			}
		});
		panel_428.setBounds(434, 774, 10, 16);
		frame.getContentPane().add(panel_428);
		
		JPanel panel_429 = new JPanel();
		panel_429.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_429.setBackground(currentColor);
			}
		});
		panel_429.setBounds(434, 743, 10, 16);
		frame.getContentPane().add(panel_429);
		
		JPanel panel_430 = new JPanel();
		panel_430.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_430.setBackground(currentColor);
			}
		});
		panel_430.setBounds(455, 744, 10, 16);
		frame.getContentPane().add(panel_430);
		
		JPanel panel_431 = new JPanel();
		panel_431.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_431.setBackground(currentColor);
			}
		});
		panel_431.setBounds(455, 775, 10, 16);
		frame.getContentPane().add(panel_431);
		
		JPanel panel_432 = new JPanel();
		panel_432.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_432.setBackground(currentColor);
			}
		});
		panel_432.setBounds(477, 775, 10, 16);
		frame.getContentPane().add(panel_432);
		
		JPanel panel_433 = new JPanel();
		panel_433.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_433.setBackground(currentColor);
			}
		});
		panel_433.setBounds(477, 744, 10, 16);
		frame.getContentPane().add(panel_433);
		
		JPanel panel_434 = new JPanel();
		panel_434.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_434.setBackground(currentColor);
			}
		});
		panel_434.setBounds(497, 744, 10, 16);
		frame.getContentPane().add(panel_434);
		
		JPanel panel_435 = new JPanel();
		panel_435.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_435.setBackground(currentColor);
			}
		});
		panel_435.setBounds(497, 775, 10, 16);
		frame.getContentPane().add(panel_435);
		
		JPanel panel_436 = new JPanel();
		panel_436.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_436.setBackground(currentColor);
			}
		});
		panel_436.setBounds(517, 774, 10, 16);
		frame.getContentPane().add(panel_436);
		
		JPanel panel_437 = new JPanel();
		panel_437.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_437.setBackground(currentColor);
			}
		});
		panel_437.setBounds(517, 743, 10, 16);
		frame.getContentPane().add(panel_437);
		
		JPanel panel_438 = new JPanel();
		panel_438.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_438.setBackground(currentColor);
			}
		});
		panel_438.setBounds(538, 743, 10, 16);
		frame.getContentPane().add(panel_438);
		
		JPanel panel_439 = new JPanel();
		panel_439.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_439.setBackground(currentColor);
			}
		});
		panel_439.setBounds(538, 774, 10, 16);
		frame.getContentPane().add(panel_439);
		
		JPanel panel_440 = new JPanel();
		panel_440.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_440.setBackground(currentColor);
			}
		});
		panel_440.setBounds(27, 160, 15, 16);
		frame.getContentPane().add(panel_440);
		
		JPanel panel_441 = new JPanel();
		panel_441.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_441.setBackground(currentColor);
			}
		});
		panel_441.setBounds(47, 168, 15, 16);
		frame.getContentPane().add(panel_441);
		
		JPanel panel_442 = new JPanel();
		panel_442.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_442.setBackground(currentColor);
			}
		});
		panel_442.setBounds(66, 175, 15, 16);
		frame.getContentPane().add(panel_442);
		
		JPanel panel_443 = new JPanel();
		panel_443.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_443.setBackground(currentColor);
			}
		});
		panel_443.setBounds(86, 183, 15, 16);
		frame.getContentPane().add(panel_443);
		
		JPanel panel_444 = new JPanel();
		panel_444.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_444.setBackground(currentColor);
			}
		});
		panel_444.setBounds(105, 189, 15, 16);
		frame.getContentPane().add(panel_444);
		
		JPanel panel_445 = new JPanel();
		panel_445.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_445.setBackground(currentColor);
			}
		});
		panel_445.setBounds(124, 197, 15, 16);
		frame.getContentPane().add(panel_445);
		
		JPanel panel_446 = new JPanel();
		panel_446.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_446.setBackground(currentColor);
			}
		});
		panel_446.setBounds(708, 160, 15, 16);
		frame.getContentPane().add(panel_446);
		
		JPanel panel_447 = new JPanel();
		panel_447.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_447.setBackground(currentColor);
			}
		});
		panel_447.setBounds(688, 168, 15, 16);
		frame.getContentPane().add(panel_447);
		
		JPanel panel_448 = new JPanel();
		panel_448.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_448.setBackground(currentColor);
			}
		});
		panel_448.setBounds(668, 175, 15, 16);
		frame.getContentPane().add(panel_448);
		
		JPanel panel_449 = new JPanel();
		panel_449.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_449.setBackground(currentColor);
			}
		});
		panel_449.setBounds(649, 182, 15, 16);
		frame.getContentPane().add(panel_449);
		
		JPanel panel_450 = new JPanel();
		panel_450.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_450.setBackground(currentColor);
			}
		});
		panel_450.setBounds(630, 190, 15, 16);
		frame.getContentPane().add(panel_450);
		
		JPanel panel_451 = new JPanel();
		panel_451.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_451.setBackground(currentColor);
			}
		});
		panel_451.setBounds(609, 196, 15, 16);
		frame.getContentPane().add(panel_451);
		
		JPanel panel_452 = new JPanel();
		panel_452.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_452.setBackground(currentColor);
			}
		});
		panel_452.setBounds(27, 196, 15, 16);
		frame.getContentPane().add(panel_452);
		
		JPanel panel_453 = new JPanel();
		panel_453.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_453.setBackground(currentColor);
			}
		});
		panel_453.setBounds(47, 204, 15, 16);
		frame.getContentPane().add(panel_453);
		
		JPanel panel_454 = new JPanel();
		panel_454.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_454.setBackground(currentColor);
			}
		});
		panel_454.setBounds(66, 211, 15, 16);
		frame.getContentPane().add(panel_454);
		
		JPanel panel_455 = new JPanel();
		panel_455.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_455.setBackground(currentColor);
			}
		});
		panel_455.setBounds(86, 219, 15, 16);
		frame.getContentPane().add(panel_455);
		
		JPanel panel_456 = new JPanel();
		panel_456.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_456.setBackground(currentColor);
			}
		});
		panel_456.setBounds(105, 225, 15, 16);
		frame.getContentPane().add(panel_456);
		
		JPanel panel_457 = new JPanel();
		panel_457.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_457.setBackground(currentColor);
			}
		});
		panel_457.setBounds(124, 233, 15, 16);
		frame.getContentPane().add(panel_457);
		
		JPanel panel_458 = new JPanel();
		panel_458.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_458.setBackground(currentColor);
			}
		});
		panel_458.setBounds(27, 229, 15, 16);
		frame.getContentPane().add(panel_458);
		
		JPanel panel_459 = new JPanel();
		panel_459.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_459.setBackground(currentColor);
			}
		});
		panel_459.setBounds(47, 237, 15, 16);
		frame.getContentPane().add(panel_459);
		
		JPanel panel_460 = new JPanel();
		panel_460.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_460.setBackground(currentColor);
			}
		});
		panel_460.setBounds(66, 244, 15, 16);
		frame.getContentPane().add(panel_460);
		
		JPanel panel_461 = new JPanel();
		panel_461.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_461.setBackground(currentColor);
			}
		});
		panel_461.setBounds(86, 252, 15, 16);
		frame.getContentPane().add(panel_461);
		
		JPanel panel_462 = new JPanel();
		panel_462.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_462.setBackground(currentColor);
			}
		});
		panel_462.setBounds(105, 258, 15, 16);
		frame.getContentPane().add(panel_462);
		
		JPanel panel_463 = new JPanel();
		panel_463.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_463.setBackground(currentColor);
			}
		});
		panel_463.setBounds(124, 266, 15, 16);
		frame.getContentPane().add(panel_463);
		
		JPanel panel_464 = new JPanel();
		panel_464.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_464.setBackground(currentColor);
			}
		});
		panel_464.setBounds(27, 263, 15, 16);
		frame.getContentPane().add(panel_464);
		
		JPanel panel_465 = new JPanel();
		panel_465.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_465.setBackground(currentColor);
			}
		});
		panel_465.setBounds(47, 271, 15, 16);
		frame.getContentPane().add(panel_465);
		
		JPanel panel_466 = new JPanel();
		panel_466.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_466.setBackground(currentColor);
			}
		});
		panel_466.setBounds(66, 278, 15, 16);
		frame.getContentPane().add(panel_466);
		
		JPanel panel_467 = new JPanel();
		panel_467.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_467.setBackground(currentColor);
			}
		});
		panel_467.setBounds(86, 286, 15, 16);
		frame.getContentPane().add(panel_467);
		
		JPanel panel_468 = new JPanel();
		panel_468.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_468.setBackground(currentColor);
			}
		});
		panel_468.setBounds(609, 230, 15, 16);
		frame.getContentPane().add(panel_468);
		
		JPanel panel_469 = new JPanel();
		panel_469.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_469.setBackground(currentColor);
			}
		});
		panel_469.setBounds(630, 224, 15, 16);
		frame.getContentPane().add(panel_469);
		
		JPanel panel_470 = new JPanel();
		panel_470.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_470.setBackground(currentColor);
			}
		});
		panel_470.setBounds(649, 216, 15, 16);
		frame.getContentPane().add(panel_470);
		
		JPanel panel_471 = new JPanel();
		panel_471.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_471.setBackground(currentColor);
			}
		});
		panel_471.setBounds(668, 209, 15, 16);
		frame.getContentPane().add(panel_471);
		
		JPanel panel_472 = new JPanel();
		panel_472.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_472.setBackground(currentColor);
			}
		});
		panel_472.setBounds(688, 202, 15, 16);
		frame.getContentPane().add(panel_472);
		
		JPanel panel_473 = new JPanel();
		panel_473.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_473.setBackground(currentColor);
			}
		});
		panel_473.setBounds(708, 194, 15, 16);
		frame.getContentPane().add(panel_473);
		
		JPanel panel_474 = new JPanel();
		panel_474.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_474.setBackground(currentColor);
			}
		});
		panel_474.setBounds(609, 265, 15, 16);
		frame.getContentPane().add(panel_474);
		
		JPanel panel_475 = new JPanel();
		panel_475.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_475.setBackground(currentColor);
			}
		});
		panel_475.setBounds(630, 259, 15, 16);
		frame.getContentPane().add(panel_475);
		
		JPanel panel_476 = new JPanel();
		panel_476.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_476.setBackground(currentColor);
			}
		});
		panel_476.setBounds(649, 251, 15, 16);
		frame.getContentPane().add(panel_476);
		
		JPanel panel_477 = new JPanel();
		panel_477.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_477.setBackground(currentColor);
			}
		});
		panel_477.setBounds(668, 244, 15, 16);
		frame.getContentPane().add(panel_477);
		
		JPanel panel_478 = new JPanel();
		panel_478.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_478.setBackground(currentColor);
			}
		});
		panel_478.setBounds(688, 237, 15, 16);
		frame.getContentPane().add(panel_478);
		
		JPanel panel_479 = new JPanel();
		panel_479.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_479.setBackground(currentColor);
			}
		});
		panel_479.setBounds(708, 229, 15, 16);
		frame.getContentPane().add(panel_479);
		
		JPanel panel_482 = new JPanel();
		panel_482.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_482.setBackground(currentColor);
			}
		});
		panel_482.setBounds(649, 285, 15, 16);
		frame.getContentPane().add(panel_482);
		
		JPanel panel_483 = new JPanel();
		panel_483.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_483.setBackground(currentColor);
			}
		});
		panel_483.setBounds(668, 278, 15, 16);
		frame.getContentPane().add(panel_483);
		
		JPanel panel_484 = new JPanel();
		panel_484.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_484.setBackground(currentColor);
			}
		});
		panel_484.setBounds(688, 271, 15, 16);
		frame.getContentPane().add(panel_484);
		
		JPanel panel_485 = new JPanel();
		panel_485.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_485.setBackground(currentColor);
			}
		});
		panel_485.setBounds(708, 263, 15, 16);
		frame.getContentPane().add(panel_485);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		buttonGroup.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_1 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_1.setBackground(c_1);
						currentColor = c_1;
			}
		});
		
		radioButton_1.setBounds(797, 21, 21, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_2 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_2.setBackground(c_2);
						currentColor = c_2;
			}
		});
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(796, 52, 21, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_3 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_3.setBackground(c_3);
						currentColor = c_3;
			}
		});
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(796, 83, 21, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_4 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_4.setBackground(c_4);
						currentColor = c_4;
			}
		});
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(796, 114, 21, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_5 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_5.setBackground(c_5);
						currentColor = c_5;
			}
		});
		buttonGroup.add(radioButton_5);
		radioButton_5.setBounds(796, 145, 21, 23);
		frame.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_6 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_6.setBackground(c_6);
						currentColor = c_6;
			}
		});
		buttonGroup.add(radioButton_6);
		radioButton_6.setBounds(796, 176, 21, 23);
		frame.getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_7 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_7.setBackground(c_7);
						currentColor = c_7;
			}
		});
		buttonGroup.add(radioButton_7);
		radioButton_7.setBounds(796, 207, 21, 23);
		frame.getContentPane().add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_8 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_8.setBackground(c_8);
						currentColor = c_8;
			}
		});
		buttonGroup.add(radioButton_8);
		radioButton_8.setBounds(796, 238, 21, 23);
		frame.getContentPane().add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("");
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_9 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_9.setBackground(c_9);
						currentColor = c_9;
			}
		});
		buttonGroup.add(radioButton_9);
		radioButton_9.setBounds(796, 269, 21, 23);
		frame.getContentPane().add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("");
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_10 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_10.setBackground(c_10);
						currentColor = c_10;
			}
		});
		buttonGroup.add(radioButton_10);
		radioButton_10.setBounds(797, 300, 21, 23);
		frame.getContentPane().add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("");
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_11 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_11.setBackground(c_11);
						currentColor = c_11;
			}
		});
		buttonGroup.add(radioButton_11);
		radioButton_11.setBounds(797, 331, 21, 23);
		frame.getContentPane().add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("");
		radioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_12 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_12.setBackground(c_12);
						currentColor = c_12;
			}
		});
		buttonGroup.add(radioButton_12);
		radioButton_12.setBounds(797, 362, 21, 23);
		frame.getContentPane().add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("");
		radioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_13 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_13.setBackground(c_13);
						currentColor = c_13;
			}
		});
		buttonGroup.add(radioButton_13);
		radioButton_13.setBounds(797, 393, 21, 23);
		frame.getContentPane().add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("");
		radioButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_14 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_14.setBackground(c_14);
						currentColor = c_14;
			}
		});
		buttonGroup.add(radioButton_14);
		radioButton_14.setBounds(797, 424, 21, 23);
		frame.getContentPane().add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("");
		radioButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_15 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_15.setBackground(c_15);
						currentColor = c_15;
			}
		});
		buttonGroup.add(radioButton_15);
		radioButton_15.setBounds(797, 455, 21, 23);
		frame.getContentPane().add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("");
		radioButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_16 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_16.setBackground(c_16);
						currentColor = c_16;
			}
		});
		buttonGroup.add(radioButton_16);
		radioButton_16.setBounds(797, 486, 21, 23);
		frame.getContentPane().add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("");
		radioButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_17 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_17.setBackground(c_17);
						currentColor = c_17;
			}
		});
		buttonGroup.add(radioButton_17);
		radioButton_17.setBounds(797, 517, 21, 23);
		frame.getContentPane().add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("");
		radioButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_18 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_18.setBackground(c_18);
						currentColor = c_18;
			}
		});
		buttonGroup.add(radioButton_18);
		radioButton_18.setBounds(797, 548, 21, 23);
		frame.getContentPane().add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("");
		radioButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_19 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_19.setBackground(c_19);
						currentColor = c_19;
			}
		});
		buttonGroup.add(radioButton_19);
		radioButton_19.setBounds(797, 579, 21, 23);
		frame.getContentPane().add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("");
		radioButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_20 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_20.setBackground(c_20);
						currentColor = c_20;
			}
		});
		buttonGroup.add(radioButton_20);
		radioButton_20.setBounds(797, 610, 21, 23);
		frame.getContentPane().add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("");
		radioButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_21 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_21.setBackground(c_21);
						currentColor = c_21;
			}
		});
		buttonGroup.add(radioButton_21);
		radioButton_21.setBounds(797, 641, 21, 23);
		frame.getContentPane().add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("");
		radioButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_22 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_22.setBackground(c_22);
						currentColor = c_22;
			}
		});
		buttonGroup.add(radioButton_22);
		radioButton_22.setBounds(797, 672, 21, 23);
		frame.getContentPane().add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("");
		radioButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_23 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_23.setBackground(c_23);
						currentColor = c_23;
			}
		});
		buttonGroup.add(radioButton_23);
		radioButton_23.setBounds(797, 703, 21, 23);
		frame.getContentPane().add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton("");
		radioButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_24 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_24.setBackground(c_24);
						currentColor = c_24;
			}
		});
		buttonGroup.add(radioButton_24);
		radioButton_24.setBounds(797, 734, 21, 23);
		frame.getContentPane().add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("");
		radioButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_25 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_25.setBackground(c_25);
						currentColor = c_25;
			}
		});
		buttonGroup.add(radioButton_25);
		radioButton_25.setBounds(797, 765, 21, 23);
		frame.getContentPane().add(radioButton_25);

		JRadioButton radioButton_26 = new JRadioButton("");
		radioButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser();
				Color c_26 = jcc.showDialog(null, "please select a color", Color.RED);
						panel_26.setBackground(c_26);
						currentColor = c_26;
			}
		});
		buttonGroup.add(radioButton_26);
		radioButton_26.setBounds(797, 796, 21, 23);
		frame.getContentPane().add(radioButton_26);
		
		textField_1 = new JTextField();
		textField_1.setBounds(868, 21, 115, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(868, 51, 115, 23);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(868, 83, 115, 23);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(868, 114, 115, 23);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(868, 145, 115, 23);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(868, 176, 115, 23);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(868, 207, 115, 23);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(868, 239, 115, 23);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(868, 270, 115, 23);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(868, 301, 115, 23);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(868, 332, 115, 23);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(868, 362, 115, 23);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(868, 394, 115, 23);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(868, 425, 115, 23);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(868, 456, 115, 23);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(868, 487, 115, 23);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(868, 517, 115, 23);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(868, 549, 115, 23);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(868, 580, 115, 23);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(868, 611, 115, 23);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(868, 642, 115, 23);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(868, 672, 115, 23);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(868, 704, 115, 23);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(868, 735, 115, 23);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(868, 766, 115, 23);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(868, 797, 115, 23);
		frame.getContentPane().add(textField_26);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 768, 846);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

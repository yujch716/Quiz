package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizHome extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizHome frame = new QuizHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(QuizHome.class.getResource("/image/quizbackground.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 435);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 프로그램 제목 ===========================================
		JLabel lbHomeTitle = new JLabel("연상퀴즈");
		lbHomeTitle.setForeground(Color.WHITE);
		lbHomeTitle.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lbHomeTitle.setBounds(203, 24, 212, 60);
		contentPane.add(lbHomeTitle);
		//=====================================================
		
		// 프로그램 종료 버튼 =======================================
		JButton jbExit = new JButton("게임종료");
		jbExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
			}
		});
		jbExit.setForeground(Color.BLACK);
		jbExit.setBackground(Color.WHITE);
		jbExit.setBounds(254, 285, 97, 23);
		contentPane.add(jbExit);
		//======================================================
		
		// 게임 시작 버튼 ===========================================
		JButton jbStart = new JButton("게임시작");
		jbStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new Nickname().setVisible(true);
			}
		});
		jbStart.setForeground(Color.BLACK);
		jbStart.setBackground(Color.WHITE);
		jbStart.setBounds(254, 250, 97, 23);
		contentPane.add(jbStart);
		//======================================================
		
		// 게임 설명 버튼 ===========================================
		JButton jbRule = new JButton("게임설명");
		jbRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new QuizRule().setVisible(true);
			}
		});
		jbRule.setBackground(Color.WHITE);
		jbRule.setForeground(Color.BLACK);
		jbRule.setBounds(254, 214, 97, 23);
		contentPane.add(jbRule);
		//=======================================================
		
		// 배경 이미지 
		JLabel lbBackground = new JLabel("New label");
		lbBackground.setIcon(new ImageIcon(QuizHome.class.getResource("/image/quizbackground.jpg")));
		lbBackground.setBounds(0, 0, 636, 396);
		contentPane.add(lbBackground);
	}
}

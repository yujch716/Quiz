package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Nickname extends JFrame {

	private JPanel contentPane;
	private static JTextField txtNick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nickname frame = new Nickname();
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
	public Nickname() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 유저 이미지 ===========================================
		JLabel lbUserImage = new JLabel("");
		lbUserImage.setIcon(new ImageIcon(Nickname.class.getResource("/image/yoshi (1) (2).png")));
		lbUserImage.setForeground(Color.WHITE);
		lbUserImage.setBackground(Color.WHITE);
		lbUserImage.setBounds(182, 48, 169, 116);
		contentPane.add(lbUserImage);
		//=====================================================
		
		// 게임시작 버튼 ==========================================
		JButton jbPlaygame = new JButton("");
		jbPlaygame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new QuizGame().setVisible(true);
			}
		});
		jbPlaygame.setIcon(new ImageIcon(Nickname.class.getResource("/image/arrow(1).png")));
		jbPlaygame.setBackground(Color.WHITE);
		jbPlaygame.setBounds(480, 336, 30, 30);
		contentPane.add(jbPlaygame);
		
		JLabel lbPalygame = new JLabel("\uC2DC\uC791");
		lbPalygame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new QuizGame().setVisible(true);
			}
		});
		lbPalygame.setForeground(new Color(147, 112, 219));
		lbPalygame.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbPalygame.setBounds(522, 336, 90, 30);
		contentPane.add(lbPalygame);
		//=====================================================
		
		// 메인으로 가는 버튼 ========================================
		JButton jbHome2 = new JButton("");
		jbHome2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		jbHome2.setIcon(new ImageIcon(Nickname.class.getResource("/image/arrow(2).png")));
		jbHome2.setBounds(480, 296, 30, 30);
		contentPane.add(jbHome2);

		JLabel lbHome2 = new JLabel("\uBA54\uC778\uC73C\uB85C");
		lbHome2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		lbHome2.setForeground(new Color(147, 112, 219));
		lbHome2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbHome2.setBounds(522, 296, 90, 30);
		contentPane.add(lbHome2);
		//=====================================================

		// 유저의 닉네임을 입력 받는 텍스트 필드 ================================
		setTxtNick(new JTextField());
		getTxtNick().setText("닉네임을 입력해주세요");
		getTxtNick().setBounds(200, 180, 200, 23);
		contentPane.add(getTxtNick());
		getTxtNick().setColumns(10);
		//=====================================================
		
	}

	public static JTextField getTxtNick() {
		return txtNick;
	}

	public static void setTxtNick(JTextField txtNick) {
		Nickname.txtNick = txtNick;
	}
	
}

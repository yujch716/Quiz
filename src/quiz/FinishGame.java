package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FinishGame extends JFrame {

	private JPanel contentPane;
	int RoundNum = Integer.parseInt(QuizGame.getRoundNum().getText());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinishGame frame = new FinishGame();
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
	public FinishGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 문제 진행 상황 ==========================================
		JLabel QuizNum1 = new JLabel("");
		QuizNum1.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		QuizNum1.setBounds(195, 12, 30, 30);
		contentPane.add(QuizNum1);

		JLabel QuizNum2 = new JLabel("");
		if (RoundNum >= 2) {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum2.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum2.setBounds(237, 12, 30, 30);
		contentPane.add(QuizNum2);

		JLabel QuizNum3 = new JLabel("");
		if (RoundNum >= 3) {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
			} else {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum3.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum3.setBounds(279, 12, 30, 30);
		contentPane.add(QuizNum3);

		JLabel QuizNum4 = new JLabel("");
		if (RoundNum >= 4) {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum4.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum4.setBounds(321, 12, 30, 30);
		contentPane.add(QuizNum4);

		JLabel QuizNum5 = new JLabel("");
		if (RoundNum >= 5) {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
			}
		QuizNum5.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum5.setBounds(363, 12, 30, 30);
		contentPane.add(QuizNum5);
		//=====================================================
		
		// Congratulation!! 출력 ================================
		JLabel lbResult2 = new JLabel("Congratulation!!");
		lbResult2.setBackground(new Color(255, 255, 255));
		lbResult2.setForeground(new Color(255, 255, 0));
		lbResult2.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		lbResult2.setBounds(109, 202, 397, 76);
		contentPane.add(lbResult2);
		//=====================================================
		
		// 유저 이미지 ============================================
		JLabel lbUserImage5 = new JLabel("");
		lbUserImage5.setIcon(new ImageIcon(FinishGame.class.getResource("/image/yoshi (1) (2) (1).png")));
		lbUserImage5.setForeground(Color.WHITE);
		lbUserImage5.setBackground(Color.WHITE);
		lbUserImage5.setBounds(234, 92, 88, 64);
		contentPane.add(lbUserImage5);
		//=====================================================
		
		// 유저의 닉네임 ===========================================
		JLabel lbNick4 = new JLabel(Nickname.getTxtNick().getText());
		lbNick4.setBackground(new Color(0, 0, 102));
		lbNick4.setFont(new Font("굴림", Font.BOLD, 20));
		lbNick4.setForeground(Color.ORANGE);
		lbNick4.setBounds(241, 151, 110, 30);
		contentPane.add(lbNick4);
		//=====================================================
		
		// 메인으로 가는 버튼 =======================================
		JButton jbHome5 = new JButton("");
		jbHome5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		jbHome5.setIcon(new ImageIcon(FinishGame.class.getResource("/image/arrow(2).png")));
		jbHome5.setBackground(Color.WHITE);
		jbHome5.setBounds(476, 336, 30, 30);
		contentPane.add(jbHome5);
		
		JLabel lbHome5 = new JLabel("\uBA54\uC778\uC73C\uB85C");
		lbHome5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		lbHome5.setForeground(new Color(147, 112, 219));
		lbHome5.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbHome5.setBounds(518, 336, 90, 30);
		contentPane.add(lbHome5);
		//=====================================================
		
		// WOW 배경 =============================================
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FinishGame.class.getResource("/image/wowcartoon-pixabay.png")));
		lblNewLabel.setBounds(145, 52, 298, 233);
		contentPane.add(lblNewLabel);
		//=====================================================
	}

}

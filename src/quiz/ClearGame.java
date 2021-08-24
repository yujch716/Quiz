package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClearGame extends JFrame {

	private JPanel contentPane;
	int RoundNum = Integer.parseInt(QuizGame.getRoundNum().getText());
	int HintNum = Integer.parseInt(QuizGame.getHintNum().getText());
	int ChallengeNum = Integer.parseInt(QuizGame.getChallengeNum().getText());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClearGame frame = new ClearGame();
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
	public ClearGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 문제 번호 ============================================
		JLabel txtquestionnumber2 = new JLabel(String.valueOf(RoundNum));
		txtquestionnumber2.setForeground(Color.WHITE);
		txtquestionnumber2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		txtquestionnumber2.setBounds(33, 0, 30, 52);
		contentPane.add(txtquestionnumber2);
		//=====================================================

		// 문제 진행 상황 ==========================================
		JLabel QuizNum1 = new JLabel("");
		QuizNum1.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		QuizNum1.setBounds(68, 12, 30, 30);
		contentPane.add(QuizNum1);

		JLabel QuizNum2 = new JLabel("");
		if (RoundNum >= 2) {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum2.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum2.setBounds(110, 12, 30, 30);
		contentPane.add(QuizNum2);

		JLabel QuizNum3 = new JLabel("");
		if (RoundNum >= 3) {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum3.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum3.setBounds(152, 12, 30, 30);
		contentPane.add(QuizNum3);

		JLabel QuizNum4 = new JLabel("");
		if (RoundNum >= 4) {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum4.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum4.setBounds(195, 12, 30, 30);
		contentPane.add(QuizNum4);

		JLabel QuizNum5 = new JLabel("");
		if (RoundNum >= 5) {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum5.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum5.setBounds(237, 12, 30, 30);
		contentPane.add(QuizNum5);
		//=====================================================

		// 기회 =================================================
		JLabel lbstar1 = new JLabel("New label");
		lbstar1.setForeground(Color.BLACK);
		lbstar1.setBackground(Color.WHITE);
		if (ChallengeNum <= 4) {
			lbstar1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar1.setBounds(149, 67, 64, 64);
		contentPane.add(lbstar1);

		JLabel lbstar2 = new JLabel("New label");
		if (ChallengeNum <= 3) {
			lbstar2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar2.setBounds(213, 67, 64, 64);
		contentPane.add(lbstar2);

		JLabel lbstar3 = new JLabel("New label");
		if (ChallengeNum <= 2) {
			lbstar3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar3.setBounds(277, 67, 64, 64);
		contentPane.add(lbstar3);

		JLabel lbstar4 = new JLabel("New label");

		if (ChallengeNum <= 1) {
			lbstar4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar4.setBounds(343, 67, 64, 64);
		contentPane.add(lbstar4);

		JLabel lbstar5 = new JLabel("New label");
		if (ChallengeNum == 0) {
			lbstar5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar5.setBounds(408, 67, 64, 64);
		contentPane.add(lbstar5);
		//=====================================================

		// 유저 이미지 ============================================
		JLabel lbUserImage3 = new JLabel("");
		lbUserImage3.setIcon(new ImageIcon(ClearGame.class.getResource("/image/yoshi (1) (2) (1).png")));
		lbUserImage3.setForeground(Color.WHITE);
		lbUserImage3.setBackground(Color.WHITE);
		lbUserImage3.setBounds(247, 151, 88, 64);
		contentPane.add(lbUserImage3);
		//=====================================================
		
		// 다음문제로 넘어가는 버튼 ===================================
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				setVisible(false);
				new QuizGame().setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(ClearGame.class.getResource("/image/arrow(1).png")));
		button.setBackground(Color.WHITE);
		button.setBounds(468, 319, 30, 30);
		contentPane.add(button);

		JLabel label_9 = new JLabel("\uB2E4\uC74C\uBB38\uC81C");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new QuizGame().setVisible(true);
			}
		});
		label_9.setForeground(new Color(147, 112, 219));
		label_9.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label_9.setBounds(511, 319, 90, 30);
		contentPane.add(label_9);
		//=====================================================

		// 유저의 닉네임 ==========================================
		JLabel lbNick2 = new JLabel(Nickname.getTxtNick().getText());
		lbNick2.setFont(new Font("굴림", Font.BOLD, 20));
		lbNick2.setForeground(Color.ORANGE);
		lbNick2.setBounds(243, 212, 127, 30);
		contentPane.add(lbNick2);
		//=====================================================
		
		// 라운드 클리어 문구 =======================================
		JLabel lbResult = new JLabel(String.valueOf(RoundNum) + " Round Clear!");
		lbResult.setForeground(Color.YELLOW);
		lbResult.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lbResult.setBounds(172, 239, 300, 63);
		contentPane.add(lbResult);
		//=====================================================
		

	}
}

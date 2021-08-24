package quiz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FalseGame extends JFrame {

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
					FalseGame frame = new FalseGame();
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
	public FalseGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// 문제 번호 =============================================
		JLabel txtquestionnumber3 = new JLabel(String.valueOf(RoundNum));
		txtquestionnumber3.setForeground(Color.WHITE);
		txtquestionnumber3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		txtquestionnumber3.setBounds(33, 0, 35, 49);
		contentPane.add(txtquestionnumber3);
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
		lbstar1.setIcon(new ImageIcon(FalseGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		lbstar1.setBounds(149, 67, 64, 64);
		contentPane.add(lbstar1);
		
		JLabel lbstar2 = new JLabel("New label");
		lbstar2.setIcon(new ImageIcon(FalseGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		lbstar2.setBounds(213, 67, 64, 64);
		contentPane.add(lbstar2);
		

		JLabel lbstar3 = new JLabel("New label");
		lbstar3.setIcon(new ImageIcon(FalseGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		lbstar3.setBounds(277, 67, 64, 64);
		contentPane.add(lbstar3);
		
		JLabel lbstar4 = new JLabel("New label");
		lbstar4.setIcon(new ImageIcon(FalseGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		lbstar4.setBounds(343, 67, 64, 64);
		contentPane.add(lbstar4);
		
		JLabel lbstar5 = new JLabel("New label");
		lbstar5.setIcon(new ImageIcon(FalseGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		lbstar5.setBounds(408, 67, 64, 64);
		contentPane.add(lbstar5);
		//=====================================================
		
		// 유저의 닉네임 ===========================================
		JLabel lbNick3 = new JLabel(Nickname.getTxtNick().getText());
		lbNick3.setBackground(new Color(0, 0, 102));
		lbNick3.setFont(new Font("굴림", Font.BOLD, 20));
		lbNick3.setForeground(Color.ORANGE);
		lbNick3.setBounds(258, 280, 110, 30);
		contentPane.add(lbNick3);
		//=====================================================
		
		// 유저 이미지 ============================================
		JLabel lbUserImage4 = new JLabel("");
		lbUserImage4.setIcon(new ImageIcon(FalseGame.class.getResource("/image/yoshi (1) (2) (1).png")));
		lbUserImage4.setForeground(Color.WHITE);
		lbUserImage4.setBackground(new Color(0, 0, 102));
		lbUserImage4.setBounds(258, 224, 107, 64);
		contentPane.add(lbUserImage4);
		//=====================================================
		
		// 메인으로 가는 버튼 =======================================
		JButton jbHome4 = new JButton("");
		jbHome4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		jbHome4.setIcon(new ImageIcon(FalseGame.class.getResource("/image/arrow(2).png")));
		jbHome4.setBackground(Color.WHITE);
		jbHome4.setBounds(480, 340, 30, 30);
		contentPane.add(jbHome4);
		
		JLabel lbHome4 = new JLabel("\uB2E4\uC2DC\uB3C4\uC804");
		lbHome4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		lbHome4.setForeground(new Color(147, 112, 219));
		lbHome4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbHome4.setBounds(522, 340, 90, 30);
		contentPane.add(lbHome4);
		//=====================================================
		
		// 정답 =================================================	
		JLabel lbAnsw = new JLabel("\uC815\uB2F5");
		lbAnsw.setBackground(new Color(0, 0, 102));
		if (RoundNum == 1) {
			lbAnsw.setText("답 : " + QuizGame.Answ1);
		}
		if (RoundNum == 2) {
			lbAnsw.setText("답 : " + QuizGame.Answ2);
		}
		if (RoundNum == 3) {
			lbAnsw.setText("답 : " + QuizGame.Answ3);
		}
		if (RoundNum == 4) {
			lbAnsw.setText("답 : " + QuizGame.Answ4);
		}
		if (RoundNum == 5) {
			lbAnsw.setText("답 : " + QuizGame.Answ5);
		}
		lbAnsw.setForeground(Color.YELLOW);
		lbAnsw.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lbAnsw.setBounds(223, 146, 172, 49);
		contentPane.add(lbAnsw);
		//=====================================================
		
		// 게임오버 배경 =================================================
		JLabel lbGameover = new JLabel("");
		lbGameover.setIcon(new ImageIcon(FalseGame.class.getResource("/image/gameover-pixabay.png")));
		lbGameover.setBounds(0, 141, 624, 189);
		contentPane.add(lbGameover);
		//=====================================================
	}
}

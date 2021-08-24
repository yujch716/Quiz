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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class QuizGame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnsw;

	public static JLabel lbNick;

	static int num = 1;// 라운드
	static int n = 0;// 도전횟수
	static int sw = 0;// 힌트

	static String Answ1 = "나비";
	static String s1_1 = "고양이 이름";
	static String s1_2 = "넥타이";
	static String s1_3 = "곤충";
	static String s1_4 = "접영";

	static String Answ2 = "만두";
	static String s2_1 = "고기";
	static String s2_2 = "중국집";
	static String s2_3 = "()()국";
	static String s2_4 = "올드보이";

	static String Answ3 = "녹차";
	static String s3_1 = "티백";
	static String s3_2 = "라떼";
	static String s3_3 = "보성";
	static String s3_4 = "초록색";

	static String Answ4 = "햄버거";
	static String s4_1 = "맥도날드";
	static String s4_2 = "사이다";
	static String s4_3 = "콜라";
	static String s4_4 = "롯데리아";

	static String Answ5 = "우유";
	static String s5_1 = "칼슘";
	static String s5_2 = "키";
	static String s5_3 = "젓소";
	static String s5_4 = "서울()()";

	private JTextField txtHint1;
	private JTextField txtHint2;
	private JTextField txtHint3;
	private JTextField txtHint4;
	private JTextField txtquestionnumber1;

	private static JTextField RoundNum;
	private static JTextField HintNum;
	private static JTextField ChallengeNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizGame frame = new QuizGame();
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
	public QuizGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 힌트 =================================================
		JLabel lbhint1 = new JLabel("\uD78C\uD2B81");
		lbhint1.setForeground(Color.WHITE);
		lbhint1.setBounds(100, 107, 38, 15);
		contentPane.add(lbhint1);

		JLabel lbhint3 = new JLabel("\uD78C\uD2B83");
		lbhint3.setForeground(Color.WHITE);
		lbhint3.setBounds(100, 139, 38, 15);
		contentPane.add(lbhint3);

		JLabel lbhint4 = new JLabel("\uD78C\uD2B84");
		lbhint4.setForeground(Color.WHITE);
		lbhint4.setBounds(322, 139, 38, 15);
		contentPane.add(lbhint4);

		JLabel lbhint2 = new JLabel("\uD78C\uD2B82");
		lbhint2.setForeground(Color.WHITE);
		lbhint2.setBounds(322, 107, 38, 15);
		contentPane.add(lbhint2);
		//=====================================================
		
		// 기회 =================================================
		JLabel lbstar1 = new JLabel("");
		lbstar1.setForeground(Color.BLACK);
		lbstar1.setBackground(Color.WHITE);
		if (n <= 4) {
			lbstar1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar1.setBounds(289, 10, 64, 64);
		contentPane.add(lbstar1);

		JLabel lbstar2 = new JLabel("");
		if (n <= 3) {
			lbstar2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar2.setBounds(353, 10, 64, 64);
		contentPane.add(lbstar2);

		JLabel lbstar3 = new JLabel("");
		if (n <= 2) {
			lbstar3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar3.setBounds(417, 10, 64, 64);
		contentPane.add(lbstar3);

		JLabel lbstar4 = new JLabel("");

		if (n <= 1) {
			lbstar4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar4.setBounds(483, 10, 64, 64);
		contentPane.add(lbstar4);

		JLabel lbstar5 = new JLabel("");
		if (n == 0) {
			lbstar5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-color-star-64.png")));
		} else {
			lbstar5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/icons8-pixel-star-64 (1).png")));
		}
		lbstar5.setBounds(548, 10, 64, 64);
		contentPane.add(lbstar5);
		//=====================================================
		
		// 힌트 나오는 버튼 ========================================
		JButton jbHint = new JButton("\uD78C\uD2B8 \uBC84\uD2BC");
		jbHint.setForeground(new Color(255, 255, 255));
		jbHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == jbHint) {
					if (sw == 0) {
						switch (num) {
						case 1:
							txtHint1.setText(s1_1);
							sw++;
							break;
						case 2:
							txtHint1.setText(s2_1);
							sw++;
							break;
						case 3:
							txtHint1.setText(s3_1);
							sw++;
							break;
						case 4:
							txtHint1.setText(s4_1);
							sw++;
							break;
						case 5:
							txtHint1.setText(s5_1);
							sw++;
							break;
						}
					} else if (sw == 1) {
						switch (num) {
						case 1:
							txtHint2.setText(s1_2);
							sw++;
							break;
						case 2:
							txtHint2.setText(s2_2);
							sw++;
							break;
						case 3:
							txtHint2.setText(s3_2);
							sw++;
							break;
						case 4:
							txtHint2.setText(s4_2);
							sw++;
							break;
						case 5:
							txtHint2.setText(s5_2);
							sw++;
							break;
						}
					} else if (sw == 2) {
						switch (num) {
						case 1:
							txtHint3.setText(s1_3);
							sw++;
							break;
						case 2:
							txtHint3.setText(s2_3);
							sw++;
							break;
						case 3:
							txtHint3.setText(s3_3);
							sw++;
							break;
						case 4:
							txtHint3.setText(s4_3);
							sw++;
							break;
						case 5:
							txtHint3.setText(s5_3);
							sw++;
							break;
						}
					} else if (sw == 3) {
						switch (num) {
						case 1:
							txtHint4.setText(s1_4);
							sw++;
							break;
						case 2:
							txtHint4.setText(s2_4);
							sw++;
							break;
						case 3:
							txtHint4.setText(s3_4);
							sw++;
							break;
						case 4:
							txtHint4.setText(s4_4);
							sw++;
							break;
						case 5:
							txtHint4.setText(s5_4);
							sw++;
							break;
						}
					}
				}
			}
		});
		jbHint.setBackground(new Color(255, 140, 0));
		jbHint.setBounds(400, 177, 97, 23);
		contentPane.add(jbHint);
		//=====================================================
		
		// 유저 이미지 ============================================
		JLabel lbUserImage2 = new JLabel("");
		lbUserImage2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/yoshi (1) (2) (1).png")));
		lbUserImage2.setForeground(Color.WHITE);
		lbUserImage2.setBackground(Color.WHITE);
		lbUserImage2.setBounds(86, 233, 88, 64);
		contentPane.add(lbUserImage2);
		//=====================================================
		
		// 정답 입력 받는 텍스트필드 ==================================
		txtAnsw = new JTextField();
		txtAnsw.setToolTipText("");
		txtAnsw.setText("\uC815\uB2F5\uC785\uB825");
		txtAnsw.setColumns(10);
		txtAnsw.setBounds(188, 247, 223, 35);
		contentPane.add(txtAnsw);
		//=====================================================
		
		// 정답 입력 버튼 ==========================================
		JButton jbAnsw = new JButton("\uC785\uB825");
		jbAnsw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbAnsw) {
					if (n <= 5) {
						switch (num) {
						case 1:
							if (Answ1.equals(txtAnsw.getText())) {
								num++;
								n = 0;
								sw = 0;
								txtquestionnumber1.setText(String.valueOf(num));
								dispose();
								setVisible(false);
								new ClearGame().setVisible(true);
							} else {
								n++;
								sw = 0;
								dispose();
								setVisible(false);

								if (n < 5) {
									new QuizGame().setVisible(true);
								} else {
									n = 0;
									new FalseGame().setVisible(true);
								}

							}
							break;
						case 2:
							if (Answ2.equals(txtAnsw.getText())) {
								n = 0;
								num++;
								sw = 0;
								txtquestionnumber1.setText(String.valueOf(num));
								dispose();
								setVisible(false);
								new ClearGame().setVisible(true);
							} else {
								n++;
								sw = 0;
								dispose();
								setVisible(false);
								if (n < 5) {
									new QuizGame().setVisible(true);
								} else {
									n = 0;
									new FalseGame().setVisible(true);
								}
							}
							break;
						case 3:
							if (Answ3.equals(txtAnsw.getText())) {
								n = 0;
								num++;
								sw = 0;
								txtquestionnumber1.setText(String.valueOf(num));
								dispose();
								setVisible(false);
								new ClearGame().setVisible(true);
							} else {
								n++;
								sw = 0;
								dispose();
								setVisible(false);
								if (n < 5) {
									new QuizGame().setVisible(true);
								} else {
									n = 0;
									new FalseGame().setVisible(true);
								}
							}
							break;
						case 4:
							if (Answ4.equals(txtAnsw.getText())) {
								n = 0;
								num++;
								sw = 0;
								txtquestionnumber1.setText(String.valueOf(num));
								dispose();
								setVisible(false);
								new ClearGame().setVisible(true);
							} else {
								n++;
								sw = 0;
								dispose();
								setVisible(false);
								if (n < 5) {
									new QuizGame().setVisible(true);
								} else {
									n = 0;
									new FalseGame().setVisible(true);
								}
							}
							break;
						case 5:
							if (Answ5.equals(txtAnsw.getText())) {
								n = 0;
								num++;
								sw = 0;
								txtquestionnumber1.setText(String.valueOf(num));
								dispose();
								setVisible(false);
								new FinishGame().setVisible(true);
							} else {
								n++;
								sw = 0;
								dispose();
								setVisible(false);
								if (n < 5) {
									new QuizGame().setVisible(true);
								} else {
									n = 0;
									new FalseGame().setVisible(true);
								}
							}
							break;
						}
					}

				}
			}
		});
		jbAnsw.setForeground(new Color(0, 0, 0));
		jbAnsw.setBackground(new Color(255, 255, 255));
		jbAnsw.setBounds(417, 247, 97, 35);
		contentPane.add(jbAnsw);
		//=====================================================
		
		// 메인으로 가는 버튼 =======================================
		JButton jbHome3 = new JButton("");
		jbHome3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new QuizHome().setVisible(true);

			}
		});
		jbHome3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/arrow(2).png")));
		jbHome3.setBounds(480, 331, 30, 30);
		contentPane.add(jbHome3);

		JLabel lbHome3 = new JLabel("\uBA54\uC778\uC73C\uB85C");
		lbHome3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		lbHome3.setForeground(new Color(147, 112, 219));
		lbHome3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbHome3.setBounds(522, 331, 90, 30);
		contentPane.add(lbHome3);
		//=====================================================
		
		// 힌트가 나오는 텍스트 필드 ==================================
		txtHint1 = new JTextField();
		txtHint1.setBounds(151, 104, 116, 21);
		contentPane.add(txtHint1);
		txtHint1.setColumns(10);

		txtHint2 = new JTextField();
		txtHint2.setColumns(10);
		txtHint2.setBounds(365, 104, 116, 21);
		contentPane.add(txtHint2);

		txtHint3 = new JTextField();
		txtHint3.setColumns(10);
		txtHint3.setBounds(150, 136, 116, 21);
		contentPane.add(txtHint3);

		txtHint4 = new JTextField();
		txtHint4.setColumns(10);
		txtHint4.setBounds(365, 136, 116, 21);
		contentPane.add(txtHint4);
		//=====================================================
		
		// 문제 번호 =============================================
		txtquestionnumber1 = new JTextField();
		txtquestionnumber1.setHorizontalAlignment(SwingConstants.CENTER);
		txtquestionnumber1.setForeground(new Color(255, 255, 255));
		txtquestionnumber1.setText(String.valueOf(num));
		txtquestionnumber1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		txtquestionnumber1.setBackground(new Color(0, 0, 128));
		txtquestionnumber1.setBounds(18, 10, 38, 42);
		contentPane.add(txtquestionnumber1);
		txtquestionnumber1.setColumns(10);
		//=====================================================
		
		// 문제 진행 상황 ==========================================
		JLabel QuizNum1 = new JLabel("");
		QuizNum1.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum1.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		QuizNum1.setBounds(68, 12, 30, 30);
		contentPane.add(QuizNum1);

		JLabel QuizNum2 = new JLabel("");
		if (num >= 2) {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum2.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum2.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum2.setBounds(110, 12, 30, 30);
		contentPane.add(QuizNum2);

		JLabel QuizNum3 = new JLabel("");
		if (num >= 3) {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum3.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum3.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum3.setBounds(152, 12, 30, 30);
		contentPane.add(QuizNum3);

		JLabel QuizNum4 = new JLabel("");
		if (num >= 4) {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum4.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum4.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum4.setBounds(195, 12, 30, 30);
		contentPane.add(QuizNum4);

		JLabel QuizNum5 = new JLabel("");
		if (num >= 5) {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-green.png")));
		} else {
			QuizNum5.setIcon(new ImageIcon(QuizGame.class.getResource("/image/circle-blue.png")));
		}
		QuizNum5.setHorizontalAlignment(SwingConstants.CENTER);
		QuizNum5.setBounds(237, 12, 30, 30);
		contentPane.add(QuizNum5);
		//=====================================================
		
		// 유저의 닉네임  ==========================================
		JLabel lbNick1 = new JLabel(Nickname.getTxtNick().getText());
		lbNick1.setFont(new Font("굴림", Font.BOLD, 20));
		lbNick1.setForeground(Color.ORANGE);
		lbNick1.setBounds(96, 292, 128, 30);
		contentPane.add(lbNick1);
		//=====================================================

		setRoundNum(new JTextField());
		getRoundNum().setText(String.valueOf(num));
		contentPane.add(getRoundNum());

		setHintNum(new JTextField());
		getHintNum().setText(String.valueOf(sw));
		contentPane.add(getHintNum());

		setChallengeNum(new JTextField());
		getChallengeNum().setText(String.valueOf(n));
		contentPane.add(getChallengeNum());
	}

	public static JTextField getRoundNum() {
		return RoundNum;
	}

	public static void setRoundNum(JTextField roundNum) {
		RoundNum = roundNum;
	}

	public static JTextField getHintNum() {
		return HintNum;
	}

	public static void setHintNum(JTextField hintNum) {
		HintNum = hintNum;
	}

	public static JTextField getChallengeNum() {
		return ChallengeNum;
	}

	public static void setChallengeNum(JTextField challengeNum) {
		ChallengeNum = challengeNum;
	}
}

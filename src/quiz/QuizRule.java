package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuizRule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizRule frame = new QuizRule();
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
	public QuizRule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 제목 ================================================
		JLabel lbRuleTitle = new JLabel("게임설명");
		lbRuleTitle.setForeground(Color.ORANGE);
				lbRuleTitle.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lbRuleTitle.setBounds(236, 20, 120, 41);
		contentPane.add(lbRuleTitle);
		//=====================================================
				
		// 게임설명 ==============================================
		JTextArea txtRule = new JTextArea();
		txtRule.setText("사용할 닉네임을 입력한뒤 게임을 실행한다.\n\n"
				+ "힌트를 보고 정답을 맞춘다.\n"
				+ " - 총 5문제로 구성되어 있다.\n"
				+ " - 힌트는 한 문제당 4개이다.\n"
				+ " - 한 문제당 주어진 기회는 5회이며 기회를 다 \n   사용할시 실패한다.\n"
				+ "   (남은 기회는 상단의 별의 갯수로 알 수 있다.)");
		txtRule.setBounds(125, 82, 350, 212);
		contentPane.add(txtRule);
				
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(114, 71, 372, 232);
		contentPane.add(panel);
		//=====================================================
		
		// 메인으로 가는 버튼 ========================================
		JButton jbHome1 = new JButton("");
		jbHome1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		jbHome1.setIcon(new ImageIcon(QuizRule.class.getResource("/image/arrow(2).png")));
		jbHome1.setBounds(480, 308, 30, 30);
		contentPane.add(jbHome1);
		
		JLabel lbHome1 = new JLabel("\uBA54\uC778\uC73C\uB85C");
		lbHome1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		lbHome1.setForeground(new Color(147, 112, 219));
		lbHome1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbHome1.setBounds(522, 308, 90, 30);
		contentPane.add(lbHome1);
		//=====================================================
		
		// 닉네임 생성으로 가는 버튼 ==================================
		JButton jbNick1 = new JButton("");
		jbNick1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();  
				setVisible(false);
				new QuizHome().setVisible(true);
			}
		});
		jbNick1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  
				setVisible(false);
				new Nickname().setVisible(true);
			}
		});
		jbNick1.setBackground(new Color(255, 255, 255));
		jbNick1.setIcon(new ImageIcon(QuizRule.class.getResource("/image/arrow(1).png")));
		jbNick1.setBounds(480, 348, 30, 30);
		contentPane.add(jbNick1);
		
		JLabel lbNick1 = new JLabel("\uC2DC\uC791");
		lbNick1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();  
				setVisible(false);
				new Nickname().setVisible(true);
			}
		});
		lbNick1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbNick1.setForeground(new Color(147, 112, 219));
		lbNick1.setBounds(522, 348, 90, 30);
		contentPane.add(lbNick1);
		//=====================================================
				
	}
}

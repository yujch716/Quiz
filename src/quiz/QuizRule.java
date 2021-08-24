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
		
		// ���� ================================================
		JLabel lbRuleTitle = new JLabel("���Ӽ���");
		lbRuleTitle.setForeground(Color.ORANGE);
				lbRuleTitle.setFont(new Font("���� ���", Font.BOLD, 30));
		lbRuleTitle.setBounds(236, 20, 120, 41);
		contentPane.add(lbRuleTitle);
		//=====================================================
				
		// ���Ӽ��� ==============================================
		JTextArea txtRule = new JTextArea();
		txtRule.setText("����� �г����� �Է��ѵ� ������ �����Ѵ�.\n\n"
				+ "��Ʈ�� ���� ������ �����.\n"
				+ " - �� 5������ �����Ǿ� �ִ�.\n"
				+ " - ��Ʈ�� �� ������ 4���̴�.\n"
				+ " - �� ������ �־��� ��ȸ�� 5ȸ�̸� ��ȸ�� �� \n   ����ҽ� �����Ѵ�.\n"
				+ "   (���� ��ȸ�� ����� ���� ������ �� �� �ִ�.)");
		txtRule.setBounds(125, 82, 350, 212);
		contentPane.add(txtRule);
				
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(114, 71, 372, 232);
		contentPane.add(panel);
		//=====================================================
		
		// �������� ���� ��ư ========================================
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
		lbHome1.setFont(new Font("���� ���", Font.BOLD, 20));
		lbHome1.setBounds(522, 308, 90, 30);
		contentPane.add(lbHome1);
		//=====================================================
		
		// �г��� �������� ���� ��ư ==================================
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
		lbNick1.setFont(new Font("���� ���", Font.BOLD, 20));
		lbNick1.setForeground(new Color(147, 112, 219));
		lbNick1.setBounds(522, 348, 90, 30);
		contentPane.add(lbNick1);
		//=====================================================
				
	}
}

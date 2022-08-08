package j19_익명클래스.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addMouseListener(new MouseAdapter() { //익명클래스
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("여기서만 검색 클리기능 사용");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스1");
			}
		});
		btnNewButton.setBounds(35, 10, 182, 76);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("확인 버튼 클릭");
			}
		});
		btnNewButton_1.setBounds(235, 10, 182, 76);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("취소");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(429, 10, 182, 76);
		contentPane.add(btnNewButton_1_1);
	}
}

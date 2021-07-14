import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setBackground(Color.WHITE);
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setForeground(new Color(255, 255, 255));
		btnJogar.setBackground(new Color(0, 128, 128));
		btnJogar.setFont(new Font("Pagul", Font.BOLD, 30));
		btnJogar.setBounds(125, 399, 200, 70);
		contentPane.add(btnJogar);
		
		JButton btnNewButton = new JButton("Placar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Pagul", Font.BOLD, 30));
		btnNewButton.setBounds(461, 399, 200, 70);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Mar profundo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Pagul", Font.BOLD, 72));
		lblNewLabel.setBounds(153, 207, 508, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mergulhe no conhecimento");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Pagul", Font.BOLD, 20));
		lblNewLabel_1.setBounds(247, 291, 312, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Grupo 12");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Pagul", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(247, 196, 312, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Background");
		lblNewLabel_2.setIcon(new ImageIcon("/home/molotov/Desktop/USP/POO/Eclipse/MarProfundo/back.jpg"));
		lblNewLabel_2.setBounds(0, -13, 800, 600);
		contentPane.add(lblNewLabel_2);
	}
}

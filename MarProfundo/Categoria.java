import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class Categoria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categoria frame = new Categoria();
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
	public Categoria() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Categoria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFacil = new JButton("Facil - 5 Pontos");
		btnFacil.setForeground(new Color(5, 61, 87));
		btnFacil.setBackground(new Color(211, 214, 216));
		btnFacil.setFont(new Font("Pagul", Font.BOLD, 20));
		btnFacil.setBounds(52, 366, 200, 70);
		//btnFacil.setBorder(new EmptyBorder(10,10,10,10));
		contentPane.add(btnFacil);
		
		JButton btnMedio = new JButton("Medio - 10 Pontos");
		btnMedio.setForeground(new Color(5, 61, 87));
		btnMedio.setBackground(new Color(211, 214, 216));
		btnMedio.setFont(new Font("Pagul", Font.BOLD, 20));
		btnMedio.setBounds(289, 366, 200, 70);
		contentPane.add(btnMedio);

		JButton btnDificil = new JButton("Dificil - 20 Pontos");
		btnDificil.setForeground(new Color(5, 61, 87));
		btnDificil.setBackground(new Color(211, 214, 216));
		btnDificil.setFont(new Font("Pagul", Font.BOLD, 20));
		btnDificil.setBounds(527, 366, 200, 70);
		contentPane.add(btnDificil);
		
		JLabel lblSorteando = new JLabel("Sorteando categoria");
		lblSorteando.setForeground(new Color(255, 255, 255));
		lblSorteando.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorteando.setFont(new Font("Pagul", Font.BOLD, 40));
		lblSorteando.setBounds(140, 135, 508, 84);
		contentPane.add(lblSorteando);
		
		JLabel lblMateria = new JLabel("Materia");
		lblMateria.setForeground(new Color(255, 255, 255));
		lblMateria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateria.setFont(new Font("Pagul", Font.BOLD, 30));
		lblMateria.setBounds(196, 254, 383, 27);
		contentPane.add(lblMateria);
		
		
		JPanel pnlBack = new JPanel();
		pnlBack.setBackground(new Color(5, 61, 87));
		pnlBack.setBounds(0, 96, 800, 389);
		contentPane.add(pnlBack);
		
		JLabel lblFundo = new JLabel("");
		lblFundo.setBounds(0, 0, 1155, 600);
		contentPane.add(lblFundo);
		lblFundo.setIcon(new ImageIcon("/home/molotov/Desktop/USP/POO/Eclipse/MarProfundo/back3.jpg"));
	}
}

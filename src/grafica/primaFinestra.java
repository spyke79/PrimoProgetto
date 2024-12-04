package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class primaFinestra extends JFrame {

	//Variabili di classe visibili in tutta la classe
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	
	//Creo i miei oggetti
	private operazioni op = new operazioni();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primaFinestra frame = new primaFinestra();
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
	public primaFinestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(175, 6, 130, 26);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inserisci numero 1");
		lblNewLabel.setBounds(6, 11, 130, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(6, 215, 518, 16);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Inserisci numero 2");
		lbl2.setBounds(6, 52, 117, 16);
		contentPane.add(lbl2);
		
		txt2 = new JTextField();
		txt2.setBounds(175, 47, 130, 26);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		//Inizio BTN1
		JButton btn1 = new JButton("Somma");
		btn1.setBounds(16, 86, 117, 29);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setText(op.somma(txt1.getText(), txt2.getText()));
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Sottrai");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setText(op.sottrazione(txt1.getText(), txt2.getText()));
			}
		});
		btn2.setBounds(145, 85, 117, 29);
		contentPane.add(btn2);
		//FINE BTN1
		
	}
}

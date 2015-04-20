import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel nascimentoLabel = new JLabel("Nascimento");
	JLabel emailLabel = new JLabel("Email");
	JLabel cpfLabel = new JLabel("CPF");
	JLabel phoneLabel = new JLabel("Phone");
	JLabel addres1Label = new JLabel("Addres1");
	JLabel addres2Label = new JLabel("Addres2");
	JLabel cepLabel = new JLabel("CEP");
	JLabel cityLabel = new JLabel("City");
	JLabel stateLabel = new JLabel("State");
	JLabel countryLabel = new JLabel("Country");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print frame = new Print();					
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
	public Print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameLabel.setBounds(167, 82, 216, 15);
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setBounds(167, 110, 216, 15);
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(lastNameLabel);
		
		nascimentoLabel.setBounds(167, 142, 216, 15);
		nascimentoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(nascimentoLabel);
		
		emailLabel.setBounds(167, 170, 216, 15);
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(emailLabel);
		
		cpfLabel.setBounds(167, 198, 216, 15);
		cpfLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(cpfLabel);
		
		phoneLabel.setBounds(167, 226, 216, 15);
		phoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(phoneLabel);
		
		addres1Label.setBounds(167, 254, 216, 15);
		addres1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(addres1Label);
		
		addres2Label.setBounds(167, 282, 216, 15);
		addres2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(addres2Label);
		
		cepLabel.setBounds(167, 310, 216, 15);
		cepLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(cepLabel);
		
		cityLabel.setBounds(167, 338, 216, 15);
		cityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(cityLabel);
		
		stateLabel.setBounds(167, 366, 216, 15);
		stateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(stateLabel);
		
		countryLabel.setBounds(167, 394, 216, 15);
		countryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(countryLabel);
		
		
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		titleLabel.setBounds(62, 55, 216, 15);
		
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setBounds(139, 12, 159, 31);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 439, 117, 25);
		contentPane.add(btnExit);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setBounds(12, 142, 127, 15);
		contentPane.add(lblDataNascimento);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 170, 98, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(12, 198, 98, 15);
		contentPane.add(lblCpf);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 226, 98, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddres = new JLabel("Addres1:");
		lblAddres.setBounds(12, 254, 98, 15);
		contentPane.add(lblAddres);
		
		JLabel lblAddres_1 = new JLabel("Addres2:");
		lblAddres_1.setBounds(12, 282, 98, 15);
		contentPane.add(lblAddres_1);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(12, 310, 98, 15);
		contentPane.add(lblCep);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 338, 98, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 366, 98, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 394, 98, 15);
		contentPane.add(lblCountry);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}

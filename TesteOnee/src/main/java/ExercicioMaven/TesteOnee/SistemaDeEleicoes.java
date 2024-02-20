package ExercicioMaven.TesteOnee;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SistemaDeEleicoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Eleicao> eleicoes = new ArrayList();
	private HashSet<String> eleitores = new HashSet();
	private int contadorDEVotos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaDeEleicoes frame = new SistemaDeEleicoes();
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
	public SistemaDeEleicoes() {
		setTitle("Sistema de Eleições");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEmQuePosso = new JLabel("Em que posso ajudá-lo(a)?");
		lblEmQuePosso.setBounds(140, 11, 167, 14);
		contentPane.add(lblEmQuePosso);

		JButton btc = new JButton("Cadastrar Candidato");
		btc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = JOptionPane.showInputDialog(null, "Informe seu cpf: ", "Cadastro de Candidato",
						JOptionPane.INFORMATION_MESSAGE);
				String nome = JOptionPane.showInputDialog(null, "Informe seu nome completo: ", "Cadastro de Candidato",
						JOptionPane.INFORMATION_MESSAGE);
				String dataNasc = JOptionPane.showInputDialog(null, "Informe sua data de nascimento: ",
						"Cadastro de Candidato", JOptionPane.INFORMATION_MESSAGE);
				String endereco = JOptionPane.showInputDialog(null, "Informe seu endereco:  ", "Cadastro de Candidato",
						JOptionPane.INFORMATION_MESSAGE);
				Candidato c1 = new Candidato(cpf, nome, dataNasc, endereco);
			}
		});
		btc.setBounds(24, 67, 179, 23);
		contentPane.add(btc);

		JComboBox cbx = new JComboBox();
		cbx.setModel(new DefaultComboBoxModel(new String[] { "Eleições Disponíveis" }));
		cbx.setBounds(249, 67, 162, 22);
		contentPane.add(cbx);

		JButton bte = new JButton("Cadastrar Eleição");
		bte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomePleito = JOptionPane.showInputDialog(null, "Informe o nome do pleito: ",
						"Cadastro de Eleição", JOptionPane.INFORMATION_MESSAGE);
				String dataIn = JOptionPane.showInputDialog(null, "Informe a data inicial do pleito: ",
						"Cadastro de Eleição", JOptionPane.INFORMATION_MESSAGE);
				String dataFin = JOptionPane.showInputDialog(null, "Informe a data final do pleito: ",
						"Cadastro de Eleição", JOptionPane.INFORMATION_MESSAGE);
				Eleicao e1 = new Eleicao(nomePleito, dataIn, dataFin);
				eleicoes.add(e1);
				cbx.addItem(nomePleito);

			}
		});
		bte.setBounds(24, 101, 179, 23);
		contentPane.add(bte);

		JButton btv = new JButton("Votar");
		btv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpfEleitor = JOptionPane.showInputDialog(null, "Informe o seu cpf: ", "Votação",
						JOptionPane.INFORMATION_MESSAGE);
				eleitores.add(cpfEleitor);
				String data = JOptionPane.showInputDialog(null, "Informe a data de hoje: ", "Votação",
						JOptionPane.INFORMATION_MESSAGE);
				String hora = JOptionPane.showInputDialog(null, "Informe a hora:  ", "Votação",
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,
						"Selecione uma dentre as eleições disponíveis para registrar seu voto:  ", "Votação",
						JOptionPane.INFORMATION_MESSAGE);
				if (!cbx.toString().equals("Eleições Disponíveis")) {
					Voto v = new Voto(cpfEleitor, data, hora);
					contadorDEVotos++;
				}

				for (int i = 0; i < eleicoes.size(); i++) {
					if (eleicoes.get(i).getNomePleito().equals(cbx.toString())) {
						eleicoes.get(i).setContadorVotos(eleicoes.get(i).getContadorVotos() + 1);
					}
				}

			}
		});
		btv.setBounds(24, 135, 179, 23);
		contentPane.add(btv);

		JButton processar = new JButton("Processar Resultado");
		processar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Foram realizados " + eleitores.size() + " votos ao todo",
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
				
				String a=" ";
				for (int i = 1; i < eleicoes.size(); i++) {
					if (eleicoes.get(i - 1).getContadorVotos() > eleicoes.get(i).getContadorVotos()) {
						a=eleicoes.get(i - 1).getNomePleito();
					}else if(eleicoes.get(i - 1).getContadorVotos() == eleicoes.get(i).getContadorVotos()) {
						a="empate";
					}else {
						a=eleicoes.get(i).getNomePleito();
					}
				}
				JOptionPane.showMessageDialog(null, a,
						"Resultado", JOptionPane.INFORMATION_MESSAGE);

			}

		});
		processar.setBounds(140, 189, 167, 23);
		contentPane.add(processar);

	}
}

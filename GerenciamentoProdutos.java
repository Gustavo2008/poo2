package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GerenciadorProdutos;
import model.Produtos;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenciamentoProdutos extends JFrame {

	private GerenciadorProdutos gerenciadorProdutos;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciamentoProdutos frame = new GerenciamentoProdutos();
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
	public GerenciamentoProdutos() {
		
		gerenciadorProdutos = new GerenciadorProdutos();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton butao = new JButton("Cadstrar");
		butao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso! ");
				String codigoProduto = textField.getText();
				String descricaoProduto = textField_1.getText();
				String precoProduto = textField_2.getText();
				String validadeProduto = textField_3.getText();
				Produtos produto = new Produtos();
				produto.setCodigo(codigoProduto);
				produto.setDescricao(descricaoProduto);
				produto.setPreco(precoProduto);
				produto.setValidade(validadeProduto);
				
				gerenciadorProdutos.criarProdutos(produto);
			}
		});
		butao.setBounds(168, 227, 89, 23);
		contentPane.add(butao);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(10, 11, 71, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descrição");
		lblNewLabel_1.setBounds(10, 58, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 55, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Preço");
		lblNewLabel_2.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 115, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Validade");
		lblNewLabel_3.setBounds(10, 164, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 161, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}

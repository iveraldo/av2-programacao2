package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.CadastroProduto;
import model.bean.CadastroUsuario;
import model.dao.ProdutoDAO;

public class TelaProduto extends JFrame {
    Object[] colunas = {"NOME", "CODIGO", "QUANTIDADE", "PREÇO"};
        Object[][] dados = {};

        JTable tabela = new JTable(dados, colunas);

    public TelaProduto() {
        JFrame janela = new JFrame("Tela Produto");
        janela.setSize(600, 400);
        janela.setLayout(null);
        janela.setBounds(100, 100, 600, 400);
        janela.getContentPane().setBackground(Color.CYAN);
        janela.setVisible(true);
        janela.setLayout(null);


        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(220, -10, 200, 100);
        janela.add(imagem1);

        JLabel rotuloNome = new JLabel("NOME:");
        rotuloNome.setBounds(60, 50, 200, 100);
        janela.add(rotuloNome);

        JLabel rotuloCodigo = new JLabel("CODIGO");
        rotuloCodigo.setBounds(60, 85, 200, 100);
        janela.add(rotuloCodigo);

        JLabel rotuloQuantidade = new JLabel("QUANTIDADE:");
        rotuloQuantidade.setBounds(60, 120, 200, 100);
        janela.add(rotuloQuantidade);

        JLabel rotuloConsultar = new JLabel("CONSULTAR:");
        rotuloConsultar.setBounds(5, 0, 200, 100);
        janela.add(rotuloConsultar);

        JLabel rotuloValor = new JLabel("VALOR:");
        rotuloValor.setBounds(60, 160, 200, 100);
        janela.add(rotuloValor);

        JLabel rotuloBranco = new JLabel("");
        rotuloBranco.setBounds(60, 140, 200, 100);
        janela.add(rotuloBranco);

        JTextField textoNome = new JTextField();
        textoNome.setSize(240, 25);
        textoNome.setLocation(200, 87);
        janela.add(textoNome);

        JTextField textoUsuario = new JTextField();
        textoUsuario.setSize(240, 25);
        textoUsuario.setLocation(200, 122);
        janela.add(textoUsuario);

        JTextField textoSenha = new JTextField();
        textoSenha.setSize(240, 25);
        textoSenha.setLocation(200, 158);
        janela.add(textoSenha);

        JTextField textoConfirmar = new JTextField();
        textoConfirmar.setSize(240, 25);
        textoConfirmar.setLocation(200, 196);
        janela.add(textoConfirmar);

        JTextField textoConsultar = new JTextField();
        textoConsultar.setSize(90, 25);
        textoConsultar.setLocation(80, 36);
        janela.add(textoConsultar);

        JButton botaoSalvar = new JButton("SALVAR");
        botaoSalvar.setSize(120, 25);
        janela.add(botaoSalvar);
        botaoSalvar.setVisible(true);
        botaoSalvar.setLocation(460, 20);

        JButton botaoCancelar = new JButton("EXCLUIR");
        botaoCancelar.setSize(120, 25);
        janela.add(botaoCancelar);
        botaoCancelar.setVisible(true);
        botaoCancelar.setLocation(460, 50);

        JButton botaoConsultar = new JButton("OK");
        botaoConsultar.setSize(70, 25);
        janela.add(botaoConsultar);
        botaoConsultar.setVisible(true);
        botaoConsultar.setLocation(180, 36);
        
        JScrollPane barraRolagem = new JScrollPane(tabela);
        tabela.setBounds(30, 225, 240, 100);
        tabela.setVisible(true);
        tabela.setSize(540, 127);
        janela.add(tabela);


        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible(false);
            }
        });

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible(false);
                CadastroProduto b = new CadastroProduto();
                ProdutoDAO dao = new ProdutoDAO();
                b.setNome(textoNome.getText());
                b.setCodigo(Integer.parseInt(textoConfirmar.getText()));
                b.setQuantidade(Integer.parseInt(textoSenha.getText()));
                b.setValor(Integer.parseInt(textoConfirmar.getText()));
                dao.createProduto(b);

                }

        });
    }
    
    }


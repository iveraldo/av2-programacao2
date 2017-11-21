
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;



public class TelaReceita {
    public TelaReceita(){
        JFrame janela = new JFrame("Tela Receita");
        janela.setSize(600,400);
        janela.setLayout(null);
        janela.setBounds(100, 100, 600, 400);
        janela.getContentPane().setBackground(Color.CYAN);
        janela.setVisible(true);
        janela.setLayout(null);
        
        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(170, -10, 200, 100);
        janela.add(imagem1);
        
        JLabel rotuloCliente = new JLabel("Cliente:");
        rotuloCliente.setBounds(20, 50, 200, 100);
        janela.add(rotuloCliente);
        
        JLabel rotuloTabelaProduto = new JLabel("PRODUTO");
        rotuloTabelaProduto.setBounds(20, 165, 200, 100);
        janela.add(rotuloTabelaProduto);
        
        JLabel rotuloTabelaQuantidade = new JLabel("QUANTIDADE");
        rotuloTabelaQuantidade.setBounds(120, 165, 200, 100);
        janela.add(rotuloTabelaQuantidade);
        
        JLabel rotuloTabelaValor = new JLabel("VALOR");
        rotuloTabelaValor.setBounds(260, 165, 200, 100);
        janela.add(rotuloTabelaValor);
        
        JLabel rotuloPaciente = new JLabel("Paciente:");
        rotuloPaciente.setBounds(20, 85, 200, 100);
        janela.add(rotuloPaciente);
        
        JLabel rotuloCodReceita = new JLabel("CODIGO DA RECEITA");
        rotuloCodReceita.setBounds(420, 165, 200, 100);
        janela.add(rotuloCodReceita);
        
        JLabel rotuloValorTotal = new JLabel("VALOR TOTAL: ");
        rotuloValorTotal.setBounds(420, 268, 200, 100);
        janela.add(rotuloValorTotal);
        
        JTextField textoValorTotal = new JTextField("R$ 00,00");
        textoValorTotal.setSize(160,25);
        textoValorTotal.setLocation(400, 330);
        janela.add(textoValorTotal);
        
        JTextField textoCodReceita = new JTextField("0000123");
        textoCodReceita.setSize(160,25);
        textoCodReceita.setLocation(400, 225);
        janela.add(textoCodReceita);
        
        JTextField textoCliente = new JTextField();
        textoCliente.setSize(240,25);
        textoCliente.setLocation(100, 87);
        janela.add(textoCliente);
        
        JTextField textoPaciente = new JTextField();
        textoPaciente.setSize(240,25);
        textoPaciente.setLocation(100, 122);
        janela.add(textoPaciente);
    
    
        String [] colunas = {"PRODUTO","QUANTIDADE","VALOR"};
        Object [][] dados = {};
        
        JTable tabela = new JTable(dados, colunas);
        JScrollPane barraRolagem = new JScrollPane(tabela);
        tabela.setBounds(0, 225, 240, 100);
        tabela.setVisible(true);
        tabela.setSize(340, 127);
        janela.add(tabela);
        
        JButton botaoSalvar = new JButton("SALVAR");
        botaoSalvar.setSize(150,35);      
        janela.add(botaoSalvar);
        botaoSalvar.setVisible(true);
        botaoSalvar.setLocation(420,50);

        JButton botaoCancelar = new JButton("CANCELAR");
        botaoCancelar.setSize(150,35);      
        janela.add(botaoCancelar);
        botaoCancelar.setVisible(true);
        botaoCancelar.setLocation(420,100);
        
            botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            janela.setVisible(false);
          
            }
        });
            botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            janela.setVisible(false);
            }
        });
    
    
    }




    
}


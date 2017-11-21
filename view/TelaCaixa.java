
package view;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaCaixa {

    public TelaCaixa(){
        JFrame janela = new JFrame("Tela Caixa");
        janela.setSize(600,400);
        janela.setLayout(null);
        janela.setBounds(100, 100, 600, 400);
        janela.getContentPane().setBackground(Color.CYAN);
        janela.setVisible(true);
        
        JLabel rotuloCodReceita = new JLabel("DIGITE O CODIGO DA RECEITA: ");
        rotuloCodReceita.setBounds(0, 85, 200, 100);
        janela.add(rotuloCodReceita);
        
        JTextField textoCodReceita = new JTextField("0000123");
        textoCodReceita.setSize(160,25);
        textoCodReceita.setLocation(185, 122);
        janela.add(textoCodReceita);
        
        JLabel rotuloCliente = new JLabel("Cliente:");
        rotuloCliente.setBounds(20, 150, 200, 100);
        janela.add(rotuloCliente);
        
        JTextField textoCliente = new JTextField();
        textoCliente.setSize(240,25);
        textoCliente.setLocation(100, 187);
        janela.add(textoCliente);
        
        String [] colunas = {"PRODUTO","QUANTIDADE","VALOR"};
        Object [][] dados = {
	{"OMEPRAZOL", "2", "20,50"},
	{"SIBUTRAMINA", "1", "40,00"},
	{"PANTROPAZOL", "2", "20,00"},
        {"LAZOPRAN", "2", "10,00"},
        {"PANTOPRAZOL", "2", "210,00"},
        {"OLEO DE COCO", "2", "120,00"},
        {"CAQUETENIA", "2", "12,00"},
        {"TRIBULUS TERRESTRE", "2", "220,00"}};
        
        JTable tabela = new JTable(dados, colunas);
        JScrollPane barraRolagem = new JScrollPane(tabela);
        tabela.setBounds(0, 225, 240, 100);
        tabela.setVisible(true);
        tabela.setSize(340, 127);
        janela.add(tabela);
    
        JButton botaoBuscar = new JButton("BUSCAR");
        botaoBuscar.setSize(160,35);      
        janela.add(botaoBuscar);
        botaoBuscar.setVisible(true);
        botaoBuscar.setLocation(390,115);
    
        JLabel rotuloValorTotal = new JLabel("VALOR TOTAL: ");
        rotuloValorTotal.setBounds(420, 208, 200, 100);
        janela.add(rotuloValorTotal);
        
        JTextField textoValorTotal = new JTextField("R$ 00,00");
        textoValorTotal.setSize(160,25);
        textoValorTotal.setLocation(400, 270);
        janela.add(textoValorTotal);
        
        JLabel rotuloValorDesconto = new JLabel("DESCONTO: ");
        rotuloValorDesconto.setBounds(420, 140, 200, 100);
        janela.add(rotuloValorDesconto);
        
        JTextField textoValorDesconto = new JTextField("R$ 00,00");
        textoValorDesconto.setSize(160,25);
        textoValorDesconto.setLocation(400, 210);
        janela.add(textoValorDesconto);
        
        JButton botaoFinalizar = new JButton("Finalizar");
        botaoFinalizar.setSize(170,30);
        janela.add(botaoFinalizar);
        botaoFinalizar.setVisible(true);
        botaoFinalizar.setLocation(390,320);
        
        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(170, -10, 200, 100);
        janela.add(imagem1);
    
            botaoFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            janela.setVisible(false);
            }
        });
    
    }
    
}

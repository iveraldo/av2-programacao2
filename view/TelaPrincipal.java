
package view;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;


public class TelaPrincipal {
    public TelaPrincipal(){
        JFrame tela = new JFrame("TELA INICIAL");
        tela.setLayout(null);
        tela.setSize(600, 400);
        tela.getContentPane().setBackground(Color.CYAN);
        tela.setVisible(true);
        
        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo2.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(190, 100, 200, 200);
        tela.add(imagem1);
    
        JMenuBar menu = new JMenuBar();
        JMenu arquivo = new JMenu("ARQUIVO");
        JMenu financeiro = new JMenu("FINANCEIRO");
        JMenu sair = new JMenu("SAIR");
        JMenu saida = new JMenu("SAIDA");
        JMenuItem receita = new JMenuItem("RECEITA");
        JMenuItem caixa = new JMenuItem("CAIXA");
        JMenuItem produto = new JMenuItem("PRODUTO");
        JMenuItem logout = new JMenuItem("LOGOUT");
        arquivo.add(produto);
        saida.add(receita);
        financeiro.add(caixa);
        sair.add(logout);
        menu.add(arquivo);
        menu.add(financeiro);
        menu.add(saida);
        menu.add(sair);
        tela.setJMenuBar(menu); 
        tela.setVisible(true);
        
        receita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TelaReceita receita = new TelaReceita();    
            return;
            }
        });
            caixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TelaCaixa receita = new TelaCaixa();    
            }
        });
    
            produto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TelaProduto produto = new TelaProduto();    
            }
        });
            logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JProgressBar progresso = new JProgressBar();
            tela.setVisible(false);
            }
        });
    }

    
}

package view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Iveraldo
 */
public class FormulaCerta {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Formula Certa");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600,400);
        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.CYAN);
        
        JLabel texto = new JLabel("SENHA");
        texto.setBounds(300,140,200,100);
        
        JButton botao2 = new JButton("CADASTRAR");
        botao2.setSize(110,30);      
        janela.add(botao2);
        botao2.setVisible(true);
        botao2.setLocation(310,240);
        botao2.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                    TelaCadastro cadastro = new TelaCadastro();
                    
            }
        });
        
        
        
        JPasswordField caixaDeTexto = new JPasswordField();
        caixaDeTexto.setSize(240, 25);
        caixaDeTexto.setLocation(200, 200);
       
        JTextField caixaDeTexto2 = new JTextField();
        caixaDeTexto2.setSize(240,25);
        caixaDeTexto2.setLocation(200, 140);
        janela.add(caixaDeTexto2);
        
        janela.add(caixaDeTexto);
        janela.add(texto);
        janela.setVisible(true);
        
        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(220, 10, 200, 100);
        janela.add(imagem1);
                            
        JLabel texto2 = new JLabel("LOGIN");
        texto2.setBounds(300, 80, 200, 100);
        janela.add(texto2);
               
        
        JButton botao = new JButton("ENTRAR");
        botao.setSize(100, 30);
        janela.add(botao);
        botao.setVisible(true);
        botao.setLocation(200, 240);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            TelaPrincipal telaPrincipal = new TelaPrincipal();    
                
                        }
                    });
    
    
    
        }            
    }
                
            
            
           
       

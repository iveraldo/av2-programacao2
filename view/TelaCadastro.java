    
package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.bean.CadastroUsuario;
import model.dao.ProdutoDAO;


public class TelaCadastro extends JFrame{
    public TelaCadastro(){
        JFrame tela = new JFrame("CADASTRO");
        tela.setLayout(null);
        tela.setSize(600, 400);
        tela.getContentPane().setBackground(Color.CYAN);
        tela.setVisible(true);
        
        JLabel imagem1 = new JLabel(new ImageIcon("C://Users/Iveraldo/Desktop/logo.png"));
        imagem1.setVisible(true);
        imagem1.setBounds(220, -10, 200, 100);
        tela.add(imagem1);
        
        JLabel rotuloNome = new JLabel("NOME:");
        rotuloNome.setBounds(60, 50, 200, 100);
        tela.add(rotuloNome);
        
        JLabel rotuloUsuario = new JLabel("USUARIO:");
        rotuloUsuario.setBounds(60, 85, 200, 100);
        tela.add(rotuloUsuario);
        
        JLabel rotuloSenha = new JLabel ("SENHA:");
        rotuloSenha.setBounds(60, 120, 200, 100);
        tela.add(rotuloSenha);
        
        JLabel rotuloRepetirSenha = new JLabel("CONFIRMAR SENHA:");
        rotuloRepetirSenha.setBounds(60, 160, 200, 100);
        tela.add(rotuloRepetirSenha);
        
        JLabel rotuloBranco = new JLabel("");
        rotuloBranco.setBounds(60, 140, 200, 100);
        tela.add(rotuloBranco);
        
        JTextField textoNome = new JTextField();
        textoNome.setSize(240,25);
        textoNome.setLocation(200, 87);
        tela.add(textoNome);
        
        JTextField textoUsuario = new JTextField();
        textoUsuario.setSize(240,25);
        textoUsuario.setLocation(200, 122);
        tela.add(textoUsuario);
        
        JPasswordField textoSenha = new JPasswordField();
        textoSenha.setSize(240,25);
        textoSenha.setLocation(200, 158);
        tela.add(textoSenha);
        
        JPasswordField textoConfirmar = new JPasswordField();
        textoConfirmar.setSize(240,25);
        textoConfirmar.setLocation(200, 196);
        tela.add(textoConfirmar);
        
        JButton botaoSalvar = new JButton("SALVAR");
        botaoSalvar.setSize(110,30);      
        tela.add(botaoSalvar);
        botaoSalvar.setVisible(true);
        botaoSalvar.setLocation(200,240);

        JButton botaoCancelar = new JButton("CANCELAR");
        botaoCancelar.setSize(110,30);      
        tela.add(botaoCancelar);
        botaoCancelar.setVisible(true);
        botaoCancelar.setLocation(320,240);
        
                botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            tela.setVisible(false);
            }
        });
            botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

    CadastroUsuario p = new CadastroUsuario();
    ProdutoDAO dao = new ProdutoDAO();
    p.setNome(textoNome.getText());
    p.setUsuario(textoUsuario.getText());
    p.setSenha(Integer.parseInt(textoSenha.getText()));
    p.setConfsenha(Integer.parseInt(textoConfirmar.getText()));
    dao.createUsuario(p);
    tela.setVisible(false);
            }
        });
    }
   
}

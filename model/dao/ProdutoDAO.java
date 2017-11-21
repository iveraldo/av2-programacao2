/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.CadastroProduto;
import model.bean.CadastroUsuario;
/**
 *
 * @author Iveraldo
 */
public class ProdutoDAO {
    
    public void createProduto(CadastroProduto p){
        
        Connection con = ConnectionFactory.getConection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO cadastroproduto(NOME,CODIGO,QUANTIDADE,VALOR) VALUES(?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2,p.getCodigo());
            stmt.setInt(3, p.getQuantidade());
            stmt.setInt(4, (int) p.getValor());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
      public List<CadastroUsuario> read(){  
          Connection con = ConnectionFactory.getConection();
          PreparedStatement stmt = null;
          ResultSet rs = null;
          
          List<CadastroUsuario> produtos = new ArrayList<>();
          
        try {
            stmt = con.prepareStatement("SELECT * FROM cadastrousuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                CadastroUsuario produto = new CadastroUsuario();
                
                produto.setNome(rs.getString("NOME"));
                produto.setUsuario(rs.getString("USUARIO"));
                produto.setSenha(rs.getInt("SENHA"));
                produto.setConfsenha(rs.getInt("CONFSENHA"));
                produtos.add(produto);
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
      
      }public void createUsuario(CadastroUsuario p){
        
        Connection con = ConnectionFactory.getConection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO cadastrousuario(NOME,USUARIO,SENHA,CONFSENHA) VALUES(?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2,p.getUsuario());
            stmt.setInt(3, p.getSenha());
            stmt.setInt(4, (int) p.getConfsenha());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
      
  }

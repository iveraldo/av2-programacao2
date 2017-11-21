/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Iveraldo
 */
public class CadastroUsuario {
    private String nome;
    private String usuario;
    private int senha;
    private int confsenha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getConfsenha() {
        return confsenha;
    }

    public void setConfsenha(int confsenha) {
        this.confsenha = confsenha;
    }
    public void readJtable(){
        
    }
}

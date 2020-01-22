/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kaustchr
 */
public class Historico {
    private int id;
    private int id_acao;
    private String data;
    private double valor;
    private int caiu;

    public Historico() {
    }

    
    public Historico(int id, int id_acao, String data, double valor, int caiu) {
        this.id = id;
        this.id_acao = id_acao;
        this.data = data;
        this.valor = valor;
        this.caiu = caiu;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_acao() {
        return id_acao;
    }

    public void setId_acao(int id_acao) {
        this.id_acao = id_acao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCaiu() {
        return caiu;
    }

    public void setCaiu(int caiu) {
        this.caiu = caiu;
    }
    
    
}

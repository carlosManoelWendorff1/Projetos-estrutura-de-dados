package com.catauto;


/**
 * Escreva uma descrição da classe automovel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class automovel
{
   private int id;
   private int anoFabricacao;
   private int anoModelo;
   private String observacoes;
   private float preco;
   private int kilometragem;
   private Modelo modelo;
   
   public Modelo getModelo(){
    return this.modelo;
    }
   public void setId(Modelo modelo){
    this.modelo = modelo;
    } 
   public int getId(){
    return this.id;
    }
    
    
   public void setId(int id){
    this.id = id;
    } 
    public int getanoFabricacao(){
    return this.anoFabricacao;
    }
   public void setanoFabricacao(int anoFabricacao){
    this.anoFabricacao = anoFabricacao;
    } 
    public int getanoModelo(){
    return this.anoModelo;
    }
   public void setanoModelo(int anoModelo){
    this.anoModelo = anoModelo;
    } 
    public int getKilometragem(){
    return this.kilometragem;
    }
   public void setKilometragem(int kilometragem){
    this.kilometragem = kilometragem;
    } 
    public float getPreco(){
    return this.preco;
    }
   public void setPreco(float preco){
    this.preco = preco;
    } 
    public String getObservacoes(){
    return this.observacoes;
    }
   public void setObservacoes(String observacoes){
    this.observacoes = observacoes;
    } 
    
}

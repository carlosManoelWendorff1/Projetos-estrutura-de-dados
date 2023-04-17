package com.catauto;
import java.util.List;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe Modelo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Modelo
{
  private int id;
 private String descricao;
 private int potencia;
 private Marca marca;
 private List<automovel> listaDeAutomoveis = new ArrayList<automovel>();
 
 public void addAutomovel(automovel auto){
    this.listaDeAutomoveis.add(auto);
 }
 public List<automovel> getListaDeAutomoveis(){
     return listaDeAutomoveis;
 }
 public Marca getMarca(){
    return this.marca;    
}
public void setMarca(Marca marca){
    this.marca = marca;
}
 public int getId(){
    return this.id;    
}
public void setId(int id){
    this.id = id;
}
public int getPotencia(){
    return this.potencia;    
}
public void setPotencia(int potencia){
    this.potencia = potencia;
}
public String getdescricao(){
    return this.descricao;    
}
public void setDescricao(String descricao){
    this.descricao = descricao;
}

}

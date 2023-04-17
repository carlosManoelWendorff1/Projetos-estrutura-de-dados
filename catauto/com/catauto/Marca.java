package com.catauto;
import java.util.List;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe Marca aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Marca
{
 private int id;
 private String nome;
 private List<Modelo> listaDeModelos = new ArrayList<Modelo>();
 
 public void addModelos(Modelo modelo){
     this.listaDeModelos.add(modelo);
 }
 public List<Modelo> getModelos(){
     return this.listaDeModelos;
 }
 public int getId(){
    return this.id;    
}
public void setId(int id){
    this.id = id;
}
public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

}
package com.mycompany.adriellesouzaado1;
public class Alce {
    
    //Atributos = campos = variáveis do Alce
    private String altura;
    private String chifres;
    private String nadar;
    private int velocidade;

    //Construtores
    public Alce (){
    }

    public Alce(String altura, String galhadas, String nadar) {
        this.altura = altura;
        this.chifres = galhadas;
        this.nadar = nadar;
    }
    
    //Métodos acessores 
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getGalhadas() {
        return chifres;
    }

    public void setGalhadas(String galhadas) {
        this.chifres = galhadas;
    }

    //Métodos modificadores
    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    //Métodos - ações do Alce
    public void correr () {
        this.velocidade += 56;
    
    System.out.println("Ações do Alce:\nNadador habilidoso");
        
    }
}

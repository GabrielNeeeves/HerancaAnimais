package model;

public class Mamifero extends Animal{
    
    public static int quantidadeMamiferoMacho;
    private int quantidadePatas;
    private float peso;
    
    // public Mamifero() {
    //     this.quantidadeMamifero++;
    // }
    
    public int getQuantidadePatas() {
        return quantidadePatas;
    }
    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}

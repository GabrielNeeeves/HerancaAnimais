package model;
public class Animal {
    
    public static int quantidadeAnimais;
    public static int quantidadePretos;
    private int id;
    private String nome;
    private String sexo;
    private String raca;
    private String cor;

    // public Animal() {
    //     quantidadeAnimais++;
    // }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    

}
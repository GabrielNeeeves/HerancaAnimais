import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        
//  Crie uma classe Animal (id, nome, sexo, raça, cor) e duas subclasses Mamifero (quantidadePatas, peso) e Aves (tipoPenas)
//  Crie uma classe que contenha o método main e receba o cadastramento de uma quantidade indeterminada de animais (Mamíferos e Aves).
//  Ao final, calcule e mostre:
//      - Quantos mamíferos são do sexo masculino
//      - Quantas aves são do sexo feminino
//      - A quantidade total de animais cadastrados
//      - Quantos animais são pretos e os nomes deles
        
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        while(!sair) {
            System.out.println("1. Cadastrar Mamifero");
            System.out.println("2. Cadastrar Ave");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    Mamifero novoMamifero = new Mamifero();
                    Animal.quantidadeAnimais++;

                    System.out.println("ID do Mamifero: ");
                    int idMamifero = scanner.nextInt();
                    novoMamifero.setId(idMamifero);

                    System.out.println("Nome do Mamifero: ");
                    String nomeMamifero = scanner.next();
                    novoMamifero.setNome(nomeMamifero);

                    System.out.println("Sexo do Mamifero (M/F)");
                    String sexoMamifero = scanner.next();
                    novoMamifero.setSexo(sexoMamifero);

                    if(sexoMamifero.equalsIgnoreCase("m"))
                        Mamifero.quantidadeMamiferoMacho++;

                    System.out.println("Raça do Mamifero:");
                    String racaMamifero = scanner.next();
                    novoMamifero.setRaca(racaMamifero);

                    System.out.println("Cor do Mamifero: ");
                    String corMamifero = scanner.next();
                    novoMamifero.setCor(corMamifero);

                    if(corMamifero.equalsIgnoreCase("preto"))
                        Animal.quantidadePretos++;

                    System.out.println("Quantidade de patas do Mamifero: ");
                    int quantidadePatasMamifero = scanner.nextInt();
                    novoMamifero.setQuantidadePatas(quantidadePatasMamifero);

                    System.out.println("Peso do Mamifero: ");
                    float pesoMamifero = scanner.nextFloat();
                    novoMamifero.setPeso(pesoMamifero);

                    System.out.println("Novo Mamifero criado!");
                    Animal animalMamifero = new Animal();
                    
                    break;
            
                case 2:
                    Aves novaAve = new Aves();
                    Animal.quantidadeAnimais++;

                    System.out.println("ID da Ave: ");
                    int id = scanner.nextInt();
                    novaAve.setId(id);

                    System.out.println("Nome da Ave: ");
                    String nome = scanner.next();
                    novaAve.setNome(nome);

                    System.out.println("Sexo da Ave: ");
                    String sexo = scanner.next();
                    novaAve.setSexo(sexo);

                    if(sexo.equalsIgnoreCase("f"))
                        Aves.quantidadeAvesFemeas++;

                    System.out.println("Raça da Ave:");
                    String raca = scanner.next();
                    novaAve.setRaca(raca);

                    System.out.println("Cor da Ave: ");
                    String cor = scanner.next();
                    novaAve.setCor(cor);

                    if(cor.equalsIgnoreCase("preto"))
                        Animal.quantidadePretos++;

                    System.out.println("Tipo de pena da Ave: ");
                    String tipoPena = scanner.next();
                    novaAve.setTipoPenas(tipoPena);

                    Animal animalAve = new Animal();

                    System.out.println("Ave criada!");
                    break;
                
                case 3:
                    System.out.println("Saiu");
                    sair = true;
                    break;
                default:
                    System.out.println("Valor inválido.");
                    break;
            } //FIM DO SWITCH
        } //FIM DO WHILE

        System.out.println("Mamiferos Machos: "+Mamifero.quantidadeMamiferoMacho);
        System.out.println("Aves Femeas: "+Aves.quantidadeAvesFemeas);
        System.out.println("Total de Animais: "+Animal.quantidadeAnimais);
        System.out.println("Quantidade de Animais pretos: "+Animal.quantidadePretos);
        
    }
}

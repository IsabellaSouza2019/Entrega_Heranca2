public class Cachorro extends Mamifero{
    public Cachorro(String nome){        
        super(4, nome);
        System.out.printf("Nome: %s \nQuantidade Patas: %d", nome, qtd_patas);
    }
    
}

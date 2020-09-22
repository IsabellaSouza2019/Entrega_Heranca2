public class Animal{
    public String nome;
    public int qtd_patas;

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(int q, String n ){
        this.nome = n;
        this.qtd_patas = q;
    }
}
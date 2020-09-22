public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Maya");
        System.out.println();
        Gato g = new Gato("Max");    
        
        c.equals(c);
        g.equals(g);
    }
    
}

package Ex05DependencyInversion;

public class Cachorro implements Pet{

    public void fazerSom(){
        System.out.println("AU AU AUUUU!");

    };

    public void comer(){
        System.out.println("O cachorro está comendo ração.");
    };

}

package Ex05DependencyInversion;

public class Interacao {

    //ATRIBUTOS
    private Pet pet;
    // CONSTRUCTOR

    public Interacao(Pet pet) {
        this.pet = pet;
    }

    //METODOS

    public void falaroComPet(){
        pet.fazerSom();
    }

    public void alimentarPet(){
        pet.comer();
    }

}

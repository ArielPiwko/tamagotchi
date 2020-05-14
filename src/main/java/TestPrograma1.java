
public class TestPrograma1 {


    public static void main(String[] args) {

        System.out.println("Empezamos el programa");
        Mascota jose = new Mascota();
        System.out.println("antes de comer tiene nivel " + jose.getNivel());
        jose.comer();
        System.out.println("despues de comer tiene nivel " + jose.getNivel());

    }

}
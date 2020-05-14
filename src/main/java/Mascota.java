public class Mascota {
    private Estado estado;
    private int nivel;

    public Mascota(){ //constructor
        this.nivel = 1;
    }

    public boolean podesJugar(){
        return this.estado.podesJugar();
    }












}






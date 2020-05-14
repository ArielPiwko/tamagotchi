public class Mascota {
    private Estado estado;
    private int nivel;

    public Mascota(){ //constructor
        this.nivel = 1;
        this.estado = new Estado();
    }

    public boolean podesJugar(){
        return this.estado.podesJugar();
    }

    public void comer(){
        this.estado.comer(this);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }






}






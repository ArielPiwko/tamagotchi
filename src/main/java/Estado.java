public class Estado {


    public boolean podesJugar() {
        return true;
    }

    public void comer(Mascota mascota) {
        int nivelTiene;
        nivelTiene = mascota.getNivel();
        mascota.setNivel(nivelTiene+1);
    }










}

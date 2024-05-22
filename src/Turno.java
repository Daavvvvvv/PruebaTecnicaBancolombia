public class Turno {
    private final int turno;
    private final Usuario usuario;
    private static int turnoCounter = 1;

    public Turno(Usuario usuario) {
        this.turno = turnoCounter++;
        this.usuario = usuario;
    }

    public int getTurno() {
        return turno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Turno " + turno + " - " + usuario;
    }
}

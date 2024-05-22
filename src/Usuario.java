public class Usuario {
    private final int id;
    private final CategoriaTurno categoria;
    private static int userIdCounter = 1;

    public Usuario(CategoriaTurno categoria) {
        this.id = userIdCounter++;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public CategoriaTurno getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Usuario con ID " + id + " (" + categoria + ")";
    }
}
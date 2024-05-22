import java.util.LinkedList;
import java.util.Queue;

public class GestionTurnos {
    private Queue<Usuario> colaPrioritarios = new LinkedList<>();
    private Queue<Usuario> colaBuenaGente = new LinkedList<>();
    private Queue<Usuario> colaClientesNormales = new LinkedList<>();

    public void registrarUsuario(Usuario usuario) {
        switch (usuario.getCategoria()) {
            case PRIORITARIO:
                colaPrioritarios.add(usuario);
                break;
            case BUENA_GENTE:
                colaBuenaGente.add(usuario);
                break;
            case CLIENTE_NORMAL:
                colaClientesNormales.add(usuario);
                break;
        }
    }

    public void llamarTurnos() {
        while (!colaPrioritarios.isEmpty() || !colaBuenaGente.isEmpty() || !colaClientesNormales.isEmpty()) {
            while (!colaPrioritarios.isEmpty()) {
                Usuario usuario = colaPrioritarios.poll();
                System.out.println(new Turno(usuario));
            }

            int countBuenaGente = 0;
            int countClienteNormal = 0;

            while (!colaBuenaGente.isEmpty() && countBuenaGente < 3) {
                Usuario usuario = colaBuenaGente.poll();
                System.out.println(new Turno(usuario));
                countBuenaGente++;
            }

            while (!colaClientesNormales.isEmpty() && countClienteNormal < 2) {
                Usuario usuario = colaClientesNormales.poll();
                System.out.println(new Turno(usuario));
                countClienteNormal++;
            }
        }
    }
}
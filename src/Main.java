import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        GestionTurnos gestionTurnos = new GestionTurnos();


        switch (answer){
            case 1 -> {
                casoUno(gestionTurnos);
            }
            case 2 -> {
                casoDos(gestionTurnos);
            }
            case 3 -> {
                casoTres(gestionTurnos);
            }
        };
    }


    /***
     *  Si hay clientes de categoría Prioritario en
     * la cola, serán atendidos de forma
     * consecutiva.
     * @param gestionTurnos
     */
    private static void casoUno(GestionTurnos gestionTurnos) {
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.PRIORITARIO));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.PRIORITARIO));

        gestionTurnos.llamarTurnos();
    }

    /***
     * En caso de que no haya clientes de nivel
     * Prioritario en la cola, pero sí de nivel
     * Buena Gente y Cliente Normal, se
     * deberán atender tres turnos de nivel
     * Buena Gente por cada dos turnos de nivel
     * Cliente Normal.
     * @param gestionTurnos
     */

    private static void casoDos(GestionTurnos gestionTurnos) {
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.CLIENTE_NORMAL));

        gestionTurnos.llamarTurnos();
    }

    /***
     *Si en la cola solo hay turnos del mismo
     * nivel de prioridad, se atenderán de
     * manera consecutiva.
     * @param gestionTurnos
     */
    private static void casoTres(GestionTurnos gestionTurnos) {
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));
        gestionTurnos.registrarUsuario(new Usuario(CategoriaTurno.BUENA_GENTE));

        gestionTurnos.llamarTurnos();
    }

}

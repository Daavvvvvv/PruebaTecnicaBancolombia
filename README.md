# PruebaTecnicaBancolombia


Toda la logica esta en el archivo Main.java, desde ahi se ejecuta en una terminal con el comando

```
javac -d out .\src\*.java  
java -cp out Main
```

el comando ``javac -d out .\src\*.java  `` es para compilar todos los archivos de java dentro de la carpeta src,
el otro comando, el cual es ``javac -cp out Main`` es para ejecutar el archivo .java en cualquier compilador que tenga
jdk, ya sea de web o un compilador conocido como Visual Studio Code

---

En el archivo Main esta organizada la informacion de tal manera que se puede asumir como esta interactuando el programa
y consiguiendo el objetivo propuesto, el cual era realizar un Sistema de Gestion de Turnos.

---
El Caso 1 está diseñado para demostrar cómo se gestionan los turnos en una cola cuando hay clientes de categoría "Prioritario". La regla fundamental que se debe cumplir en este caso es:

    Si hay clientes de categoría Prioritario en la cola, serán atendidos de forma consecutiva.

Registro de Usuarios

En este caso, los usuarios se registran en la cola en el siguiente orden:

    Usuario 1: Categoría Prioritario
    Usuario 2: Categoría Buena Gente
    Usuario 3: Categoría Cliente Normal
    Usuario 4: Categoría Buena Gente
    Usuario 5: Categoría Cliente Normal
    Usuario 6: Categoría Buena Gente
    Usuario 7: Categoría Prioritario

Lógica de Atención de Turnos

La atención de los turnos sigue una secuencia específica para asegurar que los clientes de categoría Prioritario sean atendidos consecutivamente antes de proceder con otras categorías.

Atención Consecutiva de Clientes Prioritarios:
Primero, el sistema atiende a todos los clientes de categoría Prioritario de forma consecutiva. En este caso, se atienden primero los usuarios 1 y 7.

Atención de Clientes de Otras Categorías:
Después de atender a todos los clientes Prioritarios, el sistema procede a atender a los clientes de las categorías Buena Gente y Cliente Normal. La atención se realiza en una proporción específica: tres turnos de Buena Gente por cada dos turnos de Cliente Normal.

Salida Esperada

La salida esperada del Caso 1 es la siguiente:


    Turno 1 - Usuario con ID 1 (PRIORITARIO)
    Turno 2 - Usuario con ID 7 (PRIORITARIO)
    Turno 3 - Usuario con ID 2 (BUENA_GENTE)
    Turno 4 - Usuario con ID 4 (BUENA_GENTE)
    Turno 5 - Usuario con ID 6 (BUENA_GENTE)
    Turno 6 - Usuario con ID 3 (CLIENTE_NORMAL)
    Turno 7 - Usuario con ID 5 (CLIENTE_NORMAL)

Explicación de la Salida

    Turnos 1 y 2: Los clientes con categoría Prioritario (Usuarios 1 y 7) son atendidos primero, de 
    manera consecutiva, cumpliendo con la regla de prioridad alta.

    Turnos 3, 4 y 5: Luego se atienden tres clientes de la categoría Buena Gente (Usuarios 2, 4 y 6).

    Turnos 6 y 7: Finalmente, se atienden dos clientes de la categoría Cliente Normal (Usuarios 3 y 5).


---
El Caso 2 está diseñado para demostrar cómo se gestionan los turnos en una cola cuando no hay clientes de categoría "Prioritario". La regla fundamental que se debe cumplir en este caso es:

    En caso de que no haya clientes de nivel
    Prioritario en la cola, pero sí de nivel
    Buena Gente y Cliente Normal, se
    deberán atender tres turnos de nivel
    Buena Gente por cada dos turnos de nivel
    Cliente Normal.

Registro de Usuarios

En este caso, los usuarios se registran en la cola en el siguiente orden:

    Usuario 1: Categoría Buena Gente
    Usuario 2: Categoría Cliente Normal
    Usuario 3: Categoría Cliente Normal
    Usuario 4: Categoría Buena Gente
    Usuario 5: Categoría Cliente Normal
    Usuario 6: Categoría Buena Gente
    Usuario 7: Categoría Buena Gente
    Usuario 8: Categoría Buena Gente
    Usuario 9: Categoría Cliente Normal
    Usuario 10: Categoría Cliente Normal

Lógica de Atención de Turnos

Atención de Clientes:
<br>
Después de atender a todos los clientes Prioritarios, el sistema procede a atender a los clientes de las categorías Buena Gente y Cliente Normal. La atención se realiza en una proporción específica: tres turnos de Buena Gente por cada dos turnos de Cliente Normal.

Salida Esperada

La salida esperada del Caso 1 es la siguiente:


    Turno 1 - Usuario con ID 1 (BUENA_GENTE)
    Turno 2 - Usuario con ID 4 (BUENA_GENTE)
    Turno 3 - Usuario con ID 6 (BUENA_GENTE)
    Turno 4 - Usuario con ID 2 (CLIENTE_NORMAL)
    Turno 5 - Usuario con ID 3 (CLIENTE_NORMAL)
    Turno 6 - Usuario con ID 7 (BUENA_GENTE)
    Turno 7 - Usuario con ID 8 (BUENA_GENTE)
    Turno 8 - Usuario con ID 5 (CLIENTE_NORMAL)
    Turno 9 - Usuario con ID 9 (CLIENTE_NORMAL)
    Turno 10 - Usuario con ID 10 (CLIENTE_NORMAL)

Explicación de la Salida

    Turnos 1, 2 y 3 son usuarios Buena Gente, todos de seguido, cumpliendo con la regla que se deben 
    hacer al menos tres clientes Buena Gente antes de hacer el cambio a otros tipos de clientes.

    Turnos 4 y 5 son Clientes normales, haciendo el cambio correspondiente y atendiendo a estos clientes
    normales, para despues hacer el cambio nuevamente y asi sucesivamente.
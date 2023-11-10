package datos.interfaces;

import java.util.List;

public interface CrubPaginadoInterface<T> {
    /* Metodo Listar , espera 2 parametros mas estos de tipo entero, totalPorPagina, numPagina,
    /  Mostraran el total de paginas y el numero de pagina actual*/
    public List<T> listar(String texto, int totalPorPagina, int numPagina);

    public boolean insertar(T obj);

    public boolean actualizar(T obj);

    public boolean desactivar(int id);

    public boolean activar(int id);

    public boolean existe(String texto);

    public int total();
}

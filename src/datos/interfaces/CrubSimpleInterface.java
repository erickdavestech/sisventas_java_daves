package datos.interfaces;

import java.util.List;

/* La interfas recibe en un objeto a traves del parametro <T>

este es la entidad clase que reprenta en la base de datos, ejemplo Categoria como entidad clase
 */
public interface CrubSimpleInterface<T> {

    public List<T> listar(String texto);

    public boolean insertar(T obj);

    public boolean actualizar(T obj);

    public boolean desactivar(int id);

    public boolean activar(int id);

    public boolean existe(String texto);

    public int total();

}

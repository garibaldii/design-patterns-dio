package one.digitalinovation.gof;

/**
 * Singleton preguiçoso
 *
 * @author garibaldii
 */

//singleton preguiçoso é que no primeiro momento ele nao disponibiliza uma instâcia para o usuário
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

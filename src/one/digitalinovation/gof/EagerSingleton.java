package one.digitalinovation.gof;

import java.security.spec.ECGenParameterSpec;

/**
 * Singleton preguiçoso
 *
 * @author garibaldii
 */

//singleton apressado é que ele já instancie ao declarar a instância
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        if (instance == null) {
            instance = new EagerSingleton();
        }

        return instance;
    }
}

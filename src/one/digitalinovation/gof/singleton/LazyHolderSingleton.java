package one.digitalinovation.gof.singleton;


/**
 * Singleton lazy holder
 *
 *
 *
 * @author garibaldii
 */

//singleton apressado é que ele já instancie ao declarar a instância
public class LazyHolderSingleton {

    private static class InstanceHolder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {

        return InstanceHolder.instance;
    }
}

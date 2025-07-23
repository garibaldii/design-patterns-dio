package one.digitalinovation.gof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);
        lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);
        eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);
    }
}
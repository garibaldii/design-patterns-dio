package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.EagerSingleton;
import one.digitalinovation.gof.singleton.LazyHolderSingleton;
import one.digitalinovation.gof.singleton.LazySingleton;
import one.digitalinovation.gof.strategy.*;

import java.util.concurrent.TimeoutException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Singleton

        /**
         *         LazySingleton lazy = LazySingleton.getInstance();
         *         System.out.println(lazy);
         *         lazy = LazySingleton.getInstance();
         *         System.out.println(lazy);
         *
         *         EagerSingleton eager = EagerSingleton.getInstance();
         *         System.out.println(eager);
         *         eager = EagerSingleton.getInstance();
         *         System.out.println(eager);
         *
         *         LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
         *         System.out.println(lazyHolder);
         *         lazyHolder = LazyHolderSingleton.getInstance();
         *         System.out.println(lazyHolder);
         *
         */


        //Strategy
        //pode-se assimilar o conceito a um gerenciamento de veículos, ou estacionamento

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    System.out.println("Error");
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//
//        Behavior normal = new NormalBehavior();
//        Behavior agressive = new AgressiveBehavior();
//        Behavior defensive = new DefensiveBehavior();
//
//        Robot robot = new Robot();
//
//        robot.setBehavior(agressive);
//        robot.move();
//
//
//
//        robot.setBehavior(defensive);
//        robot.move();
//
//
//        robot.setBehavior(normal);
//        robot.move();

        //Facade

        Facade facade = new Facade();

        facade.migrateClient("Matheus", "12345-000");
    }
}
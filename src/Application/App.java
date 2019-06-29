package Application;

import Chain.AbstractHandler;
import Chain.Handler1;
import Chain.Handler2;
import Chain.Handler3;

public class App {

    private static void greetings(){
        try {
            System.out.println("Bem vindo! Testando um Chain Of Responsability ↓\n");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void ending(){
        System.out.println("Ending program!");
    }

    private static void startChain(AbstractHandler handler){
        handler.addInChain(new Handler2());
        handler.addInChain(new Handler3());
        handler.wrapAround(handler);
        handler.handleRequest(3);
    }

    public static void main(String[] args) {
        App.greetings();
        AbstractHandler handler = new Handler1();
        App.startChain(handler);

    }
}

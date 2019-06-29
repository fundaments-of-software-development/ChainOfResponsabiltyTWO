package Chain;

public class Handler2 extends AbstractHandler {
    private static final int VALUE = 2;

    @Override
    public void handleRequest(int handler) {
        if (Handler2.VALUE == handler){
            System.out.println("Handled by " + this.getClass().getName());
        }
        else{
            System.out.println("Not handled by " + this.getClass().getName());
            System.out.println("Requesting next handler!\n");
            super.getNextHandler().handleRequest(handler);
        }
    }
}

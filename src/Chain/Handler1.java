package Chain;

public class Handler1 extends AbstractHandler{
    private static final int VALUE = 1;

    @Override
    public void handleRequest(int handler) {
        if (Handler1.VALUE == handler){
            System.out.println("Handled by " + this.getClass().getName());
        }
        else{
            System.out.println("Not handled by " + this.getClass().getName());
            System.out.println("Requesting next handler!\n");
            super.getNextHandler().handleRequest(handler);
        }
    }
}

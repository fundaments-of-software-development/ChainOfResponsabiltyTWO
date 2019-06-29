package Chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;


    public void addInChain(AbstractHandler nextHandler) {
        if (this.nextHandler == null) {
            this.nextHandler = nextHandler;
        }
        else {
            this.nextHandler.addInChain(nextHandler);
        }
    }

    public void wrapAround(AbstractHandler root) {
        if (nextHandler == null) {
            nextHandler = root;
        } else {
            nextHandler.wrapAround(root);
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleRequest(int i);
}

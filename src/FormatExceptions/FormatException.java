package FormatExceptions;

public class FormatException extends Throwable {

    private String message;

    public FormatException(String message) {
        this.message = message;
    }

    public void print(){
        System.err.println(message);
        return;
    }
}
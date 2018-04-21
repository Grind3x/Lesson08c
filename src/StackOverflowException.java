public class StackOverflowException extends Throwable {
    @Override
    public String getMessage() {
        return "Stack Overflow!";
    }
}

public class StackUnderflowException extends Throwable {
    @Override
    public String getMessage() {
        return "Stack Underflow!";
    }
}

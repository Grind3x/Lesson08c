public class BlackListException extends Throwable {
    @Override
    public String getMessage() {
        return "Class in Black List!";
    }
}

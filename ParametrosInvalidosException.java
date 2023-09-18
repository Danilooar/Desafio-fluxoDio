public class ParametrosInvalidosException  extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException() {
        this("O segundo parâmetro deve ser maior que o primeiro");
    }
}


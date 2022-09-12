package enumerador;

public enum Operacao {

    SOMA("+"){
        @Override
        public double realizarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRACAO("-"){
        @Override
        public double realizarOperacao(double x, double y) {
            return x - y;
        }
    }, DIVISAO("/") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x / y;
        }
    }, MULTIPLICACAO("*") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x * y;
        }
    };

    private String simbolo;

    Operacao(String simbolo){
        this.simbolo = simbolo;
    }

    public String toString(){
        return this.simbolo;
    }

    public abstract double realizarOperacao(double x, double y);
}

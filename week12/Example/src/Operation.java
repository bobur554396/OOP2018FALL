public enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double calculate(double a, double b) {
        double res = 0;
        switch (this) {
            case PLUS:
                res = a + b;
                break;
            case MINUS:
                res = a - b;
                break;
            case TIMES:
                res = a * b;
                break;
            case DIVIDE:
                res = a / b;
                break;
        }
        return res;
    }

}

package prac22.Ex2;

public class RPNCalculatorApp {
    public static void main(String[] args) {
        RPNModel model = new RPNModel();
        RPNView view = new RPNView();
        new RPNController(model, view);
    }
}

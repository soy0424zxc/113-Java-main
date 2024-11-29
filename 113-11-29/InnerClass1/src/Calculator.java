public class Calculator {
    class Operation {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            return a / b;
        }
    }
    public void performOperation(int a, int b, String operator) {
        Operation operation = new Operation();
        switch (operator){
            case "+"-> System.out.println(operation.add(a, b));
            case "-"-> System.out.println(operation.subtract(a, b));
            case "*"-> System.out.println(operation.multiply(a, b));
            case "/"-> System.out.println(operation.divide(a, b));
            default -> System.out.println("不支援此運算");
        }
        System.out.println(operation.add(a, b));
        System.out.println(operation.subtract(a, b));
        System.out.println(operation.multiply(a, b));
        System.out.println(operation.divide(a, b));
    }
}

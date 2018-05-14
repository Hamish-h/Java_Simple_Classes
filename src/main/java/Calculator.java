public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getAdd() {
        return num1 + num2;
    }

    public int getSubtract(){
        return num1 - num2;
    }

    public int getMultiply(){
        return num1 * num2;
    }

    public int getDivide(){
        return num1 / num2;
    }
}


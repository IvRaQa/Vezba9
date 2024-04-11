public class Kalkulator {
    double operand1;
    double operand2;

    public Kalkulator(double operand1,double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add(){
        return operand1+operand2;
    }
    public double sub(){
        return operand1-operand2;
    }
    public double mul(){
        return operand1*operand2;
    }
    public double div(){
        if (operand2!=0) {
            return operand1/operand2;
        }
        else{
            System.out.println("Nije moguce deliti brojeve sa nulom");
        }
        return -1;
    }
}

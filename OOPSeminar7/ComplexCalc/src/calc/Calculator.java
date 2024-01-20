package calc;

public final class Calculator implements iCalculable {

    private int primaryArg;
    private int secondaryArg;

    public Calculator(int primaryArg, int secondaryArg) {
        this.primaryArg = primaryArg;
        this.secondaryArg = secondaryArg;
    }

    @Override
    public iCalculable complexSum(int arg, int compexArg) {
        primaryArg += arg;
        secondaryArg += compexArg;
        return this;
    }

    @Override
    public iCalculable complexMulti(int arg, int complexArg) {
        var tmpPrimaryArg = primaryArg*arg - secondaryArg*complexArg;
        var tmpSecondaryArg = primaryArg*complexArg + secondaryArg*arg;
        primaryArg = tmpPrimaryArg;
        secondaryArg = tmpSecondaryArg;
        return this;
    }

    @Override
    public iCalculable complexDivision(int arg, int complexArg) {
        var divider = Math.pow(arg,2)+ Math.pow(complexArg,2);
        if (complexArg < 0){
            divider -= 2*Math.pow(complexArg,2);
        }
        this.complexMulti(arg,complexArg*(-1));
        primaryArg /= (int) divider;
        secondaryArg /= (int) divider;
        return this;
    }

    @Override
    public int getPrimaryArg() {
        return primaryArg;
    }

    @Override
    public int getSecondaryArg() {
        return secondaryArg;
    }

    @Override
    public String getResult() {
        String answer = String.valueOf(primaryArg);
        if (secondaryArg >= 0){
            answer+= "+";
        }
        answer += secondaryArg + "i";
        return answer;
    }

    public String complexResult(int firstArg, int secondArg){
        String answer = String.valueOf(firstArg);
        if (secondArg >= 0){
            answer+= "+";
        }
        answer += secondArg + "i";
        return answer;
    }
}

package calc;

public interface iCalculable {
    iCalculable complexSum(int arg, int complexArg);
    iCalculable complexMulti(int arg, int complexArg);
    iCalculable complexDivision(int arg, int complexArg);
    int getPrimaryArg();
    int getSecondaryArg();
    String getResult();
}

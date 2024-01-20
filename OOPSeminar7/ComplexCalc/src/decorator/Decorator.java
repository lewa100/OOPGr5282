package decorator;

import calc.Calculator;
import calc.iCalculable;
import log.Logger;

public class Decorator implements iCalculable {

    private Calculator oldCalculator;
    private Logger logger;

    public Decorator(Calculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculable complexSum(int arg,int complexArg) {
        String firstArg = oldCalculator.getResult();
        String secondArg = oldCalculator.complexResult(arg,complexArg);
        logger.log(String.format("[LOG] Первое значение калькулятора %s. Начало вызова метода complexSum с параметром %s", firstArg, secondArg));
        iCalculable result = oldCalculator.complexSum(arg,complexArg);
        logger.log(String.format("[LOG] Вызова метода complexSum произошел"));

        return result;
    }

    @Override
    public iCalculable complexMulti(int arg,int complexArg) {
        String firstArg = oldCalculator.getResult();
        String secondArg = oldCalculator.complexResult(arg,complexArg);
        logger.log(String.format("[LOG] Первое значение калькулятора %s. Начало вызова метода complexMulti с параметром %s", firstArg, secondArg));
        iCalculable result = oldCalculator.complexMulti(arg,complexArg);
        logger.log(String.format("[LOG] Вызова метода complexMulti произошел"));

        return result;
    }

    @Override
    public iCalculable complexDivision(int arg, int complexArg) {
        String firstArg = oldCalculator.getResult();
        String secondArg = oldCalculator.complexResult(arg,complexArg);
        logger.log(String.format("[LOG] Первое значение калькулятора %s. Начало вызова метода complexDivision с параметром %s", firstArg, secondArg));
        iCalculable result = oldCalculator.complexDivision(arg,complexArg);
        logger.log(String.format("[LOG] Вызова метода complexDivision произошел"));

        return result;
    }

    @Override
    public int getPrimaryArg() {
        int arg = oldCalculator.getPrimaryArg();
        logger.log(String.format("[LOG] Получение аргумент действительно числа %d", arg));
        return arg;
    }

    @Override
    public int getSecondaryArg() {
        int arg = oldCalculator.getSecondaryArg();
        logger.log(String.format("[LOG] Получение аргумент мимого числа %di", arg));
        return arg;
    }

    @Override
    public String getResult() {
        String result = oldCalculator.getResult();
        logger.log(String.format("[LOG] Получение результата %s", result));
        return result;
    }

}

package view;

import calc.iCalculable;

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент действительного числа: ");
            int secondaryArg = promptInt("Введите первый аргумент миного числа: ");
            calculator.complexSum(primaryArg,secondaryArg);
            while (true) {
                String cmd = prompt("Введите команду ('*','+','/', '=') : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент действительного числа: ");
                    int complexArg = promptInt("Введите второй аргумент мнимого числа: ");
                    calculator.complexMulti(arg,complexArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент действительного числа: ");
                    int complexArg = promptInt("Введите второй аргумент мнимого числа: ");
                    calculator.complexDivision(arg,complexArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент действительного числа: ");
                    int complexArg = promptInt("Введите второй аргумент мнимого числа: ");
                    calculator.complexSum(arg,complexArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.printf("Результат %s\n", calculator.getResult());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

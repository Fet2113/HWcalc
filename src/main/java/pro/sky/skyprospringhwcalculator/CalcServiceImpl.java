package pro.sky.skyprospringhwcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b ";
    }

    @Override
    public String plusCalculator(int num1, int num2) {
        int num = num1 + num2;

        return num1 + " + " + num2 + " = " + num;
    }

    @Override
    public String minusCalculator(int num1, int num2) {
        int num = num1 - num2;

        return num1 + " - " + num2 + " = " + num;
    }

    @Override
    public String multiplyCalculator(int num1, int num2) {
        int num = num1 * num2;

        return num1 + " * " + num2 + " = " + num;
    }

    @Override
    public String divideCalculator(int num1, int num2) {
        if (num2 == 0) {
            return " ОШИБКА ";
        } else {
            int num = num1 / num2;

            return num1 + " / " + num2 + " = " + num;
        }
    }
}

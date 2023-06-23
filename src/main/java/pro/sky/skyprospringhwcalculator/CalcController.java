package pro.sky.skyprospringhwcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcServiceImpl calculatorServiceImpl;

    public CalcController(CalcServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String calculator() {
        return calculatorServiceImpl.calculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam int num1, int num2) {
        return calculatorServiceImpl.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam int num1, int num2) {
        return calculatorServiceImpl.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam int num1, int num2) {
        return calculatorServiceImpl.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam int num1, int num2) {
        return calculatorServiceImpl.divideCalculator(num1, num2);
    }
}

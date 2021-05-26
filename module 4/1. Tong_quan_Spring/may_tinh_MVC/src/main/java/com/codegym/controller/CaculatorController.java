package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {

    @GetMapping("/calculator")
    public String calculator(Model model, @RequestParam("number1") int number1,
                             @RequestParam("number2") int number2, @RequestParam("total") String total){
        double sumTotal = 0;
        String message = "";
        switch (total){
            case "Addition(+)":
                sumTotal = number1+number2;
                break;
            case "Subtraction(-)":
                sumTotal = number1-number2;
                break;
            case "Multiplication(*)":
                sumTotal = number1*number2;
                break;
            case "Division(/)":
                if(number2 == 0){
                    message = "number 2 invalid!";
                    model.addAttribute("message", message);
                }
                else {
                    sumTotal = number1/number2;
                }
                break;
        }
        model.addAttribute("sumTotal", sumTotal);
        return "result";
    }
}

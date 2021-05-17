package controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @GetMapping("/convert")
    public String convert(@RequestParam int fromCurrency, @RequestParam String currency, Model model){
        int toCurrency;
        System.out.println(fromCurrency);
        if(currency.equals("USD")){
            toCurrency = fromCurrency * 23000;
        }else {
            toCurrency = fromCurrency/23000;
        }
        model.addAttribute("fromCurrency", fromCurrency);
        model.addAttribute("toCurrency", toCurrency);
        return "result";
    }

}

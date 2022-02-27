/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package refreshing.ws.Refreshing;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Acer
 */
@Controller
public class RefreshingController {
    
    @RequestMapping("/home")
    public String Homepage(Model model, HttpServletRequest param) {
        String Data = param.getParameter("input");
        double celciusToFahreinheit = Double.parseDouble(Data) * 1.8 + 32;
        double celciusToKelvin = Double.parseDouble(Data) + 273.15;
        
        model.addAttribute("dataCelcius", Double.parseDouble(Data));
        model.addAttribute("dataFahreinheit", celciusToFahreinheit);
        model.addAttribute("dataKelvin", celciusToKelvin);
        return "data";
    }
    
}
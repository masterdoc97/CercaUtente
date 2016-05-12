/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Leonardo
 */
@Controller
public class MainController {
    private Database db = new Database();
    @RequestMapping (value="/")
    public String index(ModelMap m){
        return "index";
    }
    
    @RequestMapping(value="/cercare")
    public @ResponseBody String cerca(@RequestParam(value="nomeUtente") String utente){
        String test;
        test= db.cerca(utente);
        return test;
    }   
        
}

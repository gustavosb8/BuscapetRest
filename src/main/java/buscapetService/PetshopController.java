package buscapetService;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Petshop;

@RestController
public class PetshopController {
	
	String nome = "MeuPetShop";

	@RequestMapping("/hello/{nome}")
    public Petshop getPetshop(@PathVariable(value="nome") String nome) {
        return new Petshop(5, nome);
    }
	
	@RequestMapping("/ola/{nome}")
    public String darOi(@PathVariable(value="nome") String nome) {
        return "OI, "+ nome;
    }
	
	@RequestMapping("/todos/{nome}")
	public ArrayList<Petshop> buscaTodos(@PathVariable(value="nome") String nome) {
        
		int i=0;
        ArrayList<Petshop> petshops = new ArrayList<Petshop>();
        
		for(i = 1; i <= 10; i++){
			petshops.add(new Petshop(i, nome+":"+i));
        }
		
		return petshops;
    }
	
	
	/*
	@RequestMapping(value = "/hello/{nome}", method = RequestMethod.GET)
    public Petshop getPetshop(@PathVariable(value="nome") String nome) {
        return new Petshop(5, nome);
    }
    */
}

package buscapetService;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dao.DAOPetshop;
import model.Petshop;

@RestController
public class PetshopController {
	
	//private String nome = "MeuPetShop";
	private DAOPetshop dao = new DAOPetshop();

	@RequestMapping("/hello/{nome}")
    public Petshop getPetshop(@PathVariable(value="nome") String nome) {
        return new Petshop(5, nome);
    }
	
	@RequestMapping("/ola/{nome}")
    public String darOi(@PathVariable(value="nome") String nome) {
        return "OI, "+ nome;
    }
	
	@RequestMapping("/todos/")
	public ArrayList<Petshop> buscaTodos() {
		try {
			return dao.buscaTodosPetshops();
		}catch(Exception ex) {
			System.out.println("Erro: "+ex.getMessage());
			return new ArrayList<Petshop>();
		}
    }
	
	
	/*
	@RequestMapping(value = "/hello/{nome}", method = RequestMethod.GET)
    public Petshop getPetshop(@PathVariable(value="nome") String nome) {
        return new Petshop(5, nome);
    }
    */
}

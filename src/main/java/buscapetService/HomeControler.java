package buscapetService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

	@RequestMapping("/")
	 public String home() {
        
        String file = "<br>\n" 
        		+"<br>\n" 
        		+ "<h1 style=\"color:blue\">BEM-VINDO À BUSCAPET</h1>\n" + 
        		"<br>\n"  
        		
        		 + "<img src="+"https://www.petmd.com/sites/default/files/French%20bulldog%20standing%20in%20flowers_195740612_0.jpg height="+"300 width="+"400>"
        		  +"<br>"
        		  +"<br>"
        		  +"<h1 style=\"color:blue\">"
        		  		+"TODOS OS SERVICOS ATIVOS"
        	  + "</h1>\n";

        return file;
    }
	
	/*
	@RequestMapping(value = "/hello/{nome}", method = RequestMethod.GET)
    public Petshop getPetshop(@PathVariable(value="nome") String nome) {
        return new Petshop(5, nome);
    }
    */
}

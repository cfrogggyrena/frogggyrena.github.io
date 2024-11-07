package ca.sheridan.esguerca.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridan.esguerca.Model.Catalog;


//proper anotations so the code works lol
@Controller
public class CatalogController {
	
	//create a list to store the data. Then link it later on with the Model
	List<Catalog> catalogs = new ArrayList<>();
	
	
	//map index to the controller so it can show 
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	//maps the input page with the controller and with the model as well
	@GetMapping("/DataInput")
	public String DataInput(Model model) {
		model.addAttribute("catalog", new Catalog()); //adds the attributes to update
		return "DataInput";
	}
	
	
	//maps the output for the data that was taken
	@GetMapping("/DataOutput")
	public String DataInfo(@ModelAttribute Catalog catalog, Model model) {
		
		catalogs.add(catalog); //adds the previously created catalog from the list
		
		model.addAttribute("catalogs", catalogs); //same attributes but for this mapping as well
		
			return "DataOutput"; //returns all the data 
		
	}
	
	
} //closing for the controller

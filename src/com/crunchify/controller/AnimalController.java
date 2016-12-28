package com.crunchify.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.crunchify.model.Animal;
import com.crunchify.model.Food;
import com.sun.scenario.effect.Blend.Mode;
import com.crunchify.service.AnimalService;

@Component
@Controller
public class AnimalController {
	
	public AnimalController() {
		System.out.println("in animal controller");
	}
@Autowired	
private AnimalService animalService;
	
	@Autowired(required=true)
	@Qualifier(value="animalService")
	public void setAnimalService(AnimalService ps){
		this.animalService = ps;
	}
	
	@RequestMapping(value = "/animal", method = RequestMethod.GET)
	public String listPersons(Model model) {
		System.out.println("in  animal get method");
		model.addAttribute("Animal", new Animal());
		model.addAttribute("AnimalList", this.animalService.ZooAnimals());
		 List temp =this.animalService.getAverageConsumption();
		 List temptimes = this.animalService.getAverageTimes();
		 List waste = this.animalService.getWaste();
			//System.out.println("in update method"+p.getConsumption());
			System.out.println("in consumption food");
			model.addAttribute("ResultTimes", temptimes);
	        model.addAttribute("ResultList", temp);
	        model.addAttribute("ResultWaste", waste);
		return "animal";
	}
	
	//For add and update person both
	@RequestMapping(value= "/animal/update", method = RequestMethod.POST)
	public String updateEntry(@ModelAttribute("animal") Animal p, Model model){
		this.animalService.UpdateEntry(p);
		System.out.println("in update method"+p.getConsumption());
		System.out.println("in update method food");
         model.addAttribute("Result","You have succesfully inserted");
		 return "animalSuccess";
	}
	
	@RequestMapping(value= "/animal/consumption")
	public String Consumption(Model model){
		 List temp =this.animalService.getAverageConsumption();
		//System.out.println("in update method"+p.getConsumption());
		System.out.println("in consumption food");
        model.addAttribute("ResultList", temp);
		 return "animal";
	}
	
	@RequestMapping(value= "/animal/times")
	public String Times(Model model){
		 List temp =this.animalService.getAverageTimes();
		//System.out.println("in update method"+p.getConsumption());
		System.out.println("in consumption food");
        model.addAttribute("ResultTimes", temp);
		 return "animal";
	}
	
	//zoo workers SaveorUpdate(allocation,feedingtimes,consumption) animal,food
	//Zoo workers update(allocation)
	
	

	@RequestMapping(value= "/animal/waste")
	public String Waste(Model model){
		 List temp =this.animalService.getWaste();
		//System.out.println("in update method"+p.getConsumption());
		System.out.println("get Waste");
        model.addAttribute("ResultWaste", temp);
		 return "animal";
	}
	
}

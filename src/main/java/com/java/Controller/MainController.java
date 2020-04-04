package com.java.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.model.AreaModel;
import com.java.model.PerimeterModel;
import com.java.model.RectangleModel;
import com.java.model.TriangleModel;
import com.java.service.FiguresService;

@Controller

public class MainController {

	
	
	PerimeterModel perModel = new PerimeterModel();
	AreaModel areaModel = new AreaModel();
	RectangleModel rectangleModel = new RectangleModel(); 
	TriangleModel triangleModel = new TriangleModel();
	
	@Autowired
	private FiguresService service;
	
	@RequestMapping("/")
	public String getPerimeterPage(Model model) {
		model.addAttribute("perModel",perModel);
		return "/index1";
	}
	
	
	@RequestMapping(value="/",params="calculatePerimeter",method = RequestMethod.POST)
	public String calculatePerimeter(@ModelAttribute("perModel")PerimeterModel perimetermodel,Model model) {
		
		model.addAttribute("result",service.calculatePerimeter(perimetermodel));
	
		return "/index1";
				
	}
	@RequestMapping("/triangle")
	public String getTriangle(Model model) {
		model.addAttribute("model",triangleModel);
		return "/triangle";
	}
	@RequestMapping("/perTriangle")
	public String getPerimeterTriangle(Model model) {
		model.addAttribute("model",triangleModel);
		return "/perTriangle";
	}
	@RequestMapping(value="/perTriangle",params="calculatePerimeterTriangle",method=RequestMethod.POST)
	public String calculatePerimeterTriangle(@ModelAttribute("model")TriangleModel triangleModel,Model model) {
		model.addAttribute("result",service.calculatePerimeterTriangle(triangleModel));
		return "/perTriangle";
	}
	
	
	@RequestMapping(value="/triangle",params="calculateTriangle",method=RequestMethod.POST)
	public String calculateTriangle(@ModelAttribute("model")TriangleModel triangleModel,Model model) {
		model.addAttribute("result",service.calculateTriangle(triangleModel));
		return "/triangle";
	}
	
	
	@RequestMapping("/circle")
	public String getAreaOfCircle(Model model) {
		model.addAttribute("model",areaModel);
		return "/circle";
	}
	@RequestMapping(value="/circle",params="calculateArea",method = RequestMethod.POST)
	public String getAreaOfCircle(@ModelAttribute("model")AreaModel areaModel,Model model) {
		model.addAttribute("area",service.calculateArea(areaModel));
		model.addAttribute("result",service.calculatePerimeterCircle(areaModel));
		return "/circle";
	}
	
	@RequestMapping("/squareArea")
	public String getAreaOfSquare(Model model) {
		model.addAttribute("model",perModel);
			return "/squareArea";
	}
		@RequestMapping(value="/squareArea",params="calculateAreaOfSquare",method=RequestMethod.POST)
		public String CalculateAreaOfSquare(@ModelAttribute("model")PerimeterModel perimeterModel,Model model) {
			model.addAttribute("result",service.calculateAreaOfSquare(perimeterModel));
			return "/squareArea";
		}

		
		@RequestMapping("/rectangleArea")
		public String getAreaOfRectange(Model model) {
      model.addAttribute("model",rectangleModel);
      return "/rectangleArea";
		}
		
		
		@RequestMapping(value="/rectangleArea",params="calculateRectangle",method=RequestMethod.POST)
		public String calculateRectangle(@ModelAttribute("model")RectangleModel rectangleModel,Model model) {
			model.addAttribute("result",service.calculateRectangle(rectangleModel));
			return "/rectangleArea";
		}
		
		
		
	}
		
	
	
	
	
	
	


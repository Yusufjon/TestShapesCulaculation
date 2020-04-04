package com.java.service;


import org.springframework.stereotype.Service;

import com.java.model.AreaModel;
import com.java.model.PerimeterModel;
import com.java.model.RectangleModel;
import com.java.model.TriangleModel;

@Service
public class FiguresService {

	
	public int calculatePerimeter(PerimeterModel model) {
		
		return model.getA()*2 + model.getB()*2;
				
	}
	
	public double calculateAreaOfSquare(PerimeterModel model) {
		return Math.pow(model.getA(),2);
	}
	
	
	
	public double calculateArea(AreaModel areaModel) {
		
		return areaModel.getPi() * Math.pow(areaModel.getR(), 2);
				
	}
	public double calculatePerimeterCircle(AreaModel areaModel) {
		return 2*areaModel.getPi()*areaModel.getR();
		
				}
	
	
	
	public int calculateRectangle(RectangleModel rectangleModel) {
		return rectangleModel.getA()*rectangleModel.getB();
	}
	
	
	public double calculateTriangle(TriangleModel triangleModel) {
		return triangleModel.getA()*triangleModel.getB()/2;
	}
	
	public int calculatePerimeterTriangle(TriangleModel triangleModel) {
		return triangleModel.getA()+triangleModel.getB()+triangleModel.getC();
	}
	
	
	
}

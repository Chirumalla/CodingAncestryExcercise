package com.crunchify.dao;

import java.util.List;
import java.util.Map;

import com.crunchify.model.Animal;
import com.crunchify.model.Food;

public interface AnimalDAO {

	public  List <Animal> ZooAnimals();
	public void UpdateEntry(Animal p);
	public List getAverageConsumption();
	public List getAverageTimes();
	public List getWaste();

}

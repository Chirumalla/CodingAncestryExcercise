package com.crunchify.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crunchify.model.Animal;
import com.crunchify.model.Food;
import com.crunchify.dao.AnimalDAO;


@Component
@Service
public class AnimalServiceImpl implements AnimalService {

	 @Autowired
	 private AnimalDAO animalDAO;
	
	public void setAnimalDAO(AnimalDAO animalDAO) {
		this.animalDAO = animalDAO;
	}

	@Override
	@Transactional
	public List<Animal> ZooAnimals() {
		// TODO Auto-generated method stub
        return this.animalDAO.ZooAnimals();
	
	}

	@Override
	@Transactional
	public void UpdateEntry(Animal p) {
		// TODO Auto-generated method stub
		 this.animalDAO.UpdateEntry(p);
	}

	@Override
	@Transactional
	public List getAverageConsumption() {
		// TODO Auto-generated method stub
		return  this.animalDAO.getAverageConsumption();
	}

	@Override
	@Transactional
	public List getAverageTimes() {
		// TODO Auto-generated method stub
		return this.animalDAO.getAverageTimes();
	}

	@Override
	@Transactional
	public List getWaste() {
		// TODO Auto-generated method stub
		return this.animalDAO.getWaste();
	}

	
	
	
}

package com.crunchify.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.crunchify.model.Animal;
import com.crunchify.model.Food;

@Repository
@Component
public class AnimalDAOImpl implements AnimalDAO {

	private static final Logger logger = LoggerFactory.getLogger(AnimalDAOImpl.class);
	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> ZooAnimals() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Animal> AnimalList = session.createQuery("from Animal").list();
		 for(Animal p : AnimalList){
		 	logger.info("Animal List::"+p);
		 	System.out.println("Amma"+p);
		}
		logger.info("in list");
		return AnimalList;
	}

	@Override
	public void UpdateEntry(Animal p) {
		// TODO Auto-generated method stu
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Allocation"+p.getAllocation());
		System.out.println("Consumption"+p.getConsumption());
		  int buffer =p.getAllocation() - p.getConsumption();
		  System.out.println(buffer);
		 if(buffer < 5)
			{
			  p.setVendorStatusUpdate("Notify Vendor at your earliest convenince!!");

			 }
		 else
		     p.setVendorStatusUpdate("Notification to Vendor not needed.");
		     session.saveOrUpdate(p);
		System.out.println(p.toString());
		logger.info("inserted");
		

	}

	@Override
	@SuppressWarnings("unchecked")
	public List  getAverageConsumption() {
		// TODO Auto-generated method stub
	   List temp = new ArrayList();
		Map map = new HashMap();
	   Session session = this.sessionFactory.getCurrentSession();
		String hql = "SELECT avg(a.consumption),a.AnimalGroupName from Animal a GROUP BY a.AnimalGroupName";
		Query query = session.createQuery(hql);
		for(Iterator it=query.iterate();it.hasNext();)
		  {
		   Object[] row = (Object[]) it.next();
		   //map.put("animal",row[1]);
		   //map.put("consumption", row[0]);
		   
		   // Object s = row[1];
		   //String animal = (String)row[1].toString();
		   
		    temp.add(row[1]);
		     temp.add(row[0]);
		   //String[] stringArray = Arrays.copyOf(row, row.length, String[].class);
		   // List<String> tempValues = Arrays.asList(stringArray);  
		    //Iterator itk = tempValues.iterator();
		    //while(it.hasNext()){
		    	//System.out.println(itk.next());
		   // }
		    
		     

		   

		  }
		//for(Object p : results){
			//System.out.println(p[0]);
		//}
	//	Iterator it = results.iterator();
		//while(it.hasNext()){
			//System.out.println(it.next().toString());
		//}
		 return temp;
	}

	@Override
	public List getAverageTimes() {
		// TODO Auto-generated method stub
		  List temp = new ArrayList();
			Map map = new HashMap();
		   Session session = this.sessionFactory.getCurrentSession();
			String hql = "SELECT avg(a.FeedTimes),a.AnimalGroupName from Animal a GROUP BY a.AnimalGroupName";
			Query query = session.createQuery(hql);
			for(Iterator it=query.iterate();it.hasNext();)
			  {
			   Object[] row = (Object[]) it.next();
			   //map.put("animal",row[1]);
			   //map.put("consumption", row[0]);
			   
			   // Object s = row[1];
			   //String animal = (String)row[1].toString();
			   
			    temp.add(row[1]);
			     temp.add(row[0]);
			   //String[] stringArray = Arrays.copyOf(row, row.length, String[].class);
			   // List<String> tempValues = Arrays.asList(stringArray);  
			    //Iterator itk = tempValues.iterator();
			    //while(it.hasNext()){
			    	//System.out.println(itk.next());
			   // }
			    
			     

			   

			  }
			//for(Object p : results){
				//System.out.println(p[0]);
			//}
		//	Iterator it = results.iterator();
			//while(it.hasNext()){
				//System.out.println(it.next().toString());
			//}
			 return temp;
	}
	
	
	@Override
	public List getWaste() {
		// TODO Auto-generated method stub
		  List temp = new ArrayList();
			Map map = new HashMap();
		   Session session = this.sessionFactory.getCurrentSession();
			String hql = "SELECT (a.allocation-a.consumption) as waste, a.ZOOId from Animal a GROUP BY a.allocation,a.consumption,a.ZOOId";
			Query query = session.createQuery(hql);
			for(Iterator it=query.iterate();it.hasNext();)
			  {
			   Object[] row = (Object[]) it.next();
			   //map.put("animal",row[1]);
			   //map.put("consumption", row[0]);
			   
			   // Object s = row[1];
			   //String animal = (String)row[1].toString();
			   
			    temp.add(row[1]);
			     temp.add(row[0]);
			   //String[] stringArray = Arrays.copyOf(row, row.length, String[].class);
			   // List<String> tempValues = Arrays.asList(stringArray);  
			    //Iterator itk = tempValues.iterator();
			    //while(it.hasNext()){
			    	//System.out.println(itk.next());
			   // }
			    
			     

			   

			  }
			//for(Object p : results){
				//System.out.println(p[0]);
			//}
		//	Iterator it = results.iterator();
			//while(it.hasNext()){
				//System.out.println(it.next().toString());
			//}
			 return temp;
	}
	
	

}

package com.crunchify.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMAL")
public class Animal {

@Id
@Column(name = "Id")
private String Id;


private String ZOOId;
public String getId() {
	return Id;
}
public void setId(String id) {
	this.Id = id;
}
public String getZooId() {
	return ZOOId;
}
public void setZooId(String zooId) {
	this.ZOOId = zooId;
}
public String getAnimalGroupName() {
	return AnimalGroupName;
}
public void setAnimalGroupName(String animalGroupName) {
	this.AnimalGroupName = animalGroupName;
}
public String getFeedTimes() {
	return FeedTimes;
}
public void setFeedTimes(String feedTimes) {
	this.FeedTimes = feedTimes;
}
public String getFoodid() {
	return foodId;
}
public void setFoodid(String foodid) {
	this.foodId = foodid;
}
public int getConsumption() {
	return consumption;
}
public void setConsumption(int consumption) {
	this.consumption = consumption;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Id=" + Id + ", ZOOId=" + ZOOId + ", AnimalGroupName=" + AnimalGroupName + ", FeedTimes=" + FeedTimes
			+ ", foodId=" + foodId + ", consumption=" + consumption + ", allocation=" + allocation
			+ ", VendorStatusUpdate=" + VendorStatusUpdate;
}
private String AnimalGroupName;
private String FeedTimes;
private String foodId;
private int consumption;
private int allocation;
/**
 * @return the allocation
 */
public int getAllocation() {
	return allocation;
}
/**
 * @param allocation the allocation to set
 */
public void setAllocation(int allocation) {
	this.allocation = allocation;
}
/**
 * @return the vendorStatusUpdate
 */
public String getVendorStatusUpdate() {
	return VendorStatusUpdate;
}
/**
 * @param vendorStatusUpdate the vendorStatusUpdate to set
 */
public void setVendorStatusUpdate(String vendorStatusUpdate) {
	VendorStatusUpdate = vendorStatusUpdate;
}
private String VendorStatusUpdate;
}



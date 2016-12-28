package com.crunchify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class Food {
	@Id
	@Column(name = "Id")
	public String Id;
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the allocation
	 */
	public int getAllocation() {
		return Allocation;
	}
	/**
	 * @par
	 * am allocation the allocation to set
	 */
	public void setAllocation(int allocation) {
		this.Allocation = allocation;
	}
	/**
	 * @return the zooId
	 */
	public String getZooId() {
		return ZooId;
	}
	/**
	 * @param zooId the zooId to set
	 */
	public void setZooId(String zooId) {
		this.ZooId = zooId;
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
		this.VendorStatusUpdate = vendorStatusUpdate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Food Id=" + Id + ", Allocation=" + Allocation + ", ZooId=" + ZooId + ", VendorStatusUpdate="
				+ VendorStatusUpdate + "";
	}
	public int Allocation;
	public String ZooId;
	public String VendorStatusUpdate;

}

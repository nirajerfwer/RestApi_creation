package com.RestApi.Restapi.Entities;

//import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonFormat;


public class Course {
	     private long shipperId;
	     private String loadingPoing;
	     private String unloadingPoing;
	     private String ProductType;
	     private String canter;
	     private int noOfTrucks;
	     private int weight;
	     private String comment;
	     //@JsonFormat(pattern="dd-MM-yyyy")
	     private String date;
		public Course(long shipperId, String loadingPoing, String unloadingPoing, String productType, String canter,
				int noOfTrucks, int weight, String comment, String date) {
			super();
			this.shipperId = shipperId;
			this.loadingPoing = loadingPoing;
			this.unloadingPoing = unloadingPoing;
			ProductType = productType;
			this.canter = canter;
			this.noOfTrucks = noOfTrucks;
			this.weight = weight;
			this.comment = comment;
			this.date = date;
		}
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getShipperId() {
			return shipperId;
		}
		public void setShipperId(long shipperId) {
			this.shipperId = shipperId;
		}
		public String getLoadingPoing() {
			return loadingPoing;
		}
		public void setLoadingPoing(String loadingPoing) {
			this.loadingPoing = loadingPoing;
		}
		public String getUnloadingPoing() {
			return unloadingPoing;
		}
		public void setUnloadingPoing(String unloadingPoing) {
			this.unloadingPoing = unloadingPoing;
		}
		public String getProductType() {
			return ProductType;
		}
		public void setProductType(String productType) {
			ProductType = productType;
		}
		public String getCanter() {
			return canter;
		}
		public void setCanter(String canter) {
			this.canter = canter;
		}
		public int getNoOfTrucks() {
			return noOfTrucks;
		}
		public void setNoOfTrucks(int noOfTrucks) {
			this.noOfTrucks = noOfTrucks;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return "Course [shipperId=" + shipperId + ", loadingPoing=" + loadingPoing + ", unloadingPoing="
					+ unloadingPoing + ", ProductType=" + ProductType + ", canter=" + canter + ", noOfTrucks="
					+ noOfTrucks + ", weight=" + weight + ", comment=" + comment + ", date=" + date + "]";
		}
		
		
		
	
}

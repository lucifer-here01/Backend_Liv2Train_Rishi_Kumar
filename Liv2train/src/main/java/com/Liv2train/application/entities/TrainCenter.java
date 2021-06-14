package com.Liv2train.application.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





@Entity
public class TrainCenter {
        
	    @NotNull
	    @Id
		@Size(max = 40, message= "Trainig Center Name Should be in Limit !")
	      private  String name; 
	      
	      @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Code can be Alphanumeric only !")
	      private  String Code;
	      
//	      @OneToOne(targetEntity=CenterAddress.class,cascade=CascadeType.ALL)
//	      @JoinColumn( name = "cent_add",referencedColumnName="id")
//	      private CenterAddress centerAddress;
//	      
       //  @Pattern(regexp = "^[0-9]+$", message ="Provide only Numbers !")
	      private  int Capacity;
	      
	      @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	      private  String email;
	      
	   //   @Pattern(regexp="^\\\\d{10}$", message= "Provide valid Phone No. !")
	      private  long   phone; 
	      
	


	public TrainCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

     
	

	public TrainCenter( @Size(max = 40, message = "Trainig Center Name Should be in Limit !") String name,
			@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Code can be Alphanumeric only !") String code,
			 int capacity,
			@Pattern(regexp = ".+@.+\\..+", message = "Wrong email!") String email, long phone) {
		super();
		this.name = name;
		Code = code;
		//this.centerAddress = centerAddress;
		Capacity = capacity;
		this.email = email;
		this.phone = phone;
	}




	@Override
	public String toString() {
		return "TrainCenter [id=" + " , Name=" + name + ", Code=" + Code + ", centerAddress=" +
	", Capacity=" + Capacity + ", email=" + email + ", phone=" + phone + "]";
	}





   public String getName() {
		return name;
	}


	public void setName(String name) {
	this.name = name;
	} 


	public String getCode() {
		return Code;
	}


	public void setCode(String code) {
		Code = code;
	}


	public int getCapacity() {
		return Capacity;
	}


	public void setCapacity(int capacity) {
		Capacity = capacity;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}

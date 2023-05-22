package com.ninja.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode



@Table(name="Storage2")
public class DemoEntity {
	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	 Long customerID;
	
	 @NotBlank (message = "Customer Name is mandatory")
	 String customerName;
	 String customerEmail;
	 String customerCity;

}

package WebApp.Com.Entity;



import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter

@Entity
@Table(name="tb_jdbc_testing")

public class UserEntity {
	
	@Id
	@Generated(value = { "/set" })
	private UUID id;
	
	@Column(name = "first_Name")
	private String firstName;

	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name = "emailid")
	private String emailId;
	
	@Column(name = "phone_Number")
	private String phoneNumber;
	
	@Column(name = "countryOfOperation")
	private String countryOfOperation;
	
	@Column(name = "type_Of_Customer")
	private String typeOfCustomer;

}
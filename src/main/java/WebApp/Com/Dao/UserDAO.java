package WebApp.Com.Dao;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import WebApp.Com.Entity.UserEntity;
@Repository
public class UserDAO{
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/ecommerce?serverTimezone=IST",
				"ecommerce", "Ebrain@20");
		
		return con;
		}
	public void save(UserEntity request) throws ClassNotFoundException, SQLException {
Connection connection = getConnection();
		
		String insertQuery = "insert into tb_testing_customer(first_name, last_name,email_id,phone_number,type_of_customer,country_Of_Operation,) values (?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		
		preparedStatement.setString(2,request.getFirstName() );
		preparedStatement.setString(3,request.getLastName() );
		preparedStatement.setString(4,request.getEmailId() );
		preparedStatement.setString(5,request.getPhoneNumber() );
		preparedStatement.setString(7,request.getCountryOfOperation() );
		preparedStatement.setString(6,request.getTypeOfCustomer() );
		
		
			
			preparedStatement.executeUpdate();
		}
	}

	



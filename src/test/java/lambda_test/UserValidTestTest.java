package lambda_test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import user_registration.UserValidException;
import user_registration.UserValidation;

public class UserValidTestTest {

	@Test
		
		 public void givenFirstName_Validation() {
		        UserValidation validation = new UserValidation();
		        boolean actualResult = true;
		        try {
		            actualResult = validation.firstNameValidation("Ritesh");
		        } catch (UserValidException exception) {
		            Assert.assertEquals(actualResult, exception.message);
		        }
		    }

		    @Test
		    public void giveLastName_Validation() {
		        UserValidation validation = new UserValidation();
		        boolean actualResult = true;
		        try {
		            actualResult = validation.lastNameValidation("Khunte");
		        } catch (UserValidException exception) {
		            Assert.assertEquals(actualResult, exception.message);
		        }
		    }

		    @Test
		    public void givenEmail_Validation() {
		        UserValidation validation = new UserValidation();
		        boolean actualResult = true;
		        try {
		            actualResult = validation.emailValidation("riteshkhunte05@gmail.com");
		        } catch (UserValidException exception) {
		            Assert.assertEquals(actualResult, exception);
		        }
		    }

		    @Test
		    public void givenPhoneNumber_Validation() {
		        UserValidation validation = new UserValidation();
		        boolean actualResult = true;
		        try {
		            actualResult = validation.phoneNumberValidation("+919168112901");
		        } catch (UserValidException exception) {
		            Assert.assertEquals(actualResult, exception.message);
		        }
		    }

		    @Test
		    public void givenPassword_Validation() {
		        UserValidation validation = new UserValidation();
		        boolean actualResult = true;
		        try {
		            actualResult = validation.passwordValidation("ritesh@123");
		        } catch (UserValidException exception) {
		            Assert.assertEquals(actualResult, exception.message);
		        }
		    }


		
	}



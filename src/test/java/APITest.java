import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dossier.init.Application;
import com.fullcontact.api.libs.fullcontact4j.FullContact;
import com.fullcontact.api.libs.fullcontact4j.FullContactException;
import com.fullcontact.api.libs.fullcontact4j.http.person.PersonRequest;
import com.fullcontact.api.libs.fullcontact4j.http.person.PersonResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class APITest {
	
	static Logger logger = LoggerFactory.getLogger(APITest.class);
	
	@Test
	public void test() {
		FullContact fullContact = FullContact.withApiKey("").build();
		PersonRequest personRequest = fullContact.buildPersonRequest().email("").build();
		try {
			PersonResponse personResponse = fullContact.sendRequest(personRequest);
			
			logger.info("Result: {}", personResponse);
			logger.info("Result: {}", personResponse.getSocialProfiles());
			logger.info("Result: {}", personResponse.getContactInfo());
			
		} catch (FullContactException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

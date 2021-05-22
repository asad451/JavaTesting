import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class MetamorphicTesting {

	@Test
	void MA() {
		//Imagine that the following string had been in our CatPart tests:
		String originalInput = "Tue, 3 Jun 2008 11:05:30 +00"; 
		//Now we compute the output from the original test case.
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		/*Now we generate a new test input to test the Metamorphic relation. 
		 * For the relation MA, we remove the 'Tue' part of the input, and make 
		 * the assumption that we should also remove the subsequent comma and space  
		 * as well to avoid a parsing error:
		 */
		
		String metaMorphInput = "3 Jun 2008 11:05:30 GMT";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		/*Our Metamorphic relation suggests that the resulting time should remain
		 * equal to the original time. Therefore we make this our test oracle:
		 */
		
		assertEquals(originalDateTime, metaMorphDateTime);
	}	
	
}

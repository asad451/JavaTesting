package dateTests;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class CatPart {

	@Test
	void test1() {		//Testing: 1a, 2a, 3a, 4a, 5b, 6a, 7b, 8a
		String originalInput = "Tue, 3 Jun 2008 11:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}

	@Test
	void test2() {		//Testing: 1a, 2b, 3a, 4a, 5b, 6a, 7b, 8a
		String originalInput = "Wed, 12 Dec 2018 11:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}	
	
	@Test
	void test3() {		//Testing: 1a, 2a, 3a, 4a, 5b, 6a, 7a, 8a
		String originalInput = "Tue, 3 Jun 2008 11:5:5 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test4() {		//Testing: 1a, 2a, 3a, 4a, 5b, 6a, 7c, 8a
		String originalInput = "Tue, 3 Jun 2008 11:05 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test5() {		//Testing: 1a, 2a, 3a, 4a, 5b, 6a, 7b, 8d
		String originalInput = "Tue, 3 Jun 2008 11:05:30 +0000"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test6() {		//Testing: 1b, 2a, 3a, 4a, 5b, 6a, 7b, 8a
		String originalInput = "3 Jun 2008 11:6:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test7() {		//Testing: 1b, 2a, 3a, 4a, 5b, 6a, 7c, 8a
		String originalInput = "3 Jun 2008 11:05 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test8() {		//Testing: 1b, 2a, 3a, 4a, 5b, 6a, 7b, 8d
		String originalInput = "3 Jun 2008 11:05:30 +0000"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test9() {		//Testing: 1a, 2a, 3a, 4a, 5a, 6a, 7b, 8a
		String originalInput = "Tue, 3 Jun 2008 1:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}
	
	@Test
	void test10() {		//Testing: 1b, 2b, 3a, 4a, 5b, 6a, 7b, 8a
		String originalInput = "12 Dec 2018 11:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
	}

}

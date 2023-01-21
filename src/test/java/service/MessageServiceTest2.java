package service;

import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import repository.MessageRepository;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest2 {

	@Mock
	MessageRepository repository;
	
	@InjectMocks
	MessageService service;
	
	@Test
	void testGetMessageWithLengthLessThanFive() {
		try {
			when(repository.getMessages()).thenReturn(Arrays.asList("Aa","Bb","Cc","Dd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> actualList=service.getMessageWithLengthLessThanFive();
		assertNotNull(actualList);
		assertEquals(4,actualList.size());
	}
	
}

package service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

class MessageServiceTest1 {

	@Test
	void addMessageTest() {
		
		MessageService service=mock(MessageService.class);
		
		service.addMessage("Hello");
		service.addMessage("Mockito");
		service.addMessage("Hello");
		
		// verify(service).addMessage("Hello");
		
		// verify(service,times(2)).addMessage("Hello");
		
		// verify(service,never()).removeMessage(any());
		
		verify(service,atLeast(2)).addMessage("Hello");
	}
	
	@Test
	void callOrderTest() {
		
		MessageService service=mock(MessageService.class);
		
		service.addMessage("Hello");
		service.addMessage("Mockito");
		
		InOrder inOrder=Mockito.inOrder(service);
		inOrder.verify(service).addMessage("Hello");
		inOrder.verify(service).addMessage("Mockito");
		
	}
	

}

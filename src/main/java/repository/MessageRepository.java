package repository;

import java.util.Arrays;
import java.util.List;

public class MessageRepository {
	
	private List<String> list=Arrays.asList("Hello", "Hi","Bye");
	
	public List<String> getMessages(){
		return list;
	}
	
	public void addMessage(String message) {
		list.add(message);
	}
	
	public void removeMessage(String message) {
		list.remove(message);
	}
}

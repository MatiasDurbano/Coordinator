package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.initializer.Initializer;
import com.initializer.InitializerImpl;
import com.message.MessagesCollector;
import com.message.MessagesCollectorImpl;

class test {

	@Test
	void reciveObjectsFromInitializer() {
		Initializer initializer = new InitializerImpl();
		List<Object> objs = initializer.getInstance();
		for(Object obj: objs) {
			assertTrue(obj.getClass().toString().length()>0);
		}
	}
	
	@Test
	void reciveObjectsFromMessagesCollector() {
		List<Object> obj = new ArrayList<Object>();
		obj.add("ASSDAD");
		obj.add(1);
		
		MessagesCollector collector = new MessagesCollectorImpl();
		assertTrue(collector.getMessages(obj).size() == 0);
		
	}

}

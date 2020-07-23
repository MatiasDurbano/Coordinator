package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.collector.MessagesCollector;
import com.collector.MessagesCollectorImpl;
import com.initializer.Initializer;
import com.initializer.InitializerImpl;

class Test3 {

	@Test
	void test() {
		Initializer initializer = new InitializerImpl();
		MessagesCollector collector = new MessagesCollectorImpl();
		List<String> ret = collector.getMessages(initializer.getInstance());
		
		for(String str: ret) {
			assertTrue(str.equals("empanada de pollo - prueba de api"));
		}
		
	}

}

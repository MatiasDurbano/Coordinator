package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.collector.MessagesCollector;
import com.collector.MessagesCollectorImpl;

class Test2 {

	@Test
	void test() {
		List<Object> obj = new ArrayList<Object>();
		obj.add("INVALIDO");
		obj.add(1);
		
		MessagesCollector collector = new MessagesCollectorImpl();
		assertTrue(collector.getMessages(obj).size() == 0);
	}

}

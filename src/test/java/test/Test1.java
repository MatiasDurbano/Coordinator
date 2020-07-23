package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.initializer.Initializer;
import com.initializer.InitializerImpl;

class Test1 {

	@Test
	void test() {
		Initializer initializer = new InitializerImpl();
		List<Object> objs = initializer.getInstance();
		assertTrue(objs.size()==1);
		for(Object obj: objs) {
			assertTrue(obj.getClass().toString().equals("class com.twitter.TwitterNetworkImpl"));
		}
	}

}

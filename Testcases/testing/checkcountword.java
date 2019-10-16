package testing;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

class checkcountword {

	@Test
	void checkcounteachword() {
		fileread junit=new fileread();
		// Map<String,Integer> words = null;
		Map<String,Integer> words=new HashMap<String,Integer>();
	     try {
			junit.countword("C:\\Users\\Sudha Neralagi\\Desktop\\Intru.txt",words);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}

package testing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class fileread {
static void countword(String filename,Map<String,Integer> words) throws FileNotFoundException{
	Scanner file=new Scanner(new File(filename));
	while(file.hasNext()) 
	{
	String wrd=file.next();
	Integer count=words.get(wrd);
	if(count!=null)
		count++;
	else
		count=1;
	 words.put(wrd,count);
	}
	file.close();
 }
 public static void main(String args[]) throws FileNotFoundException {
	 
	 Map<String,Integer> words=new HashMap<String,Integer>();
	 countword("C:\\Users\\Sudha Neralagi\\Desktop\\Intru.txt",words);
	 System.out.println(words);
	 
 }
}

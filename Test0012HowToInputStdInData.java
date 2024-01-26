import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
  
public class Test0012HowToInputStdInData{

	public static void main(String args[])  throws IOException {
	
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
        String line;
		while((line=obj.readLine())!=null){
			System.out.println(line);
		}
		
	}
}
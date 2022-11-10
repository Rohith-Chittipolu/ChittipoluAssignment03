package q9;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	 
	public class ex
	
	{
	    public static void main(String[] args) throws FileNotFoundException
	    {
	        FileOutputStream fos = new FileOutputStream("Resource.txt");
	         
	        try(fos)    
	        {
	            
	             
	            fos.write("First Line".getBytes());
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	         
	    }
	}



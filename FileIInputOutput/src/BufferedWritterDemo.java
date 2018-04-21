import java.io.*;
public class BufferedWritterDemo {
	public static void main(String args[]) throws Exception
	  {
	  	FileReader fr = new FileReader("BufferedWriterDemo.java");
	  	BufferedReader br=new BufferedReader(fr);
	  	FileWriter fw = new FileWriter("BufferedWriterDemoCopy.java");
	  	BufferedWriter bw=new BufferedWriter(fw);
	  	while(true)
	  	{
	  		String s=br.readLine();
	  		if(s==null) break;
	  		s=s+"\n";
	  		bw.write(s);  		
	  	}
	  	bw.close();
	  	fw.close();
	  	br.close();
	  	fr.close();  	
	   
	  }
}

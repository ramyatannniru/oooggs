package io.com.example;
import java.io.*;

public class Sampleencryption {
void encrypt(String source, String destination,int shift)
{
	BufferedReader reader;
	BufferedWriter writer = null;
	int data;
	try {
		reader=new BufferedReader(new FileReader(source));
		writer=new BufferedWriter(new FileWriter(destination));
		String l=reader.readLine();
		while(l!=null)
		{
			for(int i=0;i<l.length();i++)
			{
				data=(int) l.charAt(i)+shift;
				int couunt=vowels(l.charAt(i));
				System.out.println(couunt);
				writer.write(data);
				writer.write(couunt);
			}
			writer.write((int) '\n');
			l=reader.readLine();
		}
		reader.close();
		writer.close();
	}
	catch(Exception e)
	{
		System.out.println("file not fount");
	}
}
	public void ViewFileContent(String filename)
	{
		BufferedReader reader;
		try{
			reader=new BufferedReader(new FileReader(filename));
			String l=reader.readLine();
			while(l!=null)
			{
				System.out.println(l);
				l=reader.readLine();
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	}
	public int vowels(char c)
	{
		
		
		int data = 0;
					if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
					{
						data++;
					}
	
	
				
		
		

		return data;
	}
	}

	


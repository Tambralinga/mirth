package com.webreach.mirth.testbench;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.mule.extras.client.MuleClient;
import org.mule.umo.UMOException;

import junit.framework.TestCase;

public class MirthTests extends TestCase
{	
	ArrayList<String> hl7messages;
	MuleClient client;
	TestData properties = new TestData();
	
	protected void setUp()
	{
		Scanner s;
		try
		{
			client = new MuleClient();
		}
		catch (UMOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			s = new Scanner(new File(properties.getProperty("hl7file")));
			String message = "";
			hl7messages = new ArrayList<String>();

			if(s.hasNext())
				message = s.nextLine();
			while(s.hasNext())
			{
				String temp = s.nextLine();
				if(temp.length() == 0)
				{
					hl7messages.add(message);
					message = "";
					temp = s.nextLine();
					if(s.hasNext())
						message = s.nextLine();
				}
				else
				{
					message += "\r" + temp;	
				}
			}
			if (message.length() > 0)
				hl7messages.add(message);
		}
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
	}
	
	public void testTCPtoDatabase()
	{
		TCPInput in = new TCPInput();
		DatabaseOutput out = new DatabaseOutput();
		
/*		for(int i = 0; i < hl7messages.size(); i++)
		{
			assertTrue(in.send(client, hl7messages.get(i)));
		}
*/
		assertTrue(in.send(client, hl7messages.get(0), properties.getProperty("TCPtoDatabasePort")));
		
		
		assertTrue(out.receive("SELECT firstName FROM patients ORDER BY id DESC LIMIT 1", "TEST"));	
	}
	
	public void testHTTPtoDatabase()
	{
		HTTPInput in = new HTTPInput();
		DatabaseOutput out = new DatabaseOutput();
		
/*		for(int i = 0; i < hl7messages.size(); i++)
		{
			assertTrue(in.send(client, hl7messages.get(i)));
		}
*/
		assertTrue(in.send(client, hl7messages.get(0), properties.getProperty("HTTPtoDatabasePort")));
		
		assertTrue(out.receive("SELECT firstName FROM patients ORDER BY id DESC LIMIT 1", "TEST"));				
	}
	
	public void testTCPtoFileWriter()
	{
		TCPInput in = new TCPInput();
		FileWriterOutput out = new FileWriterOutput();
		
/*		for(int i = 0; i < hl7messages.size(); i++)
		{
			assertTrue(in.send(client, hl7messages.get(i)));
		}
*/
		assertTrue(in.send(client, hl7messages.get(0), properties.getProperty("TCPtoFileWriterPort")));
		
		assertTrue(out.receive("\\\\34.34.34.84\\Shared\\test.txt"));				
	}
	
	public void testHTTPtoFileWriter()
	{
		HTTPInput in = new HTTPInput();
		FileWriterOutput out = new FileWriterOutput();
		
/*		for(int i = 0; i < hl7messages.size(); i++)
		{
			assertTrue(in.send(client, hl7messages.get(i)));
		}
*/
		assertTrue(in.send(client, hl7messages.get(0), properties.getProperty("HTTPtoFileWriterPort")));
		
		assertTrue(out.receive("\\\\34.34.34.84\\inbox\\test.txt"));				
	}
}

package jutil;

import java.io.*;
import java.util.*;

public class IOUtil 
{
	/**
	 * @param folderName
	 *        ��ɾ�����ļ���Ŀ¼
	 **/
	public static void delete(String name)
	{
		File folder= new File(name);
		if(folder.exists()==false)
		{
			return;
		}		

		LinkedList<File> files=new LinkedList<File>();
		files.add(folder);
		while(true)
		{
			if(files.isEmpty())
			{
				break;
			}

			File nowFile = files.getLast();
			if(nowFile.isFile())
			{
				nowFile.delete();
				files.removeLast();
			}
			else
			{				
				File[] childFileList = nowFile.listFiles();
				if(childFileList==null || childFileList.length<=0)
				{
					nowFile.delete();
					files.removeLast();
				}
				else
				{
					for(File item:childFileList)
					{
						files.addLast(item);	
					}					
				}
			}
		}
	}

	/**
	 * @param filePath
	 * 			д����ļ�·��
	 * @param text
	 * 			��д���ı�����
	 * @param IOException
	 * 			�ļ�дʧ��ʱ�������쳣
	 * **/
	public static void appendText(String filePath, String text) throws IOException
	{
		File fl = new File(filePath);
		File parentDir = fl.getParentFile();
		if (parentDir.exists()==false)
		{
			parentDir.mkdirs();
		}

		FileWriter writer=null;
		try
		{
			writer = new FileWriter(fl, true);
			writer.write(text);
		}
		finally
		{
			writer.close();
		}
	}
	
	/**
	 * @param String
	 * 		��Ҫ��ȡ���ļ�
	 * @return String
	 * 		�ļ�����
	 * */
	public static String ReadAllString(String filePath) throws IOException,FileNotFoundException
	{
		File file=new File(filePath);
		FileReader reader= new FileReader(file);
		try
		{
			char[] result=new char[(int)file.length()];
			reader.read(result, 0, result.length);
			return new String(result);
		}
		finally
		{
			reader.close();
		}
	}
	
	/**
	 * @param filePath
	 *  		�ļ�·��
	 * @return byte[]
	 * 			��ȡ�����ֽ�����
	 * @exception IOException
	 * 			�ļ���ȡ����
	 * @exception FileNotFoundException
	 * 			�ļ�δ�ҵ�
	 * */
	public static byte[] ReaderAllBytes(String filePath) throws IOException,FileNotFoundException
	{
		File file=new File(filePath);
		FileInputStream inputStream=new FileInputStream(file);
		try
		{
			byte[] result=new byte[(int)file.length()];
			inputStream.read(result, 0, result.length);

			return result;
		}
		finally
		{
			inputStream.close();			
		}
	}
}

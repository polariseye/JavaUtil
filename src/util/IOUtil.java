package util;

import java.io.*;
import java.util.*;

public class IOUtil 
{
	/**
	 * @param folderName
	 *        待删除的文件或目录
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
	 * 			写入的文件路径
	 * @param text
	 * 			待写的文本内容
	 * @param IOException
	 * 			文件写失败时触发的异常
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
}

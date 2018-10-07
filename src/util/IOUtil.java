package util;

import java.io.File;
import java.util.*;

public class IOUtil 
{
	/*
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
}

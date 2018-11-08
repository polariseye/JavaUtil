package jutil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ʱ�䴦������
 * */
public class TimeUtil {

	/**
	 * ת��Ϊ�����ַ���,��ʽΪ:yyyy-MM-dd HH:mm:ss
	 * @param val
	 * 			ʱ�����
	 * */
	public static String ToDateTimeString(Date val) {
		/*
			 yyyy����
			MM����
			dd����
			hh��1~12Сʱ��(1-12)
			HH��24Сʱ��(0-23)
			mm����
			ss����
			S������
			E�����ڼ�
			D��һ���еĵڼ���
			F��һ���еĵڼ�������(���������ܹ�������������7)
			w��һ���еĵڼ�������
			W��һ���еĵڼ�����(�����ʵ���������)
			a���������ʶ
			k����HH��࣬��ʾһ��24Сʱ��(1-24)��
			K����hh��࣬��ʾһ��12Сʱ��(0-11)��
			z����ʾʱ��
		 */
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		return fmt.format(val);
	}
	
	/**
	 * ת��Ϊ�����ַ���,��ʽΪ:yyyy-MM-dd
	 * @param val
	 * 			ʱ�����
	 * */
	public static String ToDateString(Date val)	{
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");		
		return fmt.format(val);
	}
}

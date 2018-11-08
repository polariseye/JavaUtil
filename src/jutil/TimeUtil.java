package jutil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理工具类
 * */
public class TimeUtil {

	/**
	 * 转换为日期字符串,格式为:yyyy-MM-dd HH:mm:ss
	 * @param val
	 * 			时间参数
	 * */
	public static String ToDateTimeString(Date val) {
		/*
			 yyyy：年
			MM：月
			dd：日
			hh：1~12小时制(1-12)
			HH：24小时制(0-23)
			mm：分
			ss：秒
			S：毫秒
			E：星期几
			D：一年中的第几天
			F：一月中的第几个星期(会把这个月总共过的天数除以7)
			w：一年中的第几个星期
			W：一月中的第几星期(会根据实际情况来算)
			a：上下午标识
			k：和HH差不多，表示一天24小时制(1-24)。
			K：和hh差不多，表示一天12小时制(0-11)。
			z：表示时区
		 */
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		return fmt.format(val);
	}
	
	/**
	 * 转换为日期字符串,格式为:yyyy-MM-dd
	 * @param val
	 * 			时间参数
	 * */
	public static String ToDateString(Date val)	{
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");		
		return fmt.format(val);
	}
}

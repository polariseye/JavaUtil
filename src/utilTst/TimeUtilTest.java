package utilTst;

import java.util.Date;
import jutil.TimeUtil;

public class TimeUtilTest {
	public static void main(String[] args) {
		//System.out.println("今天天气很好啊");
		System.out.println("时间字符串:"+TimeUtil.ToDateTimeString(new Date()));
	}
}

package com.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
	/**
	 * 英文简写（默认）如：2010-12-01
	 */
	public static String FORMAT_SHORT = "yyyy-MM-dd";

	/**
	 * 英文全称 如：2010-12-01 23:15:06
	 */
	public static String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 精确到毫秒的完整时间 如：yyyy-MM-dd HH:mm:ss.S
	 */
	public static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";

	/**
	 * 中文简写 如：2010年12月01日
	 */
	public static String FORMAT_SHORT_CN = "yyyy年MM月dd";

	/**
	 * 中文全称 如：2010年12月01日 23时15分06秒
	 */
	public static String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";

	/**
	 * 精确到毫秒的完整中文时间
	 */
	public static String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";
	
	/**
	 * 24小时格式时间 如：23:15:06
	 */
	public static String FORMAT_TIME_LONG = "HH:mm:ss";
	
	/**
	 * 12小时格式时间 如：11:15:06
	 */
	public static String FORMAT_TIME_SHORT = "hh:mm:ss";
	
	
	public static Calendar calendar;
	
	/**
	 * 获取日期时间戳 yyyy-MM-dd
	 */
	public static String getShortDateString() {
		SimpleDateFormat df = new SimpleDateFormat(FORMAT_SHORT);
		calendar = Calendar.getInstance();
		return df.format(calendar.getTime());
	}
	

	/**
	 * 获取时间戳 yyyy-MM-dd HH:mm:ss
	 */
	public static String getFullDateString() {
		SimpleDateFormat df = new SimpleDateFormat(FORMAT_LONG);
		calendar = Calendar.getInstance();
		return df.format(calendar.getTime());
	}
	
	/**
	 * 获取时间戳 HH:mm:ss
	 */
	public static String getTimeString() {
		SimpleDateFormat df = new SimpleDateFormat(FORMAT_TIME_LONG);
		calendar = Calendar.getInstance();
		return df.format(calendar.getTime());
	}

	/**
	 * 获取日期年份
	 * 
	 * @param date 日期
	 * @return
	 */
	public static int getYear(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 功能描述：返回月
	 *
	 * @param date Date 日期
	 * @return 返回月份
	 */
	public static int getMonth(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 功能描述：返回日
	 *
	 * @param date Date 日期
	 * @return 返回日份
	 */
	public static int getDay(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 功能描述：返回小
	 *
	 * @param date 日期
	 * @return 返回小时
	 */
	public static int getHour(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 功能描述：返回分
	 *
	 * @param date 日期
	 * @return 返回分钟
	 */
	public static int getMinute(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 返回秒钟
	 *
	 * @param date Date 日期
	 * @return 返回秒钟
	 */
	public static int getSecond(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * 功能描述：返回毫
	 *
	 * @param date 日期
	 * @return 返回毫
	 */
	public static long getMillis(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}
	
	/**
	 * 获取昨天日期
	 * @param date
	 * @return
	 */
	public static Date getLastDay(Date date){
		Date yesterday = new Date(date.getTime() - 86400000L);
		return yesterday;
	}
	
	/**
	 * 获取Date的字符串 格式“yyyy-MM-dd”
	 * @param date
	 * @return
	 */
	public static String getDayString(Date date){
		return new SimpleDateFormat(FORMAT_SHORT).format(date);
	}

	public static String date2TimeStamp(String date_str)
	{  
		try {  
			SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_LONG);  
			return String.valueOf(sdf.parse(date_str).getTime()/1000);  
		} catch (Exception e) {  
			e.printStackTrace();  
		}  
		return "";  
	}  
}

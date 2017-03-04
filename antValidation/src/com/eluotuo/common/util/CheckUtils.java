package com.eluotuo.common.util;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <验证工具类>
 * 
 * @author wanglei
 * @version [版本号, 2013年8月7日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class CheckUtils
{
    /**
     * <判断对象是否为null或者空>
     * 
     * @param obj 需要判断的对象
     * @return 如果对象为null或者空则返回true
     */
    public static boolean isNullOrEmpty(Object obj)
    {
        if (obj == null || "".equals(StringUtil.toString(obj).trim()))
        {
            return true;
        }
        return false;
    }
    
    /**
     * 判断是否是数字
     * 
     * @param obj 需要判断的元素
     * @return 是否是数字
     */
    public static boolean isNumber(Object obj)
    {
        
        return checkPattern(StringUtil.toString(obj).trim(), "^[-+]?[0-9]+(\\.[0-9]+)?$");
    }
    
    /**
     * 判断是否是正数
     * 
     * @param obj 需要判断的元素
     * @return 是否是正数
     */
    public static boolean isPositiveNumber(Object obj)
    {
        
        return checkPattern(StringUtil.toString(obj).trim(), "^[0-9]+(\\.[0-9]+)?$");
    }
    
    /**
     * 判断是否是Double类型
     * 
     * @param obj 需要判断的元素
     * @return 是否是Double类型(小数点后2位小数)
     */
    public static boolean isDouble(Object obj)
    {
        return checkPattern(StringUtil.toString(obj).trim(), "^[0-9]+(.[0-9]{1,2})?$");
    }
    /**
     * 判断是否是int类型
     * 
     * @param obj 需要判断的元素
     * @return
     */
    public static boolean isInt(Object obj)
    {
        return checkPattern(StringUtil.toString(obj).trim(), "^[0-9]?$");
    }
    
    /**
     * 判断集合不为空并且不为null
     * 
     * @param con 集合
     * @return 是否为空或者null
     */
    public static boolean checkCollectionIsNullOrEmpty(@SuppressWarnings("rawtypes") Collection con)
    {
        return con == null || con.size() == 0;
    }
    
    /**
     * 判断字符串是否满足正则
     * 
     * @param str 需要判断的字符串
     * @param pattern 正则
     * @return 判断结果
     */
    public static boolean checkPattern(String str, String pattern)
    {
        try
        {
            if (pattern.startsWith("/"))
            {
                pattern = pattern.substring(1);
            }
            if (pattern.endsWith("/"))
            {
                pattern = pattern.substring(0, pattern.length() - 1);
            }
            return str.matches(pattern);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    /**
     * 判断字符串是否满足手机正则
     * 
     * @param str 手机号
     * @return 判断结果
     */
    public static boolean checkPhone(String str)
    {
        // 手机正则
        String phone = "(13\\d|14[57]|15[^4,\\D]|17[678]|18\\d)\\d{8}|170[059]\\d{7}";
        return str.matches(phone);
    }
    
    /**
     * <判断字符串是否是汉字>
     * 
     * @param str 汉字
     * @return 判断结果
     */
    public static boolean checkCharacters(String str)
    {
        // 汉字正则
        String chineseCharacters = "[\u4e00-\u9fa5]+";
        return str.matches(chineseCharacters);
    }
    
    /**
     * <判断邮箱格式是否满足条件>
     * 
     * @param emailStr 需要校验的邮箱字符串
     */
    public static boolean checkEmail(String emailStr)
    {
        // 邮箱正则
        String emailRegStr = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return emailStr.matches(emailRegStr);
    }
    
    /**
     * 
     * <判断是否满足指定格式的日期>
     *
     * @param dateStr 需要校验的日期字符串
     * @return
     */
    public static boolean checkDate(String dateStr)
    {
        if (null == dateStr || "".equals(dateStr))
        {
            return false;
        }
        boolean flag = false;
        Pattern pattern0 = null;
        Matcher match0 = null;
        String datePattern =
            "("
                +
                // 第一种情况为月份是大月的有31天。
                "(^\\d{3}[1-9]|\\d{2}[1-9]\\d{1}|\\d{1}[1-9]\\d{2}|[1-9]\\d{3}"
                + // 年
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "(10|12|0?[13578])"
                + // 大月
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "((3[01]|[12][0-9]|0?[1-9])?)"
                + // 日(31)要验证年月因此出现0/1次
                "([\\s]?)"
                + // 空格
                "((([0-1]?[0-9]|2[0-3]):([0-5]?[0-9]):([0-5]?[0-9]))?))$"
                + // 时分秒
                "|"
                + // 或
                  // 第二种情况为月份是小月的有30天，不包含2月。
                "(^\\d{3}[1-9]|\\d{2}[1-9]\\d{1}|\\d{1}[1-9]\\d{2}|[1-9]\\d{3}"
                + // 年
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "(11|0?[469])"
                + // 小月不含2月
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "(30|[12][0-9]|0?[1-9])"
                + // 日(30)
                "([\\s]?)"
                + // 空格
                "((([0-1]?[0-9]|2[0-3]):([0-5]?[0-9]):([0-5]?[0-9]))?))$"
                + // 时分秒
                "|"
                + // 或
                  // 第三种情况为平年月份是2月28天的。
                "(^\\d{3}[1-9]|\\d{2}[1-9]\\d{1}|\\d{1}[1-9]\\d{2}|[1-9]\\d{3}"
                + // 年
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "(0?2)"
                + // 平年2月
                "([-/\\._]?)"
                + // 时间间隔符(-,/,.,_)
                "(2[0-8]|1[0-9]|0?[1-9])"
                + // 日(28)
                "([\\s]?)"
                + // 空格
                "((([0-1]?[0-9]|2[0-3]):([0-5]?[0-9]):([0-5]?[0-9]))?))$"
                + // 时分秒
                "|"
                + // 或
                  // 第四种情况为闰年月份是2月29天的。
                  // 可以被4整除但不能被100整除的年份。
                  // 可以被400整除的数亦是能被100整除，因此后两位是00，所以只要保证前两位能被4整除即可。
                "(^((\\d{2})(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[13579][26])00)" + "([-/\\._]?)"
                + "(0?2)" + "([-/\\._]?)" + "(29)" + "([\\s]?)" + "((([0-1]?\\d|2[0-3]):([0-5]?\\d):([0-5]?\\d))?))$" + // 时分秒
                ")";
        ;
        
        pattern0 = Pattern.compile(datePattern);
        match0 = pattern0.matcher(dateStr);
        flag = match0.matches();
        return flag;
    }
    
    /**
     * 
     * <判断是否满足指定格式的身份证号码>
     *
     * @param idCardStr 需要校验的身份证号码的字符串
     * @return
     */
    public static boolean checkIdCard(String idCardStr)
    {
        // 身份证号码正则
        String idCardReg = "(^\\d{18}$)|(^\\d{15}$)";
        return idCardStr.matches(idCardReg);
    }
    
    public static void main(String[] args)
    {
        boolean result = checkDate("2016/01/-08 ");
        System.out.println(result);
    }
}

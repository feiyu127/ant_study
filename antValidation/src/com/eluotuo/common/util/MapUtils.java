package com.eluotuo.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * map工具类
 * 
 * @author wanglei
 * @version [版本号, 2015年7月2日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class MapUtils
{
    /**
     * 根据条件将符合条件的key 匹配出来并返回
     * 
     * @param pattern 匹配条件
     * @param map 需要查找key的map
     * @return 符合条件key的集合
     */
    public static List<String> getKeys(String pattern, Map<String, ? extends Object> map)
    {
        Set<String> keys = map.keySet();
        boolean isStartWtidCheck = false;
        boolean isEndWtidCheck = false;
        String startWidthStr = null;
        String endWithStr = null;
        List<String> resultKeys = new ArrayList<String>();
        if (pattern.startsWith("*"))
        {
            isEndWtidCheck = true;
            endWithStr = pattern.replace("*", "");
        }
        else if (pattern.endsWith("*"))
        {
            isStartWtidCheck = true;
            startWidthStr = pattern.replace("*", "");
        }
        else
        {
            isStartWtidCheck = true;
            isEndWtidCheck = true;
            String[] tempArray = pattern.split("*");
            startWidthStr = tempArray[0];
            endWithStr = tempArray[1];
        }
        for (String key : keys)
        {
            // 如果两个条件都具备才可以添加
            if (isStartWtidCheck && isEndWtidCheck && key.startsWith(startWidthStr) && key.endsWith(endWithStr))
            {
                resultKeys.add(key);
            }
            // 如果只匹配结尾
            else if (isEndWtidCheck && key.endsWith(endWithStr))
            {
                resultKeys.add(key);
            }
            // 如果只匹配开始
            else if (isStartWtidCheck && key.startsWith(startWidthStr))
            {
                resultKeys.add(key);
            }
        }
        return resultKeys;
    }
    
    /**
     * 清除空的key 设置为null
     * 
     * @param map 需要清除的map
     * @return 清除后的map
     */
    public static Map<String, Object> clearEmptyKey(Map<String, Object> map)
    {
        Set<String> set = map.keySet();
        for (String key : set)
        {
            if (CheckUtils.isNullOrEmpty(map.get(key)))
            {
                map.put(key, null);
            }
        }
        return map;
    }
    
    /**
     * 将bean转换为map
     * 
     * @param obj 需要转换的bean
     * @return map
     */
    public static Map<String, Object> bean2Map(Object obj)
    {
        
        if (obj == null)
        {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try
        {
            Field field = null;
        }
        catch (Exception e)
        {
            System.out.println("transBean2Map Error " + e);
        }
        
        return map;
        
    }
    
    /**
     * map 转 Bean
     * 
     * @param <T>
     * 
     * @param map
     * @param cls
     * @return
     */
    public static <T> T map2Bean(Map map, Class<T> cls)
    {
        T obj = null;
        try
        {
            obj = cls.newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        // 取出bean里的所有方法
        Method[] methods = cls.getMethods();
        for (int i = 0; i < methods.length; i++)
        {
            // 取方法名
            String method = methods[i].getName();
            // 取出方法的类型
            Class[] cc = methods[i].getParameterTypes();
            if (cc.length != 1)
                continue;
            
            // 如果方法名没有以set开头的则退出本次for
            if (method.indexOf("set") < 0)
                continue;
            // 类型
            String type = cc[0].getSimpleName();
            
            try
            {
                // 转成小写
                // Object value = method.substring(3).toLowerCase();
                Object value = method.substring(3, 4).toLowerCase() + method.substring(4);
                // 如果map里有该key
                if (map.containsKey(value) && map.get(value) != null)
                {
                    // 调用其底层方法
                    setValue(type, map.get(value), i, methods, obj);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return obj;
    }
    
    public static void setValue(String type, Object value, int i, Method[] method, Object bean)
    {
        if (value != null && !value.equals(""))
        {
            try
            {
                if (type.equals("String"))
                {
                    // 第一个参数:从中调用基础方法的对象 第二个参数:用于方法调用的参数
                    method[i].invoke(bean, new Object[] {value});
                }
                else if (type.equals("int") || type.equals("Integer"))
                {
                    method[i].invoke(bean, new Object[] {new Integer("" + value)});
                }
                else if (type.equals("double") || type.equals("Double"))
                {
                    method[i].invoke(bean, new Object[] {new Double("" + value)});
                }
                else if (type.equals("float") || type.equals("Float"))
                {
                    method[i].invoke(bean, new Object[] {new Float("" + value)});
                }
                else if (type.equals("long") || type.equals("Long"))
                {
                    method[i].invoke(bean, new Object[] {new Long("" + value)});
                }
                else if (type.equals("boolean") || type.equals("Boolean"))
                {
                    method[i].invoke(bean, new Object[] {Boolean.valueOf("" + value)});
                }
                else if (type.equals("BigDecimal"))
                {
                    method[i].invoke(bean, new Object[] {new BigDecimal("" + value)});
                }
                else if (type.equals("Date"))
                {
                    Date date = null;
                    if (value.getClass().getName().equals("java.util.Date"))
                    {
                        date = (Date)value;
                    }
                    else
                    {
                        String format = ((String)value).indexOf(":") > 0 ? "yyyy-MM-dd hh:mm:ss" : "yyyy-MM-dd";
                        SimpleDateFormat sf = new SimpleDateFormat();
                        sf.applyPattern(format);
                        date = sf.parse((String)(value));
                    }
                    if (date != null)
                    {
                        method[i].invoke(bean, new Object[] {date});
                    }
                }
                else if (type.equals("byte[]"))
                {
                    method[i].invoke(bean, new Object[] {new String(value + "").getBytes()});
                }
            }
            catch (Exception e)
            {
                System.out.println("将linkHashMap 或 HashTable 里的值填充到javabean时出错,请检查!");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 非空验证
     * 
     * @param paramMap
     * @param checkField 必填字段
     * @return 200 验证成功
     */
    public static String isNotService(Map<String, Object> paramMap, String... checkField)
    {
        try
        {
            // 字段
            String nullField = checkParam(paramMap, checkField);
            if (nullField.length() != 0)
            {
                return "field is null:" + nullField;
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
            return "serverError";
        }
        return "200";
        
    }
    
    /**
     * 获取哪些参数为空
     * 
     * @param paramMap 参数map
     * @param checkField 需要检查的字段集合
     * @return 如果没有错误返回"" 如果有错误返回 错误的字段用逗号分割
     */
    public static String checkParam(Map<String, Object> paramMap, String... checkField)
    {
        List<String> nullFieldList = new ArrayList<>();
        if (checkField == null)
        {
            return "";
        }
        for (String fieldName : checkField)
        {
            if (!paramMap.containsKey(fieldName))
            {
                nullFieldList.add(fieldName);
            }
        }
        if (nullFieldList.size() == 0)
        {
            return "";
        }
        return StringUtil.getStrForIntegerIn(nullFieldList);
    }
    
    /**
     * 根据参数组织一个map 单数 为key 双数为val
     * 
     * @param argsArray 参数数组
     * @return map
     */
    public static Map<? extends Object, Object> getMapFromArgs(Object[] argsArray)
    {
        Map<Object, Object> resultMap = new HashMap<>();
        for (int i = 0; (i + 1) < argsArray.length; i = (i + 2))
        {
            resultMap.put(argsArray[i], argsArray[i + 1]);
        }
        return resultMap;
    }
    
    /**
     * 将list中的某个参数当key,某个参数当value组建map
     *
     * @param list
     * @param key map的key对应的list中字段的key
     * @param value map的value对应的list中字段的key
     * @return
     */
    public static Map<String, Object> list2Map(List<Map<String, Object>> list, String key, String value)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        String paramKey = null;
        for (Map<String, Object> paramMap : list)
        {
            if (!CheckUtils.isNullOrEmpty(paramKey))
            {
                map.put(paramKey, paramMap.get(value));
            }
        }
        return map;
    }
    
    static class Test
    {
        private String pKey;
        
        public String getPKey()
        {
            return pKey;
        }
        
        public void setPKey(String pkey)
        {
            this.pKey = pkey;
        }
        
    }
}

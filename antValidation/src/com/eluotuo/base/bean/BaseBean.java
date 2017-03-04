/*
 * 文 件 名:  BaseBean.java
 * 版    权:  
 * 描    述:  <描述>
 * 修 改 人:  nanshouxiao
 * 修改时间:  2015年8月19日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.eluotuo.base.bean;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;


import com.eluotuo.common.util.JsonUtils;
import com.eluotuo.common.util.MapUtils;

/**
 * bean的基类所有的pojo都可以选择性的继承此类
 * 
 * @author nanshouxiao
 * @version [版本号, 2015年8月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class BaseBean <T extends BaseBean> implements Serializable 
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 有权限的项目ids
     */
    protected String projectIds;
    
    /**
     * 物业集团code
     */
    protected String groupCode;
    
    /**
     * 物业公司id
     */
    protected Integer propertyId;
    
    /**
     * 管理处id
     */
    protected Integer managementDepartmentId;
    
    /**
     * 获取 projectIds
     * 
     * @return 返回 projectIds
     */
    public String getProjectIds()
    {
        return projectIds;
    }
    
    /**
     * 设置 projectIds
     * 
     * @param 对projectIds进行赋值
     */
    public void setProjectIds(String projectIds)
    {
        this.projectIds = projectIds;
    }
    
    /**
     * 获取 groupCode
     * 
     * @return 返回 groupCode
     */
    public String getGroupCode()
    {
        return groupCode;
    }
    
    /**
     * 设置 groupCode
     * 
     * @param 对groupCode进行赋值
     */
    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }
    
    /**
     * 获取 propertyId
     * 
     * @return 返回 propertyId
     */
    public Integer getPropertyId()
    {
        return propertyId;
    }
    
    /**
     * 设置 propertyId
     * 
     * @param 对propertyId进行赋值
     */
    public void setPropertyId(Integer propertyId)
    {
        this.propertyId = propertyId;
    }
    
    /**
     * 获取 managementDepartmentId
     * 
     * @return 返回 managementDepartmentId
     */
    public Integer getManagementDepartmentId()
    {
        return managementDepartmentId;
    }
    
    /**
     * 设置 managementDepartmentId
     * 
     * @param 对managementDepartmentId进行赋值
     */
    public void setManagementDepartmentId(Integer managementDepartmentId)
    {
        this.managementDepartmentId = managementDepartmentId;
    }
    
    /**
     * 重载方法
     * @return json格式
     */
    public String toString()
    {
        return JsonUtils.bean2json(this);
    }
    
    /** 
     * 如果要调用此参数
     * @param args
     * @return
     */
    public T mk(Object ... args)
    {
        Map<? extends Object, Object> paramMap = MapUtils.getMapFromArgs(args);
        // 取出bean里的所有方法
        Method[] methods = this.getClass().getMethods();
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
                if (paramMap.containsKey(value) && paramMap.get(value) != null)
                {
                    // 调用其底层方法
                    MapUtils.setValue(type, paramMap.get(value), i, methods, this);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return (T)this;
    }
    
    /** 
     * 将对象转换为map
     * @return map
     */
    public  Map<String,Object> asMap()
    {
        return MapUtils.bean2Map(this);
    }
    
    /** 
     * 将对象转换为json
     * @return
     */
    public String asJson()
    {
        return JsonUtils.bean2json(this);
    }
    
    /**
     * 
     * 以下方法为测试basebean新添加的 mk方法。
     * 也是为后面的人提供一个调用的demo，请不要删除
     * 
     * 
     */
    public static void main(String[] args)
    {
        TestBean bean = new TestBean().mk("name","wanglei","age",1);
        System.out.println(bean);
    }
    
    public static class TestBean extends BaseBean<TestBean>
    {
        private String name;
        private int age;
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
        
    }
}



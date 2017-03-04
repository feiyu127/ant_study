package com.eluotuo.admin.bean;

import java.io.Serializable;

/**
 * 角色中的菜单树封装类
 * 
 * @author Administrator
 *
 */
public class TreeData implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String name;
    
    private String readitem;
    
    private String writeitem;
    
    private String editeitem;
    
    private String delitem;
    
    private String elseitem;
    
    private String parentid;
    
    private String allitem;
    
    private Integer isdir;
    
    private Integer menuLevel;
    
    private String menuCode;
    
    
    
    /**
     * 获取 menuCode
     * @return 返回 menuCode
     */
    public String getMenuCode()
    {
        return menuCode;
    }

    /**
     * 设置 menuCode
     * @param 对menuCode进行赋值
     */
    public void setMenuCode(String menuCode)
    {
        this.menuCode = menuCode;
    }

    public Integer getIsdir()
    {
        return isdir;
    }
    
    public void setIsdir(Integer isdir)
    {
        this.isdir = isdir;
    }
    
    public String getDelitem()
    {
        return delitem;
    }
    
    public void setDelitem(String delitem)
    {
        this.delitem = delitem;
    }
    
    public String getAllitem()
    {
        return allitem;
    }
    
    public void setAllitem(String allitem)
    {
        this.allitem = allitem;
    }
    
    public String getParentid()
    {
        return parentid;
    }
    
    public void setParentid(String parentid)
    {
        this.parentid = parentid;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getReaditem()
    {
        return readitem;
    }
    
    public void setReaditem(String readitem)
    {
        this.readitem = readitem;
    }
    
    public String getWriteitem()
    {
        return writeitem;
    }
    
    public void setWriteitem(String writeitem)
    {
        this.writeitem = writeitem;
    }
    
    public String getEditeitem()
    {
        return editeitem;
    }
    
    public void setEditeitem(String editeitem)
    {
        this.editeitem = editeitem;
    }
    
    /**
     * 获取 elseitem
     * 
     * @return 返回 elseitem
     */
    public String getElseitem()
    {
        return elseitem;
    }
    
    /**
     * 设置 elseitem
     * 
     * @param 对elseitem进行赋值
     */
    public void setElseitem(String elseitem)
    {
        this.elseitem = elseitem;
    }
    
    /**
     * 获取 menuLevel
     * 
     * @return 返回 menuLevel
     */
    public Integer getMenuLevel()
    {
        return menuLevel;
    }
    
    /**
     * 设置 menuLevel
     * 
     * @param 对menuLevel进行赋值
     */
    public void setMenuLevel(Integer menuLevel)
    {
        this.menuLevel = menuLevel;
    }
    
}

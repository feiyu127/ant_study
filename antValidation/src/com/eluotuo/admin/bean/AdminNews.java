package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 新闻资讯
 * 
 * @author  zhaozhilong
 * @version  [版本号, 2016/11/17 09:34:34]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AdminNews extends BaseBean 
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    /** 
     * 主键无意义递增
     */
    @NotNull(message="{admin.id.null}", groups = {Update.class, Delete.class})
    @Max(message="{admin.id.max}", value=2147483647, groups = {Delete.class, Update.class})
    @Min(message="{admin.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
    private Integer id;
    /**加密主键无意义递增*/
    @NotNull(message="{admin.idE.null}")
    private String idE;
    /** 
     * 新闻标题
     */
    @Length(message="{admin.title.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String title;
    /** 
     * 创建人id
     */
    @Length(message="{admin.createUserId.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createUserId;
    /** 
     * 创建人姓名
     */
    @Length(message="{admin.createUserName.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createUserName;
    /** 
     * 新闻内容
     */
    private String content;
    /** 
     * 阅读次数
     */
    @Max(message="{admin.readingFrequency.max}", value=2147483647, groups = {Add.class, Update.class})
    @Min(message="{admin.readingFrequency.min}", value=-2147483648, groups = {Add.class, Update.class})
    private Integer readingFrequency;
    /** 
     * 新闻分类
     */
    @Max(message="{admin.newType.max}", value=2147483647, groups = {Add.class, Update.class})
    @Min(message="{admin.newType.min}", value=-2147483648, groups = {Add.class, Update.class})
    private Integer newType;
    /** 
     * 创建时间
     */
    @Length(message="{admin.createTime.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createTime;
    /**
     * 新闻图标
     */
    private String newsIcon;
    public String getNewsIcon()
    {
        return newsIcon;
    }
    public void setNewsIcon(String newsIcon)
    {
        this.newsIcon = newsIcon;
    }
    /**给主键无意义递增进行加密*/
    public void setIdE(String idE)
    {
        this.idE = idE;
        id = EncryptUtils.getDecodeIdFromIdE(idE);
    }
    /**获取加密主键无意义递增*/
    public String getIdE()
    { 
        return idE;
    }
    /** 
     * 给主键无意义递增赋值
     */
    public void setId(Integer id)
    {
        this.id=id;
        idE = EncryptUtils.getEncodeIdEFromId(id); 
    }
    /** 
     * 获取主键无意义递增
     */
    public Integer getId()
    {
        return id;
    }
    /** 
     * 给新闻标题赋值
     */
    public void setTitle(String title)
    {
        this.title=title;
    }
    /** 
     * 获取新闻标题
     */
    public String getTitle()
    {
        return title;
    }
    /** 
     * 给创建人id赋值
     */
    public void setCreateUserId(String createUserId)
    {
        this.createUserId=createUserId;
    }
    /** 
     * 获取创建人id
     */
    public String getCreateUserId()
    {
        return createUserId;
    }
    /** 
     * 给创建人姓名赋值
     */
    public void setCreateUserName(String createUserName)
    {
        this.createUserName=createUserName;
    }
    /** 
     * 获取创建人姓名
     */
    public String getCreateUserName()
    {
        return createUserName;
    }
    /** 
     * 给新闻内容赋值
     */
    public void setContent(String content)
    {
        this.content=content;
    }
    /** 
     * 获取新闻内容
     */
    public String getContent()
    {
        return content;
    }
    /** 
     * 给阅读次数赋值
     */
    public void setReadingFrequency(Integer readingFrequency)
    {
        this.readingFrequency=readingFrequency;
    }
    /** 
     * 获取阅读次数
     */
    public Integer getReadingFrequency()
    {
        return readingFrequency;
    }
    /** 
     * 给新闻分类赋值
     */
    public void setNewType(Integer newType)
    {
        this.newType=newType;
    }
    /** 
     * 获取新闻分类
     */
    public Integer getNewType()
    {
        return newType;
    }
    /** 
     * 给创建时间赋值
     */
    public void setCreateTime(String createTime)
    {
        this.createTime=createTime;
    }
    /** 
     * 获取创建时间
     */
    public String getCreateTime()
    {
        return createTime;
    }

}

package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 新闻资讯轮播广告
 * 
 * @author  zhaozhilong
 * @version  [版本号, 2017/01/06 11:33:33]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AdminCarouselBroadcast extends BaseBean 
{
    /** 
     * 主键
     */
    @NotNull(message="{admin.id.null}", groups = {Update.class, Delete.class})
    @Max(message="{admin.id.max}", value=2147483647, groups = {Delete.class, Update.class})
    @Min(message="{admin.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
    private Integer id;
    /**加密主键*/
    @NotNull(message="{admin.idE.null}")
    private String idE;
    /** 
     * 标题
     */
    @Length(message="{admin.title.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String title;
    /** 
     * 展现顺序
     */
    @Max(message="{admin.orders.max}", value=2147483647, groups = {Add.class, Update.class})
    @Min(message="{admin.orders.min}", value=-2147483648, groups = {Add.class, Update.class})
    private Integer orders;
    /** 
     * 轮播广告图
     */
    @Length(message="{admin.fileId.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String fileId;
    /** 
     * 创建时间
     */
    @Length(message="{admin.createTime.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createTime;
    /** 
     * 创建人id
     */
    @Length(message="{admin.createUserId.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createUserId;
    /** 
     * create_user_name
     */
    @Length(message="{admin.createUserName.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String createUserName;
    /** 
     * 状态 0已作废 1显示中
     */
    @Max(message="{admin.states.max}", value=2147483647, groups = {Add.class, Update.class})
    @Min(message="{admin.states.min}", value=-2147483648, groups = {Add.class, Update.class})
    private Integer states;
    /**
     * 状态名称，用于翻译
     */
    private String statesName;
    public String getStatesName()
    {
        return statesName;
    }
    public void setStatesName(String statesName)
    {
        this.statesName = statesName;
    }
    /** 
     * 新闻IDE,用于超链
     */
    @Length(message="{admin.newsIde.length}", groups = {Add.class, Update.class}, max=255, min=0)
    private String newsIde;
    private String newsTitle;
    private String newsCreateTime;
    /**给主键进行加密*/
    public void setIdE(String idE)
    {
        this.idE = idE;
        id = EncryptUtils.getDecodeIdFromIdE(idE);
    }
    public String getNewsTitle()
    {
        return newsTitle;
    }
    public void setNewsTitle(String newsTitle)
    {
        this.newsTitle = newsTitle;
    }
    public String getNewsCreateTime()
    {
        return newsCreateTime;
    }
    public void setNewsCreateTime(String newsCreateTime)
    {
        this.newsCreateTime = newsCreateTime;
    }
    /**获取加密主键*/
    public String getIdE()
    { 
        return idE;
    }
    /** 
     * 给主键赋值
     */
    public void setId(Integer id)
    {
        this.id=id;
        idE = EncryptUtils.getEncodeIdEFromId(id); 
    }
    /** 
     * 获取主键
     */
    public Integer getId()
    {
        return id;
    }
    /** 
     * 给标题赋值
     */
    public void setTitle(String title)
    {
        this.title=title;
    }
    /** 
     * 获取标题
     */
    public String getTitle()
    {
        return title;
    }
    /** 
     * 给展现顺序赋值
     */
    public void setOrders(Integer orders)
    {
        this.orders=orders;
    }
    /** 
     * 获取展现顺序
     */
    public Integer getOrders()
    {
        return orders;
    }
    /** 
     * 给轮播广告图赋值
     */
    public void setFileId(String fileId)
    {
        this.fileId=fileId;
    }
    /** 
     * 获取轮播广告图
     */
    public String getFileId()
    {
        return fileId;
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
     * 给create_user_name赋值
     */
    public void setCreateUserName(String createUserName)
    {
        this.createUserName=createUserName;
    }
    /** 
     * 获取create_user_name
     */
    public String getCreateUserName()
    {
        return createUserName;
    }
    /** 
     * 给状态 0已作废 1显示中赋值
     */
    public void setStates(Integer states)
    {
        this.states=states;
    }
    /** 
     * 获取状态 0已作废 1显示中
     */
    public Integer getStates()
    {
        return states;
    }
    /** 
     * 给新闻IDE,用于超链赋值
     */
    public void setNewsIde(String newsIde)
    {
        this.newsIde=newsIde;
    }
    /** 
     * 获取新闻IDE,用于超链
     */
    public String getNewsIde()
    {
        return newsIde;
    }

}

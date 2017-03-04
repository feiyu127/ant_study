package com.eluotuo.admin.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;

/**
 * 培训视频下载
 * 
 * @author wanglei
 * @version [版本号, 2015/11/30 14:20:46]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Training implements Serializable
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 569692183504782621L;
    
    /**
     * id
     */
    @NotNull(message = "{admin.id.null}", groups = {Update.class, Delete.class})
    @Max(message = "{admin.id.max}", value = 2147483647, groups = {Delete.class, Update.class})
    @Min(message = "{admin.id.min}", value = -2147483648, groups = {Delete.class, Update.class})
    private Integer id;
    
    /** 加密id */
    @NotNull(message = "{admin.idE.null}")
    private String idE;
    
    /**
     * 标题
     */
    @NotNull(message = "{admin.title.null}")
    @Length(message = "{admin.title.length}", groups = {Add.class, Update.class}, max = 64, min = 0)
    private String title;
    
    /**
     * 视频地址
     */
    @NotNull(message = "{admin.videoUrl.null}")
    @Length(message = "{admin.videoUrl.length}", groups = {Add.class, Update.class}, max = 512, min = 0)
    private String videoUrl;
    
    /**
     * 介绍
     */
    @Length(message = "{admin.desc.length}", groups = {Add.class, Update.class}, max = 1024, min = 0)
    private String desc;
    
    /**
     * 类型
     */
    @Max(message = "{admin.type.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.type.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer type;
    /**
     * 类型名称用于翻译
     */
    private String typeName;
    
    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    /**
     * 视频缩略图
     */
    private String videoImg;
    
    /**
     * 视频时间
     */
    private String videoTime;
    
    /** 给id进行加密 */
    public void setIdE(String idE)
    {
        this.idE = idE;
        id = EncryptUtils.getDecodeIdFromIdE(idE);
    }
    
    /** 获取加密id */
    public String getIdE()
    {
        return idE;
    }
    
    /**
     * 给id赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
        idE = EncryptUtils.getEncodeIdEFromId(id);
    }
    
    /**
     * 获取id
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
        this.title = title;
    }
    
    /**
     * 获取标题
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * 给视频地址赋值
     */
    public void setVideoUrl(String videoUrl)
    {
        this.videoUrl = videoUrl;
    }
    
    /**
     * 获取视频地址
     */
    public String getVideoUrl()
    {
        return videoUrl;
    }
    
    /**
     * 给介绍赋值
     */
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    
    /**
     * 获取介绍
     */
    public String getDesc()
    {
        return desc;
    }
    
    /**
     * 给类型赋值
     */
    public void setType(Integer type)
    {
        this.type = type;
    }
    
    /**
     * 获取类型
     */
    public Integer getType()
    {
        return type;
    }
    
    /**
     * 获取 videoImg
     * 
     * @return 返回 videoImg
     */
    public String getVideoImg()
    {
        return videoImg;
    }
    
    /**
     * 设置 videoImg
     * 
     * @param 对videoImg进行赋值
     */
    public void setVideoImg(String videoImg)
    {
        this.videoImg = videoImg;
    }
    
    /**
     * 获取 videoTime
     * 
     * @return 返回 videoTime
     */
    public String getVideoTime()
    {
        return videoTime;
    }
    
    /**
     * 设置 videoTime
     * 
     * @param 对videoTime进行赋值
     */
    public void setVideoTime(String videoTime)
    {
        this.videoTime = videoTime;
    }
    
}

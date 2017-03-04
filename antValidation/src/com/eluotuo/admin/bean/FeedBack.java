/*
 * 西安易骆驼信息科技有限公司
 * */
package com.eluotuo.admin.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.EncryptUtils;
import com.eluotuo.common.validator.Add;
import com.eluotuo.common.validator.Delete;
import com.eluotuo.common.validator.Update;

/**
 * 
 * 意见反馈相关信息
 * 
 * @author lishibin
 * @version [版本号, 2015年9月28日]
 * @see [相关类/方法]
 * @since [产品/模块版本] desprition:com.eluotuo.center.bean.FeedBack
 */
public class FeedBack implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7385879517186439473L;

    /** 
     * 
     */
    @NotNull(message = "{center.feedbackId.null}", groups = {Update.class, Delete.class})
    @Size(message = "{center.feedbackId.size}", min = -2147483648, max = 2147483647)
    private Integer feedbackId;
    
    /** 加密主键 */
    @NotNull(message = "{center.feedbackIdE.null}")
    private String feedbackIdE;
    
    /**
     * 反馈用户姓名
     */
    @NotNull(message = "{center.feedbackName.null}")
    @Length(message = "{center.feedbackName.length}", groups = {Add.class, Update.class}, max = 20, min = 0)
    private String feedbackName;
    
    /**
     * 反馈用户电话
     */
    @NotNull(message = "{center.feedbackPhone.null}")
    private String feedbackPhone;
    
    /**
     * 反馈内容
     */
    @Length(message = "{center.feedbackContent.length}", groups = {Add.class, Update.class}, max = 512, min = 0)
    private String feedbackContent;
    
    /** 给主键进行加密 */
    public void setFeedbackIdE(String feedbackIdE)
    {
        this.feedbackIdE = feedbackIdE;
        String decoding = EncryptUtils.decryptByDES(String.valueOf(feedbackIdE), EncryptUtils.getDESKey());
        feedbackId = (Integer.valueOf(decoding));
    }
    
    /** 获取加密主键 */
    public String getFeedbackIdE()
    {
        return feedbackIdE;
    }
    
    /**
     * 给id赋值
     */
    public void setFeedbackId(Integer feedbackId)
    {
        
        this.feedbackId = feedbackId;
        String encoding = EncryptUtils.encryptByDES(String.valueOf(feedbackId), EncryptUtils.getDESKey());
        feedbackIdE = (encoding);
        
    }
    
    /**
     * 获取id
     */
    public Integer getFeedbackId()
    {
        
        return feedbackId;
        
    }
    
    /**
     * 给反馈用户姓名赋值
     */
    public void setFeedbackName(String feedbackName)
    {
        
        this.feedbackName = feedbackName;
        
    }
    
    /**
     * 获取反馈用户姓名
     */
    public String getFeedbackName()
    {
        
        return feedbackName;
        
    }
    
    /**
     * 给反馈用户电话赋值
     */
    public void setFeedbackPhone(String feedbackPhone)
    {
        
        this.feedbackPhone = feedbackPhone;
        
    }
    
    /**
     * 获取反馈用户电话
     */
    public String getFeedbackPhone()
    {
        
        return feedbackPhone;
        
    }
    
    /**
     * 给反馈内容赋值
     */
    public void setFeedbackContent(String feedbackContent)
    {
        
        this.feedbackContent = feedbackContent;
        
    }
    
    /**
     * 获取反馈内容
     */
    public String getFeedbackContent()
    {
        
        return feedbackContent;
        
    }
    
    /**
     * 反馈标题
     */
    private String feedbackTitle;
    
    /**
     * 获取反馈标题
     * 
     * @return
     */
    public String getFeedbackTitle()
    {
        return feedbackTitle;
    }
    
    /**
     * 给反馈标题赋值
     * 
     * @param feedBackTitle
     */
    public void setFeedbackTitle(String feedbackTitle)
    {
        this.feedbackTitle = feedbackTitle;
    }
    
}

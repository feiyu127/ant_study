/*
 * 文 件 名:  AdminGroup.java
 * 版    权:  eluotuo Technology International Ltd.
 * 描    述:  &lt;描述&gt;.
 * 修 改 人:  wanglei
 * 修改时间:  ${date}
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
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
 * &lt;描述一下Bean&gt;
 * 
 * @author 朱俊
 * @version [版本号, 2015/08/13 11:52:34]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AdminGroup implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 集团id
     */
    @NotNull(message = "{test.groupId.null}", groups = {Update.class, Delete.class})
    @Size(message = "{test.groupId.size}", max = -2147483648, min = 2147483647)
    private Integer groupId;
    
    /** 加密主键 */
    @NotNull(message = "{test.groupIdE.null}")
    @Length(message = "{test.groupIdE.length}", max = 10, min = 0)
    private String groupIdE;
    
    /**
     * 集团名称
     */
    @NotNull(message = "{test.groupName.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.groupName.length}", max = 125, min = 0)
    private String groupName;
    
    /**
     * 集团编码
     */
    @NotNull(message = "{test.groupCode.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.groupCode.length}", max = 32, min = 0)
    private String groupCode;
    
    /**
     * 公司地址
     */
    @NotNull(message = "{test.address.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.address.length}", max = 512, min = 0)
    private String address;
    
    /**
     * 联系人姓名
     */
    @NotNull(message = "{test.contacts.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.contacts.length}", max = 32, min = 0)
    private String contacts;
    
    /**
     * 联系人电话
     */
    @NotNull(message = "{test.contactsPhone.null}", groups = {Update.class, Add.class})
    private String contactsPhone;
    
    /**
     * 联系人邮箱
     */
    @NotNull(message = "{test.contactsEmail.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.contactsEmail.length}", max = 128, min = 0)
    private String contactsEmail;
    /**
     * 集团描述
     */
    private String groupDescribe;
    
    /**
     * 管理员
     */
    @NotNull(message = "{test.admin.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.admin.length}", max = 32, min = 0)
    private String admin;
    
    /**
     * 管理员手机
     */
    @NotNull(message = "{test.adminPhone.null}", groups = {Update.class, Add.class})
    private String adminPhone;
    
    /**
     * 管理员邮箱
     */
    @NotNull(message = "{test.adminEmail.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.adminEmail.length}", max = 128, min = 0)
    private String adminEmail;
    
    /**
     * 公司logo
     */
    private String groupLogo;
    
    /**
     * 是否禁用0 禁用1 未禁用
     */
    @NotNull(message = "{test.isDisable.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.isDisable.length}", max = 10, min = 0)
    private Integer isDisable;
    
    /**
     * 运营商编号
     */
    private String operatorCode;
    
    /**
     * 应用
     */
    private String[] apps;
    
    public String[] getApps()
    {
        return apps;
    }
    
    public void setApps(String[] apps)
    {
        this.apps = apps;
    }
    
    
    /**
     * 状态
     */
    private String state;
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    /** 给主键进行加密 */
    public void setGroupIdE(String groupIdE)
    {
        groupId = EncryptUtils.getDecodeIdFromIdE(groupIdE);
        this.groupIdE = groupIdE;
    }
    
    /** 获取加密主键 */
    public String getGroupIdE()
    {
        return groupIdE;
    }
    
    /**
     * 给集团id赋值
     */
    public void setGroupId(Integer groupId)
    {
        groupIdE = EncryptUtils.getEncodeIdEFromId(groupId);
        this.groupId = groupId;
    }
    
    /**
     * 获取集团id
     */
    public Integer getGroupId()
    {
        return groupId;
    }
    
    /**
     * 给集团名称赋值
     */
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }
    
    /**
     * 获取集团名称
     */
    public String getGroupName()
    {
        return groupName;
    }
    
    /**
     * 给集团编码赋值
     */
    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }
    
    /**
     * 获取集团编码
     */
    public String getGroupCode()
    {
        return groupCode;
    }
    
    /**
     * 给公司地址赋值
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * 获取公司地址
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * 给联系人姓名赋值
     */
    public void setContacts(String contacts)
    {
        this.contacts = contacts;
    }
    
    /**
     * 获取联系人姓名
     */
    public String getContacts()
    {
        return contacts;
    }
    
    /**
     * 给联系人电话赋值
     */
    public void setContactsPhone(String contactsPhone)
    {
        this.contactsPhone = contactsPhone;
    }
    
    /**
     * 获取联系人电话
     */
    public String getContactsPhone()
    {
        return contactsPhone;
    }
    
    /**
     * 给联系人邮箱赋值
     */
    public void setContactsEmail(String contactsEmail)
    {
        this.contactsEmail = contactsEmail;
    }
    
    /**
     * 获取联系人邮箱
     */
    public String getContactsEmail()
    {
        return contactsEmail;
    }
    
    public String getGroupDescribe()
    {
        return groupDescribe;
    }

    public void setGroupDescribe(String groupDescribe)
    {
        this.groupDescribe = groupDescribe;
    }

    /**
     * 给管理员赋值
     */
    public void setAdmin(String admin)
    {
        this.admin = admin;
    }
    
    /**
     * 获取管理员
     */
    public String getAdmin()
    {
        return admin;
    }
    
    /**
     * 给管理员手机赋值
     */
    public void setAdminPhone(String adminPhone)
    {
        this.adminPhone = adminPhone;
    }
    
    /**
     * 获取管理员手机
     */
    public String getAdminPhone()
    {
        return adminPhone;
    }
    
    /**
     * 给管理员邮箱赋值
     */
    public void setAdminEmail(String adminEmail)
    {
        this.adminEmail = adminEmail;
    }
    
    /**
     * 获取管理员邮箱
     */
    public String getAdminEmail()
    {
        return adminEmail;
    }
    
    /**
     * 给公司logo赋值
     */
    public void setGroupLogo(String groupLogo)
    {
        this.groupLogo = groupLogo;
    }
    
    /**
     * 获取公司logo
     */
    public String getGroupLogo()
    {
        return groupLogo;
    }
    
    /**
     * 给是否禁用0 禁用1 未禁用赋值
     */
    public void setIsDisable(Integer isDisable)
    {
        this.isDisable = isDisable;
    }
    
    /**
     * 获取是否禁用0 禁用1 未禁用
     */
    public Integer getIsDisable()
    {
        return isDisable;
    }
    
    /**
     * 获取 operatorCode
     * 
     * @return 返回 operatorCode
     */
    public String getOperatorCode()
    {
        return operatorCode;
    }
    
    /**
     * 设置 operatorCode
     * 
     * @param 对operatorCode进行赋值
     */
    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
    }
    
}

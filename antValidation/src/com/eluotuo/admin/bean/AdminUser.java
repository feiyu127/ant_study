/*
 * 文 件 名:  AdminUser.java
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
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.EncryptUtils;
import com.eluotuo.common.validator.Add;
import com.eluotuo.common.validator.Delete;
import com.eluotuo.common.validator.Update;

/**
 * &lt;描述一下Bean&gt;
 * 
 * @author 朱俊
 * @version [版本号, 2015/08/13 11:31:39]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AdminUser implements Serializable
{
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    
    /**
     * 用户id
     */
    @NotNull(message = "{test.userId.null}", groups = {Update.class, Delete.class})
    private Integer userId;
    
    /** 加密主键 */
    
    private String userIdE;
    
    /**
     * 登录名
     */
    @NotNull(message = "{test.userLoginName.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.userLoginName.length}", max = 20, min = 0)
    private String userLoginName;
    
    /**
     * 用户的名字
     */
    @NotNull(message = "{test.userName.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.userName.length}", max = 20, min = 0)
    private String userName;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 手机号
     */
    @NotNull(message = "{test.phoneNum.null}", groups = {Update.class, Add.class})
    private String phoneNum;
    
    /**
     * 邮箱
     */
    @NotNull(message = "{test.email.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.email.length}", max = 255, min = 0)
    private String email;
    
    /**
     * 是否禁用0 禁用1 未禁用
     */
    @NotNull(message = "{test.isDisable.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.isDisable.length}", max = 10, min = 0)
    private Integer isDisable;
    
    /**
     * 状态
     */
    private String state;
    
    /**
     * 当前用户的角色
     */
    private String[] roleList;
    
    /**
     * 原始密码
     */
    private String oldPassword;
    
    /**
     * 新密码
     */
    private String newPassword;
    
    private Integer menuType;
    
    /**
     * 运营商编码
     */
    private String operatorCode;
    
    public Integer getMenuType()
    {
        return menuType;
    }
    
    public void setMenuType(Integer menuType)
    {
        this.menuType = menuType;
    }
    
    public String getOldPassword()
    {
        return oldPassword;
    }
    
    public void setOldPassword(String oldPassword)
    {
        this.oldPassword = oldPassword;
    }
    
    public String getNewPassword()
    {
        return newPassword;
    }
    
    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }
    
    private List<AdminRole> roles;
    
    /**
     * 验证码
     * */
    private String checkCode;
    
    public List<AdminRole> getRoles()
    {
        return roles;
    }
    
    public void setRoles(List<AdminRole> roles)
    {
        this.roles = roles;
    }
    
    public String getState()
    {
        return state;
    }
    
    public String[] getRoleList()
    {
        return roleList;
    }
    
    public void setRoleList(String[] roleList)
    {
        this.roleList = roleList;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    private Integer isadmin = 0;
    
    /** 给主键进行加密 */
    public void setUserIdE(String userIdE)
    {
        userId = EncryptUtils.getDecodeIdFromIdE(userIdE);
        this.userIdE = userIdE;
    }
    
    public Integer getIsadmin()
    {
        return isadmin;
    }
    
    public void setIsadmin(Integer isadmin)
    {
        this.isadmin = isadmin;
    }
    
    /** 获取加密主键 */
    public String getUserIdE()
    {
        return userIdE;
    }
    
    /**
     * 给用户id赋值
     */
    public void setUserId(Integer userId)
    {
        userIdE = EncryptUtils.getEncodeIdEFromId(userId);
        this.userId = userId;
    }
    
    /**
     * 获取用户id
     */
    public Integer getUserId()
    {
        return userId;
    }
    
    /**
     * 给 登录名赋值
     */
    public void setUserLoginName(String userLoginName)
    {
        this.userLoginName = userLoginName;
    }
    
    /**
     * 获取 登录名
     */
    public String getUserLoginName()
    {
        return userLoginName;
    }
    
    /**
     * 给用户的名字赋值
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    /**
     * 获取用户的名字
     */
    public String getUserName()
    {
        return userName;
    }
    
    /**
     * 给密码赋值
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * 获取密码
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * 给手机号赋值
     */
    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    
    /**
     * 获取手机号
     */
    public String getPhoneNum()
    {
        return phoneNum;
    }
    
    /**
     * 给邮箱赋值
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * 获取邮箱
     */
    public String getEmail()
    {
        return email;
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
    
    public String getCheckCode()
    {
        return checkCode;
    }
    
    public void setCheckCode(String checkCode)
    {
        this.checkCode = checkCode;
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

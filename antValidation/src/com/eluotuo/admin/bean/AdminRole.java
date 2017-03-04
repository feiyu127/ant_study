/*
 * 文 件 名:  AdminRole.java
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
 * @version [版本号, 2015/08/13 11:37:58]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AdminRole implements Serializable
{
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    
    /**
     * 角色id
     */
    @NotNull(message = "{test.roleId.null}", groups = {Update.class, Delete.class})
    @Size(message = "{test.roleId.size}", max = -2147483648, min = 2147483647)
    private Integer roleId;
    
    /** 加密主键 */
    @NotNull(message = "{test.roleIdE.null}")
    @Length(message = "{test.roleIdE.length}", max = 10, min = 0)
    private String roleIdE;
    
    /**
     * 角色名称
     */
    @NotNull(message = "{test.roleName.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.roleName.length}", max = 20, min = 0)
    private String roleName;
    
    /** 
	 * 
	 */
    @NotNull(message = "{test.remark.null}")
    @Length(message = "{test.remark.length}", max = 200, min = 0)
    private String remark;
    
    /** 
	 * 
	 */
    @NotNull(message = "{test.isDisable.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.isDisable.length}", max = 10, min = 0)
    private Integer isDisable;
    
    /**
     * 运营商编码
     */
    private String operatorCode;
    
    /**
     * 菜单按钮数据
     */
    private String[] methods;
    
    public String[] getMethods()
    {
        return methods;
    }
    
    public void setMethods(String[] methods)
    {
        this.methods = methods;
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
    public void setRoleIdE(String roleIdE)
    {
        roleId = EncryptUtils.getDecodeIdFromIdE(roleIdE);
        this.roleIdE = roleIdE;
    }
    
    /** 获取加密主键 */
    public String getRoleIdE()
    {
        return roleIdE;
    }
    
    /**
     * 给角色id赋值
     */
    public void setRoleId(Integer roleId)
    {
        roleIdE = EncryptUtils.getEncodeIdEFromId(roleId);
        this.roleId = roleId;
    }
    
    /**
     * 获取角色id
     */
    public Integer getRoleId()
    {
        return roleId;
    }
    
    /**
     * 给角色名称赋值
     */
    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }
    
    /**
     * 获取角色名称
     */
    public String getRoleName()
    {
        return roleName;
    }
    
    /**
     * 给赋值
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    /**
     * 获取
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * 给赋值
     */
    public void setIsDisable(Integer isDisable)
    {
        this.isDisable = isDisable;
    }
    
    /**
     * 获取
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

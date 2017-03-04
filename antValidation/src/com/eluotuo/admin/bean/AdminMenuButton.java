/*
 * 文 件 名:  AdminMenuButton.java
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
 * @author  朱俊
 * @version  [版本号, 2015/08/13 11:37:45]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AdminMenuButton implements Serializable
{
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 	/** 
	 * 按钮id
	 */
	@NotNull(message="{test.buttonId.null}", groups = {Update.class,Delete.class})
	@Size(message="{test.buttonId.size}", max=-2147483648, min=2147483647)
	private Integer buttonId;
	/**加密主键*/
	@NotNull(message="{test.buttonIdE.null}")
	@Length(message="{test.buttonIdE.length}", max=10, min=0)
	private String buttonIdE;
 	/** 
	 * 按钮名称
	 */
	@NotNull(message="{test.buttonName.null}" , groups = {Update.class,Add.class})
	@Length(message="{test.buttonName.length}", max=64, min=0)
	private String buttonName;
 	
	private String method;
 	/** 
	 * 菜单id
	 */
	@NotNull(message="{test.menuId.null}" , groups = {Update.class,Add.class})
	@Length(message="{test.menuId.length}", max=10, min=0)
	private Integer menuId;
 	/** 
	 * 是否禁用0 禁用1 未禁用
	 */
	@NotNull(message="{test.isDisable.null}" , groups = {Update.class,Add.class})
	@Length(message="{test.isDisable.length}", max=10, min=0)
	private Integer isDisable;
 	/** 
	 * 按钮类型12345，查询，添加，修改，删除，其他
	 */
	@NotNull(message="{test.buttonType.null}" , groups = {Update.class,Add.class})
	@Length(message="{test.buttonType.length}", max=10, min=0)
	private Integer buttonType;
	
	/**
	 * 状态
	 */
	private String state;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/**给主键进行加密*/
	public void setButtonIdE(String buttonIdE)
 	{
	    buttonId = EncryptUtils.getDecodeIdFromIdE(buttonIdE);
		this.buttonIdE = buttonIdE;
	}
	/**获取加密主键*/
	public String getButtonIdE()
 	{ 
		return buttonIdE;
	}
 	/** 
	 * 给按钮id赋值
	 */
	public void setButtonId(Integer buttonId)
	{
	    buttonIdE = EncryptUtils.getEncodeIdEFromId(buttonId);
		this.buttonId=buttonId;	}
 	/** 
	 * 获取按钮id
	 */
	public Integer getButtonId()
	{
		return buttonId;
	}
 	/** 
	 * 给按钮名称赋值
	 */
	public void setButtonName(String buttonName)
	{
		this.buttonName=buttonName;
	}
 	/** 
	 * 获取按钮名称
	 */
	public String getButtonName()
	{
		return buttonName;
	}
 	/** 
	 * 给Namespace方法名字赋值
	 */
	public void setMethod(String method)
	{
		this.method=method;
	}
 	/** 
	 * 获取Namespace方法名字
	 */
	public String getMethod()
	{
		return method;
	}
 	/** 
	 * 给菜单id赋值
	 */
	public void setMenuId(Integer menuId)
	{
		this.menuId=menuId;
	}
 	/** 
	 * 获取菜单id
	 */
	public Integer getMenuId()
	{
		return menuId;
	}
 	/** 
	 * 给是否禁用0 禁用1 未禁用赋值
	 */
	public void setIsDisable(Integer isDisable)
	{
		this.isDisable=isDisable;
	}
 	/** 
	 * 获取是否禁用0 禁用1 未禁用
	 */
	public Integer getIsDisable()
	{
		return isDisable;
	}
 	/** 
	 * 给按钮类型12345，查询，添加，修改，删除，其他赋值
	 */
	public void setButtonType(Integer buttonType)
	{
		this.buttonType=buttonType;
	}
 	/** 
	 * 获取按钮类型12345，查询，添加，修改，删除，其他
	 */
	public Integer getButtonType()
	{
		return buttonType;
	}

}

package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * main
 * 
 * @author  fenglin
 * @version  [版本号, 2016/11/17 14:48:37]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AppMsgTypeList extends BaseBean 
{
 	/** 
	 * 主键id
	 */
	@NotNull(message="{base.id.null}", groups = {Update.class, Delete.class})
	@Max(message="{base.id.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{base.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer id;
	/**加密主键id*/
	@NotNull(message="{base.idE.null}")
	private String idE;
 	/** 
	 * 类型代码
	 */
	@Length(message="{base.titleCode.length}", groups = {Add.class, Update.class}, max=30, min=0)
	private String titleCode;
 	/** 
	 * 操作类型
	 */
	@Max(message="{base.type.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.type.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer type;
 	/** 
	 * 未读条数
	 */
	@Max(message="{base.noReadNum.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.noReadNum.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer noReadNum;
 	/** 
	 * 用户id
	 */
	@Max(message="{base.userId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.userId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer userId;
 	/** 
	 * 集团编码
	 */
	@Length(message="{base.groupCode.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String groupCode;
	/**
	 * 权限标识
	 */
	private String authorization;
 	/** 
	 * 更新时间
	 */
	private String updateTime;
	/**
	 * 业务名称
	 */
	private String titleName;
	/**
	 * 消息内容
	 */
	private String message;
	/**给主键id进行加密*/
	public void setIdE(String idE)
 	{
		this.idE = idE;
		id = EncryptUtils.getDecodeIdFromIdE(idE);
	}
	/**获取加密主键id*/
	public String getIdE()
 	{ 
		return idE;
	}
 	/** 
	 * 给主键id赋值
	 */
	public void setId(Integer id)
	{
		this.id=id;		idE = EncryptUtils.getEncodeIdEFromId(id); 
	}
 	/** 
	 * 获取主键id
	 */
	public Integer getId()
	{
		return id;
	}
 	/** 
	 * 给类型代码赋值
	 */
	public void setTitleCode(String titleCode)
	{
		this.titleCode=titleCode;
	}
 	/** 
	 * 获取类型代码
	 */
	public String getTitleCode()
	{
		return titleCode;
	}
 	/** 
	 * 给操作类型赋值
	 */
	public void setType(Integer type)
	{
		this.type=type;
	}
 	/** 
	 * 获取操作类型
	 */
	public Integer getType()
	{
		return type;
	}
 	/** 
	 * 给未读条数赋值
	 */
	public void setNoReadNum(Integer noReadNum)
	{
		this.noReadNum=noReadNum;
	}
 	/** 
	 * 获取未读条数
	 */
	public Integer getNoReadNum()
	{
		return noReadNum;
	}
 	/** 
	 * 给用户id赋值
	 */
	public void setUserId(Integer userId)
	{
		this.userId=userId;
	}
 	/** 
	 * 获取用户id
	 */
	public Integer getUserId()
	{
		return userId;
	}
 	/** 
	 * 给集团编码赋值
	 */
	public void setGroupCode(String groupCode)
	{
		this.groupCode=groupCode;
	}
 	/** 
	 * 获取集团编码
	 */
	public String getGroupCode()
	{
		return groupCode;
	}
 	/** 
	 * 给更新时间赋值
	 */
	public void setUpdateTime(String updateTime)
	{
		this.updateTime=updateTime;
	}
 	/** 
	 * 获取更新时间
	 */
	public String getUpdateTime()
	{
		return updateTime;
	}
    public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getTitleName()
    {
        return titleName;
    }
    public void setTitleName(String titleName)
    {
        this.titleName = titleName;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }

}

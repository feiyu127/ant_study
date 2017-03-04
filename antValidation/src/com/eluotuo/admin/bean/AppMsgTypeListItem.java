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
 * @version  [版本号, 2016/11/17 14:49:42]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AppMsgTypeListItem extends BaseBean 
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
	 * 外键
	 */
	@Max(message="{base.msgTypeId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.msgTypeId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer msgTypeId;
 	/** 
	 * 业务主键
	 */
	@Max(message="{base.pKey.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.pKey.min}", value=-2147483648, groups = {Add.class, Update.class})
	private String pKey;
 	/** 
	 * 消息标题
	 */
	@Length(message="{base.message.length}", groups = {Add.class, Update.class}, max=512, min=0)
	private String message;
 	/** 
	 * 读取状态0:未读;1:已读
	 */
	@Max(message="{base.readStatus.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.readStatus.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer readStatus;
 	/** 
	 * 创建时间
	 */
	private String createTime;
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
	 * 给外键赋值
	 */
	public void setMsgTypeId(Integer msgTypeId)
	{
		this.msgTypeId=msgTypeId;
	}
 	/** 
	 * 获取外键
	 */
	public Integer getMsgTypeId()
	{
		return msgTypeId;
	}
 	/** 
	 * 给业务主键赋值
	 */
	public void setPKey(String pKey)
	{
		this.pKey=pKey;
	}
 	/** 
	 * 获取业务主键
	 */
	public String getPKey()
	{
		return pKey;
	}
 	/** 
	 * 给消息标题赋值
	 */
	public void setMessage(String message)
	{
		this.message=message;
	}
 	/** 
	 * 获取消息标题
	 */
	public String getMessage()
	{
		return message;
	}
 	/** 
	 * 给读取状态0:未读;1:已读赋值
	 */
	public void setReadStatus(Integer readStatus)
	{
		this.readStatus=readStatus;
	}
 	/** 
	 * 获取读取状态0:未读;1:已读
	 */
	public Integer getReadStatus()
	{
		return readStatus;
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

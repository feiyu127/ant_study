package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 物业公告
 * 
 * @author  dengyinjie
 * @version  [版本号, 2016/02/25 09:28:27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AdminNotice extends BaseBean 
{
 	/** 
	 * 公告id(自增)
	 */
	@NotNull(message="{admin.id.null}", groups = {Update.class, Delete.class})
	@Max(message="{admin.id.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{admin.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer id;
	/**加密公告id(自增)*/
	@NotNull(message="{admin.idE.null}")
	private String idE;
 	/** 
	 * 创建人id
	 */
	@Max(message="{admin.creatorId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.creatorId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer creatorId;
 	/** 
	 * 创建时间
	 */
	@Length(message="{admin.creatorDate.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String creatorDate;
 	/** 
	 * 公告内容
	 */
	@Length(message="{admin.content.length}", groups = {Add.class, Update.class}, max=1024, min=0)
	private String content;
 	/** 
	 * 通知时间
	 */
	@Length(message="{admin.noticeDate.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String noticeDate;
 	/** 
	 * 运营商编码
	 */
	@Length(message="{admin.operatorCode.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String operatorCode;
	/**给公告id(自增)进行加密*/
	public void setIdE(String idE)
 	{
		this.idE = idE;
		id = EncryptUtils.getDecodeIdFromIdE(idE);
	}
	/**获取加密公告id(自增)*/
	public String getIdE()
 	{ 
		return idE;
	}
 	/** 
	 * 给公告id(自增)赋值
	 */
	public void setId(Integer id)
	{
		this.id=id;		idE = EncryptUtils.getEncodeIdEFromId(id); 
	}
 	/** 
	 * 获取公告id(自增)
	 */
	public Integer getId()
	{
		return id;
	}
 	/** 
	 * 给创建人id赋值
	 */
	public void setCreatorId(Integer creatorId)
	{
		this.creatorId=creatorId;
	}
 	/** 
	 * 获取创建人id
	 */
	public Integer getCreatorId()
	{
		return creatorId;
	}
 	/** 
	 * 给创建时间赋值
	 */
	public void setCreatorDate(String creatorDate)
	{
		this.creatorDate=creatorDate;
	}
 	/** 
	 * 获取创建时间
	 */
	public String getCreatorDate()
	{
		return creatorDate;
	}
 	/** 
	 * 给公告内容赋值
	 */
	public void setContent(String content)
	{
		this.content=content;
	}
 	/** 
	 * 获取公告内容
	 */
	public String getContent()
	{
		return content;
	}
 	/** 
	 * 给通知时间赋值
	 */
	public void setNoticeDate(String noticeDate)
	{
		this.noticeDate=noticeDate;
	}
 	/** 
	 * 获取通知时间
	 */
	public String getNoticeDate()
	{
		return noticeDate;
	}
 	/** 
	 * 给运营商编码赋值
	 */
	public void setOperatorCode(String operatorCode)
	{
		this.operatorCode=operatorCode;
	}
 	/** 
	 * 获取运营商编码
	 */
	public String getOperatorCode()
	{
		return operatorCode;
	}

}

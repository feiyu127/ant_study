package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 操作日志
 * 
 * @author  fenglin
 * @version  [版本号, 2016/10/24 08:55:44]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OperatorLog extends BaseBean 
{
 	/** 
	 * 自增id
	 */
	@NotNull(message="{admin.id.null}", groups = {Update.class, Delete.class})
	@Max(message="{admin.id.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{admin.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer id;
	/**加密自增id*/
	@NotNull(message="{admin.idE.null}")
	private String idE;
 	/** 
	 * 字典描述id
	 */
	@NotNull(message="{admin.operatorEvent.null}")
	@Max(message="{admin.operatorEvent.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.operatorEvent.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer operatorEvent;
 	/** 
	 * 字典类型
	 */
	@NotNull(message="{admin.operatorType.null}")
	@Max(message="{admin.operatorType.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.operatorType.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer operatorType;
 	/** 
	 * 业务id
	 */
	@NotNull(message="{admin.pKey.null}")
	@Max(message="{admin.pKey.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{admin.pKey.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer pKey;
	/**加密业务id*/
	@NotNull(message="{admin.pKeyE.null}")
	private String pKeyE;
 	/** 
	 * 操作人id
	 */
	@NotNull(message="{admin.operatorUserId.null}")
	@Max(message="{admin.operatorUserId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.operatorUserId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer operatorUserId;
 	/** 
	 * 操作人名称
	 */
	@NotNull(message="{admin.operatorUserName.null}")
	@Length(message="{admin.operatorUserName.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String operatorUserName;
 	/** 
	 * 备注
	 */
	@Length(message="{admin.remark.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String remark;
 	/** 
	 * 操作时间
	 */
	@NotNull(message="{admin.operatorDatetime.null}")
	@Length(message="{admin.operatorDatetime.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String operatorDatetime;
	/**
	 * 字典查询事件
	 */
	private String typeEvent;
	/**
	 * 事件名称
	 */
	private String eventName;
	/**
     * 员工图像
     */
	private String headerImg;
	/**
     * 员工电话
     */
	private String operaterPhone;
	/**
     * 工号
     */
	private String operaterNumer;
	/**
     * 扩展数据json
     */
	private String extend;
	
	/**给自增id进行加密*/
	public void setIdE(String idE)
 	{
		this.idE = idE;
		id = EncryptUtils.getDecodeIdFromIdE(idE);
	}
	/**获取加密自增id*/
	public String getIdE()
 	{ 
		return idE;
	}
 	/** 
	 * 给自增id赋值
	 */
	public void setId(Integer id)
	{
		this.id=id;		idE = EncryptUtils.getEncodeIdEFromId(id); 
	}
 	/** 
	 * 获取自增id
	 */
	public Integer getId()
	{
		return id;
	}
 	/** 
	 * 给字典描述id赋值
	 */
	public void setOperatorEvent(Integer operatorEvent)
	{
		this.operatorEvent=operatorEvent;
	}
 	/** 
	 * 获取字典描述id
	 */
	public Integer getOperatorEvent()
	{
		return operatorEvent;
	}
 	/** 
	 * 给字典类型赋值
	 */
	public void setOperatorType(Integer operatorType)
	{
		this.operatorType=operatorType;
	}
 	/** 
	 * 获取字典类型
	 */
	public Integer getOperatorType()
	{
		return operatorType;
	}
	/**给业务id进行加密*/
	public void setPKeyE(String pKeyE)
 	{
		this.pKeyE = pKeyE;
		pKey = EncryptUtils.getDecodeIdFromIdE(pKeyE);
	}
	/**获取加密业务id*/
	public String getPKeyE()
 	{ 
		return pKeyE;
	}
 	/** 
	 * 给业务id赋值
	 */
	public void setPKey(Integer pKey)
	{
		this.pKey=pKey;		pKeyE = EncryptUtils.getEncodeIdEFromId(pKey); 
	}
 	/** 
	 * 获取业务id
	 */
	public Integer getPKey()
	{
		return pKey;
	}
 	/** 
	 * 给操作人id赋值
	 */
	public void setOperatorUserId(Integer operatorUserId)
	{
		this.operatorUserId=operatorUserId;
		this.operaterNumer = StringUtil.formatCountWith0("WY", "%05d", operatorUserId);
	}
 	/** 
	 * 获取操作人id
	 */
	public Integer getOperatorUserId()
	{
		return operatorUserId;
	}
 	/** 
	 * 给操作人名称赋值
	 */
	public void setOperatorUserName(String operatorUserName)
	{
		this.operatorUserName=operatorUserName;
	}
 	/** 
	 * 获取操作人名称
	 */
	public String getOperatorUserName()
	{
		return operatorUserName;
	}
 	/** 
	 * 给备注赋值
	 */
	public void setRemark(String remark)
	{
		this.remark=remark;
	}
 	/** 
	 * 获取备注
	 */
	public String getRemark()
	{
		return remark;
	}
 	/** 
	 * 给操作时间赋值
	 */
	public void setOperatorDatetime(String operatorDatetime)
	{
		this.operatorDatetime=operatorDatetime;
	}
 	/** 
	 * 获取操作时间
	 */
	public String getOperatorDatetime()
	{
		return operatorDatetime;
	}
    public String getTypeEvent()
    {
        return operatorType+"_"+operatorEvent;
    }
    public void setTypeEvent(String typeEvent)
    {
        this.typeEvent = typeEvent;
    }
    public String getEventName()
    {
        return eventName;
    }
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }
    public String getHeaderImg()
    {
        return headerImg;
    }
    public void setHeaderImg(String headerImg)
    {
        this.headerImg = headerImg;
    }
    public String getOperaterPhone()
    {
        return operaterPhone;
    }
    public void setOperaterPhone(String operaterPhone)
    {
        this.operaterPhone = operaterPhone;
    }
    public String getOperaterNumer()
    {
        return operaterNumer;
    }
    public void setOperaterNumer(String operaterNumer)
    {
        this.operaterNumer = operaterNumer;
    }
    public String getExtend()
    {
        return extend;
    }
    public void setExtend(String extend)
    {
        this.extend = extend;
    }

}

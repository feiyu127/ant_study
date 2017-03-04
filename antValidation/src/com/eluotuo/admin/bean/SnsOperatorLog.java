package com.eluotuo.admin.bean;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * e社区日志
 * 
 * @author  fenglin
 * @version  [版本号, 2016/11/08 10:33:08]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SnsOperatorLog extends BaseBean 
{
 	/** 
	 * 自增id
	 */
	@NotNull(message="{base.id.null}", groups = {Update.class, Delete.class})
	@Max(message="{base.id.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{base.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer id;
	/**加密自增id*/
	@NotNull(message="{base.idE.null}")
	private String idE;
 	/** 
	 * 字典描述id
	 */
	@NotNull(message="{base.operatorEvent.null}")
	@Max(message="{base.operatorEvent.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.operatorEvent.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer operatorEvent;
 	/** 
	 * 字典类型
	 */
	@NotNull(message="{base.operatorType.null}")
	@Max(message="{base.operatorType.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.operatorType.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer operatorType;
 	/** 
	 * 业务id
	 */
	@NotNull(message="{base.pKey.null}")
	@Max(message="{base.pKey.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.pKey.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer pKey;
	/**加密业务id*/
    @NotNull(message="{admin.pKeyE.null}")
    private String pKeyE;
 	/** 
	 * 处理人id
	 */
	@Max(message="{base.dealPersonnelId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{base.dealPersonnelId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer dealPersonnelId;
 	/** 
	 * 处理人名称
	 */
	@Length(message="{base.dealPersonnelName.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String dealPersonnelName;
 	/** 
	 * 备注
	 */
	@Length(message="{base.remark.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String remark;
 	/** 
	 * 操作时间
	 */
	private String operatorDatetime;
 	/** 
	 * 扩展字段(json)
	 */
	private String extend;
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
 	/** 
	 * 给业务id赋值
	 */
	public void setPKey(Integer pKey)
	{
		this.pKey=pKey;
		pKeyE = EncryptUtils.getEncodeIdEFromId(pKey); 
	}
 	/** 
	 * 获取业务id
	 */
	public Integer getPKey()
	{
		return pKey;
	}
 	public String getpKeyE()
    {
        return pKeyE;
    }
    public void setpKeyE(String pKeyE)
    {
        this.pKeyE = pKeyE;
        pKey = EncryptUtils.getDecodeIdFromIdE(pKeyE);
    }
    /** 
	 * 给处理人id赋值
	 */
	public void setDealPersonnelId(Integer dealPersonnelId)
	{
		this.dealPersonnelId=dealPersonnelId;
		this.operaterNumer = StringUtil.formatCountWith0("WY", "%05d", dealPersonnelId);
	}
 	/** 
	 * 获取处理人id
	 */
	public Integer getDealPersonnelId()
	{
		return dealPersonnelId;
	}
 	/** 
	 * 给处理人名称赋值
	 */
	public void setDealPersonnelName(String dealPersonnelName)
	{
		this.dealPersonnelName=dealPersonnelName;
	}
 	/** 
	 * 获取处理人名称
	 */
	public String getDealPersonnelName()
	{
		return dealPersonnelName;
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
 	/** 
	 * 给扩展字段(json)赋值
	 */
	public void setExtend(String extend)
	{
		this.extend=extend;
	}
 	/** 
	 * 获取扩展字段(json)
	 */
	public String getExtend()
	{
		return extend;
	}
    public String getTypeEvent()
    {
        return typeEvent;
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
}

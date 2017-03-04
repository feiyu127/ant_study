package com.eluotuo.admin.bean;

import java.io.Serializable;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 客户意见反馈
 * 
 * @author  fenglin
 * @version  [版本号, 2016/11/23 16:16:50]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class AdminCustomIdea implements Serializable
{
 	/** 
	 * id
	 */
	@NotNull(message="{admin.id.null}", groups = {Update.class, Delete.class})
	@Max(message="{admin.id.max}", value=2147483647, groups = {Delete.class, Update.class})
	@Min(message="{admin.id.min}", value=-2147483648, groups = {Delete.class, Update.class})
	private Integer id;
	/**加密id*/
	@NotNull(message="{admin.idE.null}")
	private String idE;
 	/** 
	 * 城市编码
	 */
	@Length(message="{admin.cityCode.length}", groups = {Add.class, Update.class}, max=20, min=0)
	private String cityCode;
 	/** 
	 * 城市名称
	 */
	@Length(message="{admin.cityName.length}", groups = {Add.class, Update.class}, max=100, min=0)
	private String cityName;
 	/** 
	 * 集团编码
	 */
	@Length(message="{admin.groupCode.length}", groups = {Add.class, Update.class}, max=32, min=0)
	private String groupCode;
 	/** 
	 * 物业公司id
	 */
	@Max(message="{admin.propertyId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.propertyId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer propertyId;
 	/** 
	 * 物业公司名称
	 */
	@Length(message="{admin.propertyName.length}", groups = {Add.class, Update.class}, max=512, min=0)
	private String propertyName;
 	/** 
	 * 小区id
	 */
	@Max(message="{admin.projectId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.projectId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer projectId;
 	/** 
	 * 小区名称
	 */
	@Length(message="{admin.projectName.length}", groups = {Add.class, Update.class}, max=512, min=0)
	private String projectName;
 	/** 
	 * 部门id
	 */
	@Max(message="{admin.departmentId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.departmentId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer departmentId;
 	/** 
	 * 部门名称
	 */
	@Length(message="{admin.departmentName.length}", groups = {Add.class, Update.class}, max=218, min=0)
	private String departmentName;
 	/** 
	 * 反馈人id
	 */
	@Max(message="{admin.ideaUserId.max}", value=2147483647, groups = {Add.class, Update.class})
	@Min(message="{admin.ideaUserId.min}", value=-2147483648, groups = {Add.class, Update.class})
	private Integer ideaUserId;
 	/** 
	 * 反馈人名称
	 */
	@Length(message="{admin.ideaUserName.length}", groups = {Add.class, Update.class}, max=20, min=0)
	private String ideaUserName;
 	/** 
	 * 反馈详情
	 */
	private String ideaContent;
 	/** 
	 * 联系电话
	 */
	private String concatPhone;
	/** 
     * 创建时间
     */
    private String createTime;
    /** 
     * 开始时间
     */
    private String startTime;
    /** 
     * 结束时间
     */
    private String endTime;
    /** 
     * 关键词搜索
     */
    private String keyWord;
	/**给id进行加密*/
	public void setIdE(String idE)
 	{
		this.idE = idE;
		id = EncryptUtils.getDecodeIdFromIdE(idE);
	}
	/**获取加密id*/
	public String getIdE()
 	{ 
		return idE;
	}
 	/** 
	 * 给id赋值
	 */
	public void setId(Integer id)
	{
		this.id=id;		idE = EncryptUtils.getEncodeIdEFromId(id); 
	}
 	/** 
	 * 获取id
	 */
	public Integer getId()
	{
		return id;
	}
 	/** 
	 * 给城市编码赋值
	 */
	public void setCityCode(String cityCode)
	{
		this.cityCode=cityCode;
	}
 	/** 
	 * 获取城市编码
	 */
	public String getCityCode()
	{
		return cityCode;
	}
 	/** 
	 * 给城市名称赋值
	 */
	public void setCityName(String cityName)
	{
		this.cityName=cityName;
	}
 	/** 
	 * 获取城市名称
	 */
	public String getCityName()
	{
		return cityName;
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
	 * 给物业公司id赋值
	 */
	public void setPropertyId(Integer propertyId)
	{
		this.propertyId=propertyId;
	}
 	/** 
	 * 获取物业公司id
	 */
	public Integer getPropertyId()
	{
		return propertyId;
	}
 	/** 
	 * 给物业公司名称赋值
	 */
	public void setPropertyName(String propertyName)
	{
		this.propertyName=propertyName;
	}
 	/** 
	 * 获取物业公司名称
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
 	/** 
	 * 给小区id赋值
	 */
	public void setProjectId(Integer projectId)
	{
		this.projectId=projectId;
	}
 	/** 
	 * 获取小区id
	 */
	public Integer getProjectId()
	{
		return projectId;
	}
 	/** 
	 * 给小区名称赋值
	 */
	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}
 	/** 
	 * 获取小区名称
	 */
	public String getProjectName()
	{
		return projectName;
	}
 	/** 
	 * 给部门id赋值
	 */
	public void setDepartmentId(Integer departmentId)
	{
		this.departmentId=departmentId;
	}
 	/** 
	 * 获取部门id
	 */
	public Integer getDepartmentId()
	{
		return departmentId;
	}
 	/** 
	 * 给部门名称赋值
	 */
	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}
 	/** 
	 * 获取部门名称
	 */
	public String getDepartmentName()
	{
		return departmentName;
	}
 	/** 
	 * 给反馈人id赋值
	 */
	public void setIdeaUserId(Integer ideaUserId)
	{
		this.ideaUserId=ideaUserId;
	}
 	/** 
	 * 获取反馈人id
	 */
	public Integer getIdeaUserId()
	{
		return ideaUserId;
	}
 	/** 
	 * 给反馈人名称赋值
	 */
	public void setIdeaUserName(String ideaUserName)
	{
		this.ideaUserName=ideaUserName;
	}
 	/** 
	 * 获取反馈人名称
	 */
	public String getIdeaUserName()
	{
		return ideaUserName;
	}
 	/** 
	 * 给反馈详情赋值
	 */
	public void setIdeaContent(String ideaContent)
	{
		this.ideaContent=ideaContent;
	}
 	/** 
	 * 获取反馈详情
	 */
	public String getIdeaContent()
	{
		return ideaContent;
	}
 	/** 
	 * 给联系电话赋值
	 */
	public void setConcatPhone(String concatPhone)
	{
		this.concatPhone=concatPhone;
	}
 	/** 
	 * 获取联系电话
	 */
	public String getConcatPhone()
	{
		return concatPhone;
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
    public String getStartTime()
    {
        return startTime;
    }
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }
    public String getEndTime()
    {
        return endTime;
    }
    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }
    public String getKeyWord()
    {
        return keyWord;
    }
    public void setKeyWord(String keyWord)
    {
        this.keyWord = keyWord;
    }

}

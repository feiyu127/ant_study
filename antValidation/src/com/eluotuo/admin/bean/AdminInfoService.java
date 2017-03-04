package com.eluotuo.admin.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 服务/产品信息维护CRUD
 * 
 * @author lishibin
 * @version [版本号, 2015/11/23 17:37:40]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AdminInfoService implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * id
     */
    @NotNull(message = "{admin.id.null}", groups = {Update.class, Delete.class})
    @Max(message = "{admin.id.max}", value = 2147483647, groups = {Delete.class, Update.class})
    @Min(message = "{admin.id.min}", value = -2147483648, groups = {Delete.class, Update.class})
    private Integer id;
    
    /** 加密id */
    @NotNull(message = "{admin.idE.null}")
    private String idE;
    
    /**
     * 城市名称
     */
    @NotNull(message = "{admin.cityName.null}")
    @Max(message = "{admin.cityName.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.cityName.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer cityName;
    
    /**
     * 发布信息分类名称(产品供应与服务提供)
     */
    @NotNull(message = "{admin.classification.null}")
    @Max(message = "{admin.classification.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.classification.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer classification;
    
    /**
     * 发布信息分类下对应的类型（类型(设备检测，设备维修，墙体维修，清理，其他))字典表
     */
    @NotNull(message = "{admin.type.null}")
    @Max(message = "{admin.type.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.type.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer type;
    
    /**
     * 服务/产品提供的公司
     */
    @NotNull(message = "{admin.company.null}")
    @Length(message = "{admin.company.length}", groups = {Add.class, Update.class}, max = 128, min = 0)
    private String company;
    
    /**
     * 服务/产品提供的公司地址
     */
    @NotNull(message = "{admin.address.null}")
    @Length(message = "{admin.address.length}", groups = {Add.class, Update.class}, max = 128, min = 0)
    private String address;
    
    /**
     * 服务/产品提供的公司联系人
     */
    @NotNull(message = "{admin.contactPerson.null}")
    @Length(message = "{admin.contactPerson.length}", groups = {Add.class, Update.class}, max = 128, min = 0)
    private String contactPerson;
    
    /**
     * 服务/产品提供的公司联系人电话
     */
    @NotNull(message = "{admin.contactPhone.null}")
    private String contactPhone;
    
    /**
     * 所提供服务的或者产品信息的报价
     */
    @NotNull(message = "{admin.quote.null}")
    @Length(message = "{admin.quote.length}", groups = {Add.class, Update.class}, max = 256, min = 0)
    private String quote;
    
    /**
     * 所提供服务的或者产品信息的报价
     */
    @NotNull(message = "{admin.title.null}")
    @Length(message = "{admin.title.length}", groups = {Add.class, Update.class}, max = 128, min = 0)
    private String title;
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * 所提供服务的或者产品信息的详情
     */
    @NotNull(message = "{admin.details.null}")
    @Length(message = "{admin.details.length}", groups = {Add.class, Update.class}, max = 1024, min = 0)
    private String details;
    
    /** 给id进行加密 */
    public void setIdE(String idE)
    {
        this.idE = idE;
        id = EncryptUtils.getDecodeIdFromIdE(idE);
    }
    
    /** 获取加密id */
    public String getIdE()
    {
        return idE;
    }
    
    /**
     * 给id赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
        idE = EncryptUtils.getEncodeIdEFromId(id);
    }
    
    /**
     * 获取id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * 给城市名称赋值
     */
    public void setCityName(Integer cityName)
    {
        this.cityName = cityName;
    }
    
    /**
     * 获取城市名称
     */
    public Integer getCityName()
    {
        return cityName;
    }
    
    /**
     * 给发布信息分类名称(产品供应与服务提供)赋值
     */
    public void setClassification(Integer classification)
    {
        this.classification = classification;
    }
    
    /**
     * 获取发布信息分类名称(产品供应与服务提供)
     */
    public Integer getClassification()
    {
        return classification;
    }
    
    /**
     * 给发布信息分类下对应的类型（类型(设备检测，设备维修，墙体维修，清理，其他))字典表赋值
     */
    public void setType(Integer type)
    {
        this.type = type;
    }
    
    /**
     * 获取发布信息分类下对应的类型（类型(设备检测，设备维修，墙体维修，清理，其他))字典表
     */
    public Integer getType()
    {
        return type;
    }
    
    /**
     * 给服务/产品提供的公司赋值
     */
    public void setCompany(String company)
    {
        this.company = company;
    }
    
    /**
     * 获取服务/产品提供的公司
     */
    public String getCompany()
    {
        return company;
    }
    
    /**
     * 给服务/产品提供的公司地址赋值
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * 获取服务/产品提供的公司地址
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * 给服务/产品提供的公司联系人赋值
     */
    public void setContactPerson(String contactPerson)
    {
        this.contactPerson = contactPerson;
    }
    
    /**
     * 获取服务/产品提供的公司联系人
     */
    public String getContactPerson()
    {
        return contactPerson;
    }
    
    /**
     * 给服务/产品提供的公司联系人电话赋值
     */
    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }
    
    /**
     * 获取服务/产品提供的公司联系人电话
     */
    public String getContactPhone()
    {
        return contactPhone;
    }
    
    /**
     * 给所提供服务的或者产品信息的报价赋值
     */
    public void setQuote(String quote)
    {
        this.quote = quote;
    }
    
    /**
     * 获取所提供服务的或者产品信息的报价
     */
    public String getQuote()
    {
        return quote;
    }
    
    /**
     * 给所提供服务的或者产品信息的详情赋值
     */
    public void setDetails(String details)
    {
        this.details = details;
    }
    
    /**
     * 获取所提供服务的或者产品信息的详情
     */
    public String getDetails()
    {
        return details;
    }
    
    /**
     * 类型(翻译字典)
     */
    private String showInfoType;
    
    /**
     * 获取类型(翻译字典)
     * 
     * @return
     */
    public String getShowInfoType()
    {
        return showInfoType;
    }
    
    /**
     * 给获取类型(翻译字典)赋值
     * 
     * @param showInfoType
     */
    public void setShowInfoType(String showInfoType)
    {
        this.showInfoType = showInfoType;
    }
    
    /**
     * 城市翻译字典中字段
     */
    private String city;
    
    /**
     * 获取城市翻译字典中字段
     * 
     * @return
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * 给城市翻译字典中字段赋值
     * 
     * @param city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * 查询参数
     */
    private String param;
    
    /**
     * 获取查询参数
     * 
     * @return
     */
    public String getParam()
    {
        return param;
    }
    
    /**
     * 给查询参数赋值
     * 
     * @param param
     */
    public void setParam(String param)
    {
        this.param = param;
    }
    
    /**
     * 运营商编码
     */
    private String operatorCode;
    
    /**
     * 获取运营商编码
     * 
     * @return
     */
    public String getOperatorCode()
    {
        return operatorCode;
    }
    
    /**
     * 给运营商编码赋值
     * 
     * @param operatorCode
     */
    public void setOperatorCode(String operatorCode)
    {
        this.operatorCode = operatorCode;
    }
    
}

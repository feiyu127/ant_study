package com.eluotuo.charge.bean;

import java.util.Date;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 临时收费(业主)
 * 
 * @author wangpengfei
 * @version [版本号, 2015/09/28 12:15:54]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ChargeTempCus extends BaseBean
{
    /**
     * 业主临时收费id
     */
    @NotNull(message = "{charge.chargeTempCusId.null}", groups = {Update.class, Delete.class})
    @Size(message = "{charge.chargeTempCusId.size}", min = -2147483648, max = 2147483647)
    private Integer chargeTempCusId;
    
    /** 加密业主临时收费id */
    @NotNull(message = "{charge.chargeTempCusIdE.null}")
    private String chargeTempCusIdE;
    
    /**
     * 小区id
     */
    @NotNull(message = "{charge.projectId.null}", groups = {Update.class})
    @Size(message = "{charge.projectId.size}", min = -2147483648, max = 2147483647)
    private Integer projectId;
    
    /** 加密小区id */
    @NotNull(message = "{charge.projectIdE.null}")
    private String projectIdE;
    
    /**
     * 楼栋id
     */
    @NotNull(message = "{charge.buildingId.null}", groups = {Update.class})
    @Size(message = "{charge.buildingId.size}", min = -2147483648, max = 2147483647)
    private Integer buildingId;
    
    /** 加密楼栋id */
    @NotNull(message = "{charge.buildingIdE.null}")
    private String buildingIdE;
    
    /**
     * 房间id
     */
    @NotNull(message = "{charge.unitId.null}", groups = {Update.class})
    @Size(message = "{charge.unitId.size}", min = -2147483648, max = 2147483647)
    private Integer unitId;
    
    /** 加密房间id */
    @NotNull(message = "{charge.unitIdE.null}")
    private String unitIdE;
    
    /**
     * 收费周期
     */
    @NotNull(message = "{charge.chargeMonth.null}")
    @Max(message = "{charge.chargeMonth.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{charge.chargeMonth.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer chargeMonth;
    
    /**
     * 收费项目id
     */
    @NotNull(message = "{charge.chargeItemId.null}", groups = {Update.class})
    @Size(message = "{charge.chargeItemId.size}", min = -2147483648, max = 2147483647)
    private Integer chargeItemId;
    
    /** 加密收费项目id */
    @NotNull(message = "{charge.chargeItemIdE.null}")
    private String chargeItemIdE;
    
    /**
     * 算费公式id
     */
    @NotNull(message = "{charge.chargeFormulaId.null}", groups = {Update.class})
    @Size(message = "{charge.chargeFormulaId.size}", min = -2147483648, max = 2147483647)
    private Integer chargeFormulaId;
    
    /** 加密算费公式id */
    @NotNull(message = "{charge.chargeFormulaIdE.null}")
    private String chargeFormulaIdE;
    
    /**
     * 应收费用
     */
    @NotNull(message = "{charge.accountsReceivable.null}")
    private Double accountsReceivable;
    
    /**
     * 实收费用
     */
    @NotNull(message = "{charge.realCharge.null}")
    private Double realCharge;
    
    /**
     * 交费方式
     */
    @NotNull(message = "{charge.payType.null}")
    @Max(message = "{charge.payType.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{charge.payType.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer payType;
    
    /**
     * 凭证号
     */
    @Length(message = "{charge.voucherNum.length}", groups = {Add.class, Update.class}, max = 102, min = 0)
    private String voucherNum;
    
    /**
     * 0未收，1已收
     */
    @NotNull(message = "{charge.status.null}")
    @Max(message = "{charge.status.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{charge.status.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer status;
    
    /**
     * 备注
     */
    @NotNull(message = "{charge.remark.null}")
    @Length(message = "{charge.remark.length}", groups = {Add.class, Update.class}, max = 512, min = 0)
    private String remark;
    
    /**
     * 物业公司id
     */
    @Max(message = "{charge.propertyId.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{charge.propertyId.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer propertyId;
    
    /**
     * 收费人员id
     */
    @NotNull(message = "{charge.chargeOperatorId.null}")
    @Max(message = "{charge.chargeOperatorId.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{charge.chargeOperatorId.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer chargeOperatorId;
    
    /**
     * 收费人员姓名
     */
    @NotNull(message = "{charge.chargeOperatorName.null}")
    @Length(message = "{charge.chargeOperatorName.length}", groups = {Add.class, Update.class}, max = 32, min = 0)
    private String chargeOperatorName;
    
    /**
     * 小区名称
     */
    private String projectName;
    
    /**
     * 楼栋名称
     */
    private String buildingName;
    
    /**
     * 单元
     */
    private String columnName;
    
    /**
     * 房间名称
     */
    
    private String unitName;
    
    /**
     * 状态名称
     */
    private String statusName;
    
    /**
     * 收费时间
     */
    @NotNull(message = "{charge.chargeDatetime.null}")
    private Date chargeDatetime;
    
    /**
     * 交费人
     */
    private String cusName;
    
    /** 给业主临时收费id进行加密 */
    public void setChargeTempCusIdE(String chargeTempCusIdE)
    {
        this.chargeTempCusIdE = chargeTempCusIdE;
        chargeTempCusId = EncryptUtils.getDecodeIdFromIdE(chargeTempCusIdE);
    }
    
    /** 获取加密业主临时收费id */
    public String getChargeTempCusIdE()
    {
        return chargeTempCusIdE;
    }
    
    /**
     * 给业主临时收费id赋值
     */
    public void setChargeTempCusId(Integer chargeTempCusId)
    {
        this.chargeTempCusId = chargeTempCusId;
        chargeTempCusIdE = EncryptUtils.getEncodeIdEFromId(chargeTempCusId);
    }
    
    /**
     * 获取业主临时收费id
     */
    public Integer getChargeTempCusId()
    {
        return chargeTempCusId;
    }
    
    /** 给小区id进行加密 */
    public void setProjectIdE(String projectIdE)
    {
        this.projectIdE = projectIdE;
        projectId = EncryptUtils.getDecodeIdFromIdE(projectIdE);
    }
    
    /** 获取加密小区id */
    public String getProjectIdE()
    {
        return projectIdE;
    }
    
    /**
     * 给小区id赋值
     */
    public void setProjectId(Integer projectId)
    {
        this.projectId = projectId;
        projectIdE = EncryptUtils.getEncodeIdEFromId(projectId);
    }
    
    /**
     * 获取小区id
     */
    public Integer getProjectId()
    {
        return projectId;
    }
    
    /** 给楼栋id进行加密 */
    public void setBuildingIdE(String buildingIdE)
    {
        this.buildingIdE = buildingIdE;
        buildingId = EncryptUtils.getDecodeIdFromIdE(buildingIdE);
    }
    
    /** 获取加密楼栋id */
    public String getBuildingIdE()
    {
        return buildingIdE;
    }
    
    /**
     * 给楼栋id赋值
     */
    public void setBuildingId(Integer buildingId)
    {
        this.buildingId = buildingId;
        buildingIdE = EncryptUtils.getEncodeIdEFromId(buildingId);
    }
    
    /**
     * 获取楼栋id
     */
    public Integer getBuildingId()
    {
        return buildingId;
    }
    
    /** 给房间id进行加密 */
    public void setUnitIdE(String unitIdE)
    {
        this.unitIdE = unitIdE;
        unitId = EncryptUtils.getDecodeIdFromIdE(unitIdE);
    }
    
    /** 获取加密房间id */
    public String getUnitIdE()
    {
        return unitIdE;
    }
    
    /**
     * 给房间id赋值
     */
    public void setUnitId(Integer unitId)
    {
        this.unitId = unitId;
        unitIdE = EncryptUtils.getEncodeIdEFromId(unitId);
    }
    
    /**
     * 获取房间id
     */
    public Integer getUnitId()
    {
        return unitId;
    }
    
    /**
     * 给收费周期赋值
     */
    public void setChargeMonth(Integer chargeMonth)
    {
        this.chargeMonth = chargeMonth;
    }
    
    /**
     * 获取收费周期
     */
    public Integer getChargeMonth()
    {
        return chargeMonth;
    }
    
    /** 给收费项目id进行加密 */
    public void setChargeItemIdE(String chargeItemIdE)
    {
        this.chargeItemIdE = chargeItemIdE;
        chargeItemId = EncryptUtils.getDecodeIdFromIdE(chargeItemIdE);
    }
    
    /** 获取加密收费项目id */
    public String getChargeItemIdE()
    {
        return chargeItemIdE;
    }
    
    /**
     * 给收费项目id赋值
     */
    public void setChargeItemId(Integer chargeItemId)
    {
        this.chargeItemId = chargeItemId;
        chargeItemIdE = EncryptUtils.getEncodeIdEFromId(chargeItemId);
    }
    
    /**
     * 获取收费项目id
     */
    public Integer getChargeItemId()
    {
        return chargeItemId;
    }
    
    /** 给算费公式id进行加密 */
    public void setChargeFormulaIdE(String chargeFormulaIdE)
    {
        this.chargeFormulaIdE = chargeFormulaIdE;
        chargeFormulaId = EncryptUtils.getDecodeIdFromIdE(chargeFormulaIdE);
    }
    
    /** 获取加密算费公式id */
    public String getChargeFormulaIdE()
    {
        return chargeFormulaIdE;
    }
    
    /**
     * 给算费公式id赋值
     */
    public void setChargeFormulaId(Integer chargeFormulaId)
    {
        this.chargeFormulaId = chargeFormulaId;
        chargeFormulaIdE = EncryptUtils.getEncodeIdEFromId(chargeFormulaId);
    }
    
    /**
     * 获取算费公式id
     */
    public Integer getChargeFormulaId()
    {
        return chargeFormulaId;
    }
    
    /**
     * 给应收费用赋值
     */
    public void setAccountsReceivable(Double accountsReceivable)
    {
        this.accountsReceivable = accountsReceivable;
    }
    
    /**
     * 获取应收费用
     */
    public Double getAccountsReceivable()
    {
        return accountsReceivable;
    }
    
    /**
     * 给实收费用赋值
     */
    public void setRealCharge(Double realCharge)
    {
        this.realCharge = realCharge;
    }
    
    /**
     * 获取实收费用
     */
    public Double getRealCharge()
    {
        return realCharge;
    }
    
    /**
     * 给交费方式赋值
     */
    public void setPayType(Integer payType)
    {
        this.payType = payType;
    }
    
    /**
     * 获取交费方式
     */
    public Integer getPayType()
    {
        return payType;
    }
    
    /**
     * 给凭证号赋值
     */
    public void setVoucherNum(String voucherNum)
    {
        this.voucherNum = voucherNum;
    }
    
    /**
     * 获取凭证号
     */
    public String getVoucherNum()
    {
        return voucherNum;
    }
    
    /**
     * 给0未收，1已收赋值
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    /**
     * 获取0未收，1已收
     */
    public Integer getStatus()
    {
        return status;
    }
    
    /**
     * 给备注赋值
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    /**
     * 获取备注
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * 给物业公司id赋值
     */
    public void setPropertyId(Integer propertyId)
    {
        this.propertyId = propertyId;
    }
    
    /**
     * 获取物业公司id
     */
    public Integer getPropertyId()
    {
        return propertyId;
    }
    
    /**
     * 给收费人员id赋值
     */
    public void setChargeOperatorId(Integer chargeOperatorId)
    {
        this.chargeOperatorId = chargeOperatorId;
    }
    
    /**
     * 获取收费人员id
     */
    public Integer getChargeOperatorId()
    {
        return chargeOperatorId;
    }
    
    /**
     * 给收费人员姓名赋值
     */
    public void setChargeOperatorName(String chargeOperatorName)
    {
        this.chargeOperatorName = chargeOperatorName;
    }
    
    /**
     * 获取收费人员姓名
     */
    public String getChargeOperatorName()
    {
        return chargeOperatorName;
    }
    
    /**
     * 给收费时间赋值
     */
    public void setChargeDatetime(Date chargeDatetime)
    {
        this.chargeDatetime = chargeDatetime;
    }
    
    /**
     * 获取收费时间
     */
    public Date getChargeDatetime()
    {
        return chargeDatetime;
    }
    
    public String getProjectName()
    {
        return projectName;
    }
    
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
    
    public String getBuildingName()
    {
        return buildingName;
    }
    
    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }
    
    public String getColumnName()
    {
        return columnName;
    }
    
    public void setColumnName(String columnName)
    {
        this.columnName = columnName;
    }
    
    public String getUnitName()
    {
        return unitName;
    }
    
    public void setUnitName(String unitName)
    {
        this.unitName = unitName;
    }
    
    public String getStatusName()
    {
        return statusName;
    }
    
    public void setStatusName(String statusName)
    {
        this.statusName = statusName;
    }
    
    public String getCusName()
    {
        return cusName;
    }
    
    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }
}

package com.eluotuo.admin.bean;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.*;
import com.eluotuo.common.validator.*;
import com.eluotuo.base.bean.BaseBean;

/**
 * 自动添加
 * 
 * @author sunbo
 * @version [版本号, 2016/06/28 16:09:00]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SuppressWarnings("serial")
public class SysTable extends BaseBean
{
    /**
     * 表id
     */
    @NotNull(message = "{admin.id.null}", groups = {Update.class, Delete.class})
    @Max(message = "{admin.id.max}", value = 2147483647, groups = {Delete.class, Update.class})
    @Min(message = "{admin.id.min}", value = -2147483648, groups = {Delete.class, Update.class})
    private Integer id;
    
    /** 加密表id */
    @NotNull(message = "{admin.idE.null}")
    private String idE;
    
    /**
     * 项目 pms_admin=1,
     * 项目 pms_crm=2,
     * 项目 pms_main=3,
     * 项目 pms_work=4
     */
    @NotNull(message = "{admin.tableProject.null}")
    @Max(message = "{admin.tableProject.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.tableProject.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer tableProject;
    
    /**
     * 表名
     */
    @Length(message = "{admin.tableName.length}", groups = {Add.class, Update.class}, max = 64, min = 0)
    private String tableName;
    
    /**
     * 是否分表
     */
    @NotNull(message = "{admin.isDistTable.null}")
    @Max(message = "{admin.isDistTable.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.isDistTable.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer isDistTable;
    
    /**
     * 操作类型 ADD=0,
     * 操作类型 UPDATE=1,
     * 操作类型  DEL=2
     */
    @NotNull(message = "{admin.operationType.null}")
    @Max(message = "{admin.operationType.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.operationType.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer operationType;
    
    /**
     * 版本号
     */
    @NotNull(message = "{admin.operationVersion.null}")
    @Length(message = "{admin.operationVersion.length}", groups = {Add.class, Update.class}, max = 32, min = 0)
    private String operationVersion;
    
    /**
     * 虚拟字段项目名称
     */
    private String tableProjectName;
    
    /**
     * 项目名/数据库名
     */
    private String projectName;
    
    /** 给表id进行加密 */
    public void setIdE(String idE)
    {
        this.idE = idE;
        id = EncryptUtils.getDecodeIdFromIdE(idE);
    }
    
    /** 获取加密表id */
    public String getIdE()
    {
        return idE;
    }
    
    /**
     * 给表id赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
        idE = EncryptUtils.getEncodeIdEFromId(id);
    }
    
    /**
     * 获取表id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**给
     * 项目 pms_admin=1 赋值
     * 项目 pms_crm=2   赋值
     * 项目 pms_main=3  赋值
     * 项目 pms_work=4  赋值
     */
    public void setTableProject(Integer tableProject)
    {
        this.tableProject = tableProject;
    }
    
    /**
     * 获得
     * 项目 pms_admin=1 
     * 项目 pms_crm=2   
     * 项目 pms_main=3  
     * 项目 pms_work=4  
     */
    public Integer getTableProject()
    {
        return tableProject;
    }
    
    /**
     * 给表名赋值
     */
    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }
    
    /**
     * 获取表名
     */
    public String getTableName()
    {
        return tableName;
    }
    
    /**
     * 给是否分表赋值
     */
    public void setIsDistTable(Integer isDistTable)
    {
        this.isDistTable = isDistTable;
    }
    
    /**
     * 获取是否分表
     */
    public Integer getIsDistTable()
    {
        return isDistTable;
    }
    
    
    
    /**
     * 给版本号赋值
     */
    public void setOperationVersion(String operationVersion)
    {
        this.operationVersion = operationVersion;
    }
    /**
     * 获得
     * 操作类型 ADD=0      
     * 操作类型 UPDATE=1  
     * 操作类型  DEL=2  
     * return Integer    
     */
    public Integer getOperationType()
    {
        return operationType;
    }
    
    /**
     * 操作类型 ADD=0      赋值
     * 操作类型 UPDATE=1   赋值
     * 操作类型  DEL=2      赋值
     */
    public void setOperationType(Integer operationType)
    {
        this.operationType = operationType;
    }
    
    /**
     * 获取版本号
     */
    public String getOperationVersion()
    {
        return operationVersion;
    }
    
    public String getTableProjectName()
    {
        return tableProjectName;
    }
    
    public void setTableProjectName(String tableProjectName)
    {
        this.tableProjectName = tableProjectName;
    }

    /**
     * 获取 projectName
     * @return 返回 projectName
     */
    public String getProjectName()
    {
        return projectName;
    }

    /**
     * 设置 projectName
     * @param 对projectName进行赋值
     */
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
    
}

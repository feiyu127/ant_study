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
 * @version [版本号, 2016/06/28 10:42:32]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@SuppressWarnings("serial")
public class SysColumn extends BaseBean
{
    /**
     * 字段主键
     */
    @NotNull(message = "{admin.columnId.null}", groups = {Update.class, Delete.class})
    @Max(message = "{admin.columnId.max}", value = 2147483647, groups = {Delete.class, Update.class})
    @Min(message = "{admin.columnId.min}", value = -2147483648, groups = {Delete.class, Update.class})
    private Integer columnId;
    
    /** 加密字段主键 */
    @NotNull(message = "{admin.columnIdE.null}")
    private String columnIdE;
    
    /**
     * tableId
     */
    @NotNull(message = "{admin.tableId.null}")
    @Max(message = "{admin.tableId.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.tableId.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer tableId;
    
    /**
     * 集团编号
     */
    private String groupCode;
    
    /**
     * 字段名称
     */
    @NotNull(message = "{admin.columnName.null}")
    @Length(message = "{admin.columnName.length}", groups = {Add.class, Update.class}, max = 64, min = 0)
    private String columnName;
    
    /**
     * 字段类型
     */
    @Length(message = "{admin.columnType.length}", groups = {Add.class, Update.class}, max = 32, min = 0)
    private String columnType;
    
    /**
     * NOT NUll=0 NULL=1
     */
    @NotNull(message = "{admin.isNullable.null}")
    @Max(message = "{admin.isNullable.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.isNullable.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer isNullable;
    
    /**
     * 默认值
     */
    @Length(message = "{admin.columnDefault.length}", groups = {Add.class, Update.class}, max = 32, min = 0)
    private String columnDefault;
    
    /**
     * 是否索引(0否,1是)
     */
    // @NotNull(message="{admin.isIndex.null}")
    @Max(message = "{admin.isIndex.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.isIndex.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer isIndex;
    
    /**
     * 键类型(0普通,1主键,2外键)
     */
    @NotNull(message = "{admin.columnKey.null}")
    @Max(message = "{admin.columnKey.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.columnKey.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer columnKey;
    
    /**
     * 操作类型 ADD=0, 操作类型 UPDATE=1, 操作类型 DEL=2
     */
    @NotNull(message = "{admin.operationType.null}")
    @Max(message = "{admin.operationType.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.operationType.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer operationType;
    
    /**
     * 是否自增(0否,1是)
     */
    @NotNull(message = "{admin.isAutoIncrement.null}")
    @Max(message = "{admin.isAutoIncrement.max}", value = 2147483647, groups = {Add.class, Update.class})
    @Min(message = "{admin.isAutoIncrement.min}", value = -2147483648, groups = {Add.class, Update.class})
    private Integer isAutoIncrement;
    
    /**
     * 版本号
     */
    @NotNull(message = "{admin.operationVersion.null}")
    @Length(message = "{admin.operationVersion.length}", groups = {Add.class, Update.class}, max = 32, min = 0)
    private String operationVersion;
    
    /**
     * 原字段名
     */
    @Length(message = "{admin.fieldName.length}", groups = {Add.class, Update.class}, max = 64, min = 0)
    private String fieldName;
    
    /**
     * 备注
     */
    @Length(message = "{admin.comment.length}", groups = {Add.class, Update.class}, max = 512, min = 0)
    private String comment;
    
    /** 给字段主键进行加密 */
    public void setColumnIdE(String columnIdE)
    {
        this.columnIdE = columnIdE;
        columnId = EncryptUtils.getDecodeIdFromIdE(columnIdE);
    }
    
    /** 获取加密字段主键 */
    public String getColumnIdE()
    {
        return columnIdE;
    }
    
    /**
     * 给字段主键赋值
     */
    public void setColumnId(Integer columnId)
    {
        this.columnId = columnId;
        columnIdE = EncryptUtils.getEncodeIdEFromId(columnId);
    }
    
    /**
     * 获取字段主键
     */
    public Integer getColumnId()
    {
        return columnId;
    }
    
    /**
     * 给表名id赋值
     */
    public void setTableId(Integer tableId)
    {
        this.tableId = tableId;
    }
    
    /**
     * 获取表名id
     */
    public Integer getTableId()
    {
        return tableId;
    }
    
    public String getGroupCode()
    {
        return groupCode;
    }
    
    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }
    
    /**
     * 给字段名称赋值
     */
    public void setColumnName(String columnName)
    {
        this.columnName = columnName;
    }
    
    /**
     * 获取字段名称
     */
    public String getColumnName()
    {
        return columnName;
    }
    
    /**
     * 给字段类型赋值
     */
    public void setColumnType(String columnType)
    {
        this.columnType = columnType;
    }
    
    /**
     * 获取字段类型
     */
    public String getColumnType()
    {
        return columnType;
    }
    
    /**
     * 给是否为空赋值
     */
    public void setIsNullable(Integer isNullable)
    {
        this.isNullable = isNullable;
    }
    
    /**
     * 获取是否为空
     */
    public Integer getIsNullable()
    {
        return isNullable;
    }
    
    /**
     * 给默认值赋值
     */
    public void setColumnDefault(String columnDefault)
    {
        this.columnDefault = columnDefault;
    }
    
    /**
     * 获取默认值
     */
    public String getColumnDefault()
    {
        return columnDefault;
    }
    
    /**
     * 给是否索引(0索引,1否)赋值
     */
    public void setIsIndex(Integer isIndex)
    {
        this.isIndex = isIndex;
    }
    
    /**
     * 获取是否索引(0索引,1否)
     */
    public Integer getIsIndex()
    {
        return isIndex;
    }
    
    /**
     * 给键类型(0普通,1主键,2外键)赋值
     */
    public void setColumnKey(Integer columnKey)
    {
        this.columnKey = columnKey;
    }
    
    /**
     * 获得键类型(0普通,1主键,2外键)
     */
    public Integer getColumnKey()
    {
        return columnKey;
    }
    
    /**
     * 给是否操作类型(0增加,1修改,2删除)赋值
     */
    public void setOperationType(Integer operationType)
    {
        this.operationType = operationType;
    }
    
    /**
     * 获取是否操作类型(0增加,1修改,2删除)
     */
    public Integer getOperationType()
    {
        return operationType;
    }
    
    /**
     * 给是否自增(0否,1是)赋值
     */
    public void setIsAutoIncrement(Integer isAutoIncrement)
    {
        this.isAutoIncrement = isAutoIncrement;
    }
    
    /**
     * 获取是否自增(0否,1是)
     */
    public Integer getIsAutoIncrement()
    {
        return isAutoIncrement;
    }
    
    /**
     * 给版本号赋值
     */
    public void setOperationVersion(String operationVersion)
    {
        this.operationVersion = operationVersion;
    }
    
    /**
     * 获取版本号
     */
    public String getOperationVersion()
    {
        return operationVersion;
    }
    
    /**
     * 给备注赋值
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    
    public String getFieldName()
    {
        return fieldName;
    }
    
    /**
     * 给原字段名赋值
     */
    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }
    
    /**
     * 获取备注
     */
    public String getComment()
    {
        return comment;
    }
    
    /**
     * 是否记录操作日志
     */
    private Integer isRecordOperation;
    
    /**
     * 字典类型
     */
    private String wordbookGroupCode;
    
    /**
     * 修改时间
     */
    private String modifyTime;
    
    /**
     * 获取 isRecordOperation
     * 
     * @return 返回 isRecordOperation
     */
    public Integer getIsRecordOperation()
    {
        return isRecordOperation;
    }
    
    /**
     * 设置 isRecordOperation
     * 
     * @param 对isRecordOperation进行赋值
     */
    public void setIsRecordOperation(Integer isRecordOperation)
    {
        this.isRecordOperation = isRecordOperation;
    }
    
    /**
     * 获取 wordbookGroupCode
     * 
     * @return 返回 wordbookGroupCode
     */
    public String getWordbookGroupCode()
    {
        return wordbookGroupCode;
    }
    
    /**
     * 设置 wordbookGroupCode
     * 
     * @param 对wordbookGroupCode进行赋值
     */
    public void setWordbookGroupCode(String wordbookGroupCode)
    {
        this.wordbookGroupCode = wordbookGroupCode;
    }
    
    /**
     * 获取 modifyTime
     * 
     * @return 返回 modifyTime
     */
    public String getModifyTime()
    {
        return modifyTime;
    }
    
    /**
     * 设置 modifyTime
     * 
     * @param 对modifyTime进行赋值
     */
    public void setModifyTime(String modifyTime)
    {
        this.modifyTime = modifyTime;
    }
    
}

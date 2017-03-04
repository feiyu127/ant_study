package com.eluotuo.admin.bean;

import com.eluotuo.base.bean.BaseBean;

/**
 * 操作日志
 * 
 * @author  fenglin
 * @version  [版本号, 2016/10/24 08:55:44]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OperatorLogRecord extends BaseBean 
{
    /**事件名称*/
	private String operatorEvent;
	/**操作人*/
	private String operatorUserName;
	/**操作时间*/
	private String operatorTime;
	/**备注*/
	private String remark;
    public String getOperatorEvent()
    {
        return operatorEvent;
    }
    public void setOperatorEvent(String operatorEvent)
    {
        this.operatorEvent = operatorEvent;
    }
    public String getOperatorUserName()
    {
        return operatorUserName;
    }
    public void setOperatorUserName(String operatorUserName)
    {
        this.operatorUserName = operatorUserName;
    }
    public String getOperatorTime()
    {
        return operatorTime;
    }
    public void setOperatorTime(String operatorTime)
    {
        this.operatorTime = operatorTime;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
    }

}

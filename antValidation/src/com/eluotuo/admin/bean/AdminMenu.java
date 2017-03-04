/*
 * 文 件 名:  AdminMenu.java
 * 版    权:  eluotuo Technology International Ltd.
 * 描    述:  &lt;描述&gt;.
 * 修 改 人:  wanglei
 * 修改时间:  ${date}
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.eluotuo.admin.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.eluotuo.common.util.CheckUtils;
import com.eluotuo.common.util.EncryptUtils;
import com.eluotuo.common.validator.Add;
import com.eluotuo.common.validator.Delete;
import com.eluotuo.common.validator.Update;

/**
 * &lt;描述一下Bean&gt;
 * 
 * @author 朱俊
 * @version [版本号, 2015/08/13 11:37:31]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AdminMenu implements Serializable
{
    
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    
    /**
     * 菜单id
     */
    @NotNull(message = "{test.menuId.null}", groups = {Update.class, Delete.class})
    @Size(message = "{test.menuId.size}", max = -2147483648, min = 2147483647)
    private Integer menuId;
    
    /** 加密主键 */
    
    private String menuIdE;
    
    /**
     * 菜单名称
     */
    @NotNull(message = "{test.menuName.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.menuName.length}", max = 20, min = 0)
    private String menuName;
    
    /**
     * 父菜单id
     */
    @NotNull(message = "{test.fatherMenuId.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.fatherMenuId.length}", max = 10, min = 0)
    private Integer fatherMenuId;
    
    /**
     * 链接地址
     */
    private String menuUrl;
    
    /**
     * Namespace
     */
    
    private String mamespace;
    
    /**
     * 菜单等级-1根0一级1二级2三级....
     */
    private Integer menuLevel;
    
    
    /**
     * 获取 menuLevel
     * @return 返回 menuLevel
     */
    public Integer getMenuLevel()
    {
        return menuLevel;
    }

    /**
     * 设置 menuLevel
     * @param 对menuLevel进行赋值
     */
    public void setMenuLevel(Integer menuLevel)
    {
        this.menuLevel = menuLevel;
    }

    /**
     * 菜单类型0 物业公司菜单1 物业集团菜单2 平台菜单
     */
    
    private String menuType;
    
    private String[] menuTypes;
    
    /**
     * 适配的主页菜单
     */
    private String configurationHomeMenu;
    
    private String[] configurationHomeMenus;
    
    
    
    
    public String[] getConfigurationHomeMenus()
    {
        return configurationHomeMenus;
    }

    public void setConfigurationHomeMenus(String[] configurationHomeMenus)
    {
        this.configurationHomeMenus = configurationHomeMenus;
    }

    public String getConfigurationHomeMenu()
    {
        return configurationHomeMenu;
    }

    public void setConfigurationHomeMenu(String configurationHomeMenu)
    {
        this.configurationHomeMenu = configurationHomeMenu;
        if (CheckUtils.isNullOrEmpty(configurationHomeMenu))
        {
            configurationHomeMenus = new String[0];
            return;
        }
        this.configurationHomeMenus = configurationHomeMenu.split(",");
    }

    /**
     * 是否禁用0 禁用1 未禁用
     */
    @NotNull(message = "{test.isDisable.null}", groups = {Update.class, Add.class})
    @Length(message = "{test.isDisable.length}", max = 10, min = 0)
    private Integer isDisable;
    
    /**
     * 状态
     */
    private String state;
    
    private String checkHelpUrl;
    
    /**
     * 子菜单
     */
    private List<AdminMenu> sonMenu;
    
    private Integer menuState;
    
    public List<AdminMenu> getSonMenu()
    {
        if (sonMenu == null)
        {
            sonMenu = new ArrayList<>();
        }
        return sonMenu;
    }
    
    public void setSonMenu(List<AdminMenu> sonMenu)
    {
        this.sonMenu = sonMenu;
    }
    
    public String getState()
    {
        return state;
    }
    
    private String image;
    
    public String getImage()
    {
        return image;
    }
    
    public void setImage(String image)
    {
        this.image = image;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    /**
     * 是否关注
     */
    private String isAttention;
    
    public String getIsAttention()
    {
        return isAttention;
    }
    
    public void setIsAttention(String isAttention)
    {
        this.isAttention = isAttention;
    }
    
    private Integer serverNameId = 1;
    
    private String serverNameIdE;
    
    public Integer getServerNameId()
    {
        return serverNameId;
    }
    
    public void setServerNameId(Integer serverNameId)
    {
        serverNameIdE = EncryptUtils.getEncodeIdEFromId(serverNameId);
        this.serverNameId = serverNameId;
    }
    
    private Integer orderIndex;
    
    public Integer getOrderIndex()
    {
        return orderIndex;
    }
    
    public void setOrderIndex(Integer orderIndex)
    {
        this.orderIndex = orderIndex;
    }
    
    public String getServerNameIdE()
    {
        return serverNameIdE;
    }
    
    public void setServerNameIdE(String serverNameIdE)
    {
        serverNameId = EncryptUtils.getDecodeIdFromIdE(serverNameIdE);
        this.serverNameIdE = serverNameIdE;
    }
    
    /** 给主键进行加密 */
    public void setMenuIdE(String menuIdE)
    {
        menuId = EncryptUtils.getDecodeIdFromIdE(menuIdE);
        this.menuIdE = menuIdE;
    }
    
    /** 获取加密主键 */
    public String getMenuIdE()
    {
        return menuIdE;
    }
    
    /**
     * 给菜单id赋值
     */
    public void setMenuId(Integer menuId)
    {
        menuIdE = EncryptUtils.getEncodeIdEFromId(menuId);
        this.menuId = menuId;
    }
    
    /**
     * 获取菜单id
     */
    public Integer getMenuId()
    {
        return menuId;
    }
    
    /**
     * 给菜单名称赋值
     */
    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }
    
    /**
     * 获取菜单名称
     */
    public String getMenuName()
    {
        return menuName;
    }
    
    /**
     * 给父菜单id赋值
     */
    public void setFatherMenuId(Integer fatherMenuId)
    {
        this.fatherMenuId = fatherMenuId;
    }
    
    /**
     * 获取父菜单id
     */
    public Integer getFatherMenuId()
    {
        return fatherMenuId;
    }
    
    /**
     * 给链接地址赋值
     */
    public void setMenuUrl(String menuUrl)
    {
        this.menuUrl = menuUrl;
    }
    
    /**
     * 获取链接地址
     */
    public String getMenuUrl()
    {
        return menuUrl;
    }
    
    /**
     * 给Namespace赋值
     */
    public void setMamespace(String mamespace)
    {
        this.mamespace = mamespace;
    }
    
    /**
     * 获取Namespace
     */
    public String getMamespace()
    {
        return mamespace;
    }
    
    /**
     * 给菜单类型0 物业公司菜单1 物业集团菜单2 平台菜单赋值
     */
    public void setMenuType(String menuType)
    {
        this.menuType = menuType;
        if (CheckUtils.isNullOrEmpty(menuType))
        {
            menuTypes = new String[0];
            return;
        }
        this.menuTypes = menuType.split(",");
    }
    
    /**
     * 获取菜单类型0 物业公司菜单1 物业集团菜单2 平台菜单
     */
    public String getMenuType()
    {
        return menuType;
    }
    
    public String[] getMenuTypes()
    {
        return menuTypes;
    }
    
    public void setMenuTypes(String[] menuTypes)
    {
        this.menuTypes = menuTypes;
    }
    
    /**
     * 给是否禁用0 禁用1 未禁用赋值
     */
    public void setIsDisable(Integer isDisable)
    {
        this.isDisable = isDisable;
    }
    
    /**
     * 获取是否禁用0 禁用1 未禁用
     */
    public Integer getIsDisable()
    {
        return isDisable;
    }
    
    public String getCheckHelpUrl()
    {
        return checkHelpUrl;
    }
    
    public void setCheckHelpUrl(String checkHelpUrl)
    {
        this.checkHelpUrl = checkHelpUrl;
    }
    
    public Integer getMenuState()
    {
        return menuState;
    }
    
    public void setMenuState(Integer menuState)
    {
        this.menuState = menuState;
    }
    
}

package com.entity.model;

import com.entity.ZhengwuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政务预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhengwuOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政务
     */
    private Integer zhengwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhengwuOrderTime;


    /**
     * 预约审核
     */
    private Integer zhengwuOrderYesnoTypes;


    /**
     * 审核结果
     */
    private String zhengwuOrderYesnoText;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：政务
	 */
    public Integer getZhengwuId() {
        return zhengwuId;
    }


    /**
	 * 设置：政务
	 */
    public void setZhengwuId(Integer zhengwuId) {
        this.zhengwuId = zhengwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getZhengwuOrderTime() {
        return zhengwuOrderTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setZhengwuOrderTime(Date zhengwuOrderTime) {
        this.zhengwuOrderTime = zhengwuOrderTime;
    }
    /**
	 * 获取：预约审核
	 */
    public Integer getZhengwuOrderYesnoTypes() {
        return zhengwuOrderYesnoTypes;
    }


    /**
	 * 设置：预约审核
	 */
    public void setZhengwuOrderYesnoTypes(Integer zhengwuOrderYesnoTypes) {
        this.zhengwuOrderYesnoTypes = zhengwuOrderYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getZhengwuOrderYesnoText() {
        return zhengwuOrderYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setZhengwuOrderYesnoText(String zhengwuOrderYesnoText) {
        this.zhengwuOrderYesnoText = zhengwuOrderYesnoText;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

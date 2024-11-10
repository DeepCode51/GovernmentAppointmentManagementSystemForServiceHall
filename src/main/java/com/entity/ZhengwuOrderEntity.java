package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 政务预约
 *
 * @author 
 * @email
 */
@TableName("zhengwu_order")
public class ZhengwuOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengwuOrderEntity() {

	}

	public ZhengwuOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 政务
     */
    @TableField(value = "zhengwu_id")

    private Integer zhengwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhengwu_order_time")

    private Date zhengwuOrderTime;


    /**
     * 预约审核
     */
    @TableField(value = "zhengwu_order_yesno_types")

    private Integer zhengwuOrderYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "zhengwu_order_yesno_text")

    private String zhengwuOrderYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：政务
	 */
    public Integer getZhengwuId() {
        return zhengwuId;
    }
    /**
	 * 获取：政务
	 */

    public void setZhengwuId(Integer zhengwuId) {
        this.zhengwuId = zhengwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getZhengwuOrderTime() {
        return zhengwuOrderTime;
    }
    /**
	 * 获取：预约时间
	 */

    public void setZhengwuOrderTime(Date zhengwuOrderTime) {
        this.zhengwuOrderTime = zhengwuOrderTime;
    }
    /**
	 * 设置：预约审核
	 */
    public Integer getZhengwuOrderYesnoTypes() {
        return zhengwuOrderYesnoTypes;
    }
    /**
	 * 获取：预约审核
	 */

    public void setZhengwuOrderYesnoTypes(Integer zhengwuOrderYesnoTypes) {
        this.zhengwuOrderYesnoTypes = zhengwuOrderYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getZhengwuOrderYesnoText() {
        return zhengwuOrderYesnoText;
    }
    /**
	 * 获取：审核结果
	 */

    public void setZhengwuOrderYesnoText(String zhengwuOrderYesnoText) {
        this.zhengwuOrderYesnoText = zhengwuOrderYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ZhengwuOrder{" +
            "id=" + id +
            ", zhengwuId=" + zhengwuId +
            ", yonghuId=" + yonghuId +
            ", zhengwuOrderTime=" + zhengwuOrderTime +
            ", zhengwuOrderYesnoTypes=" + zhengwuOrderYesnoTypes +
            ", zhengwuOrderYesnoText=" + zhengwuOrderYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}

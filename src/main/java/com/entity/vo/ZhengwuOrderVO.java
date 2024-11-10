package com.entity.vo;

import com.entity.ZhengwuOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政务预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhengwu_order")
public class ZhengwuOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

package com.entity.vo;

import com.entity.FuwubanliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 服务办理
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fuwubanli")
public class FuwubanliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 办理详情
     */

    @TableField(value = "fuwubanli_text")
    private String fuwubanliText;


    /**
     * 服务类型
     */

    @TableField(value = "fuwubanli_types")
    private Integer fuwubanliTypes;


    /**
     * 办理状态
     */

    @TableField(value = "fuwubanli_status_types")
    private Integer fuwubanliStatusTypes;


    /**
     * 创建时间
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
	 * 设置：办理详情
	 */
    public String getFuwubanliText() {
        return fuwubanliText;
    }


    /**
	 * 获取：办理详情
	 */

    public void setFuwubanliText(String fuwubanliText) {
        this.fuwubanliText = fuwubanliText;
    }
    /**
	 * 设置：服务类型
	 */
    public Integer getFuwubanliTypes() {
        return fuwubanliTypes;
    }


    /**
	 * 获取：服务类型
	 */

    public void setFuwubanliTypes(Integer fuwubanliTypes) {
        this.fuwubanliTypes = fuwubanliTypes;
    }
    /**
	 * 设置：办理状态
	 */
    public Integer getFuwubanliStatusTypes() {
        return fuwubanliStatusTypes;
    }


    /**
	 * 获取：办理状态
	 */

    public void setFuwubanliStatusTypes(Integer fuwubanliStatusTypes) {
        this.fuwubanliStatusTypes = fuwubanliStatusTypes;
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

}

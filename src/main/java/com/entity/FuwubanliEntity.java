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
 * 服务办理
 *
 * @author 
 * @email
 */
@TableName("fuwubanli")
public class FuwubanliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuwubanliEntity() {

	}

	public FuwubanliEntity(T t) {
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

    @Override
    public String toString() {
        return "Fuwubanli{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", fuwubanliText=" + fuwubanliText +
            ", fuwubanliTypes=" + fuwubanliTypes +
            ", fuwubanliStatusTypes=" + fuwubanliStatusTypes +
            ", createTime=" + createTime +
        "}";
    }
}

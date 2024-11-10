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
 * 政务信息
 *
 * @author 
 * @email
 */
@TableName("zhengwu")
public class ZhengwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengwuEntity() {

	}

	public ZhengwuEntity(T t) {
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
     * 政务标题
     */
    @TableField(value = "zhengwu_name")

    private String zhengwuName;


    /**
     * 政务类型
     */
    @TableField(value = "zhengwu_types")

    private Integer zhengwuTypes;


    /**
     * 政务封面
     */
    @TableField(value = "zhengwu_photo")

    private String zhengwuPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 政务详情
     */
    @TableField(value = "zhengwu_content")

    private String zhengwuContent;


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
	 * 设置：政务标题
	 */
    public String getZhengwuName() {
        return zhengwuName;
    }
    /**
	 * 获取：政务标题
	 */

    public void setZhengwuName(String zhengwuName) {
        this.zhengwuName = zhengwuName;
    }
    /**
	 * 设置：政务类型
	 */
    public Integer getZhengwuTypes() {
        return zhengwuTypes;
    }
    /**
	 * 获取：政务类型
	 */

    public void setZhengwuTypes(Integer zhengwuTypes) {
        this.zhengwuTypes = zhengwuTypes;
    }
    /**
	 * 设置：政务封面
	 */
    public String getZhengwuPhoto() {
        return zhengwuPhoto;
    }
    /**
	 * 获取：政务封面
	 */

    public void setZhengwuPhoto(String zhengwuPhoto) {
        this.zhengwuPhoto = zhengwuPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：政务详情
	 */
    public String getZhengwuContent() {
        return zhengwuContent;
    }
    /**
	 * 获取：政务详情
	 */

    public void setZhengwuContent(String zhengwuContent) {
        this.zhengwuContent = zhengwuContent;
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
        return "Zhengwu{" +
            "id=" + id +
            ", zhengwuName=" + zhengwuName +
            ", zhengwuTypes=" + zhengwuTypes +
            ", zhengwuPhoto=" + zhengwuPhoto +
            ", insertTime=" + insertTime +
            ", zhengwuContent=" + zhengwuContent +
            ", createTime=" + createTime +
        "}";
    }
}

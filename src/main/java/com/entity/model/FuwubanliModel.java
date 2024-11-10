package com.entity.model;

import com.entity.FuwubanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 服务办理
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FuwubanliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 办理详情
     */
    private String fuwubanliText;


    /**
     * 服务类型
     */
    private Integer fuwubanliTypes;


    /**
     * 办理状态
     */
    private Integer fuwubanliStatusTypes;


    /**
     * 创建时间
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
	 * 获取：办理详情
	 */
    public String getFuwubanliText() {
        return fuwubanliText;
    }


    /**
	 * 设置：办理详情
	 */
    public void setFuwubanliText(String fuwubanliText) {
        this.fuwubanliText = fuwubanliText;
    }
    /**
	 * 获取：服务类型
	 */
    public Integer getFuwubanliTypes() {
        return fuwubanliTypes;
    }


    /**
	 * 设置：服务类型
	 */
    public void setFuwubanliTypes(Integer fuwubanliTypes) {
        this.fuwubanliTypes = fuwubanliTypes;
    }
    /**
	 * 获取：办理状态
	 */
    public Integer getFuwubanliStatusTypes() {
        return fuwubanliStatusTypes;
    }


    /**
	 * 设置：办理状态
	 */
    public void setFuwubanliStatusTypes(Integer fuwubanliStatusTypes) {
        this.fuwubanliStatusTypes = fuwubanliStatusTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

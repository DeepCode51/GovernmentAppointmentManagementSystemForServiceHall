package com.entity.model;

import com.entity.ZhengwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政务信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhengwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政务标题
     */
    private String zhengwuName;


    /**
     * 政务类型
     */
    private Integer zhengwuTypes;


    /**
     * 政务封面
     */
    private String zhengwuPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 政务详情
     */
    private String zhengwuContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：政务标题
	 */
    public String getZhengwuName() {
        return zhengwuName;
    }


    /**
	 * 设置：政务标题
	 */
    public void setZhengwuName(String zhengwuName) {
        this.zhengwuName = zhengwuName;
    }
    /**
	 * 获取：政务类型
	 */
    public Integer getZhengwuTypes() {
        return zhengwuTypes;
    }


    /**
	 * 设置：政务类型
	 */
    public void setZhengwuTypes(Integer zhengwuTypes) {
        this.zhengwuTypes = zhengwuTypes;
    }
    /**
	 * 获取：政务封面
	 */
    public String getZhengwuPhoto() {
        return zhengwuPhoto;
    }


    /**
	 * 设置：政务封面
	 */
    public void setZhengwuPhoto(String zhengwuPhoto) {
        this.zhengwuPhoto = zhengwuPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：政务详情
	 */
    public String getZhengwuContent() {
        return zhengwuContent;
    }


    /**
	 * 设置：政务详情
	 */
    public void setZhengwuContent(String zhengwuContent) {
        this.zhengwuContent = zhengwuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

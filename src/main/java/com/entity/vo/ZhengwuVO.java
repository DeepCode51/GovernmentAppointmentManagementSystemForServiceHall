package com.entity.vo;

import com.entity.ZhengwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政务信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhengwu")
public class ZhengwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 政务详情
     */

    @TableField(value = "zhengwu_content")
    private String zhengwuContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

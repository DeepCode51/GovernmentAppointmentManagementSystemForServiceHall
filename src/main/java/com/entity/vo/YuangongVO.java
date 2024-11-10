package com.entity.vo;

import com.entity.YuangongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 员工
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuangong")
public class YuangongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 员工姓名
     */

    @TableField(value = "yuangong_name")
    private String yuangongName;


    /**
     * 头像
     */

    @TableField(value = "yuangong_photo")
    private String yuangongPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "yuangong_phone")
    private String yuangongPhone;


    /**
     * 邮箱
     */

    @TableField(value = "yuangong_email")
    private String yuangongEmail;


    /**
     * 假删
     */

    @TableField(value = "yuangong_delete")
    private Integer yuangongDelete;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：员工姓名
	 */
    public String getYuangongName() {
        return yuangongName;
    }


    /**
	 * 获取：员工姓名
	 */

    public void setYuangongName(String yuangongName) {
        this.yuangongName = yuangongName;
    }
    /**
	 * 设置：头像
	 */
    public String getYuangongPhoto() {
        return yuangongPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setYuangongPhoto(String yuangongPhoto) {
        this.yuangongPhoto = yuangongPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYuangongPhone() {
        return yuangongPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setYuangongPhone(String yuangongPhone) {
        this.yuangongPhone = yuangongPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYuangongEmail() {
        return yuangongEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setYuangongEmail(String yuangongEmail) {
        this.yuangongEmail = yuangongEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getYuangongDelete() {
        return yuangongDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setYuangongDelete(Integer yuangongDelete) {
        this.yuangongDelete = yuangongDelete;
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

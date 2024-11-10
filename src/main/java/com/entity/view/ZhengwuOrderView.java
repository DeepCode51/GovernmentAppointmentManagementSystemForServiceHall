package com.entity.view;

import com.entity.ZhengwuOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政务预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhengwu_order")
public class ZhengwuOrderView extends ZhengwuOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约审核的值
		*/
		private String zhengwuOrderYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 zhengwu
			/**
			* 政务标题
			*/
			private String zhengwuName;
			/**
			* 政务类型
			*/
			private Integer zhengwuTypes;
				/**
				* 政务类型的值
				*/
				private String zhengwuValue;
			/**
			* 政务封面
			*/
			private String zhengwuPhoto;
			/**
			* 政务详情
			*/
			private String zhengwuContent;

	public ZhengwuOrderView() {

	}

	public ZhengwuOrderView(ZhengwuOrderEntity zhengwuOrderEntity) {
		try {
			BeanUtils.copyProperties(this, zhengwuOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约审核的值
			*/
			public String getZhengwuOrderYesnoValue() {
				return zhengwuOrderYesnoValue;
			}
			/**
			* 设置： 预约审核的值
			*/
			public void setZhengwuOrderYesnoValue(String zhengwuOrderYesnoValue) {
				this.zhengwuOrderYesnoValue = zhengwuOrderYesnoValue;
			}

















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}





				//级联表的get和set zhengwu

					/**
					* 获取： 政务标题
					*/
					public String getZhengwuName() {
						return zhengwuName;
					}
					/**
					* 设置： 政务标题
					*/
					public void setZhengwuName(String zhengwuName) {
						this.zhengwuName = zhengwuName;
					}

					/**
					* 获取： 政务类型
					*/
					public Integer getZhengwuTypes() {
						return zhengwuTypes;
					}
					/**
					* 设置： 政务类型
					*/
					public void setZhengwuTypes(Integer zhengwuTypes) {
						this.zhengwuTypes = zhengwuTypes;
					}


						/**
						* 获取： 政务类型的值
						*/
						public String getZhengwuValue() {
							return zhengwuValue;
						}
						/**
						* 设置： 政务类型的值
						*/
						public void setZhengwuValue(String zhengwuValue) {
							this.zhengwuValue = zhengwuValue;
						}

					/**
					* 获取： 政务封面
					*/
					public String getZhengwuPhoto() {
						return zhengwuPhoto;
					}
					/**
					* 设置： 政务封面
					*/
					public void setZhengwuPhoto(String zhengwuPhoto) {
						this.zhengwuPhoto = zhengwuPhoto;
					}

					/**
					* 获取： 政务详情
					*/
					public String getZhengwuContent() {
						return zhengwuContent;
					}
					/**
					* 设置： 政务详情
					*/
					public void setZhengwuContent(String zhengwuContent) {
						this.zhengwuContent = zhengwuContent;
					}







}

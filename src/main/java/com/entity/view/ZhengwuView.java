package com.entity.view;

import com.entity.ZhengwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 政务信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhengwu")
public class ZhengwuView extends ZhengwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 政务类型的值
		*/
		private String zhengwuValue;



	public ZhengwuView() {

	}

	public ZhengwuView(ZhengwuEntity zhengwuEntity) {
		try {
			BeanUtils.copyProperties(this, zhengwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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











}

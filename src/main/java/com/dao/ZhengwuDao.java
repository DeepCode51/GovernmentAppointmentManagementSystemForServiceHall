package com.dao;

import com.entity.ZhengwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengwuView;

/**
 * 政务信息 Dao 接口
 *
 * @author 
 */
public interface ZhengwuDao extends BaseMapper<ZhengwuEntity> {

   List<ZhengwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

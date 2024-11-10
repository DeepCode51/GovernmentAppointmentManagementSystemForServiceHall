package com.dao;

import com.entity.FuwubanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwubanliView;

/**
 * 服务办理 Dao 接口
 *
 * @author 
 */
public interface FuwubanliDao extends BaseMapper<FuwubanliEntity> {

   List<FuwubanliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

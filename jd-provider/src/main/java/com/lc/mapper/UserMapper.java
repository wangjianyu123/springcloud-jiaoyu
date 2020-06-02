package com.lc.mapper;

import com.lc.model.PermissionModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_infotree_copy")
    List<PermissionModel> getAllTree();


}

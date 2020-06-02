package com.lc.service;

import com.lc.mapper.UserMapper;
import com.lc.model.PermissionModel;
import com.lc.util.Params;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;

    @Override
    public List<PermissionModel> getAllTree() {
        return userMapper.getAllTree();
    }

    //------------------------------------------


}

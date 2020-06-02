package com.lc.service;

import com.lc.model.PermissionModel;
import com.lc.util.Params;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFeignError implements UserService{


    @Override
    public List<PermissionModel> getAllTree() {
        return null;
    }




}

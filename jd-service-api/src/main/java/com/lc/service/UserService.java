package com.lc.service;

import com.lc.model.PermissionModel;
import com.lc.util.Params;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "jd-provider", fallback = UserFeignError.class)
public interface UserService {


    @RequestMapping("/getAllTree")
    List<PermissionModel> getAllTree();

    //------------------------------------------------------------------------

}

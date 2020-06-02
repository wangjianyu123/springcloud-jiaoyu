package com.lc.controller;

import com.lc.model.PermissionModel;
import com.lc.service.UserService;
import com.lc.util.FileUtil;
import com.lc.util.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
 /*   @Resource
    private RedisTemplate<String,CommodityModel> redisTemplate;*/


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //树-------------------------------------------------------------------------
    //树
    @RequestMapping("/getAllTree")
    public @ResponseBody List<PermissionModel> getAllTree(){

        List<PermissionModel> list = userService.getAllTree();

        if(list == null ){
            return null;
        }
        list = TreeNoteUtil.getFatherNode(list);

        return list;
    }


    @RequestMapping("/systemInfo")
    public String systemInfo(){
        return "systemInfo";
    }
    @RequestMapping("/personalInfo")
    public String personalInfo(){
        return "personalInfo";
    }


    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request){

        String imgname = FileUtil.uploadFile(file, request);
        return imgname;

    }


}

package com.example.demo.controller;

import com.example.demo.beans.HttpResponseEntity;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:8085", maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod .POST, headers = "Accept=application/json")
    public HttpResponseEntity userLogin(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();

        try {
            List<UserEntity> hasUser = userService.selectUserInfo(userEntity);
            if (CollectionUtils.isEmpty(hasUser)) {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(hasUser.get(0));
                httpResponseEntity.setMessage("用户名或密码错误");
            } else {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(hasUser);
                httpResponseEntity.setMessage("登录成功");
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
        }
        return httpResponseEntity;
    }

    /**
     * 用户列表查询
     */
    @RequestMapping(value = "/queryUserList", method = RequestMethod .POST, headers = "Accept=application/json")
    public HttpResponseEntity queryUserList(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();

        try {
            List<UserEntity> hasUser = userService.queryUserList(userEntity);
            if (CollectionUtils.isEmpty(hasUser)) {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(hasUser.get(0));
                httpResponseEntity.setMessage("无用户信息");
            } else {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(hasUser);
                httpResponseEntity.setMessage("查询成功");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return httpResponseEntity;
    }


    /**
     * 用户添加
     */
    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST, headers = "Accept=application/json")
    public HttpResponseEntity addUser(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = userService.addUserInfo(userEntity);
            if (result != 0) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("创建成功");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("创建失败");
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
        }
        return httpResponseEntity;
    }

    /**
     * 用户修改
     */
    @RequestMapping(value = "/modifyUserInfo", method = RequestMethod .POST, headers = "Accept=application/json")
    public HttpResponseEntity modifyUser(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();

        try {
            int result = userService.modifyUserInfo(userEntity);
            if (result != 0) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("修改成功");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("修改失败");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return httpResponseEntity;
    }

    /**
     * 用户删除
     */
    @RequestMapping(value = "/deleteUserInfo", method = RequestMethod .POST, headers = "Accept=application/json")
    public HttpResponseEntity deleteUserInfo(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();


        try {
            int result = userService.deleteUserById(userEntity);
            if (result != 0) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("删除成功");
                System.out.println("chenggong");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("删除失败");
                System.out.println("shibai");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return httpResponseEntity;
    }


    /**
     * 用户可视化
     */
   /* @RequestMapping(value = "/updateUserStatus", method = RequestMethod .POST, headers = "Accept=application/json")
    public HttpResponseEntity updateUserStatus(@RequestBody UserEntity userEntity) {
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();


        try {
            int result = userService.updateUserStatus(userEntity);
            if (result != 0) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("修改成功");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("失败");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return httpResponseEntity;
    }*/

}

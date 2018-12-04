package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

public interface UserAPI {

    int login(String username, String password);//用户登录,返回userid

    boolean register(UserModel userModel);//用户注册

    boolean checkUsername(String username);//检查是否存在用户

    UserInfoModel getUserInfo(int uuid);//查询用户信息

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);//更新用户信息

}

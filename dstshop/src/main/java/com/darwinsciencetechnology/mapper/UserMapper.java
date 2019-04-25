package com.darwinsciencetechnology.mapper;

import com.darwinsciencetechnology.model.User;
import com.darwinsciencetechnology.vo.UserVo;

import java.util.ArrayList;

public interface UserMapper {
    public User findUserInfo();
    public int inseruserInfo(User user);
    public int updateUser(User user);
    public User findByUserid(int id);
    public ArrayList<User> findUserListByVo(UserVo userVo);
    public int deleteUserById(int id);
}

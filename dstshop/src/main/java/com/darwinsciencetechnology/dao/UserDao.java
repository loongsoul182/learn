package com.darwinsciencetechnology.dao;

import com.darwinsciencetechnology.mapper.UserMapper;
import com.darwinsciencetechnology.model.User;
import com.darwinsciencetechnology.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserDao {
    @Autowired
    UserMapper userMapper;

    public User findUserInfo(){
        return userMapper.findUserInfo();
    }

    public int inseruserInfo(User user){
        return userMapper.inseruserInfo(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    public User findByUserid(int id){
        return userMapper.findByUserid(id);
    }

    public ArrayList<User> findUserListByVo(UserVo userVo )
    {
        return userMapper.findUserListByVo(userVo );
    }
    public int deleteUserById(int id){
        return userMapper.deleteUserById(id);
    }
}

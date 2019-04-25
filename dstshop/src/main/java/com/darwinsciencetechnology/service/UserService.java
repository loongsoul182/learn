package com.darwinsciencetechnology.service;

import com.darwinsciencetechnology.dao.UserDao;
import com.darwinsciencetechnology.model.User;
import com.darwinsciencetechnology.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
@Autowired
    UserDao userDao;

    public User findUserInfo(){
        return userDao.findUserInfo();
    }

    public int inseruserInfo(User user){
        return userDao.inseruserInfo(user);
    }
    public int updateUser(User user){
        return userDao.updateUser(user);
    }

    public User findByUserid(int id){
        return userDao.findByUserid(id);
    }
    public ArrayList<User> findUserListByVo(UserVo userVo )
    {
        return userDao.findUserListByVo(userVo );
    }
    public int deleteUserById(int id){
        return userDao.deleteUserById(id);
    }
}

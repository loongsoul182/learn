package com.darwinsciencetechnology.control;

import com.darwinsciencetechnology.model.User;
import com.darwinsciencetechnology.service.UserService;
import com.darwinsciencetechnology.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class UserControl {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.findUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
        }
        return user;
    }
    @RequestMapping(value = "/touserregister",method = RequestMethod.GET)
    public String touserregister() {
        return "userregister";
    }

    @RequestMapping(value = "/userregister",method = RequestMethod.POST)
    public void userregister(User user) {
        userService.inseruserInfo(user);
        return;
    }

    @RequestMapping(value = "/toupdateUser",method = RequestMethod.GET)
    public String toupdateUser(int id,Model model){
        User user =  userService.findByUserid(id);
        model.addAttribute("user",user);
        return "userupdate";
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateUser(User user,Model model){
        userService.updateUser(user);

        user =  userService.findByUserid(user.getId());
        model.addAttribute("user",user);
        return "userview";
    }

    @RequestMapping(value = "/findByUserid",method = RequestMethod.GET)
    public String findByUserid(int id,Model model){
        User user =  userService.findByUserid(id);
        model.addAttribute("user",user);
        return "userview";
    }

    @RequestMapping(value = "/findUserListByVo",method = RequestMethod.GET)
    public String findUserListByVo(Model model){
        UserVo userVo=new UserVo();
        ArrayList<User> listuser=userService.findUserListByVo(userVo);
        model.addAttribute("listuser",listuser);
        return "userList";
    }

    @RequestMapping(value = "/deleteUserByIid",method = RequestMethod.GET)
    public String deleteUserByIid(int id,Model model){
        userService.deleteUserById(id);

        UserVo userVo=new UserVo();
        ArrayList<User> listuser=userService.findUserListByVo(userVo);
        model.addAttribute("listuser",listuser);
        return "userList";
    }

}

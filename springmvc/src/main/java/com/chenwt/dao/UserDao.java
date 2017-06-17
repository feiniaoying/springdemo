package com.chenwt.dao;

import com.chenwt.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwt on 2017/6/15.
 * 用户dao接口.
 */
@Repository("UserDao")
public interface UserDao {

    /**
     * 	Created by chenwt on 2017-03-22
     * 	根据用户名和密码查询用户
     * @param userName
     * @param passWord
     * @return
     */
    public User findByUsernameAndPwd(@Param("userName") String userName, @Param("passWord") String passWord);

    /**
     * 	Created by chenwt on 2017-03-30
     * 	获取用户
     * @return
     */
    public List<User> find(User User);

    /**
     * 	Created by chenwt on 2017-03-30
     * 	新增
     * @param User
     */
    public void add(User User);

    /**
     * 	Created by chenwt on 2017-03-30
     * 	修改
     * @param User
     */
    public void update(User User);

    /**
     * 	Created by chenwt on 2017-03-30
     * 	删除
     * @param id
     */
    public void delete(String id);

}

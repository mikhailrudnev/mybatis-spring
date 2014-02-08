package com.msh.persistence;

import com.msh.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DataMapper {
    public List getAllUsers();
    public User getUserById(int id);
    public void insertUser(User user);
    public void insertUsers(List usersList);
    public void insertEntity(@Param("columns") List columns, @Param("values") List values);
}

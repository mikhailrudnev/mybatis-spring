package com.msh.repositories;

import com.msh.bean.User;
import com.msh.persistence.DataMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;

public class DataRepository {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private DataMapper dataMapper;

    public DataRepository(SqlSessionFactory sqlSessionFactoryParameter) {
        this.sqlSessionFactory = sqlSessionFactoryParameter;
        this.sqlSession = sqlSessionFactory.openSession();
        this.dataMapper = sqlSession.getMapper(DataMapper.class);
    }

    public List<User> getAllUsers() {
        return dataMapper.getAllUsers();
    }

    public User getUserById(int id) {
        return dataMapper.getUserById(id);
    }

    public void insertUser(User user) {
        dataMapper.insertUser(user);
    }

    public void insertUsers(List usersList) {
        dataMapper.insertUsers(usersList);
    }

    public void insertEntity(List columns, List values){
        dataMapper.insertEntity(columns, values);
    }
}

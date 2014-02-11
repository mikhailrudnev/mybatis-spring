package com.msh.repositories;

import com.msh.bean.Article;
import com.msh.bean.Post;
import com.msh.bean.User;
import com.msh.persistence.DataMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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

    public void insertEntity(String columns[], String values[]) {
        dataMapper.insertEntity(columns, values);
    }

    public List getUsersByFieldsIfExist(User user) {
        return dataMapper.getUsersByFieldsIfExist(user);
    }

    public List getUsersLike(User user) {
        return dataMapper.getUsersLike(user);
    }

    public List getUsersByChoosenParameter(String name, String email, String phone) {
        return dataMapper.getUsersByChoosenParameter(name, email, phone);
    }

    public List<Article> getArticles(){
        return dataMapper.getArticles();
    }

    public List<Post> getPosts(){
        return dataMapper.getPosts();
    }
}

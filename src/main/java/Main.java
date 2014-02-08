import com.msh.bean.User;
import com.msh.repositories.DataRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataRepository dataRepository = (DataRepository)context.getBean("dataRepository");
        System.out.println(dataRepository.getAllUsers());
        System.out.println(dataRepository.getUserById(1));
        User user = new User();
        user.setName("name user3");
        user.setEmail("email user3");
        user.setPhone("phone user3");
        dataRepository.insertUser(user);

        List usersList = new ArrayList();
        usersList.add(new User("nameUserList1", "emailUserList1", "phoneUserList1"));
        usersList.add(new User("nameUserList2", "emailUserList2", "phoneUserList2"));

        dataRepository.insertUsers(usersList);

        List columns = new ArrayList();
        columns.add("name");
        columns.add("email");
        List values = new ArrayList();
        values.add("name value");
        values.add("email value");

        dataRepository.insertEntity(columns, values);
    }
}

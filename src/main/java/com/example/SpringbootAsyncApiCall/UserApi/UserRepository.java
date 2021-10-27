package com.example.SpringbootAsyncApiCall.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class UserRepository {
    public List<UserBean> fetchUser(){
        return getUser();
    }

    private List<UserBean> getUser()
    {
        log.info("Calling----> UserRepo->getUser()");
        UserBean user1=new UserBean("user-1234","User-1","user-1@email.id");
        UserBean user2=new UserBean("user-5678","User-2","user-2@email.id");
        UserBean user3=new UserBean("user-9012","User-3","user-3@email.id");
        UserBean user4=new UserBean("user-3456","User-4","user-4@email.id");
        UserBean user5=new UserBean("user-7890","User-5","user-5@email.id");

        List<UserBean>userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return userList;
    }
}

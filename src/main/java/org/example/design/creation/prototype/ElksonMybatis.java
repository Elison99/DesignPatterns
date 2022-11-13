package org.example.design.creation.prototype;

import java.util.HashMap;
import java.util.Map;

public class ElksonMybatis {

    //缓存
    private Map<String,User> userCache = new HashMap<String, User>();
    /**
     * 从数据库查数据
     */
    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        //缓存中没有
        if (!userCache.containsKey(username)){
            //从数据库
            user = getUserFromDb(username);
        }else {
            //从缓存直接拿，存在脏缓存的问题
            //原型已经拿到不能直接给
            user = userCache.get(username);
            System.out.println("从缓存中拿到的是："+username);
        }
        //从这个对象快速得到一个克降体（克降人）==原型模式
        user = (User) user.clone();
        return user;
    }

    private User getUserFromDb(String username) {
        System.out.println("从数据库查询数据库"+username);
        User user = new User();
        user.setAge(18);
        user.setUsername(username);
        userCache.put(username,user);
        return user;
    }
}

package org.example.design.creation.prototype;

/**
 * 当前对象可克隆的
 */
public class User implements Cloneable{
    private String username;

    /**
     * 再创建一个人，赋予所有属性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(this.username);
        user.setAge(this.age);
        return user;
    }

    private Integer age;

    public User() {
        System.out.println("User对象已创建");
    }

    public String getUserName(){
        return  username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

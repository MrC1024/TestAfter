package cn.bdqn.exam.entity;

import java.io.Serializable;

public class Problems  implements Serializable {
    private  Integer pro_id;
    private  String  pro_question;
    private String  proAdminContext;
    private  String pro_name;
    private String pro_phone;
    private  User user;

    public String getProAdminContext() {
        return proAdminContext;
    }

    public void setProAdminContext(String proAdminContext) {
        this.proAdminContext = proAdminContext;
    }

    public String getPro_phone() {
        return pro_phone;
    }

    public void setPro_phone(String pro_phone) {
        this.pro_phone = pro_phone;
    }
    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_question() {
        return pro_question;
    }

    public void setPro_question(String pro_question) {
        this.pro_question = pro_question;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

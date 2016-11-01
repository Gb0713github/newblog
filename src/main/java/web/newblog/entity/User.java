package web.newblog.entity;


import javax.persistence.*;

/**
 * Created by Administrator on 2016/11/1.
 */
@Entity
@Table
public class User {

    private Integer id;
    private String userName;
    private String passwd;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}

package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

//一个 User 对象就用来表示一条数据库的记录.
//对象的属性基本和数据库的表结构一致. (大部分是一致的, 可能有细节上的差异)
@Getter
@Setter
@ToString
public class User {
    private int userId;
    private String name;
    private String password;
    private String nickName;
    private Timestamp lastLogout;
}

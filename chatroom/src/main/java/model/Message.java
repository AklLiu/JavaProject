package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Message {
    private int messageId;
    private int userId;
    private int channelId;
    private String content;
    private Timestamp sendTime;

    // nickName 在 message 表中并不存在. 但可以根据 userId 在 user 表中查到
    // 直接把用户的昵称放到这里, 方便后面的界面显示.
    private String nickName;
}

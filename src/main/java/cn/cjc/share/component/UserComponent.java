package cn.cjc.share.component;

import cn.cjc.share.domain.User;

/**
 * @author chenjc
 * @since 2017-10-14
 */
public class UserComponent {

    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("刘翔");
        user.setAge(34);
        user.setAddress("中国上海");
        return user;
    }
}

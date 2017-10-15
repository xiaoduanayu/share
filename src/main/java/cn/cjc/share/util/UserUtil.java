package cn.cjc.share.util;

import cn.cjc.share.component.UserComponent;
import cn.cjc.share.domain.User;

/**
 * @author chenjc
 * @since 2017-10-14
 */
public class UserUtil {

    private static UserComponent userComponent = SpringMvcUtil.getBean(UserComponent.class);

    static {
        System.out.println("UserUtil初始化，userComponent=" + userComponent);
    }

    public static User getUser() {
        return userComponent.getUser();
    }

}

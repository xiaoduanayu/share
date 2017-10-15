package cn.cjc.share.service.impl;

import cn.cjc.share.domain.User;
import cn.cjc.share.service.UserService;
import cn.cjc.share.util.UserUtil;
import org.springframework.stereotype.Service;

/**
 * @author chenjc
 * @since 2017-10-14
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        return UserUtil.getUser();
    }
}

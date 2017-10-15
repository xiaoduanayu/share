package cn.cjc.share.mq.impl;

import cn.cjc.share.mq.MessageConsumer;
import cn.cjc.share.util.UserUtil;

/**
 * @author chenjc
 * @since 2017-10-14
 */
public class UserMessageConsumerImpl implements MessageConsumer {
    @Override
    public void messageReceived(Object obj) {
        byte[] bytes = (byte[]) obj;
        System.out.println("收到消息:" + new String(bytes) + "，当前线程：" + Thread.currentThread().getName());
        System.out.println(UserUtil.getUser());
    }
}

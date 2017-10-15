package cn.cjc.share.mq;

/**
 * @author chenjc
 * @since 2017-10-14
 */
public interface MessageConsumer {
    void messageReceived(Object obj);
}

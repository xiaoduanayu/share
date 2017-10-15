package cn.cjc.share.test.mq;

import cn.cjc.share.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 生产消息
 *
 * @author chenjc
 * @since 2017-10-14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:share-mq-producer.xml")
public class MessageProducerTest {

    @Resource
    private AmqpTemplate amqpTemplate;

    @Test
    public void produce() {
        for (int i = 1; i <= 100; i++) {
            User user = new User();
            user.setId(i);
            user.setName("刘翔_" + i);
            user.setAge(34);
            user.setAddress("中国上海");
            amqpTemplate.convertAndSend(user);
        }
    }
}

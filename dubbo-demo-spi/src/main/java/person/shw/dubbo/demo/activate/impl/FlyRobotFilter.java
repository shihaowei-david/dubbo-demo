package person.shw.dubbo.demo.activate.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import person.shw.dubbo.demo.activate.RobotFilter;

import static org.apache.dubbo.common.constants.CommonConstants.CONSUMER;
import static org.apache.dubbo.common.constants.CommonConstants.PROVIDER;


/**
 * @author shihaowei
 * @date 2020/7/12 9:46 下午
 */
@Activate(group = {CONSUMER},value = "yuri")
public class FlyRobotFilter implements RobotFilter {

    @Override
    public void sayHello(URL url) {

        System.out.println("I am FlyRobotFilter");
    }
}

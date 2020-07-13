package person.shw.dubbo.demo.adaptive.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.ExtensionLoader;
import person.shw.dubbo.demo.adaptive.Robot;

/**
 * @author shihaowei
 * @date 2020/7/12 11:24 下午
 */
/*
@Adaptive
public class AdaptiveRobot implements Robot {

    @Override
    public void sayHello(URL url) {
        String robot = url.getParameter("robot");

        System.out.println("Hello, I am AdaptiveRobot.robot="+robot);

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot extension = extensionLoader.getExtension(robot);
        extension.sayHello(url);
    }
}
*/

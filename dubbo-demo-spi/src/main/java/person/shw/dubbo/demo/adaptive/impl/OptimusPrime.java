package person.shw.dubbo.demo.adaptive.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import person.shw.dubbo.demo.adaptive.Robot;

/**
 * @author shihaowei
 * @date 2020/7/12 11:23 下午
 */
public class OptimusPrime implements Robot {

    //@Adaptive
    @Override
    public void sayHello(URL url) {
        System.out.println("Hello, I am Optimus Prime.");
    }
}


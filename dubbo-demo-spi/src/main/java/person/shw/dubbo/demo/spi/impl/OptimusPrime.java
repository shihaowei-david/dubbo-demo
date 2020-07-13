package person.shw.dubbo.demo.spi.impl;

import person.shw.dubbo.demo.spi.Robot;

/**
 * @author shihaowei
 * @date 2020/7/12 11:20 上午
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}

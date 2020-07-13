package person.shw.dubbo.demo.ioc.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import person.shw.dubbo.demo.ioc.Car;
import person.shw.dubbo.demo.ioc.Robot;

/**
 * @author shihaowei
 * @date 2020/7/13 3:17 下午
 */
public class OptimusPrime implements Robot {

    /**
     * 会被注入一个代理对象
     */
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    //@Adaptive
    @Override
    public void sayHello(URL url) {
        System.out.println("Hello, I am OptimusPrime");
        car.excute(url);
    }
}

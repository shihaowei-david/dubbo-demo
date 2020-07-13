package person.shw.dubbo.demo.ioc.impl;

import org.apache.dubbo.common.URL;
import person.shw.dubbo.demo.ioc.Car;
import person.shw.dubbo.demo.ioc.Robot;

/**
 * @author shihaowei
 * @date 2020/7/13 11:20 上午
 */
public class Bumblebee implements Robot {

    /**
     * 注入一个代理对象
     */
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("Hello, I am Bumblebee ");
        car.excute(url);
    }
}

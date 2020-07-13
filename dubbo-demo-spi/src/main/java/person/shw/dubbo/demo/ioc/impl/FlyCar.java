package person.shw.dubbo.demo.ioc.impl;

import org.apache.dubbo.common.URL;
import person.shw.dubbo.demo.ioc.Car;

/**
 * @author shihaowei
 * @date 2020/7/13 11:24 上午
 */
public class FlyCar implements Car {
    @Override
    public void excute(URL url) {
        System.out.println("你飞呀flyCar ======>"+url);
    }
}

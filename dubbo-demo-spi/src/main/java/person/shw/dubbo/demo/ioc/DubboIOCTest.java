package person.shw.dubbo.demo.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shihaowei
 * @date 2020/7/13 3:20 下午
 */
public interface DubboIOCTest {

    public static void main(String[] args) {

        Robot adaptiveExtension = ExtensionLoader.getExtensionLoader(Robot.class).getAdaptiveExtension();
        System.out.println("robot-adaptiveExtension ========>"+adaptiveExtension);

        Car adaptiveExtension1 = ExtensionLoader.getExtensionLoader(Car.class).getAdaptiveExtension();
        System.out.println("car-adaptiveExtension1 =========>"+adaptiveExtension1);

        System.out.println("==============================================================");

        URL url = new URL("dubbo","localhost",9527);
        url = url.addParameter("robot","optimusPrime").addParameter("car","runCar");
        adaptiveExtension.sayHello(url);

        System.out.println("==============================================================");

        url = url.addParameter("robot","bumblebee").addParameter("car","flyCar");

        adaptiveExtension.sayHello(url);
    }
}

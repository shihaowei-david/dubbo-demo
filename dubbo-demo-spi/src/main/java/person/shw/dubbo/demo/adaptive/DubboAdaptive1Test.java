package person.shw.dubbo.demo.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shihaowei
 * @date 2020/7/12 11:25 下午
 */
public class DubboAdaptive1Test {

    public static void main(String[] args) {

        Robot adaptiveExtension = ExtensionLoader.getExtensionLoader(Robot.class).getAdaptiveExtension();

        System.out.println("adaptiveExtension======" + adaptiveExtension);
        URL url = new URL("dubbo", "127.0.0.1", 8888);

        //根据不同的参数，调用不同实现
        //url = url.addParameter("robot", "optimusPrime");
        url = url.addParameter("robot", "bumblebee");

        adaptiveExtension.sayHello(url);
    }

}

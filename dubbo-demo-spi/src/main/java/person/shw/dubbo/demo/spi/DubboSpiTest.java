package person.shw.dubbo.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shihaowei
 * @date 2020/7/12 11:33 上午
 */
public class DubboSpiTest {

    public static void main(String[] args) {

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        System.out.println("extensionLoader=======>"+extensionLoader);

        Robot defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.sayHello();

        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();

    }
}

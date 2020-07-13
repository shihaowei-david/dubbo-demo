package person.shw.dubbo.demo.activate;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author shihaowei
 * @date 2020/7/12 9:44 下午
 */
@SPI
public interface RobotFilter {

    void sayHello(URL url);
}

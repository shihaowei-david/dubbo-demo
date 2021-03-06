package person.shw.dubbo.demo.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author shihaowei
 * @date 2020/7/13 11:19 上午
 */
@SPI
public interface Robot {

    @Adaptive
    void sayHello(URL url);
}

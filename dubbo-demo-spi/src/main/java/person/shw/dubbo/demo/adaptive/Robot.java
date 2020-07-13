package person.shw.dubbo.demo.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author shihaowei
 * @date 2020/7/12 11:20 下午
 */
@SPI
public interface Robot {

    @Adaptive
    void sayHello(URL url);
}

package person.shw.dubbo.demo.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author shihaowei
 * @date 2020/7/12 11:11 上午
 */
@SPI("optimusPrime")
public interface Robot {
    void sayHello();
}

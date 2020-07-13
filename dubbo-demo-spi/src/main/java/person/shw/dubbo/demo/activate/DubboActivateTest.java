package person.shw.dubbo.demo.activate;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.dubbo.common.constants.CommonConstants.CONSUMER;

/**
 * @author shihaowei
 * @date 2020/7/12 10:01 下午
 */
public class DubboActivateTest {

    public static void main(String[] args) {

        Map<String,String> param = new HashMap<>();
        param.put("ok","ojbk");
        param.put("yuri","aaa");

        URL url = new URL("dubbo","127.0.0.0",9527,param);
        url =url.addParameter("a","-runRobotFilter");
        List<RobotFilter> runRobotFilter = ExtensionLoader.getExtensionLoader(RobotFilter.class)
                .getActivateExtension(url, "a", CONSUMER);

        URL finalUrl = url;
        runRobotFilter.forEach(s -> {
            s.sayHello(finalUrl);
        });
    }
}

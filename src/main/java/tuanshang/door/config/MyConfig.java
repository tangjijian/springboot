package tuanshang.door.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
@ImportResource("classpath:bean.xml")
public class MyConfig {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter()
    {
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setMethodParam("_m");
        return hiddenHttpMethodFilter;
    }
}

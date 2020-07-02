package kr.co.metanet.tcm.config;

import com.github.rozidan.springboot.modelmapper.ConfigurationConfigurer;
import org.modelmapper.config.Configuration;
import org.springframework.stereotype.Component;

/**
 * Global model mapper config
 */
@Component
public class ModelMapperConfig extends ConfigurationConfigurer {

    @Override
    public void configure(Configuration configuration) {
        configuration
                .setSkipNullEnabled(true)
                .setAmbiguityIgnored(true);

    }
}

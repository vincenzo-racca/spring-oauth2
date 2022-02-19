package com.vincenzoracca.springoauth2client.config;

import com.hazelcast.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HazelcastConfig {

    private static final String HAZELCAST_INSTANCE_NAME = "session-hazelcast-instance";

    private static final String MAP_CONFIG_NAME = "session-config-map";

    @Bean
    Config config() {
        Config config = new Config();
        config.setInstanceName(HAZELCAST_INSTANCE_NAME)
                .addMapConfig(mapConfig()
                );
        return config;
    }

    private MapConfig mapConfig() {
        final MapConfig mapConfig = new MapConfig();
        mapConfig.setName(MAP_CONFIG_NAME)
//                .setTimeToLiveSeconds(0)
                .setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LRU)
                        .setMaxSizePolicy(MaxSizePolicy.PER_NODE)
                );
        return mapConfig;
    }
}

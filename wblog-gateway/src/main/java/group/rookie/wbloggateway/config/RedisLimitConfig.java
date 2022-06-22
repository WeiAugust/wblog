package group.rookie.wbloggateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

/**
 * @ClassName RedisLimitConfig
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/20 9:57
 * @Version 1.0
 **/
@Configuration
public class RedisLimitConfig {

    @Bean
    @Primary
    public KeyResolver remoteHostLimitKey() {
        return exchange -> Mono.just(
                exchange.getRequest()
                .getRemoteAddress()
                .getAddress()
                .getHostAddress()
        );
    }

    @Bean("customerRateLimiter")
    public RedisRateLimiter templateRateLimiter() {
        return new RedisRateLimiter(10, 20);
    }

    @Bean("defaultRateLimiter")
    @Primary
    public RedisRateLimiter defaultRateLimiter() {
        return new RedisRateLimiter(50, 100);
    }
}

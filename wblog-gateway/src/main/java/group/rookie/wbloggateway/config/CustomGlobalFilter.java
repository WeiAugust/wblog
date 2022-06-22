package group.rookie.wbloggateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;
import java.util.Date;

/**
 * @ClassName CustomGlobalFilter
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/19 8:06
 * @Version 1.0
 **/

@Component
public class CustomGlobalFilter implements GlobalFilter, Ordered {

    private static Logger logger = LoggerFactory.getLogger(CustomGlobalFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        logger.info("come in MyLogGateWayFilter:  " + new Date());

//        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
//        if (uname == null) {
//            logger.info("用户名为null，非法用户，o(╥﹏╥)o");
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return exchange.getResponse().setComplete();
//        }
        return chain.filter(exchange);

//        ServerHttpRequest request = exchange.getRequest();
//        String path = request.getPath().pathWithinApplication().value();
//        String scheme = request.getURI().getScheme();
//        HttpMethod method = request.getMethod();
//        HttpHeaders httpHeaders = request.getHeaders();
//        InetSocketAddress remoteAddress = request.getRemoteAddress();
//
//        ServerHttpRequest newRequest = exchange.getRequest().mutate().headers(headers -> {
//            headers.add("X-Gatewaw-Token","20220519");
//            headers.add("X-Gatewaw-Token","20220519");
//        }).build();
//
//        logger.info("path:{}, scheme:{}, method:{}, headers:{}, remoteAddress:{}",
//                path,scheme,method,httpHeaders,remoteAddress);
//
//        //计算请求时长
//        exchange.getAttributes().put("START_TIME", System.currentTimeMillis());
//
//        return chain.filter(exchange.mutate().request(newRequest).build()).then( Mono.fromRunnable(() -> {
//            Long startTime = exchange.getAttribute("START_TIME");
//            if (startTime != null) {
//                Long executeTime = (System.currentTimeMillis() - startTime);
//                logger.info(exchange.getRequest().getURI().getRawPath() + " : " + executeTime + "ms");
//            }
//        }));
    }

    @Override
    public int getOrder() {
        return -1;
    }
}

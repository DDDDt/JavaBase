package com.dtner.websocket.server;

import java.net.InetSocketAddress;

/**
 * @ClassName WsServerApplication
 * @Description:
 * @Author dt
 * @Date 2020-08-04
 **/
public class WsServerApplication {

    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8888);
        WsServer wsServer = new WsServer(inetSocketAddress);
        wsServer.start();
        wsServer.broadcast("这是一个测试...");

    }

}

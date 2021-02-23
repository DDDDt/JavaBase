package com.dtner.websocket.client;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * @ClassName WebSocketClient
 * @Description:
 * @Author dt
 * @Date 2020-08-04
 **/
public class WsClient extends WebSocketClient {

    public WsClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("握手成功");
    }

    @Override
    public void onMessage(String s) {
        System.out.println("接受到的消息: " +s);
        this.close();
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("close ...");
    }

    @Override
    public void onError(Exception e) {
        System.out.println("error ...");
    }
}

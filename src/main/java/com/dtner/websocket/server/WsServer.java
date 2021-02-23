package com.dtner.websocket.server;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

/**
 * @ClassName WsServer
 * @Description:
 * @Author dt
 * @Date 2020-08-04
 **/
public class WsServer extends WebSocketServer {

    public WsServer(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        webSocket.send("{\"errorCode\":0,\"messageType\":\"getCmsStatus\"}");
//        webSocket.send("Welcome to the server");
        broadcast("new connection: " + clientHandshake.getResourceDescriptor() );
        System.out.println("server open...");
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        broadcast(webSocket + "has left the room");
        System.out.println("server close...");
    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        broadcast(s);
        System.out.println(webSocket+" : "+s);
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {
        e.printStackTrace();
        System.out.println("server error...");
    }

    @Override
    public void onStart() {
        System.out.println("server start...");
        setConnectionLostTimeout(0);
        setConnectionLostTimeout(100);
    }
}

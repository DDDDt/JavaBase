package com.dtner.websocket.client;

import java.net.URI;

/**
 * @ClassName WebSocketClientApplication
 * @Description:
 * @Author dt
 * @Date 2020-08-04
 **/
public class WsClientApplication {

    private static final String url =  "ws://localhost:8888/api/open";

    public static void main(String[] args) {

        try{
            WsClient client = new WsClient(new URI(url));
            client.connectBlocking();
            // 判断是否连接成功，未成功后面发送消息时会报错
      /*      while (!client.isOpen()){
                System.out.println("连接中... 请稍后");
                Thread.sleep(1000);
            }*/
            client.send("test websocket");
            System.out.println("发送成功");
//            client.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}

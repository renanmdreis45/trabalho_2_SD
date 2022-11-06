package com.grpc.Photo;

import java.io.IOException;
import java.util.logging.Logger;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;



import com.grpc.Heater.HeatingService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PhotoServer {
//	private static class SampleListener implements ServiceListener {
//  public void serviceAdded(ServiceEvent event) {
//      System.out.println("Service addedPORT?: " + event.getInfo().getPort());
//
//  }
//
//
//  public void serviceRemoved(ServiceEvent event) {
//      System.out.println("Service removed: " + event.getInfo());
//  }
//
//
//  public void serviceResolved(ServiceEvent event) {
//      System.out.println("Service resolved: " + event.getInfo());
//     
// 		 try {
// 			FanService fanService = new FanService();
//		   
//		    int port = 50055;
//		    
//
//		// portNumber= 50055;
//		    Server server = ServerBuilder.forPort(event.getInfo().getPort())
//		        .addService(fanService)
//		        .build()
//		        .start();
//
//		    logger.info("Fan Server started, listening on " + port);
//		   
//
//		    server.awaitTermination();
//	 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//  }
//

	public static void main(String[] args) throws IOException, InterruptedException{
//		try {
//      // Create a JmDNS instance
//      JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
//
//
//      // Add a service listener
//      jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
//      System.out.println("Listening");
//      // Wait a bit
//      Thread.sleep(30000);
//  } catch (UnknownHostException e) {
//      System.out.println(e.getMessage());
//  } catch (IOException e) {
//      System.out.println(e.getMessage());
//  }
		HeatingService heatService = new HeatingService();
		int port = 50051;
				
			Server server = ServerBuilder.forPort(port)
	        .addService(heatService)
	        .build()
	        .start();
			
		
		
		System.out.println("the server has started listening for requests");
		server.awaitTermination();

	}
}

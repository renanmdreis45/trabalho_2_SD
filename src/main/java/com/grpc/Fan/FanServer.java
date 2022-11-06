package com.grpc.Fan;

import java.io.IOException;
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

import com.Fan.FanServiceGrpc.FanServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;


public class FanServer extends FanServiceImplBase{
	private static final Logger logger = Logger.getLogger(FanServer.class.getName());

//	private static class SampleListener implements ServiceListener {
//        public void serviceAdded(ServiceEvent event) {
//            System.out.println("Service addedPORT?: " + event.getInfo().getPort());
//
//        }
//
//
//        public void serviceRemoved(ServiceEvent event) {
//            System.out.println("Service removed: " + event.getInfo());
//        }
//
//
//        public void serviceResolved(ServiceEvent event) {
//            System.out.println("Service resolved: " + event.getInfo());
//           
//       		 try {
//       			FanService fanService = new FanService();
//     		   
//    		    int port = 50051;
//    		    
//
//    		// portNumber= 50051;
//    		    Server server = ServerBuilder.forPort(event.getInfo().getPort())
//    		        .addService(fanService)
//    		        .build()
//    		        .start();
//
//    		    logger.info("Fan Server started, listening on " + port);
//    		   
//
//    		    server.awaitTermination();
//    	 
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			}
//        }
//	
	public static void main(String[] args) throws IOException, InterruptedException{
//	
//	
//		
//		try {
//            // Create a JmDNS instance
//            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
//
//
//            // Add a service listener
//            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
//            System.out.println("Listening");
//            // Wait a bit
//            Thread.sleep(30000);
//        } catch (UnknownHostException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
	
		FanService fanService = new FanService();
		   
	    int port = 50051;
	    

	// portNumber= 50051;
	    Server server = ServerBuilder.forPort(port)
	        .addService(fanService)
	        .build()
	        .start();

		System.out.println("the server has started listening for requests");
		server.awaitTermination();

	}
}

	
	


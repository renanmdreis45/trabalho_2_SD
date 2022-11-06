package com.Heating;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Heating.proto")
public final class HeatingServiceGrpc {

  private HeatingServiceGrpc() {}

  public static final String SERVICE_NAME = "HeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Heating.HeaterStatusRequest,
      com.Heating.HeaterInfoResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowStatus",
      requestType = com.Heating.HeaterStatusRequest.class,
      responseType = com.Heating.HeaterInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Heating.HeaterStatusRequest,
      com.Heating.HeaterInfoResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.Heating.HeaterStatusRequest, com.Heating.HeaterInfoResponse> getShowStatusMethod;
    if ((getShowStatusMethod = HeatingServiceGrpc.getShowStatusMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getShowStatusMethod = HeatingServiceGrpc.getShowStatusMethod) == null) {
          HeatingServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.Heating.HeaterStatusRequest, com.Heating.HeaterInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService", "ShowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("ShowStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest,
      com.Heating.HeaterInfoResponse> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemp",
      requestType = com.Heating.HeaterToUpdateRequest.class,
      responseType = com.Heating.HeaterInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest,
      com.Heating.HeaterInfoResponse> getSetTempMethod() {
    io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest, com.Heating.HeaterInfoResponse> getSetTempMethod;
    if ((getSetTempMethod = HeatingServiceGrpc.getSetTempMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getSetTempMethod = HeatingServiceGrpc.getSetTempMethod) == null) {
          HeatingServiceGrpc.getSetTempMethod = getSetTempMethod = 
              io.grpc.MethodDescriptor.<com.Heating.HeaterToUpdateRequest, com.Heating.HeaterInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService", "SetTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("SetTemp"))
                  .build();
          }
        }
     }
     return getSetTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest,
      com.Heating.HeaterInfoResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOff",
      requestType = com.Heating.HeaterToUpdateRequest.class,
      responseType = com.Heating.HeaterInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest,
      com.Heating.HeaterInfoResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<com.Heating.HeaterToUpdateRequest, com.Heating.HeaterInfoResponse> getTurnOffMethod;
    if ((getTurnOffMethod = HeatingServiceGrpc.getTurnOffMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getTurnOffMethod = HeatingServiceGrpc.getTurnOffMethod) == null) {
          HeatingServiceGrpc.getTurnOffMethod = getTurnOffMethod = 
              io.grpc.MethodDescriptor.<com.Heating.HeaterToUpdateRequest, com.Heating.HeaterInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService", "TurnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Heating.HeaterInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("TurnOff"))
                  .build();
          }
        }
     }
     return getTurnOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingServiceStub newStub(io.grpc.Channel channel) {
    return new HeatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.Heating.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setTemp(com.Heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    /**
     */
    public void turnOff(com.Heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Heating.HeaterStatusRequest,
                com.Heating.HeaterInfoResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Heating.HeaterToUpdateRequest,
                com.Heating.HeaterInfoResponse>(
                  this, METHODID_SET_TEMP)))
          .addMethod(
            getTurnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Heating.HeaterToUpdateRequest,
                com.Heating.HeaterInfoResponse>(
                  this, METHODID_TURN_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class HeatingServiceStub extends io.grpc.stub.AbstractStub<HeatingServiceStub> {
    private HeatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.Heating.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemp(com.Heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOff(com.Heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeatingServiceBlockingStub extends io.grpc.stub.AbstractStub<HeatingServiceBlockingStub> {
    private HeatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.Heating.HeaterInfoResponse showStatus(com.Heating.HeaterStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Heating.HeaterInfoResponse setTemp(com.Heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Heating.HeaterInfoResponse turnOff(com.Heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatingServiceFutureStub extends io.grpc.stub.AbstractStub<HeatingServiceFutureStub> {
    private HeatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Heating.HeaterInfoResponse> showStatus(
        com.Heating.HeaterStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Heating.HeaterInfoResponse> setTemp(
        com.Heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Heating.HeaterInfoResponse> turnOff(
        com.Heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_TEMP = 1;
  private static final int METHODID_TURN_OFF = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.Heating.HeaterStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((com.Heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((com.Heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.Heating.HeaterInfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Heating.Heating.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatingService");
    }
  }

  private static final class HeatingServiceFileDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier {
    HeatingServiceFileDescriptorSupplier() {}
  }

  private static final class HeatingServiceMethodDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetTempMethod())
              .addMethod(getTurnOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}

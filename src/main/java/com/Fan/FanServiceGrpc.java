package com.Fan;

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
    comments = "Source: Fan.proto")
public final class FanServiceGrpc {

  private FanServiceGrpc() {}

  public static final String SERVICE_NAME = "FanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest,
      com.Fan.FanInfoResponse> getShowDeviceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowDeviceStatus",
      requestType = com.Fan.GetDeviceByIdRequest.class,
      responseType = com.Fan.FanInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest,
      com.Fan.FanInfoResponse> getShowDeviceStatusMethod() {
    io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest, com.Fan.FanInfoResponse> getShowDeviceStatusMethod;
    if ((getShowDeviceStatusMethod = FanServiceGrpc.getShowDeviceStatusMethod) == null) {
      synchronized (FanServiceGrpc.class) {
        if ((getShowDeviceStatusMethod = FanServiceGrpc.getShowDeviceStatusMethod) == null) {
          FanServiceGrpc.getShowDeviceStatusMethod = getShowDeviceStatusMethod = 
              io.grpc.MethodDescriptor.<com.Fan.GetDeviceByIdRequest, com.Fan.FanInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FanService", "ShowDeviceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.GetDeviceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.FanInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FanServiceMethodDescriptorSupplier("ShowDeviceStatus"))
                  .build();
          }
        }
     }
     return getShowDeviceStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Fan.GetSpeedRequest,
      com.Fan.FanInfoResponse> getSetSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSpeed",
      requestType = com.Fan.GetSpeedRequest.class,
      responseType = com.Fan.FanInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Fan.GetSpeedRequest,
      com.Fan.FanInfoResponse> getSetSpeedMethod() {
    io.grpc.MethodDescriptor<com.Fan.GetSpeedRequest, com.Fan.FanInfoResponse> getSetSpeedMethod;
    if ((getSetSpeedMethod = FanServiceGrpc.getSetSpeedMethod) == null) {
      synchronized (FanServiceGrpc.class) {
        if ((getSetSpeedMethod = FanServiceGrpc.getSetSpeedMethod) == null) {
          FanServiceGrpc.getSetSpeedMethod = getSetSpeedMethod = 
              io.grpc.MethodDescriptor.<com.Fan.GetSpeedRequest, com.Fan.FanInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FanService", "SetSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.GetSpeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.FanInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FanServiceMethodDescriptorSupplier("SetSpeed"))
                  .build();
          }
        }
     }
     return getSetSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest,
      com.Fan.FanInfoResponse> getTurnOffFanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffFan",
      requestType = com.Fan.GetDeviceByIdRequest.class,
      responseType = com.Fan.FanInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest,
      com.Fan.FanInfoResponse> getTurnOffFanMethod() {
    io.grpc.MethodDescriptor<com.Fan.GetDeviceByIdRequest, com.Fan.FanInfoResponse> getTurnOffFanMethod;
    if ((getTurnOffFanMethod = FanServiceGrpc.getTurnOffFanMethod) == null) {
      synchronized (FanServiceGrpc.class) {
        if ((getTurnOffFanMethod = FanServiceGrpc.getTurnOffFanMethod) == null) {
          FanServiceGrpc.getTurnOffFanMethod = getTurnOffFanMethod = 
              io.grpc.MethodDescriptor.<com.Fan.GetDeviceByIdRequest, com.Fan.FanInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FanService", "TurnOffFan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.GetDeviceByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Fan.FanInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FanServiceMethodDescriptorSupplier("TurnOffFan"))
                  .build();
          }
        }
     }
     return getTurnOffFanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FanServiceStub newStub(io.grpc.Channel channel) {
    return new FanServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FanServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FanServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FanServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showDeviceStatus(com.Fan.GetDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowDeviceStatusMethod(), responseObserver);
    }

    /**
     */
    public void setSpeed(com.Fan.GetSpeedRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSpeedMethod(), responseObserver);
    }

    /**
     */
    public void turnOffFan(com.Fan.GetDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffFanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowDeviceStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Fan.GetDeviceByIdRequest,
                com.Fan.FanInfoResponse>(
                  this, METHODID_SHOW_DEVICE_STATUS)))
          .addMethod(
            getSetSpeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Fan.GetSpeedRequest,
                com.Fan.FanInfoResponse>(
                  this, METHODID_SET_SPEED)))
          .addMethod(
            getTurnOffFanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Fan.GetDeviceByIdRequest,
                com.Fan.FanInfoResponse>(
                  this, METHODID_TURN_OFF_FAN)))
          .build();
    }
  }

  /**
   */
  public static final class FanServiceStub extends io.grpc.stub.AbstractStub<FanServiceStub> {
    private FanServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FanServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FanServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FanServiceStub(channel, callOptions);
    }

    /**
     */
    public void showDeviceStatus(com.Fan.GetDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowDeviceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSpeed(com.Fan.GetSpeedRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffFan(com.Fan.GetDeviceByIdRequest request,
        io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffFanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FanServiceBlockingStub extends io.grpc.stub.AbstractStub<FanServiceBlockingStub> {
    private FanServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FanServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FanServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FanServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.Fan.FanInfoResponse showDeviceStatus(com.Fan.GetDeviceByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowDeviceStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Fan.FanInfoResponse setSpeed(com.Fan.GetSpeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetSpeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Fan.FanInfoResponse turnOffFan(com.Fan.GetDeviceByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffFanMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FanServiceFutureStub extends io.grpc.stub.AbstractStub<FanServiceFutureStub> {
    private FanServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FanServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FanServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FanServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Fan.FanInfoResponse> showDeviceStatus(
        com.Fan.GetDeviceByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowDeviceStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Fan.FanInfoResponse> setSpeed(
        com.Fan.GetSpeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetSpeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Fan.FanInfoResponse> turnOffFan(
        com.Fan.GetDeviceByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffFanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_DEVICE_STATUS = 0;
  private static final int METHODID_SET_SPEED = 1;
  private static final int METHODID_TURN_OFF_FAN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FanServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FanServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_DEVICE_STATUS:
          serviceImpl.showDeviceStatus((com.Fan.GetDeviceByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse>) responseObserver);
          break;
        case METHODID_SET_SPEED:
          serviceImpl.setSpeed((com.Fan.GetSpeedRequest) request,
              (io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_FAN:
          serviceImpl.turnOffFan((com.Fan.GetDeviceByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.Fan.FanInfoResponse>) responseObserver);
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

  private static abstract class FanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Fan.Fan.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FanService");
    }
  }

  private static final class FanServiceFileDescriptorSupplier
      extends FanServiceBaseDescriptorSupplier {
    FanServiceFileDescriptorSupplier() {}
  }

  private static final class FanServiceMethodDescriptorSupplier
      extends FanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FanServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FanServiceFileDescriptorSupplier())
              .addMethod(getShowDeviceStatusMethod())
              .addMethod(getSetSpeedMethod())
              .addMethod(getTurnOffFanMethod())
              .build();
        }
      }
    }
    return result;
  }
}

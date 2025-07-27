package org.healthapp.falldetection;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: fall_detection.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FallDetectionServiceGrpc {

  private FallDetectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FallDetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getMonitorFallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorFalls",
      requestType = org.healthapp.falldetection.FallDetectionRequest.class,
      responseType = org.healthapp.falldetection.FallDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getMonitorFallsMethod() {
    io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse> getMonitorFallsMethod;
    if ((getMonitorFallsMethod = FallDetectionServiceGrpc.getMonitorFallsMethod) == null) {
      synchronized (FallDetectionServiceGrpc.class) {
        if ((getMonitorFallsMethod = FallDetectionServiceGrpc.getMonitorFallsMethod) == null) {
          FallDetectionServiceGrpc.getMonitorFallsMethod = getMonitorFallsMethod =
              io.grpc.MethodDescriptor.<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorFalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FallDetectionServiceMethodDescriptorSupplier("MonitorFalls"))
              .build();
        }
      }
    }
    return getMonitorFallsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FallDetectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceStub>() {
        @java.lang.Override
        public FallDetectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FallDetectionServiceStub(channel, callOptions);
        }
      };
    return FallDetectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static FallDetectionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceBlockingV2Stub>() {
        @java.lang.Override
        public FallDetectionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FallDetectionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return FallDetectionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FallDetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceBlockingStub>() {
        @java.lang.Override
        public FallDetectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FallDetectionServiceBlockingStub(channel, callOptions);
        }
      };
    return FallDetectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FallDetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FallDetectionServiceFutureStub>() {
        @java.lang.Override
        public FallDetectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FallDetectionServiceFutureStub(channel, callOptions);
        }
      };
    return FallDetectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionRequest> monitorFalls(
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorFallsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FallDetectionService.
   */
  public static abstract class FallDetectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FallDetectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FallDetectionService.
   */
  public static final class FallDetectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FallDetectionServiceStub> {
    private FallDetectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FallDetectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FallDetectionServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionRequest> monitorFalls(
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorFallsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FallDetectionService.
   */
  public static final class FallDetectionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<FallDetectionServiceBlockingV2Stub> {
    private FallDetectionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FallDetectionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FallDetectionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse>
        monitorFalls() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getMonitorFallsMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service FallDetectionService.
   */
  public static final class FallDetectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FallDetectionServiceBlockingStub> {
    private FallDetectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FallDetectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FallDetectionServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FallDetectionService.
   */
  public static final class FallDetectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FallDetectionServiceFutureStub> {
    private FallDetectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FallDetectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FallDetectionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_FALLS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_FALLS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorFalls(
              (io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMonitorFallsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.healthapp.falldetection.FallDetectionRequest,
              org.healthapp.falldetection.FallDetectionResponse>(
                service, METHODID_MONITOR_FALLS)))
        .build();
  }

  private static abstract class FallDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FallDetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.healthapp.falldetection.FallDetectionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FallDetectionService");
    }
  }

  private static final class FallDetectionServiceFileDescriptorSupplier
      extends FallDetectionServiceBaseDescriptorSupplier {
    FallDetectionServiceFileDescriptorSupplier() {}
  }

  private static final class FallDetectionServiceMethodDescriptorSupplier
      extends FallDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FallDetectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FallDetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FallDetectionServiceFileDescriptorSupplier())
              .addMethod(getMonitorFallsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

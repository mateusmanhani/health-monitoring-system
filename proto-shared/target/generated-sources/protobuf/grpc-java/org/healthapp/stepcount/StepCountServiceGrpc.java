package org.healthapp.stepcount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: step_count.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StepCountServiceGrpc {

  private StepCountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stepcount.StepCountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountResponse> getLogStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogSteps",
      requestType = org.healthapp.stepcount.StepCountRequest.class,
      responseType = org.healthapp.stepcount.StepCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountResponse> getLogStepsMethod() {
    io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountResponse> getLogStepsMethod;
    if ((getLogStepsMethod = StepCountServiceGrpc.getLogStepsMethod) == null) {
      synchronized (StepCountServiceGrpc.class) {
        if ((getLogStepsMethod = StepCountServiceGrpc.getLogStepsMethod) == null) {
          StepCountServiceGrpc.getLogStepsMethod = getLogStepsMethod =
              io.grpc.MethodDescriptor.<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StepCountServiceMethodDescriptorSupplier("LogSteps"))
              .build();
        }
      }
    }
    return getLogStepsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountResponse> getGetStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSteps",
      requestType = org.healthapp.stepcount.StepCountRequest.class,
      responseType = org.healthapp.stepcount.StepCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountResponse> getGetStepsMethod() {
    io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountResponse> getGetStepsMethod;
    if ((getGetStepsMethod = StepCountServiceGrpc.getGetStepsMethod) == null) {
      synchronized (StepCountServiceGrpc.class) {
        if ((getGetStepsMethod = StepCountServiceGrpc.getGetStepsMethod) == null) {
          StepCountServiceGrpc.getGetStepsMethod = getGetStepsMethod =
              io.grpc.MethodDescriptor.<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StepCountServiceMethodDescriptorSupplier("GetSteps"))
              .build();
        }
      }
    }
    return getGetStepsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountLogResponse> getStreamStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSteps",
      requestType = org.healthapp.stepcount.StepCountRequest.class,
      responseType = org.healthapp.stepcount.StepCountLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest,
      org.healthapp.stepcount.StepCountLogResponse> getStreamStepsMethod() {
    io.grpc.MethodDescriptor<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountLogResponse> getStreamStepsMethod;
    if ((getStreamStepsMethod = StepCountServiceGrpc.getStreamStepsMethod) == null) {
      synchronized (StepCountServiceGrpc.class) {
        if ((getStreamStepsMethod = StepCountServiceGrpc.getStreamStepsMethod) == null) {
          StepCountServiceGrpc.getStreamStepsMethod = getStreamStepsMethod =
              io.grpc.MethodDescriptor.<org.healthapp.stepcount.StepCountRequest, org.healthapp.stepcount.StepCountLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.stepcount.StepCountLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StepCountServiceMethodDescriptorSupplier("StreamSteps"))
              .build();
        }
      }
    }
    return getStreamStepsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StepCountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StepCountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StepCountServiceStub>() {
        @java.lang.Override
        public StepCountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StepCountServiceStub(channel, callOptions);
        }
      };
    return StepCountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StepCountServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StepCountServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StepCountServiceBlockingV2Stub>() {
        @java.lang.Override
        public StepCountServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StepCountServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StepCountServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StepCountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StepCountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StepCountServiceBlockingStub>() {
        @java.lang.Override
        public StepCountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StepCountServiceBlockingStub(channel, callOptions);
        }
      };
    return StepCountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StepCountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StepCountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StepCountServiceFutureStub>() {
        @java.lang.Override
        public StepCountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StepCountServiceFutureStub(channel, callOptions);
        }
      };
    return StepCountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void logSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogStepsMethod(), responseObserver);
    }

    /**
     */
    default void getSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStepsMethod(), responseObserver);
    }

    /**
     */
    default void streamSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamStepsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StepCountService.
   */
  public static abstract class StepCountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StepCountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StepCountService.
   */
  public static final class StepCountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StepCountServiceStub> {
    private StepCountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StepCountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StepCountServiceStub(channel, callOptions);
    }

    /**
     */
    public void logSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogStepsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStepsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamSteps(org.healthapp.stepcount.StepCountRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamStepsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StepCountService.
   */
  public static final class StepCountServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StepCountServiceBlockingV2Stub> {
    private StepCountServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StepCountServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StepCountServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public org.healthapp.stepcount.StepCountResponse logSteps(org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogStepsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.healthapp.stepcount.StepCountResponse getSteps(org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStepsMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, org.healthapp.stepcount.StepCountLogResponse>
        streamSteps(org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamStepsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StepCountService.
   */
  public static final class StepCountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StepCountServiceBlockingStub> {
    private StepCountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StepCountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StepCountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.healthapp.stepcount.StepCountResponse logSteps(org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogStepsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.healthapp.stepcount.StepCountResponse getSteps(org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStepsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.healthapp.stepcount.StepCountLogResponse> streamSteps(
        org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamStepsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StepCountService.
   */
  public static final class StepCountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StepCountServiceFutureStub> {
    private StepCountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StepCountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StepCountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.healthapp.stepcount.StepCountResponse> logSteps(
        org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogStepsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.healthapp.stepcount.StepCountResponse> getSteps(
        org.healthapp.stepcount.StepCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStepsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_STEPS = 0;
  private static final int METHODID_GET_STEPS = 1;
  private static final int METHODID_STREAM_STEPS = 2;

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
        case METHODID_LOG_STEPS:
          serviceImpl.logSteps((org.healthapp.stepcount.StepCountRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse>) responseObserver);
          break;
        case METHODID_GET_STEPS:
          serviceImpl.getSteps((org.healthapp.stepcount.StepCountRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountResponse>) responseObserver);
          break;
        case METHODID_STREAM_STEPS:
          serviceImpl.streamSteps((org.healthapp.stepcount.StepCountRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.stepcount.StepCountLogResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLogStepsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.healthapp.stepcount.StepCountRequest,
              org.healthapp.stepcount.StepCountResponse>(
                service, METHODID_LOG_STEPS)))
        .addMethod(
          getGetStepsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.healthapp.stepcount.StepCountRequest,
              org.healthapp.stepcount.StepCountResponse>(
                service, METHODID_GET_STEPS)))
        .addMethod(
          getStreamStepsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.healthapp.stepcount.StepCountRequest,
              org.healthapp.stepcount.StepCountLogResponse>(
                service, METHODID_STREAM_STEPS)))
        .build();
  }

  private static abstract class StepCountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StepCountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.healthapp.stepcount.StepCount.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StepCountService");
    }
  }

  private static final class StepCountServiceFileDescriptorSupplier
      extends StepCountServiceBaseDescriptorSupplier {
    StepCountServiceFileDescriptorSupplier() {}
  }

  private static final class StepCountServiceMethodDescriptorSupplier
      extends StepCountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StepCountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StepCountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StepCountServiceFileDescriptorSupplier())
              .addMethod(getLogStepsMethod())
              .addMethod(getGetStepsMethod())
              .addMethod(getStreamStepsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

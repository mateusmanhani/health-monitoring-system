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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.healthapp.heartrate.PatientResponse> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPatients",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.healthapp.heartrate.PatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.healthapp.heartrate.PatientResponse> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.healthapp.heartrate.PatientResponse> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = FallDetectionServiceGrpc.getGetAllPatientsMethod) == null) {
      synchronized (FallDetectionServiceGrpc.class) {
        if ((getGetAllPatientsMethod = FallDetectionServiceGrpc.getGetAllPatientsMethod) == null) {
          FallDetectionServiceGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.healthapp.heartrate.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.PatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FallDetectionServiceMethodDescriptorSupplier("GetAllPatients"))
              .build();
        }
      }
    }
    return getGetAllPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getGetFallEventHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFallEventHistory",
      requestType = org.healthapp.falldetection.FallDetectionRequest.class,
      responseType = org.healthapp.falldetection.FallDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getGetFallEventHistoryMethod() {
    io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse> getGetFallEventHistoryMethod;
    if ((getGetFallEventHistoryMethod = FallDetectionServiceGrpc.getGetFallEventHistoryMethod) == null) {
      synchronized (FallDetectionServiceGrpc.class) {
        if ((getGetFallEventHistoryMethod = FallDetectionServiceGrpc.getGetFallEventHistoryMethod) == null) {
          FallDetectionServiceGrpc.getGetFallEventHistoryMethod = getGetFallEventHistoryMethod =
              io.grpc.MethodDescriptor.<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFallEventHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FallDetectionServiceMethodDescriptorSupplier("GetFallEventHistory"))
              .build();
        }
      }
    }
    return getGetFallEventHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getGetLatestFallEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestFallEvent",
      requestType = org.healthapp.falldetection.FallDetectionRequest.class,
      responseType = org.healthapp.falldetection.FallDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest,
      org.healthapp.falldetection.FallDetectionResponse> getGetLatestFallEventMethod() {
    io.grpc.MethodDescriptor<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse> getGetLatestFallEventMethod;
    if ((getGetLatestFallEventMethod = FallDetectionServiceGrpc.getGetLatestFallEventMethod) == null) {
      synchronized (FallDetectionServiceGrpc.class) {
        if ((getGetLatestFallEventMethod = FallDetectionServiceGrpc.getGetLatestFallEventMethod) == null) {
          FallDetectionServiceGrpc.getGetLatestFallEventMethod = getGetLatestFallEventMethod =
              io.grpc.MethodDescriptor.<org.healthapp.falldetection.FallDetectionRequest, org.healthapp.falldetection.FallDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestFallEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.falldetection.FallDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FallDetectionServiceMethodDescriptorSupplier("GetLatestFallEvent"))
              .build();
        }
      }
    }
    return getGetLatestFallEventMethod;
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

    /**
     */
    default void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.PatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    /**
     */
    default void getFallEventHistory(org.healthapp.falldetection.FallDetectionRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFallEventHistoryMethod(), responseObserver);
    }

    /**
     */
    default void getLatestFallEvent(org.healthapp.falldetection.FallDetectionRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestFallEventMethod(), responseObserver);
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

    /**
     */
    public void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.PatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFallEventHistory(org.healthapp.falldetection.FallDetectionRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFallEventHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLatestFallEvent(org.healthapp.falldetection.FallDetectionRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestFallEventMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, org.healthapp.heartrate.PatientResponse>
        getAllPatients(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, org.healthapp.falldetection.FallDetectionResponse>
        getFallEventHistory(org.healthapp.falldetection.FallDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetFallEventHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.healthapp.falldetection.FallDetectionResponse getLatestFallEvent(org.healthapp.falldetection.FallDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestFallEventMethod(), getCallOptions(), request);
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

    /**
     */
    public java.util.Iterator<org.healthapp.heartrate.PatientResponse> getAllPatients(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.healthapp.falldetection.FallDetectionResponse> getFallEventHistory(
        org.healthapp.falldetection.FallDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFallEventHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.healthapp.falldetection.FallDetectionResponse getLatestFallEvent(org.healthapp.falldetection.FallDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestFallEventMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.healthapp.falldetection.FallDetectionResponse> getLatestFallEvent(
        org.healthapp.falldetection.FallDetectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestFallEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PATIENTS = 0;
  private static final int METHODID_GET_FALL_EVENT_HISTORY = 1;
  private static final int METHODID_GET_LATEST_FALL_EVENT = 2;
  private static final int METHODID_MONITOR_FALLS = 3;

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
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.healthapp.heartrate.PatientResponse>) responseObserver);
          break;
        case METHODID_GET_FALL_EVENT_HISTORY:
          serviceImpl.getFallEventHistory((org.healthapp.falldetection.FallDetectionRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_FALL_EVENT:
          serviceImpl.getLatestFallEvent((org.healthapp.falldetection.FallDetectionRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.falldetection.FallDetectionResponse>) responseObserver);
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
        .addMethod(
          getGetAllPatientsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.healthapp.heartrate.PatientResponse>(
                service, METHODID_GET_ALL_PATIENTS)))
        .addMethod(
          getGetFallEventHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.healthapp.falldetection.FallDetectionRequest,
              org.healthapp.falldetection.FallDetectionResponse>(
                service, METHODID_GET_FALL_EVENT_HISTORY)))
        .addMethod(
          getGetLatestFallEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.healthapp.falldetection.FallDetectionRequest,
              org.healthapp.falldetection.FallDetectionResponse>(
                service, METHODID_GET_LATEST_FALL_EVENT)))
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
              .addMethod(getGetAllPatientsMethod())
              .addMethod(getGetFallEventHistoryMethod())
              .addMethod(getGetLatestFallEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}

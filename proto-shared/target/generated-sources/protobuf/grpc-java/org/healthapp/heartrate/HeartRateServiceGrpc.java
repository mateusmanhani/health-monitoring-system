package org.healthapp.heartrate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service to handle requests and return the response ( heart rate of requested patient id)
 * And also a method to stream the current heart rate continuously
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: heart_rate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeartRateServiceGrpc {

  private HeartRateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HeartRateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateResponse> getGetCurrentHeartRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentHeartRate",
      requestType = org.healthapp.heartrate.HeartRateRequest.class,
      responseType = org.healthapp.heartrate.HeartRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateResponse> getGetCurrentHeartRateMethod() {
    io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateResponse> getGetCurrentHeartRateMethod;
    if ((getGetCurrentHeartRateMethod = HeartRateServiceGrpc.getGetCurrentHeartRateMethod) == null) {
      synchronized (HeartRateServiceGrpc.class) {
        if ((getGetCurrentHeartRateMethod = HeartRateServiceGrpc.getGetCurrentHeartRateMethod) == null) {
          HeartRateServiceGrpc.getGetCurrentHeartRateMethod = getGetCurrentHeartRateMethod =
              io.grpc.MethodDescriptor.<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentHeartRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeartRateServiceMethodDescriptorSupplier("GetCurrentHeartRate"))
              .build();
        }
      }
    }
    return getGetCurrentHeartRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateResponse> getStreamHeartRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamHeartRate",
      requestType = org.healthapp.heartrate.HeartRateRequest.class,
      responseType = org.healthapp.heartrate.HeartRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateResponse> getStreamHeartRateMethod() {
    io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateResponse> getStreamHeartRateMethod;
    if ((getStreamHeartRateMethod = HeartRateServiceGrpc.getStreamHeartRateMethod) == null) {
      synchronized (HeartRateServiceGrpc.class) {
        if ((getStreamHeartRateMethod = HeartRateServiceGrpc.getStreamHeartRateMethod) == null) {
          HeartRateServiceGrpc.getStreamHeartRateMethod = getStreamHeartRateMethod =
              io.grpc.MethodDescriptor.<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamHeartRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeartRateServiceMethodDescriptorSupplier("StreamHeartRate"))
              .build();
        }
      }
    }
    return getStreamHeartRateMethod;
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
    if ((getGetAllPatientsMethod = HeartRateServiceGrpc.getGetAllPatientsMethod) == null) {
      synchronized (HeartRateServiceGrpc.class) {
        if ((getGetAllPatientsMethod = HeartRateServiceGrpc.getGetAllPatientsMethod) == null) {
          HeartRateServiceGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.healthapp.heartrate.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.PatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeartRateServiceMethodDescriptorSupplier("GetAllPatients"))
              .build();
        }
      }
    }
    return getGetAllPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateLogResponse> getGetHeartRateHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHeartRateHistory",
      requestType = org.healthapp.heartrate.HeartRateRequest.class,
      responseType = org.healthapp.heartrate.HeartRateLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest,
      org.healthapp.heartrate.HeartRateLogResponse> getGetHeartRateHistoryMethod() {
    io.grpc.MethodDescriptor<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateLogResponse> getGetHeartRateHistoryMethod;
    if ((getGetHeartRateHistoryMethod = HeartRateServiceGrpc.getGetHeartRateHistoryMethod) == null) {
      synchronized (HeartRateServiceGrpc.class) {
        if ((getGetHeartRateHistoryMethod = HeartRateServiceGrpc.getGetHeartRateHistoryMethod) == null) {
          HeartRateServiceGrpc.getGetHeartRateHistoryMethod = getGetHeartRateHistoryMethod =
              io.grpc.MethodDescriptor.<org.healthapp.heartrate.HeartRateRequest, org.healthapp.heartrate.HeartRateLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHeartRateHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.healthapp.heartrate.HeartRateLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeartRateServiceMethodDescriptorSupplier("GetHeartRateHistory"))
              .build();
        }
      }
    }
    return getGetHeartRateHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartRateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceStub>() {
        @java.lang.Override
        public HeartRateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartRateServiceStub(channel, callOptions);
        }
      };
    return HeartRateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static HeartRateServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceBlockingV2Stub>() {
        @java.lang.Override
        public HeartRateServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartRateServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return HeartRateServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartRateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceBlockingStub>() {
        @java.lang.Override
        public HeartRateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartRateServiceBlockingStub(channel, callOptions);
        }
      };
    return HeartRateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartRateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartRateServiceFutureStub>() {
        @java.lang.Override
        public HeartRateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartRateServiceFutureStub(channel, callOptions);
        }
      };
    return HeartRateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getCurrentHeartRate(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentHeartRateMethod(), responseObserver);
    }

    /**
     */
    default void streamHeartRate(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamHeartRateMethod(), responseObserver);
    }

    /**
     */
    default void getAllPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.PatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    /**
     */
    default void getHeartRateHistory(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeartRateHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HeartRateService.
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public static abstract class HeartRateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HeartRateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HeartRateService.
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public static final class HeartRateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HeartRateServiceStub> {
    private HeartRateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartRateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartRateServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentHeartRate(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentHeartRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamHeartRate(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamHeartRateMethod(), getCallOptions()), request, responseObserver);
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
    public void getHeartRateHistory(org.healthapp.heartrate.HeartRateRequest request,
        io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetHeartRateHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HeartRateService.
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public static final class HeartRateServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<HeartRateServiceBlockingV2Stub> {
    private HeartRateServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartRateServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartRateServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public org.healthapp.heartrate.HeartRateResponse getCurrentHeartRate(org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentHeartRateMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, org.healthapp.heartrate.HeartRateResponse>
        streamHeartRate(org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamHeartRateMethod(), getCallOptions(), request);
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
    public io.grpc.stub.BlockingClientCall<?, org.healthapp.heartrate.HeartRateLogResponse>
        getHeartRateHistory(org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetHeartRateHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service HeartRateService.
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public static final class HeartRateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HeartRateServiceBlockingStub> {
    private HeartRateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartRateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartRateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.healthapp.heartrate.HeartRateResponse getCurrentHeartRate(org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentHeartRateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.healthapp.heartrate.HeartRateResponse> streamHeartRate(
        org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamHeartRateMethod(), getCallOptions(), request);
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
    public java.util.Iterator<org.healthapp.heartrate.HeartRateLogResponse> getHeartRateHistory(
        org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetHeartRateHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HeartRateService.
   * <pre>
   * A service to handle requests and return the response ( heart rate of requested patient id)
   * And also a method to stream the current heart rate continuously
   * </pre>
   */
  public static final class HeartRateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HeartRateServiceFutureStub> {
    private HeartRateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartRateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartRateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.healthapp.heartrate.HeartRateResponse> getCurrentHeartRate(
        org.healthapp.heartrate.HeartRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentHeartRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_HEART_RATE = 0;
  private static final int METHODID_STREAM_HEART_RATE = 1;
  private static final int METHODID_GET_ALL_PATIENTS = 2;
  private static final int METHODID_GET_HEART_RATE_HISTORY = 3;

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
        case METHODID_GET_CURRENT_HEART_RATE:
          serviceImpl.getCurrentHeartRate((org.healthapp.heartrate.HeartRateRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse>) responseObserver);
          break;
        case METHODID_STREAM_HEART_RATE:
          serviceImpl.streamHeartRate((org.healthapp.heartrate.HeartRateRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.healthapp.heartrate.PatientResponse>) responseObserver);
          break;
        case METHODID_GET_HEART_RATE_HISTORY:
          serviceImpl.getHeartRateHistory((org.healthapp.heartrate.HeartRateRequest) request,
              (io.grpc.stub.StreamObserver<org.healthapp.heartrate.HeartRateLogResponse>) responseObserver);
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
          getGetCurrentHeartRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.healthapp.heartrate.HeartRateRequest,
              org.healthapp.heartrate.HeartRateResponse>(
                service, METHODID_GET_CURRENT_HEART_RATE)))
        .addMethod(
          getStreamHeartRateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.healthapp.heartrate.HeartRateRequest,
              org.healthapp.heartrate.HeartRateResponse>(
                service, METHODID_STREAM_HEART_RATE)))
        .addMethod(
          getGetAllPatientsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.healthapp.heartrate.PatientResponse>(
                service, METHODID_GET_ALL_PATIENTS)))
        .addMethod(
          getGetHeartRateHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.healthapp.heartrate.HeartRateRequest,
              org.healthapp.heartrate.HeartRateLogResponse>(
                service, METHODID_GET_HEART_RATE_HISTORY)))
        .build();
  }

  private static abstract class HeartRateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartRateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.healthapp.heartrate.HeartRateProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartRateService");
    }
  }

  private static final class HeartRateServiceFileDescriptorSupplier
      extends HeartRateServiceBaseDescriptorSupplier {
    HeartRateServiceFileDescriptorSupplier() {}
  }

  private static final class HeartRateServiceMethodDescriptorSupplier
      extends HeartRateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HeartRateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HeartRateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartRateServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentHeartRateMethod())
              .addMethod(getStreamHeartRateMethod())
              .addMethod(getGetAllPatientsMethod())
              .addMethod(getGetHeartRateHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}

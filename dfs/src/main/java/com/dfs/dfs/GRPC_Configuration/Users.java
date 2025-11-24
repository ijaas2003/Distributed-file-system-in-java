package com.dfs.dfs.GRPC_Configuration;

import com.grpc.user.UserRequest;
import com.grpc.user.UserResponse;
import com.grpc.user.UserServiceGrpc.UserServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class Users extends UserServiceImplBase {
    
    @Override
    public void payOrder (UserRequest request, StreamObserver<UserResponse> response) {
        System.out.println("Response recievied" + request.getPaymentUser());
        UserResponse userResponse = UserResponse
            .newBuilder()
            .setMessage("Success")
            .build();
        
        response.onNext(userResponse);
        response.onCompleted();
    }
}

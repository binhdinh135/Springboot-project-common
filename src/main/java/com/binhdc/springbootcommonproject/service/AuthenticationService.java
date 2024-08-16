package com.binhdc.springbootcommonproject.service;

import com.binhdc.springbootcommonproject.dto.request.AuthenticationRequest;
import com.binhdc.springbootcommonproject.dto.request.IntrospectRequest;
import com.binhdc.springbootcommonproject.dto.request.LogoutRequest;
import com.binhdc.springbootcommonproject.dto.request.RefreshRequest;
import com.binhdc.springbootcommonproject.dto.response.AuthenticationResponse;
import com.binhdc.springbootcommonproject.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    AuthenticationResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;

    void logout(LogoutRequest request);

    IntrospectResponse introspect(IntrospectRequest request);
}

package com.broadfactor.register.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "environment")
@Getter
@Setter
public class EnvironmentProperties {

    @Value( "${api.legacy.url}" )
    private String legacyUrl;

    @Value("${api.authenticator.url.base}")
    private String authorizationUrl;

    @Value( "${app.awsServices.bucketName.broadfactor}" )
    private String bucketBroadfactorCompany;

    @Value( "${sys.legacy.token}" )
    private String legacyToken;

    @Value( "${api.receitaws.url}" )
    private String receitaWsUrl;

    @Value("${api.cnpjws.url}")
    private String cnpjWsUrl;

    @Value("${api.cnpjws.token}")
    private String cnpjWsToken;

    @Value( "${api.base.url}" )
    private String baseUrl;

    @Value( "${login.broadfactor.legacy.url}" )
    private String loginBroadUrl;

    @Value( "${registration.url}" )
    private String registrationUrl;

    @Value( "${email.sender}" )
    private String sender;

    @Value( "${email.sender.rh}" )
    private String senderRh;

    @Value( "${support.phone}" )
    private String supportPhone;

    @Value( "${api.rdstation.token.url}" )
    private String rdStationUrl;

    @Value("${api.rdstation.client.id}")
    private String RdStationClientId;

    @Value("${api.rdstation.client.secret}")
    private String RdStationClientSecret;

    @Value("${api.rdstation.refresh.token}")
    private String RdStationRefreshToken;

    @Value("${api.authenticator.client.credentials}")
    private String clientCredentials;

    @Value( "${api.srm.url}" )
    private String urlSrm;

    @Value( "${api.srm.key}" )
    private String keySrm;

    @Value( "${api.srm.code.manager}" )
    private String codeManagerSrm;
}
#### Spring OAuth2

This repo contains the project of this tutorial: https://www.vincenzoracca.com/blog/framework/spring/spring-oauth/. \
In that tutorial I explain how create OAuth2 (authorization code ) flow with Spring Cloud Gateway and
WSO2 Identity Server, with Hazelcast to share sessions.


The project contains three directories:
- **spring-oauth2-client**: Spring Cloud Gateway/OAuth2 Client project
- **spring-resource-server**: A simple Spring Mvc Project who is also a Resource Server
- **wso2-is-docker**: Official Dockerfile of WSO2IS, if you want build the image manually (useful if you have an ARM architecture like
  Apple Silicon, because the official image of WSO2IS in DockerHub seems compatibles only for AMD architecture).

In addiction, the project contains the **spring-oauth2-client.xml** file, who is the config file for the Service Provider in
WSO2IS. You can import that file in your WSO2IS, so you will have all the configurations automatically. \
The other file is the **client-truststore.jks**, who is self-signed certificate for WSO2IS to manage https.

##### Run the applications

First, run the WSO2IS instance. \
Then, you can run the spring-oauth2-client from Main class with an IDE or with Maven, in this way: \
`./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Djavax.net.ssl.trustStore=<client-truststore.jks_path> -Djavax.net.ssl.trustStorePassword=wso2carbon"`

For example: \
`./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Djavax.net.ssl.trustStore=/Users/vracca/Documents/progetti_java/progetti_miei/spring-oauth2/client-truststore.jks -Djavax.net.ssl.trustStorePassword=wso2carbon"`

If you use Windows, you need the use mvnw.cmd script instead of mvnw script.


The need to do the same thing for the spring-resource-server project.

Please, follow my tutorial for other things.

Italian version: https://www.vincenzoracca.com/blog/framework/spring/spring-oauth/

English version: https://www.vincenzoracca.com/en/blog/framework/spring/spring-oauth/
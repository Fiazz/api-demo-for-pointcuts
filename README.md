# api-demo-for-pointcuts
Demo rest app to perform joinpoints after execution

Logs: Check the last two Lines below
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::       (v2.1.12.RELEASE)

2020-02-28 00:58:11.882  INFO 648 --- [           main] com.example.aop.DemoApplication          : Starting DemoApplication on LAPTOP-FDKAB15R with PID 648 (S:\Downloads\api-demo-for-pointcuts\api-demo-for-pointcuts\bin\main started by hp-pc in S:\Downloads\api-demo-for-pointcuts\api-demo-for-pointcuts)
2020-02-28 00:58:11.887  INFO 648 --- [           main] com.example.aop.DemoApplication          : No active profile set, falling back to default profiles: default
2020-02-28 00:58:14.750  INFO 648 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-02-28 00:58:14.792  INFO 648 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-02-28 00:58:14.800  INFO 648 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.30]
2020-02-28 00:58:16.269  INFO 648 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
...
2020-02-28 00:58:23.117  INFO 648 --- [nio-8080-exec-1] com.example.aop.DemoEO                   : Generated guid : 7c1a7fea-cfaf-4ac4-b912-b1d929729457 for User : kathy64
2020-02-28 00:58:23.141  INFO 648 --- [nio-8080-exec-1] com.example.aop.DemoLoggingAspect        : Attempted /invoke url with request User Name : [userName=kathy64], User Guid : 7c1a7fea-cfaf-4ac4-b912-b1d929729457 , Device Version : 1 , OS : Android, Method : POST and Response is 200.
2020-02-28 00:59:18.899 ERROR 648 --- [nio-8080-exec-2] com.example.aop.DemoLoggingAspect        : Attempted /invoke url with request User Name : [userName=kathy64], Device Version : A , OS : Android, Method : POST and Response is 400.

```

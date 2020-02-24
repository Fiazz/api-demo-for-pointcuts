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

2020-02-25 03:53:42.993  INFO 228 --- [           main] com.example.aop.DemoApplication          : Starting DemoApplication on LAPTOP-FDKAB15R with PID 228 (S:\Downloads\api-demo-for-pointcuts\api-demo-for-pointcuts\bin\main started by hp-pc in S:\Downloads\api-demo-for-pointcuts\api-demo-for-pointcuts)
2020-02-25 03:53:43.000  INFO 228 --- [           main] com.example.aop.DemoApplication          : No active profile set, falling back to default profiles: default
2020-02-25 03:53:46.287  INFO 228 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
....
2020-02-25 03:53:48.333  INFO 228 --- [           main] com.example.aop.DemoApplication          : Started DemoApplication in 6.056 seconds (JVM running for 6.909)
2020-02-25 03:53:53.194  INFO 228 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-02-25 03:53:53.194  INFO 228 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-02-25 03:53:53.207  INFO 228 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 12 ms
2020-02-25 03:53:53.405  INFO 228 --- [nio-8080-exec-1] com.example.aop.DemoEO                   : Generated guid : b3b2b6bc-0007-410f-9c40-73b0c89c9dcd for User : kathy64
2020-02-25 03:53:53.422  INFO 228 --- [nio-8080-exec-1] com.example.aop.DemoLoggingAspect        : Attempted /Portal login with request User Name : com.example.aop.DemoUserVO@6af628ab[userName=kathy64], User Guid : b3b2b6bc-0007-410f-9c40-73b0c89c9dcd , Device Version : 1 , OS : Android, Method : POST and Response is 200.
2020-02-25 04:01:55.966  INFO 228 --- [nio-8080-exec-1] com.example.aop.DemoLoggingAspect        : Attempted /Portal login with request User Name : com.example.aop.DemoUserVO@42fa6b32[userName=kathy64], User Guid : null , Device Version : A , OS : Android, Method : POST and Response is 400.
```

# wildfly-swarm-microservice-example
sample code for wildfly swarm microservice by joel patrick llosa for a stackhunter.com blog

here is the output when you run the service then invoke localhost:8080/log?m=lets jog&s=run.time.exception:

<pre>
tmpDir: C:\Users\jpllosa\AppData\Local\Temp\
16:16:36,937 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.6.Final
16:16:37,085 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0049: WildFly Core 2.0.0.CR8 "Kenny" starting
2015-12-11 16:16:37,721 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 14) WFLYSEC0002: Activating Security Subsystem
2015-12-11 16:16:37,722 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 13) WFLYNAM0001: Activating Naming Subsystem
2015-12-11 16:16:37,725 INFO  [org.jboss.as.security] (MSC service thread 1-6) WFLYSEC0001: Current PicketBox version=4.9.3.Final
2015-12-11 16:16:37,726 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 10) WFLYIO001: Worker 'default' has auto-configured to 8 core threads with 64 task threads based on your 4 available processors
2015-12-11 16:16:37,735 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 1.3.3.Final starting
2015-12-11 16:16:37,736 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 9) WFLYUT0003: Undertow 1.3.3.Final starting
2015-12-11 16:16:37,805 INFO  [org.jboss.as.naming] (MSC service thread 1-6) WFLYNAM0003: Starting Naming Service
2015-12-11 16:16:37,835 INFO  [org.xnio] (MSC service thread 1-5) XNIO version 3.3.2.Final
2015-12-11 16:16:37,845 INFO  [org.xnio.nio] (MSC service thread 1-5) XNIO NIO Implementation Version 3.3.2.Final
2015-12-11 16:16:37,921 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0012: Started server default-server.
2015-12-11 16:16:37,978 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: Undertow HTTP listener default listening on [0:0:0:0:0:0:0:0]:8080
2015-12-11 16:16:38,031 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Core 2.0.0.CR8 "Kenny" started in 1141ms - Started 68 of 75 services (14 services are lazy, passive or on-demand)
2015-12-11 16:16:39,966 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "log-service.war" (runtime-name: "log-service.war")
2015-12-11 16:16:41,223 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0018: Host default-host starting
2015-12-11 16:16:41,463 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 5) RESTEASY002225: Deploying javax.ws.rs.core.Application: class org.wildfly.swarm.generated.WildFlySwarmDefaultJAXRSApplication
2015-12-11 16:16:41,491 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 5) WFLYUT0021: Registered web context: /
2015-12-11 16:16:41,513 INFO  [org.jboss.as.server] (main) WFLYSRV0010: Deployed "log-service.war" (runtime-name : "log-service.war")
2015-12-11 16:16:57,866 INFO  [stdout] (default task-1) message: lets jog, stacktrace: run.time.exception
</pre>

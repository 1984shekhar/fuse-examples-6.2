package com.abc.test.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.ShutdownRoute;
import org.apache.camel.ShutdownRunningTask;
import org.apache.camel.builder.RouteBuilder;


public class SchedulerRoute extends RouteBuilder  {
  //  private static final Logger LOGGER = LoggerFactory.getLogger(SchedulerRoute.class);
   
    /* (non-Javadoc)
     * @see org.apache.camel.builder.RouteBuilder#configure()
     */
    @Override
    public void configure() throws Exception {
        //timer - simple trigger
        from("quartz2://testSchedulerGroup/mySheduleTimerRoute?trigger.repeatCount=0")
                .routeId("myTestTimerRoute")
                .shutdownRoute(ShutdownRoute.Defer)
                .shutdownRunningTask(ShutdownRunningTask.CompleteAllTasks)
                .onException(Exception.class)
                    .log(LoggingLevel.ERROR, "Error : [${routeId}] There is unexpected exception: message: ${exception.message}, stacktrace: ${exception.stacktrace}")
                .end()
                .log(("[${routeId}] Start at ${date:now:MM/dd/yyyy HH:mm:ss.SSS}"));
        
        
        //quartz2 scheduler - run every 2 mins
        from("quartz2://testSchedulerGroup/myQuartzRoute?cron=0+0/2+*+?+*+*")
                .routeId("myTestQuartzRoute")
                .shutdownRoute(ShutdownRoute.Defer)
                .shutdownRunningTask(ShutdownRunningTask.CompleteAllTasks)
                .onException(Exception.class)
                    .log(LoggingLevel.ERROR, "Error: [${routeId}] There is unexpected exception: message: ${exception.message}, stacktrace: ${exception.stacktrace}")
                .end()
                .log("Quartz 2 run - [${routeId}] Start at ${date:now:MM/dd/yyyy HH:mm:ss.SSS}");
        
    }
}

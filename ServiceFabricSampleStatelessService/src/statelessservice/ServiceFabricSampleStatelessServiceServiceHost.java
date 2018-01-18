package statelessservice;

import java.time.Duration;
import java.util.logging.Logger;
import java.util.logging.Level;

import microsoft.servicefabric.services.runtime.ServiceRuntime;

public class ServiceFabricSampleStatelessServiceServiceHost {

    private static final Logger logger = Logger.getLogger(ServiceFabricSampleStatelessServiceServiceHost.class.getName());

    public static void main(String[] args) throws Exception {
        try {
            ServiceRuntime.registerStatelessServiceAsync("ServiceFabricSampleStatelessServiceType", (context) -> new ServiceFabricSampleStatelessServiceService(), Duration.ofSeconds(10));
            logger.log(Level.INFO, "Registered stateless service of type ServiceFabricSampleStatelessServiceType. ");
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Exception occured", ex);
            throw ex;
        }
    }
}

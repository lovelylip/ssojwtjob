package sso.jwt.jobme.web;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResource.class);
    private static volatile ApplicationResource instance = null;
    private Properties prop;

    private ApplicationResource()
        throws FileNotFoundException, IOException
    {
        this.prop = new Properties();
        this.prop.load(this.getClass().getClassLoader().getResource("config/application.properties").openStream());
        PropertyConfigurator.configure(this.prop);
    }

    public static ApplicationResource getInstance()
        throws FileNotFoundException, IOException
    {
        if (instance == null) {
            synchronized (ApplicationResource.class)
            {
                if (instance == null) {
                    instance = new ApplicationResource();
                }
            }
        }
        return instance;
    }

    public static String getMessage(String key)
    {
        try
        {
            return getInstance().prop.getProperty(key);
        }
        catch (IOException e)
        {
            LOGGER.error("IOException", e.toString());
        }
        return null;
    }
}

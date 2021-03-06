package fr.inria.astor.core.setup;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author Matias Martinez, matias.martinez@inria.fr
 *
 */
public class ConfigurationProperties {

	public static Properties properties;
	protected static Logger logger = Logger.getLogger(ConfigurationProperties.class);

	static {
		properties = new Properties();
	}

	public static boolean hasProperty(String key) {
		if (properties.getProperty(key) == null) {
			return false;
		}
		return true;
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static void setProperty(String key, String value) {
		properties.setProperty(key, value);
	}

	public static Integer getPropertyInt(String key) {
		return Integer.valueOf(properties.getProperty(key));
	}

	public static Boolean getPropertyBool(String key) {
		return Boolean.valueOf(properties.getProperty(key));
	}

	public static Double getPropertyDouble(String key) {
		return Double.valueOf(properties.getProperty(key));
	}

	public static void print() {
		logger.info("----------------------------");
		logger.info("---Configuration properties:---Execution values");
		for (String key : properties.stringPropertyNames()) {
			logger.info("p:" + key + "= " + properties.getProperty(key));
		}
		logger.info("----------------------------");
	}

	/**
	 * Clean/remove all properties
	 */
	public static void clear() {
		properties.clear();
	}

}

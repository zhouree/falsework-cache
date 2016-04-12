package net.falsework.cache.redis;

/**
 * 继承父类 支持redis的name space配置
 * 
 */
public class NsRedisConnectionFactory extends DefaultRedisConnectionFactory {
	/**
	 * ns path
	 */
	private String nsPath;

	@Override
	public void afterPropertiesSet() {
		//nsRegistry.setProperties(nsPath, this);
		super.afterPropertiesSet();
	}

	public void setNsPath(String nsPath) {
		this.nsPath = nsPath;
	}

}

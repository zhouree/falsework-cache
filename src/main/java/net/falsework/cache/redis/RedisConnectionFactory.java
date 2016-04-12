package net.falsework.cache.redis;

/**
 * Redis实现的连接工厂接口定义类。
 * 
 * @author sea.bao
 */
public interface RedisConnectionFactory {
	/**
	 * 获得Redis连接
	 * @return
	 */
	RedisConnection getConnection();
}

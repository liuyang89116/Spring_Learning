package com.yang.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     *
     * @param bean 实例对象
     * @param beanName 配置文件中的 id
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {

        System.out.println("第五步： 初始化之前执行...");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {

        System.out.println("第八步： 初始化执行后...");

        // 增强 bean： 动态代理
        if (beanName.equals("customerService")) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("add".equals(method.getName())) {
                            System.out.println(System.currentTimeMillis());
                            Object result = method.invoke(bean, args);
                            System.out.println(System.currentTimeMillis());
                            return result;
                        }
                        return method.invoke(bean, args);
                    }
                });
            return proxy;
        }

        return bean;
    }

}

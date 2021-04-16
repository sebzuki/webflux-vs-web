# TOMCAT spring web req avec temps de 100ms

    server.tomcat.max-connections=8182
    server.tomcat.threads.max=200
![img.png](img.png)


    server.tomcat.max-connections=8182
    server.tomcat.threads.max=300
![img_1.png](img_1.png)


    server.tomcat.max-connections=16192
    server.tomcat.threads.max=300
![img_2.png](img_2.png)
![img_5.png](img_5.png)

# TOMCAT spring web req avec temps de 200ms
    server.tomcat.max-connections=16192
    server.tomcat.threads.max=300
![img_6.png](img_6.png)


# TOMCAT spring web req avec temps de 150ms + appel BD
    server.tomcat.max-connections=16192
    server.tomcat.threads.max=300
![img_9.png](img_9.png)


# NETTY spring webflux req avec temps de 100ms
![img_3.png](img_3.png)
![img_4.png](img_4.png)

# NETTY spring webflux req avec temps de 200ms
![img_7.png](img_7.png)

# NETTY spring webflux req avec temps de 150ms + appel BD
![img_8.png](img_8.png)

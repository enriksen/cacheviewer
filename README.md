# cacheviewer

Cache Viewer is a proof of concept (PoC) to test the functionality of Hazelcast cluster cache.

Cache viewer is included in [CacheManager] [cachemanager] but this is the StandAlone Viewer to run as independient service.

It searchs data from Cache Cluster.

Cacheviewer uses SpringBoot to run as service. Don't need application server.

### System requeriments
- Java 1.7+
- Apache Maven 3.x+

## How to run

1. download (git clone https://github.com/enriksen/cacheviewer.git)
2. mvn install
3. java -jar target\cacheviewer-0.1.0.jar
4. Ready!
 
## How it works
* First app initilize embebbed Tomcat. 
* Initialize HazelCast client (cache cluster must be ON!Can create by yourself or use CacheManager)
* Finish launching the app on port 80
* Then the app is ready to search at cache nodes.
* Thymeleaf + Datatables for View Layer.


## Main EndPoints

All operations can be invoked by GET request:

[Search]
* **http://localhost/cacheviewer/search** : Show HTML Search Form
* **http://localhost/cacheviewer/users**: Search in cache and return JSON data
* **http://localhost/cacheviewer/users?name=XXX&phone=XXX&company=XXX&iban=XXX**: Search with filters


## Other Endpoints

[Monitoring]
* **http://localhost/cacheviewer/beans** : Displays a complete list of all the Spring beans in the application.
* **http://localhost/cacheviewer/dump** : Performs a thread dump.
* **http://localhost/cacheviewer/health** : Shows application health information
* **http://localhost/cacheviewer/metrics** : Shows 'metrics' information for the current application.
* **http://localhost/cacheviewer/mappings** : Displays a collated list of all @RequestMapping paths.



## Quickstart

1 - Start CacheViewer
```
java -jar cacheviewer-0.1.0.jar
```

2 - Open Html Search Form
```
http://localhost/cacheviewer/search
```

3 - If prefer JSON response for WS integration
```
http://localhost/cacheviewer/users?company=Google
```



[cachemanager]: <https://github.com/enriksen/cachemanager>

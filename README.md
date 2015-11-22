# cacheviewer

Cache Viewer is a proof of concept (PoC) to test the functionality of Hazelcast cluster cache.

Cache viewer is included in [CacheManager] [cachemanager] but this is the StandAlone Viewer to run as independient service.

It searchs data from Cache Cluster.

Cacheviewer uses SpringBoot to run as service. Don't need application server.

## How to run

1. download (git clone https://github.com/enriksen/cacheviewer)
2. mvn install
3. java -jar target\cacheviewer-0.1.0.jar
4. Ready!
 
## How it works
* First app initilize embebbed Tomcat. 
* Initialize HazelCast client (cache cluster must be ON!)
* Finish launching the app on port 80
* Then the app is ready to search at cache nodes.
* Thymeleaf + Datatables for View Layer.


## Main EndPoints

All operations can be invoked by GET request:

[Search]
* **http://localhost:8181/cachemanager/search** : Show HTML Search Form
* **http://localhost:8181/cachemanager/search/users**: Search in cache and return JSON data
* **http://localhost:8181/cachemanager/search/users?name=XXX&phone=XXX&company=XXX&iban=XXX**: Search with filters


## Other Endpoints

[Monitoring]
* **http://localhost:8181/cachemanager/beans** : Displays a complete list of all the Spring beans in the application.
* **http://localhost:8181/cachemanager/dump** : Performs a thread dump.
* **http://localhost:8181/cachemanager/health** : Shows application health information
* **http://localhost:8181/cachemanager/metrics** : Shows 'metrics' information for the current application.
* **http://localhost:8181/cachemanager/mappings** : Displays a collated list of all @RequestMapping paths.



## Quickstart

1. Start CacheManager
```
java -jar cacheviewer-0.1.0.jar
```

2. Open Html Search Form
```
http://localhost/cacheviewer/search
```


[cachemanager]: <https://github.com/enriksen/cachemanager>
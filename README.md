# utopian.java #

Utopian API for Desktop Java and Android

# Download #
Maven:
```xml
<repositories>
    <repository>
        <id>jcenter</id>
        <url>https://jcenter.bintray.com/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>io.faob</groupId>
        <artifactId>utopian-java</artifactId>
        <version>0.2.0</version>
    </dependency>
</dependencies>
```
Gradle:
```gradle
repositories {
    jcenter()
}

dependencies {
    compile 'io.faob:utopian-java:0.2.0'
}
```
# Synchronous API examples #

####  Creating utopian service java object
``` Java
UtopianService service = new DefaultUtopianService();
```

#### 1. Get all moderators and print their names
``` Java
JsonObject moderatorsJson = service.moderators().get();
System.out.println("Total moderators: " +moderatorsJson.get("total"));

JsonArray results = moderatorsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("account").getAsString());
}
```
#### 2. Get all sponsors and print their names
``` Java
JsonObject sponsorsJson = service.sponsors().get();
System.out.println("Total sponsors: " +sponsorsJson.get("total"));
JsonArray results = sponsorsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("account").getAsString());
}
```
#### 3.  Get stats and print them
``` Java
JsonObject statsJson = service.stats().get();
JsonObject stats = statsJson.get("stats").getAsJsonObject();
System.out.println(stats);
```
#### 4.  Get specific moderator and access its properties
``` Java
JsonObject moderatorJson = service.moderator("espoem").get();
if(moderatorJson.size() != 0)
    System.out.println(moderatorJson.get("account").getAsString());
```
#### 5.  Get specific sponsor and access its properties
``` Java
JsonObject sponsorJson = service.sponsor("freedom").get();
if(sponsorJson.size() != 0)
    System.out.println(sponsorJson.get("account").getAsString());
```
#### 6.  Get first 50 posts titles in All category
``` Java
JsonObject postsJson = service.posts(new HashMap<>()).get();
JsonArray results = postsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("title").getAsString());
}
```
#### 7.  Get first 5 posts titles in Tutorials category
``` Java
Map<String, Object> filterOptions = new HashMap<>();
filterOptions.put("sortBy", "created");
filterOptions.put("type", "tutorials");
filterOptions.put("limit", 5);

JsonObject postsJson = service.posts(filterOptions).get();
JsonArray results = postsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("title").getAsString());
}
```
#### 8.  Get specific post and print moderator of this post
``` Java
JsonObject postJson = service.post("kabooom", "building-and-using-multiple-android-shared-libraries").get();
System.out.println(postJson.get("moderator").getAsString());
```
#### 9.  Get total posts count
``` Java
int count = service.totalPostsCount().get();
System.out.println("Total posts count: "+ count);
```
#### 10.  Get post url
``` Java
String url = service.postURL("38068955").get();
System.out.println("URL of post: " + url);
```
#### 11.  Get all posts by specific author
``` Java
JsonObject postsJson = service.postByAuthor("kabooom", new HashMap<>()).get();
JsonArray results = postsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("title").getAsString());
}
```
#### 12.  Get posts done on github repo "java-native-access/jna"
``` Java
JsonObject postsJson = service.postsByGithubProject("java-native-access/jna", new HashMap<>()).get();
JsonArray results = postsJson.get("results").getAsJsonArray();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("title").getAsString());
}
```
#### 13.  Get top projects
``` Java
JsonArray results = service.topProjects(new HashMap<>()).get();
for (JsonElement result : results) {
    System.out.println(result.getAsJsonObject().get("_id").getAsString());
}
```
# Asynchronous API examples #
#### 1. Get all moderators and print their names
``` Java
service
    .moderators()
    .getAsync(moderatorsJson -> {
        System.out.println("Total moderators: " + moderatorsJson.get("total"));

        JsonArray results = moderatorsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("account").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 2. Get all sponsors and print their names
``` Java
service
    .sponsors()
    .getAsync(sponsorsJson -> {
        System.out.println("Total sponsors: " + sponsorsJson.get("total"));
        JsonArray results = sponsorsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("account").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 3.  Get stats and print them
``` Java
service
    .stats()
    .getAsync(statsJson -> {
        JsonObject stats = statsJson.get("stats").getAsJsonObject();
        System.out.println(stats);
    }, e -> {
        e.printStackTrace();
    });
```
#### 4.  Get specific moderator and access its properties
``` Java
service
    .moderator("espoem")
    .getAsync(moderatorJson -> {
        if (moderatorJson.size() != 0)
            System.out.println(moderatorJson.get("account").getAsString());
    }, e -> {
        e.printStackTrace();
    });
```
#### 5.  Get specific sponsor and access its properties
``` Java
service
    .sponsor("freedom")
    .getAsync(sponsorJson -> {
        if (sponsorJson.size() != 0)
            System.out.println(sponsorJson.get("account").getAsString());
    }, e -> {
        e.printStackTrace();
    });
```
#### 6.  Get first 50 posts titles in All category
``` Java
service
    .posts(new HashMap<>())
    .getAsync(postsJson -> {
        JsonArray results = postsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("title").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 7.  Get first 5 posts titles in Tutorials category
``` Java
Map<String, Object> filterOptions = new HashMap<>();
filterOptions.put("sortBy", "created");
filterOptions.put("type", "tutorials");
filterOptions.put("limit", 5);

service
    .posts(filterOptions)
    .getAsync(postsJson -> {
        JsonArray results = postsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("title").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 8.  Get specific post and print moderator of this post
``` Java
service
    .post("kabooom", "building-and-using-multiple-android-shared-libraries")
    .getAsync(postJson -> {
        System.out.println(postJson.get("moderator").getAsString());
    }, e -> {
        e.printStackTrace();
    });
```
#### 9.  Get total posts count
``` Java
service
    .totalPostsCount()
    .getAsync(count -> {
        System.out.println("Total posts count: " + count);
    }, e -> {
        e.printStackTrace();
    });
```
#### 10.  Get post url
``` Java
service
    .postURL("38068955")
    .getAsync(url -> {
        System.out.println("URL of post: " + url);
    }, e -> {
        e.printStackTrace();
    });
```
#### 11.  Get all posts by specific author
``` Java
service
    .postByAuthor("kabooom", new HashMap<>())
    .getAsync(postsJson -> {
        JsonArray results = postsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("title").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 12.  Get posts done on github repo "java-native-access/jna"
``` Java
service
    .postsByGithubProject("java-native-access/jna", new HashMap<>())
    .getAsync(postsJson -> {
        JsonArray results = postsJson.get("results").getAsJsonArray();
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("title").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```
#### 13.  Get top projects
``` Java
service
    .topProjects(new HashMap<>())
    .getAsync(results -> {
        for (JsonElement result : results) {
            System.out.println(result.getAsJsonObject().get("_id").getAsString());
        }
    }, e -> {
        e.printStackTrace();
    });
```

# Author #

FaoB  
https://utopian.io/@kabooom

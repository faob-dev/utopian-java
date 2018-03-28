# utopian.java #

Utopian API for Desktop Java and Android

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



# Author #

FaoB  
https://utopian.io/@kabooom

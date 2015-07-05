# FlickableView
Flickable ImageView for Android. It is like a twitter's detail image.

![](https://github.com/gotokatsuya/FlickableView/blob/master/doc/scaled_sample.gif)


## How to use

```java
 final FlickableImageView flickableImageView = (FlickableImageView) findViewById(R.id.fiv);
 // Resource
 flickableImageView.setImageResource(R.drawable.travel);

 // Http Request
 // String url = "...";
 // Picasso.with(context).load(url).into(flickableImageView);
```
[Check this sample code.](https://github.com/gotokatsuya/FlickableView/blob/master/app/src/main/java/com/goka/sample/MainActivity.java)


## Gradle

**Comming soon**

```java
repositories {
    jcenter()
}

dependencies {
    // compile 'com.github.goka.flickableview:flickableview:1.0.0'
}
```


## Release
1.0.0
 First release.

## Reference
[ImageViewZoom](https://github.com/sephiroth74/ImageViewZoom)


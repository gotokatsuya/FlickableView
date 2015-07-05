# FlickableView
Flickable ImageView for Android. It is like a twitter's detail image.

![](https://github.com/gotokatsuya/FlickableView/blob/master/doc/scaled_sample.gif)

## Feature
Move, Zoom, Flick

## How to use

```java
 final FlickableImageView flickableImageView = (FlickableImageView) findViewById(R.id.fiv);
 // Resource
 flickableImageView.setImageResource(R.drawable.travel);

 // Http Request
 // String url = "...";
 // Picasso.with(context).load(url).into(flickableImageView);
 
 
 // Listeners
 
 // Flick Listener
 flickableImageView.setOnFlickListener(new FlickableImageView.OnFlickableImageViewFlickListener() {
     @Override
     public void onStartFlick() {
     }
     
     @Override
     public void onFinishFlick() {
     }
 });
 
 // Drag Listener
 flickableImageView.setOnDraggingListener(new FlickableImageView.OnFlickableImageViewDraggingListener() {
     @Override
     public void onStartDrag() {
     }
     
     @Override
     public void onCancelDrag() {
     }
 });
 
 // SingleTap Listener
 flickableImageView.setOnSingleTapListener(new FlickableImageView.OnFlickableImageViewSingleTapListener() {
     @Override
     public void onSingleTapConfirmed() {
     }
 });
 
 // DoubleTap Listener
 flickableImageView.setOnDoubleTapListener(new FlickableImageView.OnFlickableImageViewDoubleTapListener() {
     @Override
     public void onDoubleTap() {
     }
 });
 
 // Zoom Listener
 flickableImageView.setOnZoomListener(new FlickableImageView.OnFlickableImageViewZoomListener() {
     @Override
     public void onStartZoom() {
     }
     
     @Override
     public void onBackScale() {
     }
 });
 
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


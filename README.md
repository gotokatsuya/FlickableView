# FlickableView
Flickable ImageView for Android. It's like a view of twitter's detail image.

It's possible that other views animate with FlickableView.

![](https://github.com/gotokatsuya/FlickableView/blob/master/doc/img1_desc.png)

## Demo
![](https://github.com/gotokatsuya/FlickableView/blob/master/doc/scaled_sample.gif)

## Feature
- Move (Up, Down)
- Zoom
- Flick (Up, Down)

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
     public void onBackFromMinScale() {
     }
 });
 
```
[Check this sample code.](https://github.com/gotokatsuya/FlickableView/blob/master/app/src/main/java/com/goka/sample/MainActivity.java)


## Gradle
```java
repositories {
    jcenter()
}

dependencies {
    compile 'com.github.goka.flickableview:flickableview:1.0.0'
}
```


## Release
1.0.0  
　First release.

## Reference
[ImageViewZoom](https://github.com/sephiroth74/ImageViewZoom)


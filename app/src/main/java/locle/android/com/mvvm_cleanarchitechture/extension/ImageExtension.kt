package locle.android.com.mvvm_cleanarchitechture.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import locle.android.com.mvvm_cleanarchitechture.R

/***
 * glide handle image smart and auto downsampling and caching minimize storage overhead and decode times.(giam thieu chi phi luu tru va thoi gian bien dich)
 * glide easily for used and have require minilize for configuration
 * 2 by default glide cache images with url by urls as key in the memory and disk
 * 3 notify for glide  not save image to cache
 * */


fun ImageView.circleImage(image: Any, cache: Boolean = false) {
    Glide.with(this.context)
        .load(image)//1
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.drawable.ic_error)
        .skipMemoryCache(true)//2
        .diskCacheStrategy(DiskCacheStrategy.NONE)//3
        .transform(CircleCrop()) //4
        .into(this)
}

//fun ImageView.loadImage(image: Any) {
//    Glide.with(this)
//        .load(photoUrl)
//        .override(500, 500) //1
//        .transform( //2
//            CenterCrop(),
//            BlurTransformation(blurValue), //3
//            ContrastFilterTransformation(contrastValue), //4
//            VignetteFilterTransformation(
//                PointF(0.5f, 0.5f),
//                floatArrayOf(0f, 0f, 0f),
//                0f,
//                vignetteValue)) //5
//        .diskCacheStrategy(DiskCacheStrategy.DATA) //6
//        .placeholder(ivPhoto.drawable) //7
//        .into(ivPhoto)
//}

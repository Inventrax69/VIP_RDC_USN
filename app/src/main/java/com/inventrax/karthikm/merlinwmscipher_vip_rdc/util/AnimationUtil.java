package com.inventrax.karthikm.merlinwmscipher_vip_rdc.util;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.inventrax.karthikm.merlinwmscipher_vip_rdc.R;


public class AnimationUtil extends Animation{
    Animation animation;

    public void bounceAnimation(Context context, ImageView iv){
        animation= AnimationUtils.loadAnimation(context,
                R.anim.bounce_animation);

        iv.startAnimation(animation);
    }
}

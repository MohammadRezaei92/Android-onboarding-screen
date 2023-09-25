package com.omni.onboarding.entity
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.omni.onbarding.R

data class OnBoardingPage(
    @StringRes val titleResource: Int,
    @StringRes val subTitleResource: Int,
    @StringRes val descriptionResource: Int,
    @DrawableRes val logoResource: Int
) {
    companion object {
        fun defaultData() = listOf(
            OnBoardingPage(R.string.onboarding_slide1_title, R.string.onboarding_slide1_subtitle,R.string.onboarding_slide1_desc, R.drawable.ic_directions),
            OnBoardingPage(R.string.onboarding_slide2_title, R.string.onboarding_slide2_subtitle,
                R.string.onboarding_slide2_desc, R.drawable.ic_hang_out),
            OnBoardingPage(R.string.onboarding_slide2_title, R.string.onboarding_slide3_subtitle,R.string.onboarding_slide1_desc, R.drawable.ic_a_day_at_the_park)
        )
    }
}
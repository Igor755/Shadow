package com.company.sonikplams.shadow

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.MaterialShapeDrawable.*
import com.google.android.material.shape.ShapeAppearanceModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  radius = resources.getDimension(R.dimen.corner_radius)

        val shapeAppearanceModel : ShapeAppearanceModel  = ShapeAppearanceModel()
            .toBuilder()
            .setAllCorners(CornerFamily.ROUNDED,radius)
            .build()


        val shapeDrawable : MaterialShapeDrawable =  MaterialShapeDrawable(shapeAppearanceModel)
        //Fill the LinearLayout with your color
        shapeDrawable.setShadowColor(ContextCompat.getColor(this,R.color.colorGreen))
        shapeDrawable.setStroke(2.0f,resources.getColor(R.color.colorWhite))

        shapeDrawable.fillColor = ContextCompat.getColorStateList(this,R.color.colorPrimaryLight)
        //Stroke color and width
        // shapeDrawable.shadowRadius=260
        shapeDrawable.elevation = 170f
        shapeDrawable.shadowVerticalOffset =  20
        shapeDrawable.shadowCompatRotation = 45
        shapeDrawable.shadowCompatibilityMode = SHADOW_COMPAT_MODE_ALWAYS


        ViewCompat.setBackground(liner,shapeDrawable)

        button.setOnClickListener {

        }
    }
}